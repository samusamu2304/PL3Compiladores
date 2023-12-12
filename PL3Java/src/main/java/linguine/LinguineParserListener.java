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
	 * Enter a parse tree produced by the {@code AsigSimple}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsigSimple(LinguineParser.AsigSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsigSimple}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsigSimple(LinguineParser.AsigSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsigCond}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsigCond(LinguineParser.AsigCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsigCond}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsigCond(LinguineParser.AsigCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsigMatch}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsigMatch(LinguineParser.AsigMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsigMatch}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsigMatch(LinguineParser.AsigMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inc}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterInc(LinguineParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inc}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitInc(LinguineParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dec}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterDec(LinguineParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dec}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitDec(LinguineParser.DecContext ctx);
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
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LinguineParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LinguineParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterBool(LinguineParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitBool(LinguineParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LlamadaFuncion}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(LinguineParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LlamadaFuncion}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(LinguineParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LinguineParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LinguineParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LinguineParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LinguineParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(LinguineParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(LinguineParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rel}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterRel(LinguineParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rel}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitRel(LinguineParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterId(LinguineParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitId(LinguineParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterString(LinguineParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitString(LinguineParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(LinguineParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(LinguineParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterInt(LinguineParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitInt(LinguineParser.IntContext ctx);
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