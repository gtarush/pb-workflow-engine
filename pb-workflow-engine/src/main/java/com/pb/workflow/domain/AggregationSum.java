package com.pb.workflow.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Tarush Grover
 * Created on 9/25/2016.
 */
public class AggregationSum {

    @JsonProperty("sum")
    public Sum sum;

    /**
     * @param sum
     */
    public AggregationSum(Sum sum){
        this.sum = sum;
    }

    /**
     * @return
     */
    public Sum getSum() {
        return sum;
    }

    /**
     * @param sum
     */
    public void setSum(Sum sum) {
        this.sum = sum;
    }
}
