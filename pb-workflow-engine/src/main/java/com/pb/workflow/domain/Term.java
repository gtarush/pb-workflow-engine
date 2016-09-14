/**
 * 
 */
package com.pb.workflow.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Tarush Grover
 *
 */
public class Term {
	
	@JsonProperty("field")
	public String field;
	
	public Term() {
		
	}
	
	public Term(String field){
		this.field = field;
	}
	
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

}
