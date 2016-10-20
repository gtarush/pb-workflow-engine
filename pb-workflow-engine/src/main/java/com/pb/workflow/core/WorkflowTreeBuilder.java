/**
 *
 */
package com.pb.workflow.core;

import java.util.Stack;

import com.pb.WorkflowBaseListener;
import com.pb.WorkflowParser;
import com.pb.WorkflowParser.AggregationCountContext;
import com.pb.WorkflowParser.AggregationExprContext;
import com.pb.WorkflowParser.ExpressionVariableContext;
import com.pb.WorkflowParser.QuerySetContext;
import com.pb.WorkflowParser.SingleQueryContext;
import com.pb.workflow.constants.Relation;
import com.pb.workflow.domain.*;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * @author Tarush Grover
 */
@SuppressWarnings("all")
public class WorkflowTreeBuilder extends WorkflowBaseListener {

    private QuerySet querySet = null;
    private Aggregation aggregation;

    private Stack<String> fieldsStack = new Stack<>();

    private Stack<SearchComparisonExpression> comparisonExpressions = new Stack<>();

    private SearchComparisonExpression searchComparisonExpression;

    private SearchBinaryOperator searchBinaryOperator;

    private Stack<SearchBinaryOperator> operators = new Stack<>();

    @Override
    public void enterQuerySet(QuerySetContext ctx) {
        querySet = new QuerySet();
    }

    public QuerySet getQuerySet() {
        return querySet;
    }

    public Aggregation getAggregation() {
        return querySet.getAggregation();
    }

    @Override
    public void enterAggregationExpr(AggregationExprContext ctx) {
        //System.out.println("enter aggregation expr");
        this.aggregation = new Aggregation();
    }

    @Override
    public void exitAggregationExpr(AggregationExprContext ctx) {
        //System.out.println("exit aggr expr");
        this.querySet.setAggregation(aggregation);
    }

    @Override
    public void exitAggregationCount(AggregationCountContext ctx) {
        //System.out.println("exit aggr count");
        AggregationCount aggrCount = new AggregationCount(new Term());
        aggrCount.getTerm().setField(fieldsStack.pop());
        this.aggregation.setAggregationCount(aggrCount);
    }

    @Override
    public void exitAggregationSum(@NotNull WorkflowParser.AggregationSumContext ctx) {
        AggregationSum aggregationSum = new AggregationSum(new Sum());
        aggregationSum.getSum().setField(fieldsStack.pop());
        this.aggregation.setAggregationSum(aggregationSum);
    }

    @Override
    public void enterSingleQuery(SingleQueryContext ctx) {
        //System.out.println("enter single query");
    }

    @Override
    public void exitSingleQuery(SingleQueryContext ctx) {
        //System.out.println("exit single query");
    }

    @Override
    public void exitExpressionVariable(ExpressionVariableContext ctx) {
        //System.out.println("exit expression variable");
        fieldsStack.push(ctx.getText());
    }

    @Override public void exitFilterCondition(@NotNull WorkflowParser.FilterConditionContext ctx) {
        System.out.println("exitFilterCondition");
        // logic to package all filter conditions into one search query.
    }

    @Override public void exitFilterConditionInParen(@NotNull WorkflowParser.FilterConditionInParenContext ctx) {
        System.out.println("exitFilterConditionInParen");
    }

    @Override public void exitFilterConditionAnd(@NotNull WorkflowParser.FilterConditionAndContext ctx) {
        System.out.println("exitFilterConditionAnd");
    }

    @Override public void exitComparisonExpression(@NotNull WorkflowParser.ComparisonExpressionContext ctx) {
        System.out.println("exitComparisonExpression - text = " + ctx.getText());
    }

    @Override public void exitComparisonExpressionWithOperator(
        @NotNull WorkflowParser.ComparisonExpressionWithOperatorContext ctx) {
        System.out.println("exitComparisonExpressionWithOperator - text = " + ctx.getText());
    }

    @Override public void exitComparisonOperand(@NotNull WorkflowParser.ComparisonOperandContext ctx) {
        System.out.println("exitComparisonOperand - text = " + ctx.getText());
    }

    @Override public void exitComparisonOperator(@NotNull WorkflowParser.ComparisonOperatorContext ctx) {
        /*System.out.println("exitComparisonOperator - text = " + ctx.getText());*/
        if (!operators.isEmpty()) {
            searchBinaryOperator = operators.pop();
            searchBinaryOperator.setOperator(getRelation(ctx.getText()));
            operators.push(searchBinaryOperator);
            resetBinaryOperator();
        }
    }

    private Relation getRelation(@NotNull String operator) {
        Relation relation = null;
        switch (operator) {
            case "=":
                relation = Relation.EQUAL;
                break;
            case ">":
                relation = Relation.GREATER;
                break;
        }
        return relation;
    }

    @Override public void exitNumericVariable(@NotNull WorkflowParser.NumericVariableContext ctx) {
        if(operators.isEmpty()) {
            searchBinaryOperator = new SearchBinaryOperator();
            searchBinaryOperator.setLeftOperand(new Operand(ctx.getText()));
            operators.push(searchBinaryOperator);
            resetBinaryOperator();
        } else {
            searchBinaryOperator = operators.pop();
            if (searchBinaryOperator.getLeftOperand() == null) {
                searchBinaryOperator.setLeftOperand(new Operand(ctx.getText()));
            } else {
                searchBinaryOperator.setRightOperand(new Operand(ctx.getText()));
            }
            operators.push(searchBinaryOperator);
            resetBinaryOperator();
        }
    }

    private void resetBinaryOperator() {
        this.searchBinaryOperator = null;
    }
}
