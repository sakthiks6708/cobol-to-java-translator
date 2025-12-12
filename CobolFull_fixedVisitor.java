// Generated from CobolFull_fixed.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CobolFull_fixedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CobolFull_fixedVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CobolFull_fixedParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#idDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDivision(CobolFull_fixedParser.IdDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#dataDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDivision(CobolFull_fixedParser.DataDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#dataItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataItem(CobolFull_fixedParser.DataItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#procedureDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivision(CobolFull_fixedParser.ProcedureDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CobolFull_fixedParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#displayStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStmt(CobolFull_fixedParser.DisplayStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#moveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveStmt(CobolFull_fixedParser.MoveStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#addStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddStmt(CobolFull_fixedParser.AddStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolFull_fixedParser#stopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStmt(CobolFull_fixedParser.StopStmtContext ctx);
}