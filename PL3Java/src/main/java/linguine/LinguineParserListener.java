// Generated from /Users/samuelpintilei/PL3Compiladores/Linguine/LinguineParser.g4 by ANTLR 4.13.1
package linguine;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguineParser}.
 */
public interface LinguineParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguineParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LinguineParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LinguineParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(LinguineParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(LinguineParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(LinguineParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(LinguineParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LinguineParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LinguineParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(LinguineParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(LinguineParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LinguineParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LinguineParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(LinguineParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(LinguineParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(LinguineParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(LinguineParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LinguineParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LinguineParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(LinguineParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(LinguineParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(LinguineParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(LinguineParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(LinguineParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(LinguineParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(LinguineParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(LinguineParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(LinguineParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(LinguineParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(LinguineParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(LinguineParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguineParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LinguineParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguineParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LinguineParser.ArgsContext ctx);
}