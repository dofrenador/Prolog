// Generated from LabeledExpr.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(LabeledExprParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LabeledExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LabeledExprParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LabeledExprParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(LabeledExprParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(LabeledExprParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(LabeledExprParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Increment}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(LabeledExprParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(LabeledExprParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(LabeledExprParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LabeledExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LabeledExprParser.IntContext ctx);
}