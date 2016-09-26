package com.pb.workflow.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Tarush Grover
 * Created on 9/25/2016.
 */
public class Sum {

    @JsonProperty("field")
    public String field;

    public Sum() {

    }

    public Sum(String field){
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
