// Generated from com\pb\Workflow.g4 by ANTLR 4.3
package com.pb;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WorkflowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, RESULT=2, END=3, REPORT=4, COUNT=5, SUM=6, AVG=7, FROM=8, FILTER=9, 
		TIME=10, SAVE=11, AS=12, AT=13, CSV=14, S3=15, LOCATION=16, PROPERTIES=17, 
		AFTER=18, BEFORE=19, LPAREN=20, RPAREN=21, AND=22, OR=23, EQUAL=24, GT=25, 
		GTE=26, LT=27, LTE=28, DECIMAL=29, IDENTIFIER=30, SEMI=31, COMMENT=32, 
		WS=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'start'", "'result'", "'end'", "'report'", "'count'", "'sum'", 
		"'avg'", "'from'", "'filter'", "'time'", "'save'", "'as'", "'at'", "'csv'", 
		"'s3'", "'location'", "'properties'", "'after'", "'before'", "'('", "')'", 
		"'and'", "'or'", "'='", "'>'", "'>='", "'<'", "'<='", "DECIMAL", "IDENTIFIER", 
		"';'", "COMMENT", "WS"
	};
	public static final int
		RULE_querySet = 0, RULE_singleQuery = 1, RULE_aggregationExpr = 2, RULE_aggregation = 3, 
		RULE_expression = 4, RULE_index_name = 5, RULE_filter_conditions = 6, 
		RULE_filter_condition = 7, RULE_result = 8, RULE_query = 9, RULE_query_entity = 10;
	public static final String[] ruleNames = {
		"querySet", "singleQuery", "aggregationExpr", "aggregation", "expression", 
		"index_name", "filter_conditions", "filter_condition", "result", "query", 
		"query_entity"
	};

	@Override
	public String getGrammarFileName() { return "Workflow.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WorkflowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QuerySetContext extends ParserRuleContext {
		public List<SingleQueryContext> singleQuery() {
			return getRuleContexts(SingleQueryContext.class);
		}
		public TerminalNode EOF() { return getToken(WorkflowParser.EOF, 0); }
		public SingleQueryContext singleQuery(int i) {
			return getRuleContext(SingleQueryContext.class,i);
		}
		public QuerySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterQuerySet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitQuerySet(this);
		}
	}

	public final QuerySetContext querySet() throws RecognitionException {
		QuerySetContext _localctx = new QuerySetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_querySet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==START || _la==REPORT) {
				{
				{
				setState(22); singleQuery();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleQueryContext extends ParserRuleContext {
		public Filter_conditionsContext filter_conditions(int i) {
			return getRuleContext(Filter_conditionsContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public AggregationExprContext aggregationExpr() {
			return getRuleContext(AggregationExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(WorkflowParser.FROM, 0); }
		public List<Filter_conditionsContext> filter_conditions() {
			return getRuleContexts(Filter_conditionsContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode REPORT() { return getToken(WorkflowParser.REPORT, 0); }
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WorkflowParser.SEMI, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode END() { return getToken(WorkflowParser.END, 0); }
		public TerminalNode START() { return getToken(WorkflowParser.START, 0); }
		public TerminalNode RESULT() { return getToken(WorkflowParser.RESULT, 0); }
		public TerminalNode FILTER() { return getToken(WorkflowParser.FILTER, 0); }
		public SingleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterSingleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitSingleQuery(this);
		}
	}

	public final SingleQueryContext singleQuery() throws RecognitionException {
		SingleQueryContext _localctx = new SingleQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleQuery);
		int _la;
		try {
			setState(55);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(START);
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31); query(0);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN || _la==IDENTIFIER );
				setState(36); match(RESULT);
				setState(37); result();
				setState(38); match(END);
				setState(39); match(SEMI);
				}
				break;
			case REPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); match(REPORT);
				setState(42); aggregationExpr();
				setState(43); match(FROM);
				setState(44); index_name();
				setState(45); match(FILTER);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(46); filter_conditions();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52); match(END);
				setState(53); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationExprContext extends ParserRuleContext {
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public AggregationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterAggregationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitAggregationExpr(this);
		}
	}

	public final AggregationExprContext aggregationExpr() throws RecognitionException {
		AggregationExprContext _localctx = new AggregationExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aggregationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); aggregation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
	 
		public AggregationContext() { }
		public void copyFrom(AggregationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AggregationCountContext extends AggregationContext {
		public TerminalNode COUNT() { return getToken(WorkflowParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(WorkflowParser.LPAREN, 0); }
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WorkflowParser.RPAREN, 0); }
		public AggregationCountContext(AggregationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterAggregationCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitAggregationCount(this);
		}
	}
	public static class AggregationSumContext extends AggregationContext {
		public TerminalNode LPAREN() { return getToken(WorkflowParser.LPAREN, 0); }
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WorkflowParser.RPAREN, 0); }
		public TerminalNode SUM() { return getToken(WorkflowParser.SUM, 0); }
		public AggregationSumContext(AggregationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterAggregationSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitAggregationSum(this);
		}
	}
	public static class AggregationAvgContext extends AggregationContext {
		public TerminalNode LPAREN() { return getToken(WorkflowParser.LPAREN, 0); }
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WorkflowParser.RPAREN, 0); }
		public TerminalNode AVG() { return getToken(WorkflowParser.AVG, 0); }
		public AggregationAvgContext(AggregationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterAggregationAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitAggregationAvg(this);
		}
	}
	public static class AggregationExpressionContext extends AggregationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AggregationExpressionContext(AggregationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterAggregationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitAggregationExpression(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aggregation);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case COUNT:
				_localctx = new AggregationCountContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(COUNT);
				setState(60); match(LPAREN);
				setState(61); aggregation();
				setState(62); match(RPAREN);
				}
				break;
			case SUM:
				_localctx = new AggregationSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(SUM);
				setState(65); match(LPAREN);
				setState(66); aggregation();
				setState(67); match(RPAREN);
				}
				break;
			case AVG:
				_localctx = new AggregationAvgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69); match(AVG);
				setState(70); match(LPAREN);
				setState(71); aggregation();
				setState(72); match(RPAREN);
				}
				break;
			case IDENTIFIER:
				_localctx = new AggregationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionVariableContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(WorkflowParser.IDENTIFIER, 0); }
		public ExpressionVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterExpressionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitExpressionVariable(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			_localctx = new ExpressionVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
	 
		public Index_nameContext() { }
		public void copyFrom(Index_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexNameContext extends Index_nameContext {
		public TerminalNode IDENTIFIER() { return getToken(WorkflowParser.IDENTIFIER, 0); }
		public IndexNameContext(Index_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitIndexName(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index_name);
		try {
			_localctx = new IndexNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_conditionsContext extends ParserRuleContext {
		public Filter_conditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_conditions; }
	 
		public Filter_conditionsContext() { }
		public void copyFrom(Filter_conditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterConditionContext extends Filter_conditionsContext {
		public Filter_conditionContext filter_condition() {
			return getRuleContext(Filter_conditionContext.class,0);
		}
		public FilterConditionContext(Filter_conditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterFilterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitFilterCondition(this);
		}
	}
	public static class FilterConditionOrContext extends Filter_conditionsContext {
		public Filter_conditionContext filter_condition(int i) {
			return getRuleContext(Filter_conditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(WorkflowParser.OR, 0); }
		public List<Filter_conditionContext> filter_condition() {
			return getRuleContexts(Filter_conditionContext.class);
		}
		public FilterConditionOrContext(Filter_conditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterFilterConditionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitFilterConditionOr(this);
		}
	}
	public static class FilterConditionAndContext extends Filter_conditionsContext {
		public Filter_conditionContext filter_condition(int i) {
			return getRuleContext(Filter_conditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(WorkflowParser.AND, 0); }
		public List<Filter_conditionContext> filter_condition() {
			return getRuleContexts(Filter_conditionContext.class);
		}
		public FilterConditionAndContext(Filter_conditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterFilterConditionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitFilterConditionAnd(this);
		}
	}

	public final Filter_conditionsContext filter_conditions() throws RecognitionException {
		Filter_conditionsContext _localctx = new Filter_conditionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filter_conditions);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new FilterConditionAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81); filter_condition();
				setState(82); match(AND);
				setState(83); filter_condition();
				}
				break;

			case 2:
				_localctx = new FilterConditionOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85); filter_condition();
				setState(86); match(OR);
				setState(87); filter_condition();
				}
				break;

			case 3:
				_localctx = new FilterConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89); filter_condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_conditionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WorkflowParser.IDENTIFIER, 0); }
		public Filter_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterFilter_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitFilter_condition(this);
		}
	}

	public final Filter_conditionContext filter_condition() throws RecognitionException {
		Filter_conditionContext _localctx = new Filter_conditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_filter_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WorkflowParser.IDENTIFIER, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryExpressionAfterContext extends QueryContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public TerminalNode AFTER() { return getToken(WorkflowParser.AFTER, 0); }
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public QueryExpressionAfterContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterQueryExpressionAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitQueryExpressionAfter(this);
		}
	}
	public static class QueryExpressionInParenContext extends QueryContext {
		public TerminalNode LPAREN() { return getToken(WorkflowParser.LPAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WorkflowParser.RPAREN, 0); }
		public QueryExpressionInParenContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterQueryExpressionInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitQueryExpressionInParen(this);
		}
	}
	public static class QueryEntityContext extends QueryContext {
		public Query_entityContext query_entity() {
			return getRuleContext(Query_entityContext.class,0);
		}
		public QueryEntityContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterQueryEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitQueryEntity(this);
		}
	}
	public static class QueryExpressionBeforeContext extends QueryContext {
		public TerminalNode BEFORE() { return getToken(WorkflowParser.BEFORE, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public QueryExpressionBeforeContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterQueryExpressionBefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitQueryExpressionBefore(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		return query(0);
	}

	private QueryContext query(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryContext _localctx = new QueryContext(_ctx, _parentState);
		QueryContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_query, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new QueryExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97); match(LPAREN);
				setState(98); query(0);
				setState(99); match(RPAREN);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new QueryEntityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); query_entity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new QueryExpressionAfterContext(new QueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105); match(AFTER);
						setState(106); query(5);
						}
						break;

					case 2:
						{
						_localctx = new QueryExpressionBeforeContext(new QueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(108); match(BEFORE);
						setState(109); query(4);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Query_entityContext extends ParserRuleContext {
		public Query_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_entity; }
	 
		public Query_entityContext() { }
		public void copyFrom(Query_entityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryVariableContext extends Query_entityContext {
		public TerminalNode IDENTIFIER() { return getToken(WorkflowParser.IDENTIFIER, 0); }
		public QueryVariableContext(Query_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).enterQueryVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkflowListener ) ((WorkflowListener)listener).exitQueryVariable(this);
		}
	}

	public final Query_entityContext query_entity() throws RecognitionException {
		Query_entityContext _localctx = new Query_entityContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_query_entity);
		try {
			_localctx = new QueryVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return query_sempred((QueryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean query_sempred(QueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\6\3#\n\3\r\3\16\3"+
		"$\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16\3\65\13"+
		"\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13i\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13q\n\13\f\13\16\13t\13"+
		"\13\3\f\3\f\3\f\2\3\24\r\2\4\6\b\n\f\16\20\22\24\26\2\2x\2\33\3\2\2\2"+
		"\49\3\2\2\2\6;\3\2\2\2\bM\3\2\2\2\nO\3\2\2\2\fQ\3\2\2\2\16\\\3\2\2\2\20"+
		"^\3\2\2\2\22`\3\2\2\2\24h\3\2\2\2\26u\3\2\2\2\30\32\5\4\3\2\31\30\3\2"+
		"\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2"+
		"\2\2\36\37\7\2\2\3\37\3\3\2\2\2 \"\7\3\2\2!#\5\24\13\2\"!\3\2\2\2#$\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\4\2\2\'(\5\22\n\2()\7\5\2\2"+
		")*\7!\2\2*:\3\2\2\2+,\7\6\2\2,-\5\6\4\2-.\7\n\2\2./\5\f\7\2/\63\7\13\2"+
		"\2\60\62\5\16\b\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\5\2\2\678\7!\2\28:\3\2\2\29 "+
		"\3\2\2\29+\3\2\2\2:\5\3\2\2\2;<\5\b\5\2<\7\3\2\2\2=>\7\7\2\2>?\7\26\2"+
		"\2?@\5\b\5\2@A\7\27\2\2AN\3\2\2\2BC\7\b\2\2CD\7\26\2\2DE\5\b\5\2EF\7\27"+
		"\2\2FN\3\2\2\2GH\7\t\2\2HI\7\26\2\2IJ\5\b\5\2JK\7\27\2\2KN\3\2\2\2LN\5"+
		"\n\6\2M=\3\2\2\2MB\3\2\2\2MG\3\2\2\2ML\3\2\2\2N\t\3\2\2\2OP\7 \2\2P\13"+
		"\3\2\2\2QR\7 \2\2R\r\3\2\2\2ST\5\20\t\2TU\7\30\2\2UV\5\20\t\2V]\3\2\2"+
		"\2WX\5\20\t\2XY\7\31\2\2YZ\5\20\t\2Z]\3\2\2\2[]\5\20\t\2\\S\3\2\2\2\\"+
		"W\3\2\2\2\\[\3\2\2\2]\17\3\2\2\2^_\7 \2\2_\21\3\2\2\2`a\7 \2\2a\23\3\2"+
		"\2\2bc\b\13\1\2cd\7\26\2\2de\5\24\13\2ef\7\27\2\2fi\3\2\2\2gi\5\26\f\2"+
		"hb\3\2\2\2hg\3\2\2\2ir\3\2\2\2jk\f\6\2\2kl\7\24\2\2lq\5\24\13\7mn\f\5"+
		"\2\2no\7\25\2\2oq\5\24\13\6pj\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs"+
		"\3\2\2\2s\25\3\2\2\2tr\3\2\2\2uv\7 \2\2v\27\3\2\2\2\13\33$\639M\\hpr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}