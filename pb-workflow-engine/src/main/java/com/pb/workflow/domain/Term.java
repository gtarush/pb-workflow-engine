/*
 * Copyright (c) 2016 - Pitney Bowes.
 */
package com.pb.workflow.domain;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * @author Tarush Grover
 *
 */
@JsonSerialize(using = Term.TermSerializer.class)
@SuppressWarnings("all")
@NoArgsConstructor
public class Term {

	private static final String DEFAULT_FIELD_NAME = "field";

	@Getter
	@Setter
	private String fieldTag = DEFAULT_FIELD_NAME;

	@Getter
	@Setter
	private Object field;

	/**
	 * @param field
	 */
	public Term(Object field){
		this.field = field;
		this.fieldTag = DEFAULT_FIELD_NAME;
	}

	/**
	 * @param field
	 * @param fieldName
	 */
	public Term(Object field, @NonNull String fieldName){
		this.field = field;
		this.fieldTag = fieldName;
	}

	/**
	 * This is JsonSerializer for class "Term"
	 */
	public static class TermSerializer extends JsonSerializer<Term> {
		@Override public void serialize(Term term, JsonGenerator jsonGenerator, SerializerProvider provider)
			throws IOException {
			jsonGenerator.writeStartObject();
			writeJsonFieldBasedOnType(term, jsonGenerator);
			jsonGenerator.writeEndObject();
		}

		/**
		 * @param term
		 * @param jgen
		 * @throws IOException
		 */
		private void writeJsonFieldBasedOnType(Term term, JsonGenerator jgen) throws IOException{
			Object newField = term.getField();
			if (Objects.isNull(newField)) {
				jgen.writeNullField(term.getFieldTag());
			} else if (newField instanceof Integer) {
				jgen.writeNumberField(term.getFieldTag(), (Integer) term.getField());
			} else if (newField instanceof Long) {
				jgen.writeNumberField(term.getFieldTag(), (Long) term.getField());
			} else if (newField instanceof Double) {
				jgen.writeNumberField(term.getFieldTag(), (Double) term.getField());
			} else if (newField instanceof Float) {
				jgen.writeNumberField(term.getFieldTag(), (Float) term.getField());
			} else if (newField instanceof BigDecimal) {
				jgen.writeNumberField(term.getFieldTag(), (BigDecimal) term.getField());
			} else if (newField instanceof Boolean) {
				jgen.writeBooleanField(term.getFieldTag(), (Boolean) term.getField());
			} else {
				jgen.writeStringField(term.getFieldTag(), (String) term.getField());
			}
		}
	}
}
