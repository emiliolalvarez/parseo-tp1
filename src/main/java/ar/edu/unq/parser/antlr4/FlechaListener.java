// Generated from /home/sb2/www/parseo/FlechaParser/src/main/antlr4/Flecha.g4 by ANTLR 4.7
package ar.edu.unq.parser.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlechaParser}.
 */
public interface FlechaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlechaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FlechaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FlechaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#program1}.
	 * @param ctx the parse tree
	 */
	void enterProgram1(FlechaParser.Program1Context ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#program1}.
	 * @param ctx the parse tree
	 */
	void exitProgram1(FlechaParser.Program1Context ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(FlechaParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(FlechaParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FlechaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FlechaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#externalExpression}.
	 * @param ctx the parse tree
	 */
	void enterExternalExpression(FlechaParser.ExternalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#externalExpression}.
	 * @param ctx the parse tree
	 */
	void exitExternalExpression(FlechaParser.ExternalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(FlechaParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(FlechaParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseBranch(FlechaParser.ElseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseBranch(FlechaParser.ElseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(FlechaParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(FlechaParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#caseBranches}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranches(FlechaParser.CaseBranchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#caseBranches}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranches(FlechaParser.CaseBranchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(FlechaParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(FlechaParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void enterLetExpression(FlechaParser.LetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void exitLetExpression(FlechaParser.LetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(FlechaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(FlechaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#internalExpression}.
	 * @param ctx the parse tree
	 */
	void enterInternalExpression(FlechaParser.InternalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#internalExpression}.
	 * @param ctx the parse tree
	 */
	void exitInternalExpression(FlechaParser.InternalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#internalExpression2}.
	 * @param ctx the parse tree
	 */
	void enterInternalExpression2(FlechaParser.InternalExpression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#internalExpression2}.
	 * @param ctx the parse tree
	 */
	void exitInternalExpression2(FlechaParser.InternalExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(FlechaParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(FlechaParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(FlechaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(FlechaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#applicationExpresion}.
	 * @param ctx the parse tree
	 */
	void enterApplicationExpresion(FlechaParser.ApplicationExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#applicationExpresion}.
	 * @param ctx the parse tree
	 */
	void exitApplicationExpresion(FlechaParser.ApplicationExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(FlechaParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(FlechaParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#listExpression2}.
	 * @param ctx the parse tree
	 */
	void enterListExpression2(FlechaParser.ListExpression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#listExpression2}.
	 * @param ctx the parse tree
	 */
	void exitListExpression2(FlechaParser.ListExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(FlechaParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(FlechaParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlechaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FlechaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlechaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FlechaParser.ParametersContext ctx);
}