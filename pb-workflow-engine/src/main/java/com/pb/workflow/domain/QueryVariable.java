/**
 * 
 */
package com.pb.workflow.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Tarush Grover
 *
 */
public class QueryVariable extends QueryExpression{

	private final String variableName;
	
	public QueryVariable(String type) {
		super(type);
		this.variableName = type;
	}
    @JsonProperty("n")
    public String getVariableName() {
        return variableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QueryVariable other = (QueryVariable) o;
        if (variableName != null ? !variableName.equals(other.variableName) : other.variableName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return variableName != null ? variableName.hashCode() : 0;
    }

}
