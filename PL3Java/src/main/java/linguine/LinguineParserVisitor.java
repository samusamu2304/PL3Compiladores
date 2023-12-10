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
	 * Visit a parse tree produced by {@link LinguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LinguineParser.AsignacionContext ctx);
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
	 * Visit a parse tree produced by {@link LinguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LinguineParser.ExpresionContext ctx);
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