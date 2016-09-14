// Generated from com\pb\Workflow.g4 by ANTLR 4.3
package com.pb;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WorkflowLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"START", "RESULT", "END", "REPORT", "COUNT", "SUM", "AVG", "FROM", "FILTER", 
		"TIME", "SAVE", "AS", "AT", "CSV", "S3", "LOCATION", "PROPERTIES", "AFTER", 
		"BEFORE", "LPAREN", "RPAREN", "AND", "OR", "EQUAL", "GT", "GTE", "LT", 
		"LTE", "DECIMAL", "IDENTIFIER", "SEMI", "COMMENT", "WS"
	};


	public WorkflowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Workflow.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\5\36\u00c8\n\36\3\36\6\36"+
		"\u00cb\n\36\r\36\16\36\u00cc\3\36\3\36\6\36\u00d1\n\36\r\36\16\36\u00d2"+
		"\5\36\u00d5\n\36\3\37\3\37\7\37\u00d9\n\37\f\37\16\37\u00dc\13\37\3 \3"+
		" \3!\3!\3!\3!\6!\u00e4\n!\r!\16!\u00e5\3!\5!\u00e9\n!\3!\3!\3\"\6\"\u00ee"+
		"\n\"\r\"\16\"\u00ef\3\"\3\"\3\u00e5\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\3\2\62;\5\2C\\aac"+
		"|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\16\17\"\"\u00f9\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5K\3\2\2\2\7R\3\2\2\2\tV\3\2\2"+
		"\2\13]\3\2\2\2\rc\3\2\2\2\17g\3\2\2\2\21k\3\2\2\2\23p\3\2\2\2\25w\3\2"+
		"\2\2\27|\3\2\2\2\31\u0081\3\2\2\2\33\u0084\3\2\2\2\35\u0087\3\2\2\2\37"+
		"\u008b\3\2\2\2!\u008e\3\2\2\2#\u0097\3\2\2\2%\u00a2\3\2\2\2\'\u00a8\3"+
		"\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b7\3\2\2\2\61"+
		"\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00be\3\2\2\2\67\u00c1\3\2\2\29\u00c3"+
		"\3\2\2\2;\u00c7\3\2\2\2=\u00d6\3\2\2\2?\u00dd\3\2\2\2A\u00df\3\2\2\2C"+
		"\u00ed\3\2\2\2EF\7u\2\2FG\7v\2\2GH\7c\2\2HI\7t\2\2IJ\7v\2\2J\4\3\2\2\2"+
		"KL\7t\2\2LM\7g\2\2MN\7u\2\2NO\7w\2\2OP\7n\2\2PQ\7v\2\2Q\6\3\2\2\2RS\7"+
		"g\2\2ST\7p\2\2TU\7f\2\2U\b\3\2\2\2VW\7t\2\2WX\7g\2\2XY\7r\2\2YZ\7q\2\2"+
		"Z[\7t\2\2[\\\7v\2\2\\\n\3\2\2\2]^\7e\2\2^_\7q\2\2_`\7w\2\2`a\7p\2\2ab"+
		"\7v\2\2b\f\3\2\2\2cd\7u\2\2de\7w\2\2ef\7o\2\2f\16\3\2\2\2gh\7c\2\2hi\7"+
		"x\2\2ij\7i\2\2j\20\3\2\2\2kl\7h\2\2lm\7t\2\2mn\7q\2\2no\7o\2\2o\22\3\2"+
		"\2\2pq\7h\2\2qr\7k\2\2rs\7n\2\2st\7v\2\2tu\7g\2\2uv\7t\2\2v\24\3\2\2\2"+
		"wx\7v\2\2xy\7k\2\2yz\7o\2\2z{\7g\2\2{\26\3\2\2\2|}\7u\2\2}~\7c\2\2~\177"+
		"\7x\2\2\177\u0080\7g\2\2\u0080\30\3\2\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7u\2\2\u0083\32\3\2\2\2\u0084\u0085\7c\2\2\u0085\u0086\7v\2\2\u0086\34"+
		"\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7u\2\2\u0089\u008a\7x\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7\65\2\2\u008d \3\2\2\2\u008e"+
		"\u008f\7n\2\2\u008f\u0090\7q\2\2\u0090\u0091\7e\2\2\u0091\u0092\7c\2\2"+
		"\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7q\2\2\u0095\u0096"+
		"\7p\2\2\u0096\"\3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7q\2\2\u009a\u009b\7r\2\2\u009b\u009c\7g\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1$\3\2\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7v\2"+
		"\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7"+
		"d\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7g\2\2\u00ae(\3\2\2\2\u00af\u00b0\7*\2\2\u00b0*\3"+
		"\2\2\2\u00b1\u00b2\7+\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\u00b6\7f\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\62\3\2\2\2\u00bc\u00bd"+
		"\7@\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0\66"+
		"\3\2\2\2\u00c1\u00c2\7>\2\2\u00c28\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5"+
		"\7?\2\2\u00c5:\3\2\2\2\u00c6\u00c8\7/\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\t\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d4\3\2"+
		"\2\2\u00ce\u00d0\7\60\2\2\u00cf\u00d1\t\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5<\3\2\2\2\u00d6\u00da"+
		"\t\3\2\2\u00d7\u00d9\t\4\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db>\3\2\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dd\u00de\7=\2\2\u00de@\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\7"+
		"\61\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\13\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e9\t\5\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\b!\2\2\u00ebB\3\2\2\2\u00ec\u00ee\t\6\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\b\"\2\2\u00f2D\3\2\2\2\13\2\u00c7\u00cc\u00d2\u00d4\u00da"+
		"\u00e5\u00e8\u00ef\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}