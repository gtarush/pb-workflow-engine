/**
 * 
 */
package com.pb.workflow.domain;

/**
 * @author Tarush Grover
 *
 */
public class Query implements IQuerySet{
	
	private QueryExpression queryExpression;
	
	private Result result;
	
	public Query(){
		
	}
	
	public Query(QueryExpression queryExpression, Result result){
		this.queryExpression = queryExpression;
		this.result = result;
	}

	public QueryExpression getQueryExpression() {
		return queryExpression;
	}

	public void setQueryExpression(QueryExpression queryExpression) {
		this.queryExpression = queryExpression;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = new Result(result);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Query query = (Query) o;

        if (result != null ? !result.equals(query.result) : query.result != null) return false;
        if (queryExpression != null ? !queryExpression.equals(query.queryExpression) : query.queryExpression != null) return false;

        return true;
	}
	
	@Override
	public int hashCode() {
		int hashcode = queryExpression != null ? queryExpression.hashCode() : 0;
        hashcode = 31 * hashcode + (result != null ? result.hashCode() : 0);
        return hashcode;
	}
	
}
