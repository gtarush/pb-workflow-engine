/**
 * 
 */
package com.pb.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pb.workflow.core.Compiler;
import com.pb.workflow.domain.QuerySet;

/**
 * @author Tarush Grover
 *
 */
public class WorkflowApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Compiler compiler = new Compiler();
        QuerySet compile = compiler.compile("report count(color) from name filter (y > x) end;");

        //JSON serialization
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(compile.getAggregation());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
	}
}

