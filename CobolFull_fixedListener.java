// Generated from CobolFull_fixed.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CobolFull_fixedParser}.
 */
public interface CobolFull_fixedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CobolFull_fixedParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CobolFull_fixedParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#idDivision}.
	 * @param ctx the parse tree
	 */
	void enterIdDivision(CobolFull_fixedParser.IdDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#idDivision}.
	 * @param ctx the parse tree
	 */
	void exitIdDivision(CobolFull_fixedParser.IdDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#dataDivision}.
	 * @param ctx the parse tree
	 */
	void enterDataDivision(CobolFull_fixedParser.DataDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#dataDivision}.
	 * @param ctx the parse tree
	 */
	void exitDataDivision(CobolFull_fixedParser.DataDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#dataItem}.
	 * @param ctx the parse tree
	 */
	void enterDataItem(CobolFull_fixedParser.DataItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#dataItem}.
	 * @param ctx the parse tree
	 */
	void exitDataItem(CobolFull_fixedParser.DataItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivision(CobolFull_fixedParser.ProcedureDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivision(CobolFull_fixedParser.ProcedureDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CobolFull_fixedParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CobolFull_fixedParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#displayStmt}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStmt(CobolFull_fixedParser.DisplayStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#displayStmt}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStmt(CobolFull_fixedParser.DisplayStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#moveStmt}.
	 * @param ctx the parse tree
	 */
	void enterMoveStmt(CobolFull_fixedParser.MoveStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#moveStmt}.
	 * @param ctx the parse tree
	 */
	void exitMoveStmt(CobolFull_fixedParser.MoveStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#addStmt}.
	 * @param ctx the parse tree
	 */
	void enterAddStmt(CobolFull_fixedParser.AddStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#addStmt}.
	 * @param ctx the parse tree
	 */
	void exitAddStmt(CobolFull_fixedParser.AddStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolFull_fixedParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void enterStopStmt(CobolFull_fixedParser.StopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolFull_fixedParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void exitStopStmt(CobolFull_fixedParser.StopStmtContext ctx);
}