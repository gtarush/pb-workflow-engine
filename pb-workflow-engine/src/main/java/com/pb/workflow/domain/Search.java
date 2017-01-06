/**
 Licensed to the Apache Software Foundation (ASF) under one
 or more contributor license agreements.  See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership.  The ASF licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */
package com.pb.workflow.domain;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

/**
 * @author Tarush Grover
 * Created on 10/14/2016.
 */
@JsonSerialize(using = Search.SearchSerializer.class)
@SuppressWarnings("all")
@JsonRootName("query")
public class Search {

    private static final String CONSTANT_SCORE_FIELD = "constant_score";

    /**
     * This is JsonSerializer for class "Search"
     */
    public static class SearchSerializer extends JsonSerializer<Search> {
        @Override public void serialize(Search search, JsonGenerator jsonGenerator, SerializerProvider provider)
            throws IOException {
            jsonGenerator.writeStartObject();
            /*Bool bool1 = new Bool();
            Bool bool2 = new Bool();
            bool1.setAndConditions(Arrays.asList(new Term(20, "price"), bool2));
            bool2.setAndConditions(Arrays.asList(new Term("yind", "productId")));*/
            jsonGenerator.writeObjectField(CONSTANT_SCORE_FIELD, new Filter(new Term(20, "price")));
//            jsonGenerator.writeObjectField(CONSTANT_SCORE_FIELD, new Filter(bool1));
            jsonGenerator.writeEndObject();
        }
    }

    @Data
    @JsonRootName("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private static class Filter {

        private Term term;

        private Bool bool;

        public Filter(Term term) {
            this.term = term;
        }

        public Filter(Bool bool) {
            this.bool = bool;
        }
    }

    @JsonRootName("bool")
    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private static class Bool {

        @JsonProperty("must")
        private List<Object> andConditions;

        @JsonProperty("should")
        private List<Object> orConditions;

        @JsonProperty("must_not")
        private List<Object> notConditions;

    }

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(new Search());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
    }

}
