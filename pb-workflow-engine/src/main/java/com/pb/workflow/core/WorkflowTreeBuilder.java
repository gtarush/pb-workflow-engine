/**
 * 
 */
package com.pb.workflow.core;

import java.util.Stack;

import com.pb.WorkflowBaseListener;
import com.pb.WorkflowParser.AggregationCountContext;
import com.pb.WorkflowParser.AggregationExprContext;
import com.pb.WorkflowParser.ExpressionVariableContext;
import com.pb.WorkflowParser.QuerySetContext;
import com.pb.WorkflowParser.SingleQueryContext;
import com.pb.workflow.domain.Aggregation;
import com.pb.workflow.domain.AggregationCount;
import com.pb.workflow.domain.QuerySet;
import com.pb.workflow.domain.Term;

/**
 * @author Tarush Grover
 *
 */
public class WorkflowTreeBuilder extends WorkflowBaseListener{
	
	private QuerySet querySet = null;
	private Aggregation aggregation;
	
	private Stack<String> fieldsStack = new Stack<>();

	@Override
	public void enterQuerySet(QuerySetContext ctx) {
		querySet = new QuerySet();
	}
	
	public QuerySet getQuerySet(){
		return querySet;
	}
	
	public Aggregation getAggregation(){
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
}
