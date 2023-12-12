// Generated from /Users/samuelpintilei/PL3Compiladores/Linguine/LinguineParser.g4 by ANTLR 4.13.1
package linguine;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguineParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguineParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LinguineParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(LinguineParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LinguineParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsigSimple}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigSimple(LinguineParser.AsigSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsigCond}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigCond(LinguineParser.AsigCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsigMatch}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigMatch(LinguineParser.AsigMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inc}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(LinguineParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dec}
	 * labeled alternative in {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(LinguineParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LinguineParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LinguineParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(LinguineParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(LinguineParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LinguineParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(LinguineParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(LinguineParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(LinguineParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(LinguineParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LinguineParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(LinguineParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LlamadaFuncion}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(LinguineParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LinguineParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LinguineParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LinguineParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rel}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(LinguineParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LinguineParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LinguineParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(LinguineParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LinguineParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(LinguineParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguineParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LinguineParser.ArgsContext ctx);
}