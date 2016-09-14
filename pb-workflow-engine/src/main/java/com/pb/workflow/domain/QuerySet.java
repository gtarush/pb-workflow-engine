/**
 * 
 */
package com.pb.workflow.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Tarush Grover
 *
 */
public class QuerySet implements IQuerySet{
	
	public final List<Query> queries;
	
	public Aggregation aggregation;
	
	/**
	 * @param aggregation the aggregation to set
	 */
	public void setAggregation(Aggregation aggregation) {
		this.aggregation = aggregation;
	}

	/**
	 * @return the aggregation
	 */
	public Aggregation getAggregation() {
		return aggregation;
	}

	public QuerySet(){
		this.queries = new ArrayList<>();
		this.aggregation = new Aggregation();
	}
	
	public QuerySet(Collection<Query> queries){
		this.queries = new ArrayList<>(queries);
	}
	
	public List<Query> getQueries(){
		return Collections.unmodifiableList(queries);
	}
	
	public void addQuery(Query query){
		this.queries.add(query);
	}
	
	@Override
	public int hashCode() {
		return queries!= null ? queries.hashCode():0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) return false;
		
		QuerySet querySet = (QuerySet)obj;
		return this.queries.equals(querySet.queries);
	}

}
