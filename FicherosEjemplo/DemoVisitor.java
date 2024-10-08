// Generated from Demo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DemoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(DemoParser.PlusContext ctx);
}