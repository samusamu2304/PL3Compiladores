// Generated from /Users/samuelpintilei/PL3Compiladores/Linguine/LinguineParser.g4 by ANTLR 4.13.1
package linguine;
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
		RULE_params = 8, RULE_show = 9, RULE_match = 10, RULE_cases = 11, RULE_case = 12, 
		RULE_expresion = 13, RULE_args = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "declaracion", "asignacion", "for", "while", 
			"condicional", "funcion", "params", "show", "match", "cases", "case", 
			"expresion", "args"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4295219142L) != 0)) {
				{
				{
				setState(30);
				sentencia();
				setState(31);
				match(SEMICOLON);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NLINE) {
					{
					setState(32);
					match(NLINE);
					}
				}

				}
				}
				setState(39);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				show();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				for_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				expresion(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LET);
			setState(52);
			match(ID);
			setState(53);
			match(ASSIGN);
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case ID:
			case FLOAT:
			case INT:
			case STRING:
			case LPAREN:
				{
				setState(54);
				expresion(0);
				}
				break;
			case IF:
				{
				setState(55);
				condicional();
				}
				break;
			case MATCH:
				{
				setState(56);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterAsigCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitAsigCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitAsigCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode MINUSMINUS() { return getToken(LinguineParser.MINUSMINUS, 0); }
		public DecContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsigMatchContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LinguineParser.ASSIGN, 0); }
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public AsigMatchContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterAsigMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitAsigMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitAsigMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsigSimpleContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LinguineParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsigSimpleContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterAsigSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitAsigSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitAsigSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode PLUSPLUS() { return getToken(LinguineParser.PLUSPLUS, 0); }
		public IncContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AsigSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(ID);
				setState(60);
				match(ASSIGN);
				setState(61);
				expresion(0);
				}
				break;
			case 2:
				_localctx = new AsigCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(ID);
				setState(63);
				match(ASSIGN);
				setState(64);
				condicional();
				}
				break;
			case 3:
				_localctx = new AsigMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(ID);
				setState(66);
				match(ASSIGN);
				setState(67);
				match();
				}
				break;
			case 4:
				_localctx = new IncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(ID);
				setState(69);
				match(PLUSPLUS);
				}
				break;
			case 5:
				_localctx = new DecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(ID);
				setState(71);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(FOR);
			setState(75);
			match(LPAREN);
			setState(76);
			declaracion();
			setState(77);
			match(SEMICOLON);
			setState(78);
			expresion(0);
			setState(79);
			match(SEMICOLON);
			setState(80);
			asignacion();
			setState(81);
			match(RPAREN);
			setState(82);
			match(LCURLY);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(83);
				match(NLINE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					sentencia();
					setState(90);
					match(SEMICOLON);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(91);
						match(NLINE);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(102);
			sentencia();
			setState(103);
			match(SEMICOLON);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(105);
				match(NLINE);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(WHILE);
			setState(114);
			match(LPAREN);
			setState(115);
			expresion(0);
			setState(116);
			match(RPAREN);
			setState(117);
			match(LCURLY);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(118);
				match(NLINE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					sentencia();
					setState(125);
					match(SEMICOLON);
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(126);
						match(NLINE);
						}
						}
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(137);
			sentencia();
			setState(138);
			match(SEMICOLON);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(140);
				match(NLINE);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IF);
			setState(149);
			match(LPAREN);
			setState(150);
			expresion(0);
			setState(151);
			match(RPAREN);
			setState(152);
			match(THEN);
			setState(153);
			match(LCURLY);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(154);
				match(NLINE);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					sentencia();
					setState(161);
					match(SEMICOLON);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NLINE) {
						{
						{
						setState(162);
						match(NLINE);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(173);
			sentencia();
			setState(174);
			match(SEMICOLON);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLINE) {
				{
				{
				setState(176);
				match(NLINE);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(RCURLY);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(183);
				match(ELSEIF);
				setState(184);
				match(LPAREN);
				setState(185);
				expresion(0);
				setState(186);
				match(RPAREN);
				setState(187);
				match(THEN);
				setState(188);
				match(LCURLY);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NLINE) {
					{
					{
					setState(189);
					match(NLINE);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(195);
						sentencia();
						setState(196);
						match(SEMICOLON);
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NLINE) {
							{
							{
							setState(197);
							match(NLINE);
							}
							}
							setState(202);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(208);
				sentencia();
				setState(209);
				match(SEMICOLON);
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NLINE) {
					{
					{
					setState(211);
					match(NLINE);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(RCURLY);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(224);
				match(ELSE);
				setState(225);
				match(LCURLY);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NLINE) {
					{
					{
					setState(226);
					match(NLINE);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232);
						sentencia();
						setState(233);
						match(SEMICOLON);
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NLINE) {
							{
							{
							setState(234);
							match(NLINE);
							}
							}
							setState(239);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(245);
				sentencia();
				setState(246);
				match(SEMICOLON);
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NLINE) {
					{
					{
					setState(248);
					match(NLINE);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(RCURLY);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(FUN);
			setState(259);
			match(ID);
			setState(260);
			match(LPAREN);
			setState(261);
			params();
			setState(262);
			match(RPAREN);
			setState(263);
			match(ARROW);
			{
			setState(264);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				match(ID);
				}
				}
				setState(273);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(SHOW);
			setState(275);
			match(LPAREN);
			setState(276);
			expresion(0);
			setState(277);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(LinguineParser.WITH, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(MATCH);
			setState(280);
			expresion(0);
			setState(281);
			match(WITH);
			setState(282);
			cases();
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
	public static class CasesContext extends ParserRuleContext {
		public List<TerminalNode> NLINE() { return getTokens(LinguineParser.NLINE); }
		public TerminalNode NLINE(int i) {
			return getToken(LinguineParser.NLINE, i);
		}
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284);
				match(NLINE);
				setState(285);
				case_();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NLINE );
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
		public TerminalNode PIPE() { return getToken(LinguineParser.PIPE, 0); }
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode QEST() { return getToken(LinguineParser.QEST, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(PIPE);
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case ID:
			case FLOAT:
			case INT:
			case STRING:
			case LPAREN:
				{
				setState(291);
				expresion(0);
				}
				break;
			case QEST:
				{
				setState(292);
				match(QEST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(295);
			match(ARROW);
			setState(296);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExpresionContext {
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public ParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public IdContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpresionContext {
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public StringContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExpresionContext {
		public TerminalNode BOOLEAN() { return getToken(LinguineParser.BOOLEAN, 0); }
		public BooleanContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExpresionContext {
		public TerminalNode INT() { return getToken(LinguineParser.INT, 0); }
		public IntContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(299);
				match(LPAREN);
				setState(300);
				expresion(0);
				setState(301);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new LlamadaFuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(ID);
				setState(309);
				match(LPAREN);
				setState(310);
				args();
				setState(311);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(315);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(316);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						expresion(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(318);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(319);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expresion(11);
						}
						break;
					case 3:
						{
						_localctx = new RelContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(321);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(322);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 507510784L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expresion(10);
						}
						break;
					case 4:
						{
						_localctx = new AndOrContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(324);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(325);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						expresion(9);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			expresion(0);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(333);
				match(COMMA);
				setState(334);
				expresion(0);
				}
				}
				setState(339);
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
		case 13:
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
		"\u0004\u0001)\u0155\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\"\b\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004"+
		"X\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004]\b\u0004\n\u0004"+
		"\f\u0004`\t\u0004\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004k\b\u0004\n\u0004"+
		"\f\u0004n\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005x\b\u0005\n\u0005"+
		"\f\u0005{\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0080"+
		"\b\u0005\n\u0005\f\u0005\u0083\t\u0005\u0005\u0005\u0085\b\u0005\n\u0005"+
		"\f\u0005\u0088\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u008e\b\u0005\n\u0005\f\u0005\u0091\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u009c\b\u0006\n\u0006\f\u0006\u009f\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a4\b\u0006\n\u0006"+
		"\f\u0006\u00a7\t\u0006\u0005\u0006\u00a9\b\u0006\n\u0006\f\u0006\u00ac"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b2"+
		"\b\u0006\n\u0006\f\u0006\u00b5\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00bf\b\u0006\n\u0006\f\u0006\u00c2\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00c7\b\u0006\n\u0006\f\u0006\u00ca\t\u0006\u0005\u0006"+
		"\u00cc\b\u0006\n\u0006\f\u0006\u00cf\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00d5\b\u0006\n\u0006\f\u0006\u00d8\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00dc\b\u0006\n\u0006\f\u0006\u00df"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00e4\b\u0006"+
		"\n\u0006\f\u0006\u00e7\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00ec\b\u0006\n\u0006\f\u0006\u00ef\t\u0006\u0005\u0006\u00f1\b"+
		"\u0006\n\u0006\f\u0006\u00f4\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00fa\b\u0006\n\u0006\f\u0006\u00fd\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0101\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u010e\b\b\n\b\f\b\u0111\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u011f\b\u000b\u000b\u000b\f\u000b\u0120"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0126\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u013a\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0148\b\r\n\r\f\r\u014b\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0150\b\u000e\n\u000e\f\u000e\u0153\t\u000e\u0001"+
		"\u000e\u0000\u0001\u001a\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0004\u0001\u0000\u0014\u0015"+
		"\u0001\u0000\u0012\u0013\u0002\u0000\u0016\u0016\u0019\u001c\u0001\u0000"+
		"\u001d\u001e\u0179\u0000%\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000"+
		"\u0000\u00043\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"J\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\f\u0094\u0001\u0000"+
		"\u0000\u0000\u000e\u0102\u0001\u0000\u0000\u0000\u0010\u010a\u0001\u0000"+
		"\u0000\u0000\u0012\u0112\u0001\u0000\u0000\u0000\u0014\u0117\u0001\u0000"+
		"\u0000\u0000\u0016\u011e\u0001\u0000\u0000\u0000\u0018\u0122\u0001\u0000"+
		"\u0000\u0000\u001a\u0139\u0001\u0000\u0000\u0000\u001c\u014c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f!\u0005&\u0000\u0000"+
		" \"\u0005\'\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#\u001e\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\u0001\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(2\u0003\u0006"+
		"\u0003\u0000)2\u0003\u0004\u0002\u0000*2\u0003\f\u0006\u0000+2\u0003\u0012"+
		"\t\u0000,2\u0003\u0014\n\u0000-2\u0003\b\u0004\u0000.2\u0003\n\u0005\u0000"+
		"/2\u0003\u001a\r\u000002\u0003\u000e\u0007\u00001(\u0001\u0000\u0000\u0000"+
		"1)\u0001\u0000\u0000\u00001*\u0001\u0000\u0000\u00001+\u0001\u0000\u0000"+
		"\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0003"+
		"\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u000045\u0005\u000e\u0000"+
		"\u000059\u0005\u001f\u0000\u00006:\u0003\u001a\r\u00007:\u0003\f\u0006"+
		"\u00008:\u0003\u0014\n\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005"+
		"\u000e\u0000\u0000<=\u0005\u001f\u0000\u0000=I\u0003\u001a\r\u0000>?\u0005"+
		"\u000e\u0000\u0000?@\u0005\u001f\u0000\u0000@I\u0003\f\u0006\u0000AB\u0005"+
		"\u000e\u0000\u0000BC\u0005\u001f\u0000\u0000CI\u0003\u0014\n\u0000DE\u0005"+
		"\u000e\u0000\u0000EI\u0005\u0017\u0000\u0000FG\u0005\u000e\u0000\u0000"+
		"GI\u0005\u0018\u0000\u0000H;\u0001\u0000\u0000\u0000H>\u0001\u0000\u0000"+
		"\u0000HA\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000"+
		"KL\u0005 \u0000\u0000LM\u0003\u0004\u0002\u0000MN\u0005&\u0000\u0000N"+
		"O\u0003\u001a\r\u0000OP\u0005&\u0000\u0000PQ\u0003\u0006\u0003\u0000Q"+
		"R\u0005!\u0000\u0000RV\u0005$\u0000\u0000SU\u0005\'\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000Wc\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000YZ\u0003\u0002\u0001\u0000Z^\u0005&\u0000\u0000[]\u0005\'\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fg\u0003\u0002\u0001\u0000gh\u0005&\u0000"+
		"\u0000hl\u0001\u0000\u0000\u0000ik\u0005\'\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005"+
		"%\u0000\u0000p\t\u0001\u0000\u0000\u0000qr\u0005\u0007\u0000\u0000rs\u0005"+
		" \u0000\u0000st\u0003\u001a\r\u0000tu\u0005!\u0000\u0000uy\u0005$\u0000"+
		"\u0000vx\u0005\'\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0086\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0003\u0002\u0001\u0000"+
		"}\u0081\u0005&\u0000\u0000~\u0080\u0005\'\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084|\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u0002\u0001"+
		"\u0000\u008a\u008b\u0005&\u0000\u0000\u008b\u008f\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0005\'\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005%\u0000\u0000\u0093\u000b"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096"+
		"\u0005 \u0000\u0000\u0096\u0097\u0003\u001a\r\u0000\u0097\u0098\u0005"+
		"!\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009d\u0005$\u0000"+
		"\u0000\u009a\u009c\u0005\'\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00aa\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0002\u0001\u0000"+
		"\u00a1\u00a5\u0005&\u0000\u0000\u00a2\u00a4\u0005\'\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0003\u0002\u0001\u0000\u00ae\u00af\u0005&\u0000\u0000\u00af\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\'\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00dd\u0005"+
		"%\u0000\u0000\u00b7\u00b8\u0005\u0005\u0000\u0000\u00b8\u00b9\u0005 \u0000"+
		"\u0000\u00b9\u00ba\u0003\u001a\r\u0000\u00ba\u00bb\u0005!\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00c0\u0005$\u0000\u0000\u00bd"+
		"\u00bf\u0005\'\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00cd\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u0002\u0001\u0000\u00c4\u00c8"+
		"\u0005&\u0000\u0000\u00c5\u00c7\u0005\'\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003"+
		"\u0002\u0001\u0000\u00d1\u00d2\u0005&\u0000\u0000\u00d2\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d5\u0005\'\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005%\u0000\u0000"+
		"\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00b7\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u0100\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0004\u0000\u0000"+
		"\u00e1\u00e5\u0005$\u0000\u0000\u00e2\u00e4\u0005\'\u0000\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00f2\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0003\u0002\u0001\u0000\u00e9\u00ed\u0005&\u0000\u0000\u00ea\u00ec"+
		"\u0005\'\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00e8\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0003\u0002\u0001\u0000\u00f6\u00f7\u0005"+
		"&\u0000\u0000\u00f7\u00fb\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\'"+
		"\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005%\u0000\u0000\u00ff\u0101\u0001\u0000\u0000"+
		"\u0000\u0100\u00e0\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\r\u0001\u0000\u0000\u0000\u0102\u0103\u0005\b\u0000\u0000"+
		"\u0103\u0104\u0005\u000e\u0000\u0000\u0104\u0105\u0005 \u0000\u0000\u0105"+
		"\u0106\u0003\u0010\b\u0000\u0106\u0107\u0005!\u0000\u0000\u0107\u0108"+
		"\u0005#\u0000\u0000\u0108\u0109\u0003\u0002\u0001\u0000\u0109\u000f\u0001"+
		"\u0000\u0000\u0000\u010a\u010f\u0005\u000e\u0000\u0000\u010b\u010c\u0005"+
		"\"\u0000\u0000\u010c\u010e\u0005\u000e\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0011\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005\t\u0000"+
		"\u0000\u0113\u0114\u0005 \u0000\u0000\u0114\u0115\u0003\u001a\r\u0000"+
		"\u0115\u0116\u0005!\u0000\u0000\u0116\u0013\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005\n\u0000\u0000\u0118\u0119\u0003\u001a\r\u0000\u0119\u011a"+
		"\u0005\u000b\u0000\u0000\u011a\u011b\u0003\u0016\u000b\u0000\u011b\u0015"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005\'\u0000\u0000\u011d\u011f\u0003"+
		"\u0018\f\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0017\u0001\u0000\u0000\u0000\u0122\u0125\u0005\r\u0000"+
		"\u0000\u0123\u0126\u0003\u001a\r\u0000\u0124\u0126\u0005(\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005#\u0000\u0000\u0128"+
		"\u0129\u0003\u001a\r\u0000\u0129\u0019\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0006\r\uffff\uffff\u0000\u012b\u012c\u0005 \u0000\u0000\u012c\u012d"+
		"\u0003\u001a\r\u0000\u012d\u012e\u0005!\u0000\u0000\u012e\u013a\u0001"+
		"\u0000\u0000\u0000\u012f\u013a\u0005\f\u0000\u0000\u0130\u013a\u0005\u000e"+
		"\u0000\u0000\u0131\u013a\u0005\u0010\u0000\u0000\u0132\u013a\u0005\u000f"+
		"\u0000\u0000\u0133\u013a\u0005\u0011\u0000\u0000\u0134\u0135\u0005\u000e"+
		"\u0000\u0000\u0135\u0136\u0005 \u0000\u0000\u0136\u0137\u0003\u001c\u000e"+
		"\u0000\u0137\u0138\u0005!\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000"+
		"\u0139\u012a\u0001\u0000\u0000\u0000\u0139\u012f\u0001\u0000\u0000\u0000"+
		"\u0139\u0130\u0001\u0000\u0000\u0000\u0139\u0131\u0001\u0000\u0000\u0000"+
		"\u0139\u0132\u0001\u0000\u0000\u0000\u0139\u0133\u0001\u0000\u0000\u0000"+
		"\u0139\u0134\u0001\u0000\u0000\u0000\u013a\u0149\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\n\u000b\u0000\u0000\u013c\u013d\u0007\u0000\u0000\u0000\u013d"+
		"\u0148\u0003\u001a\r\f\u013e\u013f\n\n\u0000\u0000\u013f\u0140\u0007\u0001"+
		"\u0000\u0000\u0140\u0148\u0003\u001a\r\u000b\u0141\u0142\n\t\u0000\u0000"+
		"\u0142\u0143\u0007\u0002\u0000\u0000\u0143\u0148\u0003\u001a\r\n\u0144"+
		"\u0145\n\b\u0000\u0000\u0145\u0146\u0007\u0003\u0000\u0000\u0146\u0148"+
		"\u0003\u001a\r\t\u0147\u013b\u0001\u0000\u0000\u0000\u0147\u013e\u0001"+
		"\u0000\u0000\u0000\u0147\u0141\u0001\u0000\u0000\u0000\u0147\u0144\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u001b\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0151\u0003"+
		"\u001a\r\u0000\u014d\u014e\u0005\"\u0000\u0000\u014e\u0150\u0003\u001a"+
		"\r\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u001d\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\"!%19HV^cly\u0081\u0086\u008f\u009d\u00a5\u00aa\u00b3\u00c0\u00c8"+
		"\u00cd\u00d6\u00dd\u00e5\u00ed\u00f2\u00fb\u0100\u010f\u0120\u0125\u0139"+
		"\u0147\u0149\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}