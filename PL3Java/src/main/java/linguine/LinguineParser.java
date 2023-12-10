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
		LET=1, IF=2, THEN=3, ELSE=4, FUN=5, SHOW=6, MATCH=7, WITH=8, PIPE=9, ID=10, 
		INT=11, STRING=12, PLUS=13, MINUS=14, MUL=15, DIV=16, EQ=17, GT=18, LT=19, 
		GTE=20, LTE=21, ASSIGN=22, LPAREN=23, RPAREN=24, COMMA=25, ARROW=26, SEMICOLON=27, 
		NLINE=28, QEST=29, ESPACIO_BLANCO=30;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_asignacion = 2, RULE_condicional = 3, 
		RULE_funcion = 4, RULE_params = 5, RULE_show = 6, RULE_match = 7, RULE_cases = 8, 
		RULE_case = 9, RULE_expresion = 10, RULE_llamada_funcion = 11, RULE_args = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "asignacion", "condicional", "funcion", "params", 
			"show", "match", "cases", "case", "expresion", "llamada_funcion", "args"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8396006L) != 0)) {
				{
				{
				setState(26);
				sentencia();
				setState(27);
				match(SEMICOLON);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NLINE) {
					{
					setState(28);
					match(NLINE);
					}
				}

				}
				}
				setState(35);
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
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(36);
				asignacion();
				}
				break;
			case 2:
				{
				setState(37);
				condicional();
				}
				break;
			case 3:
				{
				setState(38);
				show();
				}
				break;
			case 4:
				{
				setState(39);
				match();
				}
				break;
			case 5:
				{
				setState(40);
				llamada_funcion();
				}
				break;
			case 6:
				{
				setState(41);
				expresion(0);
				}
				break;
			case 7:
				{
				setState(42);
				funcion();
				}
				break;
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
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LET);
			setState(46);
			match(ID);
			setState(47);
			match(ASSIGN);
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case STRING:
			case LPAREN:
				{
				setState(48);
				expresion(0);
				}
				break;
			case IF:
				{
				setState(49);
				condicional();
				}
				break;
			case MATCH:
				{
				setState(50);
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguineParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(LinguineParser.THEN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
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
		enterRule(_localctx, 6, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(IF);
			setState(54);
			match(LPAREN);
			setState(55);
			expresion(0);
			setState(56);
			match(RPAREN);
			setState(57);
			match(THEN);
			setState(58);
			sentencia();
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(59);
				match(ELSE);
				setState(60);
				sentencia();
				}
				break;
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
		enterRule(_localctx, 8, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(FUN);
			setState(64);
			match(ID);
			setState(65);
			match(LPAREN);
			setState(66);
			params();
			setState(67);
			match(RPAREN);
			setState(68);
			match(ARROW);
			{
			setState(69);
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
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				match(ID);
				}
				}
				setState(78);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(SHOW);
			setState(80);
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
		enterRule(_localctx, 14, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(MATCH);
			setState(83);
			expresion(0);
			setState(84);
			match(WITH);
			setState(85);
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
		enterRule(_localctx, 16, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				match(NLINE);
				setState(88);
				case_();
				}
				}
				setState(91); 
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
		enterRule(_localctx, 18, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PIPE);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case STRING:
			case LPAREN:
				{
				setState(94);
				expresion(0);
				}
				break;
			case QEST:
				{
				setState(95);
				match(QEST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			match(ARROW);
			setState(99);
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
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode INT() { return getToken(LinguineParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LinguineParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LinguineParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(LinguineParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LinguineParser.MINUS, 0); }
		public TerminalNode GT() { return getToken(LinguineParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LinguineParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(LinguineParser.EQ, 0); }
		public TerminalNode LT() { return getToken(LinguineParser.LT, 0); }
		public TerminalNode LTE() { return getToken(LinguineParser.LTE, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitExpresion(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(102);
				match(LPAREN);
				setState(103);
				expresion(0);
				setState(104);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(106);
				match(ID);
				}
				break;
			case 3:
				{
				setState(107);
				match(INT);
				}
				break;
			case 4:
				{
				setState(108);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(109);
				llamada_funcion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(112);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(113);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						expresion(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(115);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(116);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						expresion(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(118);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(119);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguineParserListener ) ((LinguineParserListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguineParserVisitor ) return ((LinguineParserVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(LPAREN);
			setState(128);
			args();
			setState(129);
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
		enterRule(_localctx, 24, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			expresion(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				expresion(0);
				}
				}
				setState(138);
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
		case 10:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001e"+
		"\b\u0000\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003>\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005K\b\u0005\n\u0005\f\u0005N\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0004\bZ\b\b\u000b\b\f\b[\u0001\t\u0001\t\u0001"+
		"\t\u0003\ta\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\no\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nz\b"+
		"\n\n\n\f\n}\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0087\b\f\n\f\f\f\u008a\t\f\u0001"+
		"\f\u0000\u0001\u0014\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0003\u0001\u0000\u000f\u0010\u0001\u0000\r\u000e"+
		"\u0001\u0000\u0011\u0015\u0094\u0000!\u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000"+
		"\u0000\b?\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000\u0000\fO\u0001"+
		"\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000"+
		"\u0000\u0012]\u0001\u0000\u0000\u0000\u0014n\u0001\u0000\u0000\u0000\u0016"+
		"~\u0001\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0003\u0002\u0001\u0000\u001b\u001d\u0005\u001b\u0000\u0000\u001c\u001e"+
		"\u0005\u001c\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001a\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"\u0001\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$,\u0003\u0004\u0002\u0000%,\u0003\u0006\u0003\u0000"+
		"&,\u0003\f\u0006\u0000\',\u0003\u000e\u0007\u0000(,\u0003\u0016\u000b"+
		"\u0000),\u0003\u0014\n\u0000*,\u0003\b\u0004\u0000+$\u0001\u0000\u0000"+
		"\u0000+%\u0001\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000"+
		"\u0000\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000"+
		"\u0000./\u0005\n\u0000\u0000/3\u0005\u0016\u0000\u000004\u0003\u0014\n"+
		"\u000014\u0003\u0006\u0003\u000024\u0003\u000e\u0007\u000030\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u00004\u0005"+
		"\u0001\u0000\u0000\u000056\u0005\u0002\u0000\u000067\u0005\u0017\u0000"+
		"\u000078\u0003\u0014\n\u000089\u0005\u0018\u0000\u00009:\u0005\u0003\u0000"+
		"\u0000:=\u0003\u0002\u0001\u0000;<\u0005\u0004\u0000\u0000<>\u0003\u0002"+
		"\u0001\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0007"+
		"\u0001\u0000\u0000\u0000?@\u0005\u0005\u0000\u0000@A\u0005\n\u0000\u0000"+
		"AB\u0005\u0017\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005\u0018\u0000\u0000"+
		"DE\u0005\u001a\u0000\u0000EF\u0003\u0002\u0001\u0000F\t\u0001\u0000\u0000"+
		"\u0000GL\u0005\n\u0000\u0000HI\u0005\u0019\u0000\u0000IK\u0005\n\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000M\u000b\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0003\u0014\n\u0000"+
		"Q\r\u0001\u0000\u0000\u0000RS\u0005\u0007\u0000\u0000ST\u0003\u0014\n"+
		"\u0000TU\u0005\b\u0000\u0000UV\u0003\u0010\b\u0000V\u000f\u0001\u0000"+
		"\u0000\u0000WX\u0005\u001c\u0000\u0000XZ\u0003\u0012\t\u0000YW\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u0011\u0001\u0000\u0000\u0000]`\u0005\t\u0000\u0000"+
		"^a\u0003\u0014\n\u0000_a\u0005\u001d\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u001a\u0000"+
		"\u0000cd\u0003\u0014\n\u0000d\u0013\u0001\u0000\u0000\u0000ef\u0006\n"+
		"\uffff\uffff\u0000fg\u0005\u0017\u0000\u0000gh\u0003\u0014\n\u0000hi\u0005"+
		"\u0018\u0000\u0000io\u0001\u0000\u0000\u0000jo\u0005\n\u0000\u0000ko\u0005"+
		"\u000b\u0000\u0000lo\u0005\f\u0000\u0000mo\u0003\u0016\u000b\u0000ne\u0001"+
		"\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o{\u0001\u0000\u0000"+
		"\u0000pq\n\b\u0000\u0000qr\u0007\u0000\u0000\u0000rz\u0003\u0014\n\ts"+
		"t\n\u0007\u0000\u0000tu\u0007\u0001\u0000\u0000uz\u0003\u0014\n\bvw\n"+
		"\u0006\u0000\u0000wx\u0007\u0002\u0000\u0000xz\u0003\u0014\n\u0007yp\u0001"+
		"\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u0015\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\n\u0000\u0000\u007f\u0080\u0005\u0017\u0000\u0000\u0080\u0081\u0003"+
		"\u0018\f\u0000\u0081\u0082\u0005\u0018\u0000\u0000\u0082\u0017\u0001\u0000"+
		"\u0000\u0000\u0083\u0088\u0003\u0014\n\u0000\u0084\u0085\u0005\u0019\u0000"+
		"\u0000\u0085\u0087\u0003\u0014\n\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0019\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\f\u001d!+3=L[`ny{\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}