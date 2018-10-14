package ar.edu.unq.parser;

import ar.edu.unq.parser.antlr4.FlechaListener;
import ar.edu.unq.parser.antlr4.FlechaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.ArrayList;
import java.util.List;

public class FlechaListenerParser implements FlechaListener {

    private List<String> output = new ArrayList<>();
    private Integer indentation = 0;
    private Integer listExpressionLevel = 0;

    private void clearOutputBuffer() {
        output = new ArrayList<>();
    }

    private void indent() {
        output.add(StringUtils.repeat(" ", indentation));
    }

    private void increaseIndentation() {
        indentation+=1;
    }

    private void decreaseIndentation() {
        indentation-=1;
    }

    private void increaseIndentationAndIndent() {
        increaseIndentation();
        indent();
    }

    private void addBreakLine() {
        output.add("\n");
    }

    public String getOutput() {
        return StringUtils.join(output, "");
    }

    @Override
    public void enterProgram(FlechaParser.ProgramContext ctx) {
        output.add("[");
    }

    @Override
    public void exitProgram(FlechaParser.ProgramContext ctx) {
        addBreakLine();
        output.add("]");
        addBreakLine();
    }


    @Override
    public void enterProgram1(FlechaParser.Program1Context ctx) {

    }

    @Override
    public void exitProgram1(FlechaParser.Program1Context ctx) {

    }


    @Override
    public void enterDefinition(FlechaParser.DefinitionContext ctx) {
        addBreakLine();
        increaseIndentationAndIndent();
        output.add("[");
        output.add("\"" + StringUtils.capitalize(ctx.DEF().toString()) + "\", \"" + ctx.LOWERID() + "\",");
    }

    @Override
    public void exitDefinition(FlechaParser.DefinitionContext ctx) {
        Boolean isLastNode = ctx.getParent().children.get(1).getChildCount() == 0;
        addBreakLine();
        indent();
        output.add("]" + (isLastNode ? "" : "," ));
        decreaseIndentation();
    }

    @Override
    public void enterExpression(FlechaParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(FlechaParser.ExpressionContext ctx) {

    }

    @Override
    public void enterExternalExpression(FlechaParser.ExternalExpressionContext ctx) {

    }

    @Override
    public void exitExternalExpression(FlechaParser.ExternalExpressionContext ctx) {

    }

    @Override
    public void enterIfExpression(FlechaParser.IfExpressionContext ctx) {

    }

    @Override
    public void exitIfExpression(FlechaParser.IfExpressionContext ctx) {

    }

    @Override
    public void enterElseBranch(FlechaParser.ElseBranchContext ctx) {

    }

    @Override
    public void exitElseBranch(FlechaParser.ElseBranchContext ctx) {

    }

    @Override
    public void enterCaseExpression(FlechaParser.CaseExpressionContext ctx) {

    }

    @Override
    public void exitCaseExpression(FlechaParser.CaseExpressionContext ctx) {

    }

    @Override
    public void enterCaseBranches(FlechaParser.CaseBranchesContext ctx) {

    }

    @Override
    public void exitCaseBranches(FlechaParser.CaseBranchesContext ctx) {

    }

    @Override
    public void enterCaseBranch(FlechaParser.CaseBranchContext ctx) {

    }

    @Override
    public void exitCaseBranch(FlechaParser.CaseBranchContext ctx) {

    }

    @Override
    public void enterLetExpression(FlechaParser.LetExpressionContext ctx) {

    }

    @Override
    public void exitLetExpression(FlechaParser.LetExpressionContext ctx) {

    }

    @Override
    public void enterLambdaExpression(FlechaParser.LambdaExpressionContext ctx) {

    }

    @Override
    public void exitLambdaExpression(FlechaParser.LambdaExpressionContext ctx) {

    }

    @Override
    public void enterListExpression(FlechaParser.ListExpressionContext ctx) {
        listExpressionLevel++;
        if (listExpressionLevel == 1) {
            addBreakLine();
            increaseIndentationAndIndent();
        }
        output.add("[\"ExprApply\",");
        addBreakLine();
        increaseIndentationAndIndent();
        output.add("[\"ExprApply\",");
        addBreakLine();
        increaseIndentationAndIndent();
        output.add("[\"ExprConstructor\", \"Cons\"],");
        decreaseIndentation();
    }

    @Override
    public void exitListExpression(FlechaParser.ListExpressionContext ctx) {
        addBreakLine();
        indent();
        output.add("]");
        if (listExpressionLevel == 1) {
            decreaseIndentation();
        }
        listExpressionLevel--;
    }

    @Override
    public void enterListExpression2(FlechaParser.ListExpression2Context ctx) {
        addBreakLine();
        indent();
        output.add("],");
        decreaseIndentation();
    }

    @Override
    public void exitListExpression2(FlechaParser.ListExpression2Context ctx) {

    }

    @Override
    public void enterInternalExpression(FlechaParser.InternalExpressionContext ctx) {
    }

    @Override
    public void exitInternalExpression(FlechaParser.InternalExpressionContext ctx) {

    }

    @Override
    public void enterInternalExpression2(FlechaParser.InternalExpression2Context ctx) {

    }

    @Override
    public void exitInternalExpression2(FlechaParser.InternalExpression2Context ctx) {

    }

    @Override
    public void enterBinaryOperator(FlechaParser.BinaryOperatorContext ctx) {

    }

    @Override
    public void exitBinaryOperator(FlechaParser.BinaryOperatorContext ctx) {

    }

    @Override
    public void enterUnaryOperator(FlechaParser.UnaryOperatorContext ctx) {

    }

    @Override
    public void exitUnaryOperator(FlechaParser.UnaryOperatorContext ctx) {

    }

    @Override
    public void enterApplicationExpresion(FlechaParser.ApplicationExpresionContext ctx) {

    }

    @Override
    public void exitApplicationExpresion(FlechaParser.ApplicationExpresionContext ctx) {
    }

    @Override
    public void enterAtomicExpression(FlechaParser.AtomicExpressionContext ctx) {
        addBreakLine();
        increaseIndentationAndIndent();
        if (ctx.NUMBER() != null) {
            output.add("[\"ExprNumber\", " + Integer.parseInt(ctx.NUMBER().getText()) + "]");
        } else if(ctx.LOWERID() !=null) {
            output.add("[\"ExprVar\", \"" + ctx.LOWERID().getText() + "\"]");
        } else if(ctx.CHAR() !=null && ctx.CHAR().getText().length() < 4) {
            output.add("[\"ExprChar\", " + ((int)ctx.CHAR().getText().charAt(1)) + "]");
        }  else if(ctx.CHAR() !=null && ctx.CHAR().getText().length() == 4) {
            output.add("[\"ExprChar\", " + (int)StringEscapeUtils.unescapeJava(ctx.CHAR().getText().substring(1,3)).charAt(0) + "]");
        }  else if(ctx.UPPERID() != null) {
            output.add("[\"ExprConstructor\", \"" + ctx.UPPERID().getText() + "\"]");
        }

    }

    @Override
    public void exitAtomicExpression(FlechaParser.AtomicExpressionContext ctx) {
        decreaseIndentation();
    }

    @Override
    public void enterParameters(FlechaParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(FlechaParser.ParametersContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}

