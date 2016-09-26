package com.pb.workflow.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Tarush Grover
 */
@JsonRootName(value = "aggs")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Aggregation {

    @JsonProperty("aggregation_count")
    public AggregationCount aggregationCount;

    @JsonProperty("aggregation_sum")
    public AggregationSum aggregationSum;

    public Aggregation() {

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

    /**
     * @return
     */
    public AggregationSum getAggregationSum() {
        return aggregationSum;
    }

    /**
     * @param aggregationSum
     */
    public void setAggregationSum(AggregationSum aggregationSum) {
        this.aggregationSum = aggregationSum;
    }

    @Override
    public int hashCode() {
        return (this.aggregationCount != null && this.aggregationSum != null) ?
                (aggregationCount.hashCode() + 31 * aggregationSum.hashCode()) : (this.aggregationCount != null ? this.aggregationCount.hashCode() : this.aggregationSum.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Aggregation aggr = (Aggregation) obj;

        return this.aggregationCount.equals(aggr.aggregationCount) &&
                this.aggregationSum.equals(aggr.aggregationSum);
    }

}
