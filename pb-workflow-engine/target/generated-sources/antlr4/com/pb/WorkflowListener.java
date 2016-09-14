// Generated from com\pb\Workflow.g4 by ANTLR 4.3
package com.pb;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WorkflowParser}.
 */
public interface WorkflowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WorkflowParser#aggregationExpr}.
	 * @param ctx the parse tree
	 */
	void enterAggregationExpr(@NotNull WorkflowParser.AggregationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkflowParser#aggregationExpr}.
	 * @param ctx the parse tree
	 */
	void exitAggregationExpr(@NotNull WorkflowParser.AggregationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link WorkflowParser#singleQuery}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuery(@NotNull WorkflowParser.SingleQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkflowParser#singleQuery}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuery(@NotNull WorkflowParser.SingleQueryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code QueryExpressionAfter}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionAfter(@NotNull WorkflowParser.QueryExpressionAfterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExpressionAfter}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionAfter(@NotNull WorkflowParser.QueryExpressionAfterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterCondition}
	 * labeled alternative in {@link WorkflowParser#filter_conditions}.
	 * @param ctx the parse tree
	 */
	void enterFilterCondition(@NotNull WorkflowParser.FilterConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterCondition}
	 * labeled alternative in {@link WorkflowParser#filter_conditions}.
	 * @param ctx the parse tree
	 */
	void exitFilterCondition(@NotNull WorkflowParser.FilterConditionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code QueryVariable}
	 * labeled alternative in {@link WorkflowParser#query_entity}.
	 * @param ctx the parse tree
	 */
	void enterQueryVariable(@NotNull WorkflowParser.QueryVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryVariable}
	 * labeled alternative in {@link WorkflowParser#query_entity}.
	 * @param ctx the parse tree
	 */
	void exitQueryVariable(@NotNull WorkflowParser.QueryVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link WorkflowParser#querySet}.
	 * @param ctx the parse tree
	 */
	void enterQuerySet(@NotNull WorkflowParser.QuerySetContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkflowParser#querySet}.
	 * @param ctx the parse tree
	 */
	void exitQuerySet(@NotNull WorkflowParser.QuerySetContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AggregationAvg}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregationAvg(@NotNull WorkflowParser.AggregationAvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AggregationAvg}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregationAvg(@NotNull WorkflowParser.AggregationAvgContext ctx);

	/**
	 * Enter a parse tree produced by the {@code QueryExpressionInParen}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionInParen(@NotNull WorkflowParser.QueryExpressionInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExpressionInParen}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionInParen(@NotNull WorkflowParser.QueryExpressionInParenContext ctx);

	/**
	 * Enter a parse tree produced by the {@code QueryEntity}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryEntity(@NotNull WorkflowParser.QueryEntityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryEntity}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryEntity(@NotNull WorkflowParser.QueryEntityContext ctx);

	/**
	 * Enter a parse tree produced by the {@code QueryExpressionBefore}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionBefore(@NotNull WorkflowParser.QueryExpressionBeforeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExpressionBefore}
	 * labeled alternative in {@link WorkflowParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionBefore(@NotNull WorkflowParser.QueryExpressionBeforeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterConditionAnd}
	 * labeled alternative in {@link WorkflowParser#filter_conditions}.
	 * @param ctx the parse tree
	 */
	void enterFilterConditionAnd(@NotNull WorkflowParser.FilterConditionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterConditionAnd}
	 * labeled alternative in {@link WorkflowParser#filter_conditions}.
	 * @param ctx the parse tree
	 */
	void exitFilterConditionAnd(@NotNull WorkflowParser.FilterConditionAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IndexName}
	 * labeled alternative in {@link WorkflowParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(@NotNull WorkflowParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexName}
	 * labeled alternative in {@link WorkflowParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(@NotNull WorkflowParser.IndexNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link WorkflowParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull WorkflowParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkflowParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull WorkflowParser.ResultContext ctx);

	/**
	 * Enter a parse tree produced by {@link WorkflowParser#filter_condition}.
	 * @param ctx the parse tree
	 */
	void enterFilter_condition(@NotNull WorkflowParser.Filter_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkflowParser#filter_condition}.
	 * @param ctx the parse tree
	 */
	void exitFilter_condition(@NotNull WorkflowParser.Filter_conditionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AggregationCount}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregationCount(@NotNull WorkflowParser.AggregationCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AggregationCount}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregationCount(@NotNull WorkflowParser.AggregationCountContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AggregationSum}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregationSum(@NotNull WorkflowParser.AggregationSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AggregationSum}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregationSum(@NotNull WorkflowParser.AggregationSumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterConditionOr}
	 * labeled alternative in {@link WorkflowParser#filter_conditions}.
	 * @param ctx the parse tree
	 */
	void enterFilterConditionOr(@NotNull WorkflowParser.FilterConditionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterConditionOr}
	 * labeled alternative in {@link WorkflowParser#filter_conditions}.
	 * @param ctx the parse tree
	 */
	void exitFilterConditionOr(@NotNull WorkflowParser.FilterConditionOrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ExpressionVariable}
	 * labeled alternative in {@link WorkflowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionVariable(@NotNull WorkflowParser.ExpressionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionVariable}
	 * labeled alternative in {@link WorkflowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionVariable(@NotNull WorkflowParser.ExpressionVariableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AggregationExpression}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregationExpression(@NotNull WorkflowParser.AggregationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AggregationExpression}
	 * labeled alternative in {@link WorkflowParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregationExpression(@NotNull WorkflowParser.AggregationExpressionContext ctx);
}