// Generated from /Users/snitron/IdeaProjects/tinkoff-edu/mettrans/src/main/antlr/GG.g4 by ANTLR 4.13.1
package lab4.antlr

import lab4.*
import lab4.State
import lab4.Invoke


import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*

@Suppress("FunctionName", "LocalVariableName", "EnumEntryName", "RemoveRedundantBackticks")
public open class GGLexer(input: CharStream) : Lexer(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0000\u0015\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0002\u000d\u0007\u000d\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0008\u0001\u0008\u0001\u0009\u0001\u0009\u0001\u000a\u0001\u000a\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001\u000d\u0001\u000d\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0059\u0008\u000f\u000a\u000f\u000c\u000f\u005c\u0009\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0060\u0008\u0010\u000a\u0010\u000c\u0010\u0063\u0009\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u0067\u0008\u0011\u000b\u0011\u000c\u0011\u0068\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0004\u0012\u006f\u0008\u0012\u000b\u0012\u000c\u0012\u0070\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0078\u0008\u0013\u000b\u0013\u000c\u0013\u0079\u0001\u0013\u0003\u0013\u007d\u0008\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\u0009\u0005\u000b\u0006\u000d\u0007\u000f\u0008\u0011\u0009\u0013\u000a\u0015\u000b\u0017\u000c\u0019\u000d\u001b\u000e\u001d\u000f\u001f\u0010\u0021\u0011\u0023\u0012\u0025\u0013\u0027\u0014\u0029\u0015\u0001\u0000\u0008\u0002\u0000\u005f\u005f\u0061\u007a\u0004\u0000\u0030\u0039\u0041\u005a\u005f\u005f\u0061\u007a\u0001\u0000\u0041\u005a\u0003\u0000\u0030\u0039\u0041\u005a\u005f\u005f\u0002\u0000\u002c\u002c\u005d\u005d\u0001\u0000\u0024\u0024\u0001\u0000\u0027\u0027\u0003\u0000\u0009\u000a\u000d\u000d\u0020\u0020\u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\u0009\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u000d\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000\u0021\u0001\u0000\u0000\u0000\u0000\u0023\u0001\u0000\u0000\u0000\u0000\u0025\u0001\u0000\u0000\u0000\u0000\u0027\u0001\u0000\u0000\u0000\u0000\u0029\u0001\u0000\u0000\u0000\u0001\u002b\u0001\u0000\u0000\u0000\u0003\u0031\u0001\u0000\u0000\u0000\u0005\u0034\u0001\u0000\u0000\u0000\u0007\u0036\u0001\u0000\u0000\u0000\u0009\u003e\u0001\u0000\u0000\u0000\u000b\u0040\u0001\u0000\u0000\u0000\u000d\u0042\u0001\u0000\u0000\u0000\u000f\u0044\u0001\u0000\u0000\u0000\u0011\u0046\u0001\u0000\u0000\u0000\u0013\u0048\u0001\u0000\u0000\u0000\u0015\u004a\u0001\u0000\u0000\u0000\u0017\u004c\u0001\u0000\u0000\u0000\u0019\u004e\u0001\u0000\u0000\u0000\u001b\u0050\u0001\u0000\u0000\u0000\u001d\u0052\u0001\u0000\u0000\u0000\u001f\u0056\u0001\u0000\u0000\u0000\u0021\u005d\u0001\u0000\u0000\u0000\u0023\u0064\u0001\u0000\u0000\u0000\u0025\u006c\u0001\u0000\u0000\u0000\u0027\u0074\u0001\u0000\u0000\u0000\u0029\u0080\u0001\u0000\u0000\u0000\u002b\u002c\u0005\u0073\u0000\u0000\u002c\u002d\u0005\u0074\u0000\u0000\u002d\u002e\u0005\u0061\u0000\u0000\u002e\u002f\u0005\u0072\u0000\u0000\u002f\u0030\u0005\u0074\u0000\u0000\u0030\u0002\u0001\u0000\u0000\u0000\u0031\u0032\u0005\u0057\u0000\u0000\u0032\u0033\u0005\u0053\u0000\u0000\u0033\u0004\u0001\u0000\u0000\u0000\u0034\u0035\u0005\u002c\u0000\u0000\u0035\u0006\u0001\u0000\u0000\u0000\u0036\u0037\u0005\u0072\u0000\u0000\u0037\u0038\u0005\u0065\u0000\u0000\u0038\u0039\u0005\u0074\u0000\u0000\u0039\u003a\u0005\u0075\u0000\u0000\u003a\u003b\u0005\u0072\u0000\u0000\u003b\u003c\u0005\u006e\u0000\u0000\u003c\u003d\u0005\u0073\u0000\u0000\u003d\u0008\u0001\u0000\u0000\u0000\u003e\u003f\u0005\u003b\u0000\u0000\u003f\u000a\u0001\u0000\u0000\u0000\u0040\u0041\u0005\u003a\u0000\u0000\u0041\u000c\u0001\u0000\u0000\u0000\u0042\u0043\u0005\u0027\u0000\u0000\u0043\u000e\u0001\u0000\u0000\u0000\u0044\u0045\u0005\u007c\u0000\u0000\u0045\u0010\u0001\u0000\u0000\u0000\u0046\u0047\u0005\u005b\u0000\u0000\u0047\u0012\u0001\u0000\u0000\u0000\u0048\u0049\u0005\u005d\u0000\u0000\u0049\u0014\u0001\u0000\u0000\u0000\u004a\u004b\u0005\u007b\u0000\u0000\u004b\u0016\u0001\u0000\u0000\u0000\u004c\u004d\u0005\u007d\u0000\u0000\u004d\u0018\u0001\u0000\u0000\u0000\u004e\u004f\u0005\u003c\u0000\u0000\u004f\u001a\u0001\u0000\u0000\u0000\u0050\u0051\u0005\u003e\u0000\u0000\u0051\u001c\u0001\u0000\u0000\u0000\u0052\u0053\u0005\u0065\u0000\u0000\u0053\u0054\u0005\u0070\u0000\u0000\u0054\u0055\u0005\u0073\u0000\u0000\u0055\u001e\u0001\u0000\u0000\u0000\u0056\u005a\u0007\u0000\u0000\u0000\u0057\u0059\u0007\u0001\u0000\u0000\u0058\u0057\u0001\u0000\u0000\u0000\u0059\u005c\u0001\u0000\u0000\u0000\u005a\u0058\u0001\u0000\u0000\u0000\u005a\u005b\u0001\u0000\u0000\u0000\u005b\u0020\u0001\u0000\u0000\u0000\u005c\u005a\u0001\u0000\u0000\u0000\u005d\u0061\u0007\u0002\u0000\u0000\u005e\u0060\u0007\u0003\u0000\u0000\u005f\u005e\u0001\u0000\u0000\u0000\u0060\u0063\u0001\u0000\u0000\u0000\u0061\u005f\u0001\u0000\u0000\u0000\u0061\u0062\u0001\u0000\u0000\u0000\u0062\u0022\u0001\u0000\u0000\u0000\u0063\u0061\u0001\u0000\u0000\u0000\u0064\u0066\u0005\u0027\u0000\u0000\u0065\u0067\u0008\u0004\u0000\u0000\u0066\u0065\u0001\u0000\u0000\u0000\u0067\u0068\u0001\u0000\u0000\u0000\u0068\u0066\u0001\u0000\u0000\u0000\u0068\u0069\u0001\u0000\u0000\u0000\u0069\u006a\u0001\u0000\u0000\u0000\u006a\u006b\u0005\u0027\u0000\u0000\u006b\u0024\u0001\u0000\u0000\u0000\u006c\u006e\u0005\u0024\u0000\u0000\u006d\u006f\u0008\u0005\u0000\u0000\u006e\u006d\u0001\u0000\u0000\u0000\u006f\u0070\u0001\u0000\u0000\u0000\u0070\u006e\u0001\u0000\u0000\u0000\u0070\u0071\u0001\u0000\u0000\u0000\u0071\u0072\u0001\u0000\u0000\u0000\u0072\u0073\u0005\u0024\u0000\u0000\u0073\u0026\u0001\u0000\u0000\u0000\u0074\u007c\u0005\u003c\u0000\u0000\u0075\u0077\u0005\u0027\u0000\u0000\u0076\u0078\u0008\u0006\u0000\u0000\u0077\u0076\u0001\u0000\u0000\u0000\u0078\u0079\u0001\u0000\u0000\u0000\u0079\u0077\u0001\u0000\u0000\u0000\u0079\u007a\u0001\u0000\u0000\u0000\u007a\u007b\u0001\u0000\u0000\u0000\u007b\u007d\u0005\u0027\u0000\u0000\u007c\u0075\u0001\u0000\u0000\u0000\u007c\u007d\u0001\u0000\u0000\u0000\u007d\u007e\u0001\u0000\u0000\u0000\u007e\u007f\u0005\u003e\u0000\u0000\u007f\u0028\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0007\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u0014\u0000\u0000\u0083\u002a\u0001\u0000\u0000\u0000\u0007\u0000\u005a\u0061\u0068\u0070\u0079\u007c\u0001\u0006\u0000\u0000"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()

        private val LITERAL_NAMES: Array<String?> =
            arrayOf(null, "'start'", "'WS'", "','", "'returns'", "';'", 
                    "':'", "'''", "'|'", "'['", "']'", "'{'", "'}'", "'<'", 
                    "'>'", "'eps'")

        private val SYMBOLIC_NAMES: Array<String?> =
            arrayOf(null, null, null, "COMMA", "RETURNS", "SEMICOLON", "COLON", 
                    "SINGLE_QUOTE", "OR", "SOBRACKET", "SCBRACKET", "COBRACKET", 
                    "CCBRACKET", "TOBRACKET", "TCBRACKET", "EPS", "NOT_CAPS_WORD", 
                    "CAPS_WORD", "ARG", "LITERAL", "UPDATE", "WS")

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)
    }

    public enum class Tokens(public val id: kotlin.Int) {
        `T__0`(1),
        `T__1`(2),
        `COMMA`(3),
        `RETURNS`(4),
        `SEMICOLON`(5),
        `COLON`(6),
        `SINGLE_QUOTE`(7),
        `OR`(8),
        `SOBRACKET`(9),
        `SCBRACKET`(10),
        `COBRACKET`(11),
        `CCBRACKET`(12),
        `TOBRACKET`(13),
        `TCBRACKET`(14),
        `EPS`(15),
        `NOT_CAPS_WORD`(16),
        `CAPS_WORD`(17),
        `ARG`(18),
        `LITERAL`(19),
        `UPDATE`(20),
        `WS`(21)
    }

    public enum class Channels(public val id: kotlin.Int) {
        DEFAULT_TOKEN_CHANNEL(0),
        HIDDEN(1),
    }

    public enum class Modes(public val id: kotlin.Int) {
        DEFAULT_MODE(0),
    }

    public enum class Rules {
        `T__0`,
        `T__1`,
        `COMMA`,
        `RETURNS`,
        `SEMICOLON`,
        `COLON`,
        `SINGLE_QUOTE`,
        `OR`,
        `SOBRACKET`,
        `SCBRACKET`,
        `COBRACKET`,
        `CCBRACKET`,
        `TOBRACKET`,
        `TCBRACKET`,
        `EPS`,
        `NOT_CAPS_WORD`,
        `CAPS_WORD`,
        `ARG`,
        `LITERAL`,
        `UPDATE`,
        `WS`
    }

    override var interpreter: LexerATNSimulator =
        @Suppress("LeakingThis")
        LexerATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "GG.g4"

    override val atn: ATN =
        ATN

    override val vocabulary: Vocabulary =
        VOCABULARY

    override val serializedATN: String =
        SERIALIZED_ATN

    override val ruleNames: Array<String> =
        Rules.entries.map(Rules::name).toTypedArray()

    override val channelNames: Array<String> =
        Channels.entries.map(Channels::name).toTypedArray()

    override val modeNames: Array<String> =
        Modes.entries.map(Modes::name).toTypedArray()


}