# Задание 6. Airlines application

## Общая идея

Рассмотрим архитектору некоторого асинхронного приложения авиакомпании.

Для простоты будем считать, самолеты этой авиакомпании вылетают только из одного аэропорта, причем из этого аэропорта
вылетают самолеты только этой авиакомпании.
Каждый рейс этой авиакомпании идентифицируется параметрами `flightId` и `departureTime`.
В обычной жизни гарантируется не больше одного рейса с определенным `flightId` в день, однако мы можем проигнорировать
это правило для целей тестов.

Рейсы выполняются на ограниченном количестве самолетов.
Для каждого самолета известен набор мест, на который можно продать билеты.

На рейсы авиакомпании продуются билеты, в ответ на запрос покупки билета, пользователю на электронную почту приходит
сообщение об успешной или неуспешной покупке билета.

Рейсы могут задерживаться и отменятся, им могут назначать стойку регистрации (`checkInNumber`) и выход на
посадку (`gateNumber`). Сообщения об изменениях рейса должны отправляться на электронные почты всех покупателей билетов.

Также для информирования пользователей в аэропорту предусмотрены:

* информационные табло: со списком рейсов и информацией про них
* аудио объявления: объявления голосов информации о рейсах.

Задания предполагают использования [модели акторов](actors.md) для обработки параллельных запросов над изменяемым
состоянием.
Предполагается, что обработка всех изменений будет происходить внутри одной корутины с последовательным чтением
типизированных событий из flow.

Для реализации вам потребуется библиотека `kotlinx.coroutines`.
При выполнении задания не допускается использования Java Concurrency Utilities, в частности
пакета `java.util.concurrent`.
Так же не стоит использовать библиотеку `kotlinx.atomicfu`.

## Требования к реализации

Основное решение выполняется в классе `AirlineApplication`.
Обработку всех изменений состояния внутри `AirlineApplication` стоит проводить внутри suspend функции run.

Предполагается, что состояние приложение является неизменяемым списком (объектов типа `Flight`).

### Management service

Внутри класса `AirlineApplication` реализуйте свойство managementService, возвращаемый объект которого будет
реализовывать интерфейс `AirlineManagementService`.

Все `AirlineManagementService` по сути должны приводить к добавлению события в канал, которое далее будет обрабатываться
внутри `run`.

Примечание: вам потребуется выделить `sealed class/interface` и наследников для сообщений, добавляющих новые или изменяющих
существующие рейсы, добавьте необходимые классы в пакет `airline.api`.

### Booking service

Аналогично предыдущему пункту, внутри `AirlineApplication` реализуйте свойство bookingService, возвращаемый объект
которого будет реализовывать интерфейс `BookingServices`.

Для отправки email сообщений покупателям, пока что воспользуйтесь `EmailService`, который передается вам в качестве
аргумента.

Обратите внимание, что купленные билеты должны храниться внутри `Flight`, поэтому покупка очередного билета должна также
изменять состояние приложение, как и какое-то изменение в рейсах.

### BufferedEmailService

Отправка email сообщений - не быстрая операцая, кроме того, почтовые сервера могут тормозить.
Чтобы не задерживать асинхронную обработку других событий, реализуйте BufferedEmailService.

Эта реализация `EmailService` должна собирать все сообщения `kotlinx.coroutines.channels.Channel` с некоторым размером
буфера.
А далее в прямая отправка сообщений должна происходить внутри метода `run`, который будет вычитывать сообщения для
отправки и отправлять их через переданный в качестве параметра конструктора `emailService`.

Используйте реализованный `BufferedEmailService` в качестве `EmailService` для отправки почты
внутри `AirlinesApplication`.

### PassengerNotificationService

Давайте добавим отправку уведомлений пользователям об изменениях рейса.

Для этого реализуйте необходимые методы внутри `PassengerNotificationService`.
В этом сервисе мы также не хотим блокировать основной поток обработки сообщений, поэтому используйте `Channel` для
передачи запросов на массовую рассылку в метод run, который будет запускать в отдельной корутине.

Предусмотрите персонализацию отправляемых сообщений. Например, в случае задержки рейса, можно отправлять сообщение:

_Dear, {passengerName}. Unfortunately, your flight {flightId} delayed from {departureTime} to {actualDepartureTime}_.

Примените созданный сервис для массовой отправки сообщений пользователям при изменениях в рейсе:
переносе, отмене, изменении стойки регистрации или выхода на посадку.

### InformationDisplay и AudioAlerts

Реализуйте систему информирования в аэропорте.

Метод airportInformationDisplay должно возвращать StateFlow из InformationDisplay, в котором будет содержать информация
о вылетающий рейсах на ближайший день. Значение StateFlow должно обновляться не чаще,
чем `config.displayUpdateInterval`. `airportInformationDisplay(scope).collect { ... }` не должен получать два одинаковых
состояния InformationDisplay. Иными словами, во flow должно появляться новое значение, только если старое было изменено.
Вы можете использовать переданный coroutineScope для получения StateFlow.

Свойство airportAudioAlerts должно возвращать flow аудио уведомлений, из которого можно будет получать не чаще чем раз в
интервал `config.audioAlertsInterval` сообщения

* об открытии регистрации на рейс (в первые 3 минут после начала регистрации),
* об окончании регистрации на рейс (в последние 3 минуты регистрации),
* об открытии посадки на рейс (в первые 3 минут после начала посадки),
* об окончании посадки на рейс (в последние 3 минуты посадки).

Время начала/окончания регистрации определяется, как `actualDepartureTime - config.registrationOpeningTime` (
или `config.registrationClosingTime` соответственно). Аналогично со временем посадки.

### Тесты

Добавьте тесты, позволяющие проверить базовую корректность работы вашего решения.
В тестах необходимо проверить корректность функционала `AirlinesApplication`.
Для написания тестов можно использовать JUnit или другой фреймворк.
Тесты не должны выполняться дольше 30 секунд.

В качестве примера вы можете посмотреть файл [ExampleTest.kt](src/test/kotlin/airline/ExampleTest.kt).