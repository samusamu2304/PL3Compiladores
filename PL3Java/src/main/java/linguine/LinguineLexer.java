// Generated from /Users/samuelpintilei/PL3Compiladores/Linguine/LinguineLexer.g4 by ANTLR 4.13.1
package linguine;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LinguineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, IF=2, THEN=3, ELSE=4, FOR=5, WHILE=6, FUN=7, SHOW=8, MATCH=9, WITH=10, 
		PIPE=11, ID=12, INT=13, STRING=14, PLUS=15, MINUS=16, MUL=17, DIV=18, 
		EQ=19, PLUSPLUS=20, MINUSMINUS=21, GT=22, LT=23, GTE=24, LTE=25, ASSIGN=26, 
		LPAREN=27, RPAREN=28, COMMA=29, ARROW=30, SEMICOLON=31, NLINE=32, QEST=33, 
		ESPACIO_BLANCO=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "IF", "THEN", "ELSE", "FOR", "WHILE", "FUN", "SHOW", "MATCH", 
			"WITH", "PIPE", "ID", "INT", "STRING", "PLUS", "MINUS", "MUL", "DIV", 
			"EQ", "PLUSPLUS", "MINUSMINUS", "GT", "LT", "GTE", "LTE", "ASSIGN", "LPAREN", 
			"RPAREN", "COMMA", "ARROW", "SEMICOLON", "NLINE", "QEST", "ESPACIO_BLANCO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'if'", "'then'", "'else'", "'for'", "'while'", "'fun'", 
			"'show'", "'match'", "'with'", "'|'", null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'++'", "'--'", "'>'", "'<'", "'>='", "'<='", "'='", 
			"'('", "')'", "','", "'->'", "';'", null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "IF", "THEN", "ELSE", "FOR", "WHILE", "FUN", "SHOW", "MATCH", 
			"WITH", "PIPE", "ID", "INT", "STRING", "PLUS", "MINUS", "MUL", "DIV", 
			"EQ", "PLUSPLUS", "MINUSMINUS", "GT", "LT", "GTE", "LTE", "ASSIGN", "LPAREN", 
			"RPAREN", "COMMA", "ARROW", "SEMICOLON", "NLINE", "QEST", "ESPACIO_BLANCO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LinguineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LinguineLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\"\u00c1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"y\b\u000b\n\u000b\f\u000b|\t\u000b\u0001\f\u0004\f\u007f\b\f\u000b\f\f"+
		"\f\u0080\u0001\r\u0001\r\u0005\r\u0085\b\r\n\r\f\r\u0088\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f"+
		"\u00b5\b\u001f\u000b\u001f\f\u001f\u00b6\u0001 \u0001 \u0001!\u0004!\u00bc"+
		"\b!\u000b!\f!\u00bd\u0001!\u0001!\u0000\u0000\"\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"\u0001\u0000\u0006\u0003\u0000AZ__"+
		"az\u0004\u000009AZ__az\u0001\u000009\u0001\u0000\"\"\u0002\u0000\n\n\r"+
		"\r\u0003\u0000\t\n\r\r  \u00c5\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0001E\u0001\u0000\u0000\u0000\u0003I\u0001\u0000\u0000\u0000\u0005L"+
		"\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000\u0000\u0000\tV\u0001\u0000"+
		"\u0000\u0000\u000bZ\u0001\u0000\u0000\u0000\r`\u0001\u0000\u0000\u0000"+
		"\u000fd\u0001\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000\u0013o"+
		"\u0001\u0000\u0000\u0000\u0015t\u0001\u0000\u0000\u0000\u0017v\u0001\u0000"+
		"\u0000\u0000\u0019~\u0001\u0000\u0000\u0000\u001b\u0082\u0001\u0000\u0000"+
		"\u0000\u001d\u008b\u0001\u0000\u0000\u0000\u001f\u008d\u0001\u0000\u0000"+
		"\u0000!\u008f\u0001\u0000\u0000\u0000#\u0091\u0001\u0000\u0000\u0000%"+
		"\u0093\u0001\u0000\u0000\u0000\'\u0096\u0001\u0000\u0000\u0000)\u0099"+
		"\u0001\u0000\u0000\u0000+\u009c\u0001\u0000\u0000\u0000-\u009e\u0001\u0000"+
		"\u0000\u0000/\u00a0\u0001\u0000\u0000\u00001\u00a3\u0001\u0000\u0000\u0000"+
		"3\u00a6\u0001\u0000\u0000\u00005\u00a8\u0001\u0000\u0000\u00007\u00aa"+
		"\u0001\u0000\u0000\u00009\u00ac\u0001\u0000\u0000\u0000;\u00ae\u0001\u0000"+
		"\u0000\u0000=\u00b1\u0001\u0000\u0000\u0000?\u00b4\u0001\u0000\u0000\u0000"+
		"A\u00b8\u0001\u0000\u0000\u0000C\u00bb\u0001\u0000\u0000\u0000EF\u0005"+
		"l\u0000\u0000FG\u0005e\u0000\u0000GH\u0005t\u0000\u0000H\u0002\u0001\u0000"+
		"\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005f\u0000\u0000K\u0004\u0001\u0000"+
		"\u0000\u0000LM\u0005t\u0000\u0000MN\u0005h\u0000\u0000NO\u0005e\u0000"+
		"\u0000OP\u0005n\u0000\u0000P\u0006\u0001\u0000\u0000\u0000QR\u0005e\u0000"+
		"\u0000RS\u0005l\u0000\u0000ST\u0005s\u0000\u0000TU\u0005e\u0000\u0000"+
		"U\b\u0001\u0000\u0000\u0000VW\u0005f\u0000\u0000WX\u0005o\u0000\u0000"+
		"XY\u0005r\u0000\u0000Y\n\u0001\u0000\u0000\u0000Z[\u0005w\u0000\u0000"+
		"[\\\u0005h\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005l\u0000\u0000^_\u0005"+
		"e\u0000\u0000_\f\u0001\u0000\u0000\u0000`a\u0005f\u0000\u0000ab\u0005"+
		"u\u0000\u0000bc\u0005n\u0000\u0000c\u000e\u0001\u0000\u0000\u0000de\u0005"+
		"s\u0000\u0000ef\u0005h\u0000\u0000fg\u0005o\u0000\u0000gh\u0005w\u0000"+
		"\u0000h\u0010\u0001\u0000\u0000\u0000ij\u0005m\u0000\u0000jk\u0005a\u0000"+
		"\u0000kl\u0005t\u0000\u0000lm\u0005c\u0000\u0000mn\u0005h\u0000\u0000"+
		"n\u0012\u0001\u0000\u0000\u0000op\u0005w\u0000\u0000pq\u0005i\u0000\u0000"+
		"qr\u0005t\u0000\u0000rs\u0005h\u0000\u0000s\u0014\u0001\u0000\u0000\u0000"+
		"tu\u0005|\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vz\u0007\u0000\u0000"+
		"\u0000wy\u0007\u0001\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0018"+
		"\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0007\u0002"+
		"\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u001a\u0001\u0000\u0000\u0000\u0082\u0086\u0005\"\u0000\u0000\u0083\u0085"+
		"\b\u0003\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\"\u0000\u0000\u008a\u001c\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005+\u0000\u0000\u008c\u001e\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005-\u0000\u0000\u008e \u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005*\u0000\u0000\u0090\"\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005/\u0000\u0000\u0092$\u0001\u0000\u0000\u0000\u0093\u0094\u0005="+
		"\u0000\u0000\u0094\u0095\u0005=\u0000\u0000\u0095&\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005+\u0000\u0000\u0097\u0098\u0005+\u0000\u0000\u0098("+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005-\u0000\u0000\u009a\u009b\u0005"+
		"-\u0000\u0000\u009b*\u0001\u0000\u0000\u0000\u009c\u009d\u0005>\u0000"+
		"\u0000\u009d,\u0001\u0000\u0000\u0000\u009e\u009f\u0005<\u0000\u0000\u009f"+
		".\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005>\u0000\u0000\u00a1\u00a2\u0005"+
		"=\u0000\u0000\u00a20\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005<\u0000"+
		"\u0000\u00a4\u00a5\u0005=\u0000\u0000\u00a52\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005=\u0000\u0000\u00a74\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"(\u0000\u0000\u00a96\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005)\u0000"+
		"\u0000\u00ab8\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005,\u0000\u0000\u00ad"+
		":\u0001\u0000\u0000\u0000\u00ae\u00af\u0005-\u0000\u0000\u00af\u00b0\u0005"+
		">\u0000\u0000\u00b0<\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005;\u0000"+
		"\u0000\u00b2>\u0001\u0000\u0000\u0000\u00b3\u00b5\u0007\u0004\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7@\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005?\u0000\u0000\u00b9B"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0007\u0005\u0000\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0006!\u0000\u0000\u00c0D\u0001\u0000"+
		"\u0000\u0000\u0006\u0000z\u0080\u0086\u00b6\u00bd\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}