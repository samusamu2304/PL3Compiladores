// Generated from Demo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DemoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DemoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterPlus(DemoParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitPlus(DemoParser.PlusContext ctx);
}