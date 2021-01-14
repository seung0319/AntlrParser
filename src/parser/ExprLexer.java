// Generated from Expr.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CONSTANT=2, CHAR_VALUE=3, STRING_VALUE=4, INT_VALUE=5, FLOAT_VALUE=6, 
		IF=7, ELSE=8, ELSEIF=9, THEN=10, FOR=11, WHILE=12, DO=13, UP=14, DOWN=15, 
		TO=16, INT_TYPE=17, FLOAT_TYPE=18, CHAR_TYPE=19, STRING_TYPE=20, BOOLEAN_TYPE=21, 
		VOID_TYPE=22, FUNCTION=23, PRINT=24, SCAN=25, MAIN=26, RETURN=27, TRUE=28, 
		FALSE=29, ID=30, LEFT_BRACKET=31, RIGHT_BRACKET=32, LEFT_PAREN=33, RIGHT_PAREN=34, 
		LEFT_BRACE=35, RIGHT_BRACE=36, COMMA=37, SEMICOLON=38, DOT=39, QUOTE_S=40, 
		QUOTE_D=41, PLUS_PLUS=42, MINUS_MINUS=43, PLUS=44, MINUS=45, MUL=46, DIV=47, 
		MOD=48, EQUALS=49, PLUS_EQUALS=50, MIN_EQUALS=51, MUL_EQUALS=52, DIV_EQUALS=53, 
		LESS_THAN=54, LESS_THAN_EQUALS=55, GREATER_THAN=56, GREATER_THAN_EQUALS=57, 
		EQUALS_EQUALS=58, NOT_EQUALS=59, AND=60, OR=61, NOT=62, DIGIT=63, LETTER=64, 
		WS=65, COMMENT=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "CONSTANT", "CHAR_VALUE", "STRING_VALUE", "INT_VALUE", "FLOAT_VALUE", 
			"IF", "ELSE", "ELSEIF", "THEN", "FOR", "WHILE", "DO", "UP", "DOWN", "TO", 
			"INT_TYPE", "FLOAT_TYPE", "CHAR_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", 
			"VOID_TYPE", "FUNCTION", "PRINT", "SCAN", "MAIN", "RETURN", "TRUE", "FALSE", 
			"ID", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
			"RIGHT_BRACE", "COMMA", "SEMICOLON", "DOT", "QUOTE_S", "QUOTE_D", "PLUS_PLUS", 
			"MINUS_MINUS", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQUALS", "PLUS_EQUALS", 
			"MIN_EQUALS", "MUL_EQUALS", "DIV_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", 
			"GREATER_THAN", "GREATER_THAN_EQUALS", "EQUALS_EQUALS", "NOT_EQUALS", 
			"AND", "OR", "NOT", "DIGIT", "LETTER", "LetterorDigit", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'constant'", null, null, null, null, "'if'", "'else'", 
			"'else if'", "'then'", "'for'", "'while'", "'do'", "'up'", "'down'", 
			"'to'", "'int'", "'float'", "'char'", "'string'", "'bool'", "'void'", 
			"'func'", "'print'", "'scan'", "'main'", "'return'", "'true'", "'false'", 
			null, "'['", "']'", "'('", "')'", "'{'", "'}'", "','", "';'", "'.'", 
			"'''", "'\"'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CONSTANT", "CHAR_VALUE", "STRING_VALUE", "INT_VALUE", "FLOAT_VALUE", 
			"IF", "ELSE", "ELSEIF", "THEN", "FOR", "WHILE", "DO", "UP", "DOWN", "TO", 
			"INT_TYPE", "FLOAT_TYPE", "CHAR_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", 
			"VOID_TYPE", "FUNCTION", "PRINT", "SCAN", "MAIN", "RETURN", "TRUE", "FALSE", 
			"ID", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
			"RIGHT_BRACE", "COMMA", "SEMICOLON", "DOT", "QUOTE_S", "QUOTE_D", "PLUS_PLUS", 
			"MINUS_MINUS", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQUALS", "PLUS_EQUALS", 
			"MIN_EQUALS", "MUL_EQUALS", "DIV_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", 
			"GREATER_THAN", "GREATER_THAN_EQUALS", "EQUALS_EQUALS", "NOT_EQUALS", 
			"AND", "OR", "NOT", "DIGIT", "LETTER", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01a1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u00a0"+
		"\n\5\f\5\16\5\u00a3\13\5\3\5\3\5\3\6\5\6\u00a8\n\6\3\6\6\6\u00ab\n\6\r"+
		"\6\16\6\u00ac\3\7\5\7\u00b0\n\7\3\7\6\7\u00b3\n\7\r\7\16\7\u00b4\3\7\3"+
		"\7\6\7\u00b9\n\7\r\7\16\7\u00ba\5\7\u00bd\n\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u0137"+
		"\n\37\f\37\16\37\u013a\13\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3"+
		"=\3=\3=\3>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\5B\u018e\nB\3C\6C\u0191\nC\r"+
		"C\16C\u0192\3C\3C\3D\3D\3D\3D\7D\u019b\nD\fD\16D\u019e\13D\3D\3D\2\2E"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085C\u0087D\3\2\7\3\2$$\3\2\62;"+
		"\6\2&&C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u01aa\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0089"+
		"\3\2\2\2\5\u0090\3\2\2\2\7\u0099\3\2\2\2\t\u009d\3\2\2\2\13\u00a7\3\2"+
		"\2\2\r\u00af\3\2\2\2\17\u00c0\3\2\2\2\21\u00c3\3\2\2\2\23\u00c8\3\2\2"+
		"\2\25\u00d0\3\2\2\2\27\u00d5\3\2\2\2\31\u00d9\3\2\2\2\33\u00df\3\2\2\2"+
		"\35\u00e2\3\2\2\2\37\u00e5\3\2\2\2!\u00ea\3\2\2\2#\u00ed\3\2\2\2%\u00f1"+
		"\3\2\2\2\'\u00f7\3\2\2\2)\u00fc\3\2\2\2+\u0103\3\2\2\2-\u0108\3\2\2\2"+
		"/\u010d\3\2\2\2\61\u0112\3\2\2\2\63\u0118\3\2\2\2\65\u011d\3\2\2\2\67"+
		"\u0122\3\2\2\29\u0129\3\2\2\2;\u012e\3\2\2\2=\u0134\3\2\2\2?\u013b\3\2"+
		"\2\2A\u013d\3\2\2\2C\u013f\3\2\2\2E\u0141\3\2\2\2G\u0143\3\2\2\2I\u0145"+
		"\3\2\2\2K\u0147\3\2\2\2M\u0149\3\2\2\2O\u014b\3\2\2\2Q\u014d\3\2\2\2S"+
		"\u014f\3\2\2\2U\u0151\3\2\2\2W\u0154\3\2\2\2Y\u0157\3\2\2\2[\u0159\3\2"+
		"\2\2]\u015b\3\2\2\2_\u015d\3\2\2\2a\u015f\3\2\2\2c\u0161\3\2\2\2e\u0163"+
		"\3\2\2\2g\u0166\3\2\2\2i\u0169\3\2\2\2k\u016c\3\2\2\2m\u016f\3\2\2\2o"+
		"\u0171\3\2\2\2q\u0174\3\2\2\2s\u0176\3\2\2\2u\u0179\3\2\2\2w\u017c\3\2"+
		"\2\2y\u017f\3\2\2\2{\u0182\3\2\2\2}\u0185\3\2\2\2\177\u0187\3\2\2\2\u0081"+
		"\u0189\3\2\2\2\u0083\u018d\3\2\2\2\u0085\u0190\3\2\2\2\u0087\u0196\3\2"+
		"\2\2\u0089\u008a\7e\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7v\2\2\u008e\u008f\7g\2\2\u008f\4\3\2\2\2\u0090\u0091"+
		"\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7p\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2"+
		"\u0098\6\3\2\2\2\u0099\u009a\5Q)\2\u009a\u009b\13\2\2\2\u009b\u009c\5"+
		"Q)\2\u009c\b\3\2\2\2\u009d\u00a1\5S*\2\u009e\u00a0\n\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5S*\2\u00a5\n\3\2\2\2\u00a6"+
		"\u00a8\5[.\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2"+
		"\2\u00a9\u00ab\5\177@\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\f\3\2\2\2\u00ae\u00b0\5[.\2\u00af"+
		"\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5\177"+
		"@\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00bc\3\2\2\2\u00b6\u00b8\5O(\2\u00b7\u00b9\5\177"+
		"@\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\16\3\2\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7h\2\2\u00c2\20\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7\22\3\2\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7\"\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf\24\3\2\2\2"+
		"\u00d0\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\26\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\30\3\2\2\2\u00d9\u00da\7y\2\2\u00da\u00db\7j\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de\32\3\2\2\2\u00df\u00e0"+
		"\7f\2\2\u00e0\u00e1\7q\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4"+
		"\7r\2\2\u00e4\36\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7y\2\2\u00e8\u00e9\7p\2\2\u00e9 \3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0$\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7v\2\2\u00f6&\3\2\2\2\u00f7\u00f8"+
		"\7e\2\2\u00f8\u00f9\7j\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7t\2\2\u00fb"+
		"(\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7i\2\2\u0102*\3\2\2\2\u0103"+
		"\u0104\7d\2\2\u0104\u0105\7q\2\2\u0105\u0106\7q\2\2\u0106\u0107\7n\2\2"+
		"\u0107,\3\2\2\2\u0108\u0109\7x\2\2\u0109\u010a\7q\2\2\u010a\u010b\7k\2"+
		"\2\u010b\u010c\7f\2\2\u010c.\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7"+
		"w\2\2\u010f\u0110\7p\2\2\u0110\u0111\7e\2\2\u0111\60\3\2\2\2\u0112\u0113"+
		"\7r\2\2\u0113\u0114\7t\2\2\u0114\u0115\7k\2\2\u0115\u0116\7p\2\2\u0116"+
		"\u0117\7v\2\2\u0117\62\3\2\2\2\u0118\u0119\7u\2\2\u0119\u011a\7e\2\2\u011a"+
		"\u011b\7c\2\2\u011b\u011c\7p\2\2\u011c\64\3\2\2\2\u011d\u011e\7o\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\66\3\2\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7g\2\2\u0124\u0125\7v\2\2\u0125\u0126\7w\2\2"+
		"\u0126\u0127\7t\2\2\u0127\u0128\7p\2\2\u01288\3\2\2\2\u0129\u012a\7v\2"+
		"\2\u012a\u012b\7t\2\2\u012b\u012c\7w\2\2\u012c\u012d\7g\2\2\u012d:\3\2"+
		"\2\2\u012e\u012f\7h\2\2\u012f\u0130\7c\2\2\u0130\u0131\7n\2\2\u0131\u0132"+
		"\7u\2\2\u0132\u0133\7g\2\2\u0133<\3\2\2\2\u0134\u0138\5\u0081A\2\u0135"+
		"\u0137\5\u0083B\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139>\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7]\2\2\u013c@\3\2\2\2\u013d\u013e\7_\2\2\u013eB\3\2\2\2\u013f\u0140"+
		"\7*\2\2\u0140D\3\2\2\2\u0141\u0142\7+\2\2\u0142F\3\2\2\2\u0143\u0144\7"+
		"}\2\2\u0144H\3\2\2\2\u0145\u0146\7\177\2\2\u0146J\3\2\2\2\u0147\u0148"+
		"\7.\2\2\u0148L\3\2\2\2\u0149\u014a\7=\2\2\u014aN\3\2\2\2\u014b\u014c\7"+
		"\60\2\2\u014cP\3\2\2\2\u014d\u014e\7)\2\2\u014eR\3\2\2\2\u014f\u0150\7"+
		"$\2\2\u0150T\3\2\2\2\u0151\u0152\7-\2\2\u0152\u0153\7-\2\2\u0153V\3\2"+
		"\2\2\u0154\u0155\7/\2\2\u0155\u0156\7/\2\2\u0156X\3\2\2\2\u0157\u0158"+
		"\7-\2\2\u0158Z\3\2\2\2\u0159\u015a\7/\2\2\u015a\\\3\2\2\2\u015b\u015c"+
		"\7,\2\2\u015c^\3\2\2\2\u015d\u015e\7\61\2\2\u015e`\3\2\2\2\u015f\u0160"+
		"\7\'\2\2\u0160b\3\2\2\2\u0161\u0162\7?\2\2\u0162d\3\2\2\2\u0163\u0164"+
		"\7-\2\2\u0164\u0165\7?\2\2\u0165f\3\2\2\2\u0166\u0167\7/\2\2\u0167\u0168"+
		"\7?\2\2\u0168h\3\2\2\2\u0169\u016a\7,\2\2\u016a\u016b\7?\2\2\u016bj\3"+
		"\2\2\2\u016c\u016d\7\61\2\2\u016d\u016e\7?\2\2\u016el\3\2\2\2\u016f\u0170"+
		"\7>\2\2\u0170n\3\2\2\2\u0171\u0172\7>\2\2\u0172\u0173\7?\2\2\u0173p\3"+
		"\2\2\2\u0174\u0175\7@\2\2\u0175r\3\2\2\2\u0176\u0177\7@\2\2\u0177\u0178"+
		"\7?\2\2\u0178t\3\2\2\2\u0179\u017a\7?\2\2\u017a\u017b\7?\2\2\u017bv\3"+
		"\2\2\2\u017c\u017d\7#\2\2\u017d\u017e\7?\2\2\u017ex\3\2\2\2\u017f\u0180"+
		"\7(\2\2\u0180\u0181\7(\2\2\u0181z\3\2\2\2\u0182\u0183\7~\2\2\u0183\u0184"+
		"\7~\2\2\u0184|\3\2\2\2\u0185\u0186\7#\2\2\u0186~\3\2\2\2\u0187\u0188\t"+
		"\3\2\2\u0188\u0080\3\2\2\2\u0189\u018a\t\4\2\2\u018a\u0082\3\2\2\2\u018b"+
		"\u018e\5\177@\2\u018c\u018e\5\u0081A\2\u018d\u018b\3\2\2\2\u018d\u018c"+
		"\3\2\2\2\u018e\u0084\3\2\2\2\u018f\u0191\t\5\2\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0195\bC\2\2\u0195\u0086\3\2\2\2\u0196\u0197\7\61\2\2\u0197"+
		"\u0198\7\61\2\2\u0198\u019c\3\2\2\2\u0199\u019b\n\6\2\2\u019a\u0199\3"+
		"\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\bD\2\2\u01a0\u0088\3\2"+
		"\2\2\16\2\u00a1\u00a7\u00ac\u00af\u00b4\u00ba\u00bc\u0138\u018d\u0192"+
		"\u019c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}