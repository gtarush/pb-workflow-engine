package com.pb.workflow.constants;

/**
 * @author Tarush Grover
 *         Created on 10/14/2016.
 */
public enum Relation {

    EQUAL("="),
    GREATER(">")
    ;

    private String operator;

    Relation(String operator) {
        this.operator = operator;
    }
}
