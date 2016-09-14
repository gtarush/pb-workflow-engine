/**
 * 
 */
package com.pb.workflow.domain;

/**
 * @author Tarush Grover
 *
 */
public abstract class QueryExpression implements IQuerySet{
	
	private final String type;

    protected QueryExpression(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
