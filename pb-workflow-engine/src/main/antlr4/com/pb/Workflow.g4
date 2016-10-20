grammar Workflow;

/* Lexical Rules*/

START	: 'start' ;
RESULT	: 'result' ;
END	: 'end' ;

REPORT	: 'report' ;
COUNT	: 'count' ;
SUM		: 'sum' ;
AVG		: 'avg' ;
FROM	: 'from' ;
FILTER	: 'filter' ;
TIME	: 'time' ;
SAVE	: 'save' ;
AS		: 'as' ;
AT		: 'at';
CSV		: 'csv' ;
S3		: 's3' ;
LOCATION	: 'location' ;
PROPERTIES	: 'properties' ;	


AFTER	: 'after';
BEFORE	: 'before';

LPAREN	: '(';
RPAREN	: ')';

// Logical grammar
AND		: 'and' ;
OR		: 'or' ;

//comparison grammar
EQ	    : '=' ;
GT		: '>' ;
GTE		: '>=' ;
LT		: '<' ;
LTE		: '<=' ;
NE      : '!=' ;

TRUE  : 'true' ;
FALSE : 'false' ;

MULT  : '*' ;
DIV   : '/' ;
PLUS  : '+' ;
MINUS : '-' ;

//  DECIMAL, IDENTIFIER, COMMENTS, WS are set using regular expressions

DECIMAL : '-'?[0-9]+('.'[0-9]+)? ;
 
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;
 
SEMI : ';' ;

// COMMENT and WS are stripped from the output token stream by sending
// to a different channel 'skip'
 
COMMENT : '//' .+? ('\n'|EOF) -> skip ;
 
WS : [ \r\t\u000C\n]+ -> skip ;

/* Grammar rules */

querySet	: singleQuery* EOF ;

singleQuery	: REPORT aggregationExpr FROM index_name FILTER filter_conditions* END SEMI
            | REPORT aggregationExpr FROM index_name END SEMI
            ;
			
aggregationExpr
	: aggregation  
	;
			
aggregation
	: COUNT LPAREN aggregation RPAREN	# AggregationCount
	| SUM LPAREN aggregation RPAREN		# AggregationSum
	| AVG LPAREN aggregation RPAREN		# AggregationAvg
	| expression						# AggregationExpression
	;
	
expression
	: IDENTIFIER	# ExpressionVariable
	;
	
index_name
	: IDENTIFIER	# IndexName
	;
	
filter_conditions
	: filter_condition AND filter_condition		# FilterConditionAnd
	| filter_condition OR filter_condition		# FilterConditionOr
//	| comparison_expr                           # ComparisonExpression
	| LPAREN filter_condition RPAREN            # FilterConditionInParen
//	| logical_entity                            # LogicalEntity
	| filter_condition							# FilterCondition
	;

// filter condition tag to be added
filter_condition
    : comparison_expr                           # ComparisonExpression
    | logical_entity                            # LogicalEntity
	;

comparison_expr : comparisonOperand comparisonOperator comparisonOperand
                       # ComparisonExpressionWithOperator
                | LPAREN comparison_expr RPAREN # ComparisonExpressionInParen
                ;

comparisonOperand : arithmetic_expr
                   ;

comparisonOperator  : GT
                    | GTE
                    | LT
                    | LTE
                    | EQ
                    ;

arithmetic_expr
 : arithmetic_expr MULT arithmetic_expr  # ArithmeticExpressionMult
 | arithmetic_expr DIV arithmetic_expr   # ArithmeticExpressionDiv
 | arithmetic_expr PLUS arithmetic_expr  # ArithmeticExpressionPlus
 | arithmetic_expr MINUS arithmetic_expr # ArithmeticExpressionMinus
 | MINUS arithmetic_expr                 # ArithmeticExpressionNegation
 | LPAREN arithmetic_expr RPAREN         # ArithmeticExpressionParens
 | numeric_entity                        # ArithmeticExpressionNumericEntity
 ;

logical_entity : (TRUE | FALSE) # LogicalConst
               | IDENTIFIER     # LogicalVariable
               ;

numeric_entity : DECIMAL              # NumericConst
               | IDENTIFIER           # NumericVariable
               ;

//query	: query_expr ;
result	: IDENTIFIER ;

/**query_expr
	: query_expr AFTER query_expr	# QueryExpressionAfter
	| query_expr BEFORE query_expr	# QueryExpressionBefore
	| LPAREN query_expr RPAREN		# QueryExpressionInParen
	| query_entity					# QueryEntity
	; 
**/
	
query
	: query AFTER query		# QueryExpressionAfter
	| query BEFORE query	# QueryExpressionBefore
	| LPAREN query RPAREN	# QueryExpressionInParen
	| query_entity			# QueryEntity
	;

/**
query_entity : IDENTIFIER     # QueryVariable
               ;
**/

query_entity : IDENTIFIER     # QueryVariable
			;