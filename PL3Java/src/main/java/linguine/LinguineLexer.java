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
		LET=1, IF=2, THEN=3, ELSE=4, FUN=5, SHOW=6, MATCH=7, WITH=8, PIPE=9, ID=10, 
		INT=11, STRING=12, PLUS=13, MINUS=14, MUL=15, DIV=16, EQ=17, GT=18, LT=19, 
		GTE=20, LTE=21, ASSIGN=22, LPAREN=23, RPAREN=24, COMMA=25, ARROW=26, SEMICOLON=27, 
		NLINE=28, QEST=29, ESPACIO_BLANCO=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "IF", "THEN", "ELSE", "FUN", "SHOW", "MATCH", "WITH", "PIPE", 
			"ID", "INT", "STRING", "PLUS", "MINUS", "MUL", "DIV", "EQ", "GT", "LT", 
			"GTE", "LTE", "ASSIGN", "LPAREN", "RPAREN", "COMMA", "ARROW", "SEMICOLON", 
			"NLINE", "QEST", "ESPACIO_BLANCO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'if'", "'then'", "'else'", "'fun'", "'show'", "'match'", 
			"'with'", "'|'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'=='", 
			"'>'", "'<'", "'>='", "'<='", "'='", "'('", "')'", "','", "'->'", "';'", 
			null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "IF", "THEN", "ELSE", "FUN", "SHOW", "MATCH", "WITH", "PIPE", 
			"ID", "INT", "STRING", "PLUS", "MINUS", "MUL", "DIV", "EQ", "GT", "LT", 
			"GTE", "LTE", "ASSIGN", "LPAREN", "RPAREN", "COMMA", "ARROW", "SEMICOLON", 
			"NLINE", "QEST", "ESPACIO_BLANCO"
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
		"\u0004\u0000\u001e\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tg\b\t\n\t\f\tj\t\t"+
		"\u0001\n\u0004\nm\b\n\u000b\n\f\nn\u0001\u000b\u0001\u000b\u0005\u000b"+
		"s\b\u000b\n\u000b\f\u000bv\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u009d\b\u001b\u000b\u001b\f"+
		"\u001b\u009e\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u00a4\b\u001d"+
		"\u000b\u001d\f\u001d\u00a5\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e\u0001\u0000\u0006\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0001\u0000\"\"\u0002\u0000"+
		"\n\n\r\r\u0003\u0000\t\n\r\r  \u00ad\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003A\u0001"+
		"\u0000\u0000\u0000\u0005D\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000"+
		"\u0000\tN\u0001\u0000\u0000\u0000\u000bR\u0001\u0000\u0000\u0000\rW\u0001"+
		"\u0000\u0000\u0000\u000f]\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000"+
		"\u0000\u0013d\u0001\u0000\u0000\u0000\u0015l\u0001\u0000\u0000\u0000\u0017"+
		"p\u0001\u0000\u0000\u0000\u0019y\u0001\u0000\u0000\u0000\u001b{\u0001"+
		"\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000\u001f\u007f\u0001\u0000"+
		"\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#\u0084\u0001\u0000\u0000\u0000"+
		"%\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000)\u008b"+
		"\u0001\u0000\u0000\u0000+\u008e\u0001\u0000\u0000\u0000-\u0090\u0001\u0000"+
		"\u0000\u0000/\u0092\u0001\u0000\u0000\u00001\u0094\u0001\u0000\u0000\u0000"+
		"3\u0096\u0001\u0000\u0000\u00005\u0099\u0001\u0000\u0000\u00007\u009c"+
		"\u0001\u0000\u0000\u00009\u00a0\u0001\u0000\u0000\u0000;\u00a3\u0001\u0000"+
		"\u0000\u0000=>\u0005l\u0000\u0000>?\u0005e\u0000\u0000?@\u0005t\u0000"+
		"\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005i\u0000\u0000BC\u0005f\u0000"+
		"\u0000C\u0004\u0001\u0000\u0000\u0000DE\u0005t\u0000\u0000EF\u0005h\u0000"+
		"\u0000FG\u0005e\u0000\u0000GH\u0005n\u0000\u0000H\u0006\u0001\u0000\u0000"+
		"\u0000IJ\u0005e\u0000\u0000JK\u0005l\u0000\u0000KL\u0005s\u0000\u0000"+
		"LM\u0005e\u0000\u0000M\b\u0001\u0000\u0000\u0000NO\u0005f\u0000\u0000"+
		"OP\u0005u\u0000\u0000PQ\u0005n\u0000\u0000Q\n\u0001\u0000\u0000\u0000"+
		"RS\u0005s\u0000\u0000ST\u0005h\u0000\u0000TU\u0005o\u0000\u0000UV\u0005"+
		"w\u0000\u0000V\f\u0001\u0000\u0000\u0000WX\u0005m\u0000\u0000XY\u0005"+
		"a\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005h\u0000"+
		"\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005w\u0000\u0000^_\u0005i\u0000"+
		"\u0000_`\u0005t\u0000\u0000`a\u0005h\u0000\u0000a\u0010\u0001\u0000\u0000"+
		"\u0000bc\u0005|\u0000\u0000c\u0012\u0001\u0000\u0000\u0000dh\u0007\u0000"+
		"\u0000\u0000eg\u0007\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u0014\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000km\u0007\u0002"+
		"\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0016\u0001\u0000\u0000"+
		"\u0000pt\u0005\"\u0000\u0000qs\b\u0003\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005"+
		"\"\u0000\u0000x\u0018\u0001\u0000\u0000\u0000yz\u0005+\u0000\u0000z\u001a"+
		"\u0001\u0000\u0000\u0000{|\u0005-\u0000\u0000|\u001c\u0001\u0000\u0000"+
		"\u0000}~\u0005*\u0000\u0000~\u001e\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005/\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082\u0005="+
		"\u0000\u0000\u0082\u0083\u0005=\u0000\u0000\u0083\"\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005>\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005<\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		">\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a(\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005<\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d"+
		"*\u0001\u0000\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f,\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005(\u0000\u0000\u0091.\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005)\u0000\u0000\u00930\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005,\u0000\u0000\u00952\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"-\u0000\u0000\u0097\u0098\u0005>\u0000\u0000\u00984\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005;\u0000\u0000\u009a6\u0001\u0000\u0000\u0000\u009b"+
		"\u009d\u0007\u0004\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f8\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005?\u0000\u0000\u00a1:\u0001\u0000\u0000\u0000\u00a2\u00a4\u0007\u0005"+
		"\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006\u001d"+
		"\u0000\u0000\u00a8<\u0001\u0000\u0000\u0000\u0006\u0000hnt\u009e\u00a5"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}