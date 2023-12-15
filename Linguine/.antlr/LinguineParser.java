// Generated from c://Users//pokes//Desktop//PL3Compiladores//Linguine//LinguineParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LinguineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, IF=2, THEN=3, ELSE=4, ELSEIF=5, FOR=6, WHILE=7, FUN=8, SHOW=9, 
		MATCH=10, WITH=11, BOOLEAN=12, PIPE=13, ID=14, FLOAT=15, INT=16, STRING=17, 
		PLUS=18, MINUS=19, MUL=20, DIV=21, EQ=22, PLUSPLUS=23, MINUSMINUS=24, 
		GT=25, LT=26, GTE=27, LTE=28, AND=29, OR=30, ASSIGN=31, LPAREN=32, RPAREN=33, 
		COMMA=34, ARROW=35, LCURLY=36, RCURLY=37, SEMICOLON=38, NLINE=39, QEST=40, 
		ESPACIO_BLANCO=41;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_for = 4, RULE_while = 5, RULE_condicional = 6, RULE_funcion = 7, 
		RULE_params = 8, RULE_show = 9, RULE_match = 10, RULE_case = 11, RULE_expresion = 12, 
		RULE_args = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "declaracion", "asignacion", "for", "while", 
			"condicional", "funcion", "params", "show", "match", "case", "expresion", 
			"args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'if'", "'then'", "'else'", "'elseif'", "'for'", "'while'", 
			"'fun'", "'show'", "'match'", "'with'", null, "'|'", null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'=='", "'++'", "'--'", "'>'", "'<'", 
			"'>='", "'<='", "'&&'", "'||'", "'='", "'('", "')'", "','", "'->'", "'{'", 
			"'}'", "';'", null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "IF", "THEN", "ELSE", "ELSEIF", "FOR", "WHILE", "FUN", "SHOW", 
			"MATCH", "WITH", "BOOLEAN", "PIPE", "ID", "FLOAT", "INT", "STRING", "PLUS", 
			"MINUS", "MUL", "DIV", "EQ", "PLUSPLUS", "MINUSMINUS", "GT", "LT", "GTE", 
			"LTE", "AND", "OR", "ASSIGN", "LPAREN", "RPAREN", "COMMA", "ARROW", "LCURLY", 
			"RCURLY", "SEMICOLON", "NLINE", "QEST", "ESPACIO_BLANCO"
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

	@Override
	public String getGrammarFileName() { return "LinguineParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LinguineParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LinguineParser.SEMICOLON, i);
		}
		public List<TerminalNode> NLINE() { return getTokens(LinguineParser.NLINE); }
		public TerminalNode NLINE(int i) {
			return getToken(LinguineParser.NLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4295219142L) != 0)) {
				{
				{
				setState(28);
				sentencia();
				setState(29);
				match(SEMICOLON);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NLINE) {
					{
					setState(30);
					match(NLINE);
					}
				}

				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				show();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				for_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				expresion(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				funcion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(LinguineParser.LET, 0); }
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LinguineParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LET);
			setState(50);
			match(ID);
			setState(51);
			match(ASSIGN);
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case ID:
			case FLOAT:
			case INT:
			case STRING:
			case LPAREN:
				{
				setState(52);
				expresion(0);
				}
				break;
			case IF:
				{
				setState(53);
				condicional();
				}
				break;
			case MATCH:
				{
				setState(54);
				match();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsigCondContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LinguineParser.ASSIGN, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public AsigCondContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode MINUSMINUS() { return getToken(LinguineParser.MINUSMINUS, 0); }
		public DecContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsigMatchContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LinguineParser.ASSIGN, 0); }
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public AsigMatchContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsigSimpleContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LinguineParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsigSimpleContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode PLUSPLUS() { return getToken(LinguineParser.PLUSPLUS, 0); }
		public IncContext(AsignacionContext ctx) { copyFrom(ctx); }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AsigSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				setState(58);
				match(ASSIGN);
				setState(59);
				expresion(0);
				}
				break;
			case 2:
				_localctx = new AsigCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ID);
				setState(61);
				match(ASSIGN);
				setState(62);
				condicional();
				}
				break;
			case 3:
				_localctx = new AsigMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(ID);
				setState(64);
				match(ASSIGN);
				setState(65);
				match();
				}
				break;
			case 4:
				_localctx = new IncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(ID);
				setState(67);
				match(PLUSPLUS);
				}
				break;
			case 5:
				_localctx = new DecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				match(ID);
				setState(69);
				match(MINUSMINUS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LinguineParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LinguineParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LinguineParser.SEMICOLON, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(LinguineParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(LinguineParser.RCURLY, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> NLINE() { return getTokens(LinguineParser.NLINE); }
		public TerminalNode NLINE(int i) {
			return getToken(LinguineParser.NLINE, i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(FOR);
			setState(73);
			match(LPAREN);
			setState(74);
			declaracion();
			setState(75);
			match(SEMICOLON);
			setState(76);
			expresion(0);
			setState(77);
			match(SEMICOLON);
			setState(78);
			asignacion();
			setState(79);
			match(RPAREN);
			setState(80);
			match(LCURLY);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(81);
				match(NLINE);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					sentencia();
					setState(88);
					match(SEMICOLON);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(89);
						match(NLINE);
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(100);
			sentencia();
			setState(101);
			match(SEMICOLON);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(103);
				match(NLINE);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LinguineParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(LinguineParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(LinguineParser.RCURLY, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LinguineParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LinguineParser.SEMICOLON, i);
		}
		public List<TerminalNode> NLINE() { return getTokens(LinguineParser.NLINE); }
		public TerminalNode NLINE(int i) {
			return getToken(LinguineParser.NLINE, i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(WHILE);
			setState(112);
			match(LPAREN);
			setState(113);
			expresion(0);
			setState(114);
			match(RPAREN);
			setState(115);
			match(LCURLY);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(116);
				match(NLINE);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					sentencia();
					setState(123);
					match(SEMICOLON);
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(124);
						match(NLINE);
						}
						}
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(135);
			sentencia();
			setState(136);
			match(SEMICOLON);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(138);
				match(NLINE);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguineParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(LinguineParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(LinguineParser.LPAREN, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(LinguineParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LinguineParser.RPAREN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(LinguineParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(LinguineParser.THEN, i);
		}
		public List<TerminalNode> LCURLY() { return getTokens(LinguineParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(LinguineParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(LinguineParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(LinguineParser.RCURLY, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LinguineParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LinguineParser.SEMICOLON, i);
		}
		public List<TerminalNode> NLINE() { return getTokens(LinguineParser.NLINE); }
		public TerminalNode NLINE(int i) {
			return getToken(LinguineParser.NLINE, i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(LinguineParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(LinguineParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(LinguineParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicional);
		int _la;
		try {
			int _alt;
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(146);
				match(IF);
				setState(147);
				match(LPAREN);
				setState(148);
				expresion(0);
				setState(149);
				match(RPAREN);
				setState(150);
				match(THEN);
				setState(151);
				match(LCURLY);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NLINE) {
					{
					{
					setState(152);
					match(NLINE);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						sentencia();
						setState(159);
						match(SEMICOLON);
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NLINE) {
							{
							{
							setState(160);
							match(NLINE);
							}
							}
							setState(165);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(171);
				sentencia();
				setState(172);
				match(SEMICOLON);
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NLINE) {
					{
					{
					setState(174);
					match(NLINE);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(RCURLY);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(181);
					match(ELSEIF);
					setState(182);
					match(LPAREN);
					setState(183);
					expresion(0);
					setState(184);
					match(RPAREN);
					setState(185);
					match(THEN);
					setState(186);
					match(LCURLY);
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(187);
						match(NLINE);
						}
						}
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					{
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(193);
							sentencia();
							setState(194);
							match(SEMICOLON);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NLINE) {
								{
								{
								setState(195);
								match(NLINE);
								}
								}
								setState(200);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							} 
						}
						setState(205);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					setState(206);
					sentencia();
					setState(207);
					match(SEMICOLON);
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(209);
						match(NLINE);
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(215);
					match(RCURLY);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(222);
					match(ELSE);
					setState(223);
					match(LCURLY);
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(224);
						match(NLINE);
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					{
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(230);
							sentencia();
							setState(231);
							match(SEMICOLON);
							setState(235);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NLINE) {
								{
								{
								setState(232);
								match(NLINE);
								}
								}
								setState(237);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							} 
						}
						setState(242);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(243);
					sentencia();
					setState(244);
					match(SEMICOLON);
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(246);
						match(NLINE);
						}
						}
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(252);
					match(RCURLY);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(256);
				match(IF);
				setState(257);
				match(LPAREN);
				setState(258);
				expresion(0);
				setState(259);
				match(RPAREN);
				setState(260);
				match(THEN);
				setState(261);
				sentencia();
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(262);
					match(ELSE);
					setState(263);
					sentencia();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(LinguineParser.FUN, 0); }
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FUN);
			setState(269);
			match(ID);
			setState(270);
			match(LPAREN);
			setState(271);
			params();
			setState(272);
			match(RPAREN);
			setState(273);
			match(ARROW);
			{
			setState(274);
			sentencia();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LinguineParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LinguineParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguineParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguineParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277);
				match(COMMA);
				setState(278);
				match(ID);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(LinguineParser.SHOW, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(SHOW);
			setState(285);
			match(LPAREN);
			setState(286);
			expresion(0);
			setState(287);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(LinguineParser.MATCH, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(LinguineParser.WITH, 0); }
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public TerminalNode NLINE() { return getToken(LinguineParser.NLINE, 0); }
		public TerminalNode PIPE() { return getToken(LinguineParser.PIPE, 0); }
		public TerminalNode QEST() { return getToken(LinguineParser.QEST, 0); }
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_match);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(MATCH);
			setState(290);
			expresion(0);
			setState(291);
			match(WITH);
			setState(293); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(292);
					case_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NLINE) {
				{
				setState(297);
				match(NLINE);
				setState(298);
				match(PIPE);
				setState(299);
				match(QEST);
				setState(300);
				match(ARROW);
				setState(301);
				expresion(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode NLINE() { return getToken(LinguineParser.NLINE, 0); }
		public TerminalNode PIPE() { return getToken(LinguineParser.PIPE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(NLINE);
			setState(305);
			match(PIPE);
			setState(306);
			expresion(0);
			setState(307);
			match(ARROW);
			setState(308);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExpresionContext {
		public TerminalNode FLOAT() { return getToken(LinguineParser.FLOAT, 0); }
		public FloatContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaFuncionContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public LlamadaFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LinguineParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LinguineParser.DIV, 0); }
		public MulDivContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LinguineParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LinguineParser.MINUS, 0); }
		public AddSubContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExpresionContext {
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public ParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode GT() { return getToken(LinguineParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LinguineParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(LinguineParser.EQ, 0); }
		public TerminalNode LT() { return getToken(LinguineParser.LT, 0); }
		public TerminalNode LTE() { return getToken(LinguineParser.LTE, 0); }
		public RelContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public IdContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpresionContext {
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public StringContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExpresionContext {
		public TerminalNode BOOLEAN() { return getToken(LinguineParser.BOOLEAN, 0); }
		public BooleanContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOrContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LinguineParser.AND, 0); }
		public TerminalNode OR() { return getToken(LinguineParser.OR, 0); }
		public AndOrContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExpresionContext {
		public TerminalNode INT() { return getToken(LinguineParser.INT, 0); }
		public IntContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(311);
				match(LPAREN);
				setState(312);
				expresion(0);
				setState(313);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new LlamadaFuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(ID);
				setState(321);
				match(LPAREN);
				setState(322);
				args();
				setState(323);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(327);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(328);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						expresion(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(330);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(331);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						expresion(11);
						}
						break;
					case 3:
						{
						_localctx = new RelContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(333);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(334);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 507510784L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						expresion(10);
						}
						break;
					case 4:
						{
						_localctx = new AndOrContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(336);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(337);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(338);
						expresion(9);
						}
						break;
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguineParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguineParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expresion(0);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				expresion(0);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u0161\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		" \b\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004\u0005"+
		"\u0004`\b\u0004\n\u0004\f\u0004c\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004i\b\u0004\n\u0004\f\u0004l\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005~\b\u0005\n\u0005\f\u0005\u0081"+
		"\t\u0005\u0005\u0005\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008c\b\u0005\n"+
		"\u0005\f\u0005\u008f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u009a\b\u0006\n\u0006\f\u0006\u009d\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00a2\b\u0006\n\u0006\f\u0006\u00a5\t\u0006\u0005"+
		"\u0006\u00a7\b\u0006\n\u0006\f\u0006\u00aa\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b0\b\u0006\n\u0006\f\u0006\u00b3"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bd\b\u0006\n\u0006\f\u0006"+
		"\u00c0\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c5\b"+
		"\u0006\n\u0006\f\u0006\u00c8\t\u0006\u0005\u0006\u00ca\b\u0006\n\u0006"+
		"\f\u0006\u00cd\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00d3\b\u0006\n\u0006\f\u0006\u00d6\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00da\b\u0006\n\u0006\f\u0006\u00dd\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00e2\b\u0006\n\u0006\f\u0006\u00e5"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ea\b\u0006"+
		"\n\u0006\f\u0006\u00ed\t\u0006\u0005\u0006\u00ef\b\u0006\n\u0006\f\u0006"+
		"\u00f2\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00f8\b\u0006\n\u0006\f\u0006\u00fb\t\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00ff\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0109\b\u0006\u0003"+
		"\u0006\u010b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0118\b\b\n\b\f\b\u011b\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u0126\b\n\u000b\n\f\n\u0127\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u012f\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0146\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0154\b\f\n\f\f\f\u0157\t\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u015c\b\r\n\r\f\r\u015f\t\r\u0001\r\u0000\u0001\u0018\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0004"+
		"\u0001\u0000\u0014\u0015\u0001\u0000\u0012\u0013\u0002\u0000\u0016\u0016"+
		"\u0019\u001c\u0001\u0000\u001d\u001e\u0188\u0000#\u0001\u0000\u0000\u0000"+
		"\u0002/\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006F"+
		"\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000"+
		"\u0000\f\u010a\u0001\u0000\u0000\u0000\u000e\u010c\u0001\u0000\u0000\u0000"+
		"\u0010\u0114\u0001\u0000\u0000\u0000\u0012\u011c\u0001\u0000\u0000\u0000"+
		"\u0014\u0121\u0001\u0000\u0000\u0000\u0016\u0130\u0001\u0000\u0000\u0000"+
		"\u0018\u0145\u0001\u0000\u0000\u0000\u001a\u0158\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001f\u0005&\u0000\u0000\u001e"+
		" \u0005\'\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001c\u0001\u0000\u0000"+
		"\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$\u0001\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&0\u0003\u0006\u0003\u0000\'0\u0003\u0004\u0002\u0000(0\u0003\f\u0006"+
		"\u0000)0\u0003\u0012\t\u0000*0\u0003\u0014\n\u0000+0\u0003\b\u0004\u0000"+
		",0\u0003\n\u0005\u0000-0\u0003\u0018\f\u0000.0\u0003\u000e\u0007\u0000"+
		"/&\u0001\u0000\u0000\u0000/\'\u0001\u0000\u0000\u0000/(\u0001\u0000\u0000"+
		"\u0000/)\u0001\u0000\u0000\u0000/*\u0001\u0000\u0000\u0000/+\u0001\u0000"+
		"\u0000\u0000/,\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001"+
		"\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u000012\u0005\u0001\u0000"+
		"\u000023\u0005\u000e\u0000\u000037\u0005\u001f\u0000\u000048\u0003\u0018"+
		"\f\u000058\u0003\f\u0006\u000068\u0003\u0014\n\u000074\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0005\u0001"+
		"\u0000\u0000\u00009:\u0005\u000e\u0000\u0000:;\u0005\u001f\u0000\u0000"+
		";G\u0003\u0018\f\u0000<=\u0005\u000e\u0000\u0000=>\u0005\u001f\u0000\u0000"+
		">G\u0003\f\u0006\u0000?@\u0005\u000e\u0000\u0000@A\u0005\u001f\u0000\u0000"+
		"AG\u0003\u0014\n\u0000BC\u0005\u000e\u0000\u0000CG\u0005\u0017\u0000\u0000"+
		"DE\u0005\u000e\u0000\u0000EG\u0005\u0018\u0000\u0000F9\u0001\u0000\u0000"+
		"\u0000F<\u0001\u0000\u0000\u0000F?\u0001\u0000\u0000\u0000FB\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000G\u0007\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0006\u0000\u0000IJ\u0005 \u0000\u0000JK\u0003\u0004\u0002\u0000"+
		"KL\u0005&\u0000\u0000LM\u0003\u0018\f\u0000MN\u0005&\u0000\u0000NO\u0003"+
		"\u0006\u0003\u0000OP\u0005!\u0000\u0000PT\u0005$\u0000\u0000QS\u0005\'"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000Ua\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WX\u0003\u0002\u0001\u0000X\\\u0005&\u0000\u0000"+
		"Y[\u0005\'\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0003\u0002\u0001\u0000"+
		"ef\u0005&\u0000\u0000fj\u0001\u0000\u0000\u0000gi\u0005\'\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0005%\u0000\u0000n\t\u0001\u0000\u0000\u0000op\u0005\u0007"+
		"\u0000\u0000pq\u0005 \u0000\u0000qr\u0003\u0018\f\u0000rs\u0005!\u0000"+
		"\u0000sw\u0005$\u0000\u0000tv\u0005\'\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u0084\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z{\u0003\u0002\u0001\u0000{\u007f\u0005&\u0000\u0000|~\u0005\'\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082z\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0002"+
		"\u0001\u0000\u0088\u0089\u0005&\u0000\u0000\u0089\u008d\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0005\'\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005%\u0000\u0000\u0091"+
		"\u000b\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093"+
		"\u0094\u0005 \u0000\u0000\u0094\u0095\u0003\u0018\f\u0000\u0095\u0096"+
		"\u0005!\u0000\u0000\u0096\u0097\u0005\u0003\u0000\u0000\u0097\u009b\u0005"+
		"$\u0000\u0000\u0098\u009a\u0005\'\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a8\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u0002"+
		"\u0001\u0000\u009f\u00a3\u0005&\u0000\u0000\u00a0\u00a2\u0005\'\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0003\u0002\u0001\u0000\u00ac\u00ad\u0005&\u0000\u0000"+
		"\u00ad\u00b1\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\'\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00db\u0005%\u0000\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000\u00b6\u00b7"+
		"\u0005 \u0000\u0000\u00b7\u00b8\u0003\u0018\f\u0000\u00b8\u00b9\u0005"+
		"!\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u00be\u0005$\u0000"+
		"\u0000\u00bb\u00bd\u0005\'\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u0002\u0001\u0000"+
		"\u00c2\u00c6\u0005&\u0000\u0000\u00c3\u00c5\u0005\'\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c1\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0003\u0002\u0001\u0000\u00cf\u00d0\u0005&\u0000\u0000\u00d0\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005\'\u0000\u0000\u00d2\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"%\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00b5\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0004"+
		"\u0000\u0000\u00df\u00e3\u0005$\u0000\u0000\u00e0\u00e2\u0005\'\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00f0\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0003\u0002\u0001\u0000\u00e7\u00eb\u0005&\u0000\u0000"+
		"\u00e8\u00ea\u0005\'\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003\u0002\u0001\u0000\u00f4"+
		"\u00f5\u0005&\u0000\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0005\'\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005%\u0000\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00de\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u010b\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0002"+
		"\u0000\u0000\u0101\u0102\u0005 \u0000\u0000\u0102\u0103\u0003\u0018\f"+
		"\u0000\u0103\u0104\u0005!\u0000\u0000\u0104\u0105\u0005\u0003\u0000\u0000"+
		"\u0105\u0108\u0003\u0002\u0001\u0000\u0106\u0107\u0005\u0004\u0000\u0000"+
		"\u0107\u0109\u0003\u0002\u0001\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000"+
		"\u010a\u0092\u0001\u0000\u0000\u0000\u010a\u0100\u0001\u0000\u0000\u0000"+
		"\u010b\r\u0001\u0000\u0000\u0000\u010c\u010d\u0005\b\u0000\u0000\u010d"+
		"\u010e\u0005\u000e\u0000\u0000\u010e\u010f\u0005 \u0000\u0000\u010f\u0110"+
		"\u0003\u0010\b\u0000\u0110\u0111\u0005!\u0000\u0000\u0111\u0112\u0005"+
		"#\u0000\u0000\u0112\u0113\u0003\u0002\u0001\u0000\u0113\u000f\u0001\u0000"+
		"\u0000\u0000\u0114\u0119\u0005\u000e\u0000\u0000\u0115\u0116\u0005\"\u0000"+
		"\u0000\u0116\u0118\u0005\u000e\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0011\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011d\u0005\t\u0000\u0000"+
		"\u011d\u011e\u0005 \u0000\u0000\u011e\u011f\u0003\u0018\f\u0000\u011f"+
		"\u0120\u0005!\u0000\u0000\u0120\u0013\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\n\u0000\u0000\u0122\u0123\u0003\u0018\f\u0000\u0123\u0125\u0005"+
		"\u000b\u0000\u0000\u0124\u0126\u0003\u0016\u000b\u0000\u0125\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012e\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005\'\u0000\u0000\u012a\u012b\u0005\r"+
		"\u0000\u0000\u012b\u012c\u0005(\u0000\u0000\u012c\u012d\u0005#\u0000\u0000"+
		"\u012d\u012f\u0003\u0018\f\u0000\u012e\u0129\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0015\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005\'\u0000\u0000\u0131\u0132\u0005\r\u0000\u0000\u0132\u0133"+
		"\u0003\u0018\f\u0000\u0133\u0134\u0005#\u0000\u0000\u0134\u0135\u0003"+
		"\u0018\f\u0000\u0135\u0017\u0001\u0000\u0000\u0000\u0136\u0137\u0006\f"+
		"\uffff\uffff\u0000\u0137\u0138\u0005 \u0000\u0000\u0138\u0139\u0003\u0018"+
		"\f\u0000\u0139\u013a\u0005!\u0000\u0000\u013a\u0146\u0001\u0000\u0000"+
		"\u0000\u013b\u0146\u0005\f\u0000\u0000\u013c\u0146\u0005\u000e\u0000\u0000"+
		"\u013d\u0146\u0005\u0010\u0000\u0000\u013e\u0146\u0005\u000f\u0000\u0000"+
		"\u013f\u0146\u0005\u0011\u0000\u0000\u0140\u0141\u0005\u000e\u0000\u0000"+
		"\u0141\u0142\u0005 \u0000\u0000\u0142\u0143\u0003\u001a\r\u0000\u0143"+
		"\u0144\u0005!\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0136"+
		"\u0001\u0000\u0000\u0000\u0145\u013b\u0001\u0000\u0000\u0000\u0145\u013c"+
		"\u0001\u0000\u0000\u0000\u0145\u013d\u0001\u0000\u0000\u0000\u0145\u013e"+
		"\u0001\u0000\u0000\u0000\u0145\u013f\u0001\u0000\u0000\u0000\u0145\u0140"+
		"\u0001\u0000\u0000\u0000\u0146\u0155\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\n\u000b\u0000\u0000\u0148\u0149\u0007\u0000\u0000\u0000\u0149\u0154\u0003"+
		"\u0018\f\f\u014a\u014b\n\n\u0000\u0000\u014b\u014c\u0007\u0001\u0000\u0000"+
		"\u014c\u0154\u0003\u0018\f\u000b\u014d\u014e\n\t\u0000\u0000\u014e\u014f"+
		"\u0007\u0002\u0000\u0000\u014f\u0154\u0003\u0018\f\n\u0150\u0151\n\b\u0000"+
		"\u0000\u0151\u0152\u0007\u0003\u0000\u0000\u0152\u0154\u0003\u0018\f\t"+
		"\u0153\u0147\u0001\u0000\u0000\u0000\u0153\u014a\u0001\u0000\u0000\u0000"+
		"\u0153\u014d\u0001\u0000\u0000\u0000\u0153\u0150\u0001\u0000\u0000\u0000"+
		"\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0019\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015d\u0003\u0018\f\u0000\u0159"+
		"\u015a\u0005\"\u0000\u0000\u015a\u015c\u0003\u0018\f\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u001b"+
		"\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000$\u001f#/"+
		"7FT\\ajw\u007f\u0084\u008d\u009b\u00a3\u00a8\u00b1\u00be\u00c6\u00cb\u00d4"+
		"\u00db\u00e3\u00eb\u00f0\u00f9\u00fe\u0108\u010a\u0119\u0127\u012e\u0145"+
		"\u0153\u0155\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}