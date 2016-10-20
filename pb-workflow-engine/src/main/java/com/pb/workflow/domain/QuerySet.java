package com.pb.workflow.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * This class is the main parent class to form a complete query.
 * @author Tarush Grover
 *
 */
public class QuerySet implements IQuerySet{
	
	//public final List<Query> queries;

    @Getter
    @Setter
	private Aggregation aggregation;

	public QuerySet(){
		//this.queries = new ArrayList<>();
		//this.aggregation = new Aggregation();
	}
	
	/*public QuerySet(Collection<Query> queries){
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
	}*/

}
