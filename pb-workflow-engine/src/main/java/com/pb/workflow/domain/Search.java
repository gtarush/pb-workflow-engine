package com.pb.workflow.domain;

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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

/**
 * @author Tarush Grover
 * Created on 10/14/2016.
 */
@JsonSerialize(using = Search.SearchSerializer.class)
@SuppressWarnings("all")
@JsonRootName("query")
public class Search {

    private static final String CONSTANT_SCORE_FIELD = "constant_score";

    public static class SearchSerializer extends JsonSerializer<Search> {
        @Override public void serialize(Search search, JsonGenerator jsonGenerator, SerializerProvider provider)
            throws IOException {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeObjectField(CONSTANT_SCORE_FIELD, new Filter(new Term(20, "price")));
            jsonGenerator.writeEndObject();
        }
    }

    @AllArgsConstructor
    @Data
    @JsonRootName("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Filter {
        private Term term;
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
