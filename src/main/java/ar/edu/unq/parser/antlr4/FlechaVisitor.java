// Generated from /home/sb2/www/parseo/FlechaParser/src/main/antlr4/Flecha.g4 by ANTLR 4.7
package ar.edu.unq.parser.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlechaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlechaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlechaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FlechaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#program1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram1(FlechaParser.Program1Context ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(FlechaParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FlechaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#externalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalExpression(FlechaParser.ExternalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(FlechaParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#elseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBranch(FlechaParser.ElseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(FlechaParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#caseBranches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranches(FlechaParser.CaseBranchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(FlechaParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#letExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpression(FlechaParser.LetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(FlechaParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#internalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalExpression(FlechaParser.InternalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#internalExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalExpression2(FlechaParser.InternalExpression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(FlechaParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(FlechaParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#applicationExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationExpresion(FlechaParser.ApplicationExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(FlechaParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#listExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression2(FlechaParser.ListExpression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#atomicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpression(FlechaParser.AtomicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlechaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FlechaParser.ParametersContext ctx);
}