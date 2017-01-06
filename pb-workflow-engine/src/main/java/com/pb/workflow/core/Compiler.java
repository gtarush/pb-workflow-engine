package com.pb.workflow.core;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.pb.WorkflowLexer;
import com.pb.WorkflowParser;
import com.pb.workflow.domain.QuerySet;

public class Compiler {
//    public QuerySet compile(String inputString) {
//        ANTLRInputStream input = new ANTLRInputStream(inputString);
//        WorkflowLexer lexer = new WorkflowLexer(input);
//        TokenStream tokens = new CommonTokenStream(lexer);
//        WorkflowParser parser = new WorkflowParser(tokens);
//
//        WorkflowTreeBuilder treeBuilder = new WorkflowTreeBuilder();
//        parser.addParseListener(treeBuilder);
//        parser.setErrorHandler(new ExceptionThrowingErrorHandler());
//
//        parser.querySet();
//
//        return treeBuilder.getQuerySet();
//    }

	public QuerySet compile(String inputString) {
		WorkflowParser parser = new WorkflowParser(
			new CommonTokenStream(new WorkflowLexer(new ANTLRInputStream(inputString))));
		WorkflowTreeBuilder treeBuilder = new WorkflowTreeBuilder();
		parser.addParseListener(treeBuilder);
		parser.setErrorHandler(new ExceptionThrowingErrorHandler());
		parser.querySet();
		return treeBuilder.getQuerySet();
	}
}
