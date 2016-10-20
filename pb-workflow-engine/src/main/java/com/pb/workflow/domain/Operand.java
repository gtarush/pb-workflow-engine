package com.pb.workflow.domain;

import lombok.Data;

/**
 * @author Tarush Grover
 * Created on 10/14/2016.
 */
@Data
public class Operand {
    private String variable;

    public Operand(String operand) {
        variable = operand;
    }
}
