package com.pb.workflow.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Tarush Grover
 *
 */
@JsonRootName(value = "aggs")
public class Aggregation {
	
	@JsonProperty("aggregation_count")
	public AggregationCount aggregationCount;
	
	public Aggregation(){
		
	}

	/**
	 * @return the aggregationCount
	 */
	public AggregationCount getAggregationCount() {
		return aggregationCount;
	}

	/**
	 * @param aggregationCount the aggregationCount to set
	 */
	public void setAggregationCount(AggregationCount aggregationCount) {
		this.aggregationCount = aggregationCount;
	}
	
	@Override
	public int hashCode() {
		return this.aggregationCount != null ? aggregationCount.hashCode() : 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) return false;
		
		Aggregation aggr = (Aggregation)obj;
		
		return this.aggregationCount.equals(aggr.aggregationCount);
	}

}
