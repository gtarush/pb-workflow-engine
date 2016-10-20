package com.pb.workflow.domain;

import com.pb.workflow.constants.Relation;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tarush Grover
 * Created on 10/14/2016.
 */
@Data
@NoArgsConstructor
public class SearchBinaryOperator {
    private Operand leftOperand;
    private Operand rightOperand;
    private Relation operator;
}
