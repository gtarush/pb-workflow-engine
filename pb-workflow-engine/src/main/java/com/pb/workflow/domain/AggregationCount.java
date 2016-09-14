/**
 * 
 */
package com.pb.workflow.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Tarush Grover
 *
 */
public class AggregationCount {
	
	@JsonProperty("term")
	public Term term;
	
	public AggregationCount(Term term){
		this.term = term;
	}

	/**
	 * @return the term
	 */
	public Term getTerm() {
		return term;
	}

	/**
	 * @param term the term to set
	 */
	public void setTerm(Term term) {
		this.term = term;
	}
	
	

}
