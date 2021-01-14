// Generated from Expr.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_block_content = 1, RULE_main = 2, RULE_function = 3, 
		RULE_call = 4, RULE_returnstatement = 5, RULE_parameter = 6, RULE_intparameter = 7, 
		RULE_booleanparameter = 8, RULE_floatparameter = 9, RULE_stringparameter = 10, 
		RULE_charparameter = 11, RULE_arrayparameter = 12, RULE_declaration = 13, 
		RULE_constantdeclaration = 14, RULE_singledeclaration = 15, RULE_arraydeclaration = 16, 
		RULE_booleandeclaration = 17, RULE_booleanarrdeclaration = 18, RULE_intdeclaration = 19, 
		RULE_stringdeclaration = 20, RULE_intarrdeclaration = 21, RULE_floatdeclaration = 22, 
		RULE_floatarrdeclaration = 23, RULE_chardeclaration = 24, RULE_chararrdeclaration = 25, 
		RULE_assignment = 26, RULE_condition = 27, RULE_loop = 28, RULE_loopfor = 29, 
		RULE_loopwhile = 30, RULE_loopdowhile = 31, RULE_operation = 32, RULE_opr = 33, 
		RULE_plus_minus = 34, RULE_multopr = 35, RULE_mult_div_mod = 36, RULE_terminalopr = 37, 
		RULE_shortopr = 38, RULE_print = 39, RULE_scan = 40, RULE_booleanexp = 41, 
		RULE_booleanvalue = 42, RULE_relation = 43, RULE_logic = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block_content", "main", "function", "call", "returnstatement", 
			"parameter", "intparameter", "booleanparameter", "floatparameter", "stringparameter", 
			"charparameter", "arrayparameter", "declaration", "constantdeclaration", 
			"singledeclaration", "arraydeclaration", "booleandeclaration", "booleanarrdeclaration", 
			"intdeclaration", "stringdeclaration", "intarrdeclaration", "floatdeclaration", 
			"floatarrdeclaration", "chardeclaration", "chararrdeclaration", "assignment", 
			"condition", "loop", "loopfor", "loopwhile", "loopdowhile", "operation", 
			"opr", "plus_minus", "multopr", "mult_div_mod", "terminalopr", "shortopr", 
			"print", "scan", "booleanexp", "booleanvalue", "relation", "logic"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(90);
				function();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			main();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(97);
				function();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(EOF);
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

	public static class Block_contentContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConstantdeclarationContext constantdeclaration() {
			return getRuleContext(ConstantdeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopdowhileContext loopdowhile() {
			return getRuleContext(LoopdowhileContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Block_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlock_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlock_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlock_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_contentContext block_content() throws RecognitionException {
		Block_contentContext _localctx = new Block_contentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block_content);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANT:
			case DO:
			case INT_TYPE:
			case FLOAT_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case BOOLEAN_TYPE:
			case PRINT:
			case SCAN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(105);
					declaration();
					}
					break;
				case 2:
					{
					setState(106);
					constantdeclaration();
					}
					break;
				case 3:
					{
					setState(107);
					assignment();
					}
					break;
				case 4:
					{
					setState(108);
					loopdowhile();
					}
					break;
				case 5:
					{
					setState(109);
					operation();
					}
					break;
				case 6:
					{
					setState(110);
					print();
					}
					break;
				case 7:
					{
					setState(111);
					scan();
					}
					break;
				case 8:
					{
					setState(112);
					call();
					}
					break;
				}
				setState(115);
				match(SEMICOLON);
				}
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case WHILE:
					{
					setState(117);
					loop();
					}
					break;
				case IF:
					{
					setState(118);
					condition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ExprParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ExprParser.RIGHT_BRACE, 0); }
		public List<Block_contentContext> block_content() {
			return getRuleContexts(Block_contentContext.class);
		}
		public Block_contentContext block_content(int i) {
			return getRuleContext(Block_contentContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(MAIN);
			setState(124);
			match(LEFT_PAREN);
			setState(125);
			match(RIGHT_PAREN);
			setState(126);
			match(LEFT_BRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(127);
				block_content();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RIGHT_BRACE);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ExprParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ExprParser.RIGHT_BRACE, 0); }
		public TerminalNode INT_TYPE() { return getToken(ExprParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ExprParser.FLOAT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ExprParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ExprParser.STRING_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(ExprParser.VOID_TYPE, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ExprParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ExprParser.RIGHT_BRACKET, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<Block_contentContext> block_content() {
			return getRuleContexts(Block_contentContext.class);
		}
		public Block_contentContext block_content(int i) {
			return getRuleContext(Block_contentContext.class,i);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FUNCTION);
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(137);
				match(LEFT_BRACKET);
				setState(138);
				match(RIGHT_BRACKET);
				}
			}

			setState(141);
			match(ID);
			setState(142);
			match(LEFT_PAREN);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(143);
				parameter();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(144);
					match(COMMA);
					setState(145);
					parameter();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(153);
			match(RIGHT_PAREN);
			setState(154);
			match(LEFT_BRACE);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(155);
				block_content();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(161);
				returnstatement();
				}
			}

			setState(164);
			match(RIGHT_BRACE);
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

	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> INT_VALUE() { return getTokens(ExprParser.INT_VALUE); }
		public TerminalNode INT_VALUE(int i) {
			return getToken(ExprParser.INT_VALUE, i);
		}
		public List<TerminalNode> FLOAT_VALUE() { return getTokens(ExprParser.FLOAT_VALUE); }
		public TerminalNode FLOAT_VALUE(int i) {
			return getToken(ExprParser.FLOAT_VALUE, i);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(ExprParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(ExprParser.STRING_VALUE, i);
		}
		public List<TerminalNode> CHAR_VALUE() { return getTokens(ExprParser.CHAR_VALUE); }
		public TerminalNode CHAR_VALUE(int i) {
			return getToken(ExprParser.CHAR_VALUE, i);
		}
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<OprContext> opr() {
			return getRuleContexts(OprContext.class);
		}
		public OprContext opr(int i) {
			return getRuleContext(OprContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(LEFT_PAREN);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_VALUE) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LEFT_PAREN) | (1L << NOT))) != 0)) {
				{
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(168);
					match(INT_VALUE);
					}
					break;
				case 2:
					{
					setState(169);
					match(FLOAT_VALUE);
					}
					break;
				case 3:
					{
					setState(170);
					match(STRING_VALUE);
					}
					break;
				case 4:
					{
					setState(171);
					match(CHAR_VALUE);
					}
					break;
				case 5:
					{
					setState(172);
					booleanexp();
					}
					break;
				case 6:
					{
					setState(173);
					opr(0);
					}
					break;
				case 7:
					{
					setState(174);
					match(ID);
					}
					break;
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(RIGHT_PAREN);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ExprParser.RETURN, 0); }
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<OprContext> opr() {
			return getRuleContexts(OprContext.class);
		}
		public OprContext opr(int i) {
			return getRuleContext(OprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(RETURN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_VALUE) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LEFT_PAREN) | (1L << NOT))) != 0)) {
				{
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(183);
					booleanexp();
					}
					break;
				case 2:
					{
					setState(184);
					opr(0);
					}
					break;
				case 3:
					{
					setState(185);
					match(ID);
					}
					break;
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParameterContext extends ParserRuleContext {
		public IntparameterContext intparameter() {
			return getRuleContext(IntparameterContext.class,0);
		}
		public BooleanparameterContext booleanparameter() {
			return getRuleContext(BooleanparameterContext.class,0);
		}
		public StringparameterContext stringparameter() {
			return getRuleContext(StringparameterContext.class,0);
		}
		public CharparameterContext charparameter() {
			return getRuleContext(CharparameterContext.class,0);
		}
		public ArrayparameterContext arrayparameter() {
			return getRuleContext(ArrayparameterContext.class,0);
		}
		public FloatparameterContext floatparameter() {
			return getRuleContext(FloatparameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				intparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				booleanparameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				stringparameter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				charparameter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				arrayparameter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				floatparameter();
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

	public static class IntparameterContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(ExprParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IntparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIntparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIntparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIntparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntparameterContext intparameter() throws RecognitionException {
		IntparameterContext _localctx = new IntparameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(INT_TYPE);
			setState(200);
			match(ID);
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

	public static class BooleanparameterContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_TYPE() { return getToken(ExprParser.BOOLEAN_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public BooleanparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleanparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleanparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanparameterContext booleanparameter() throws RecognitionException {
		BooleanparameterContext _localctx = new BooleanparameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_booleanparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(BOOLEAN_TYPE);
			setState(203);
			match(ID);
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

	public static class FloatparameterContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(ExprParser.FLOAT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public FloatparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFloatparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFloatparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFloatparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatparameterContext floatparameter() throws RecognitionException {
		FloatparameterContext _localctx = new FloatparameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floatparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(FLOAT_TYPE);
			setState(206);
			match(ID);
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

	public static class StringparameterContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(ExprParser.STRING_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public StringparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStringparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStringparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStringparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringparameterContext stringparameter() throws RecognitionException {
		StringparameterContext _localctx = new StringparameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stringparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(STRING_TYPE);
			setState(209);
			match(ID);
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

	public static class CharparameterContext extends ParserRuleContext {
		public TerminalNode CHAR_TYPE() { return getToken(ExprParser.CHAR_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public CharparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCharparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCharparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCharparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharparameterContext charparameter() throws RecognitionException {
		CharparameterContext _localctx = new CharparameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_charparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CHAR_TYPE);
			setState(212);
			match(ID);
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

	public static class ArrayparameterContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(ExprParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ExprParser.RIGHT_BRACKET, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(ExprParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ExprParser.FLOAT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ExprParser.CHAR_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(ExprParser.BOOLEAN_TYPE, 0); }
		public ArrayparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArrayparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArrayparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArrayparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayparameterContext arrayparameter() throws RecognitionException {
		ArrayparameterContext _localctx = new ArrayparameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
			match(LEFT_BRACKET);
			setState(216);
			match(RIGHT_BRACKET);
			setState(217);
			match(ID);
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

	public static class DeclarationContext extends ParserRuleContext {
		public SingledeclarationContext singledeclaration() {
			return getRuleContext(SingledeclarationContext.class,0);
		}
		public ArraydeclarationContext arraydeclaration() {
			return getRuleContext(ArraydeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				singledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				arraydeclaration();
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

	public static class ConstantdeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(ExprParser.CONSTANT, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConstantdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConstantdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConstantdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConstantdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantdeclarationContext constantdeclaration() throws RecognitionException {
		ConstantdeclarationContext _localctx = new ConstantdeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(CONSTANT);
			setState(224);
			declaration();
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

	public static class SingledeclarationContext extends ParserRuleContext {
		public IntdeclarationContext intdeclaration() {
			return getRuleContext(IntdeclarationContext.class,0);
		}
		public FloatdeclarationContext floatdeclaration() {
			return getRuleContext(FloatdeclarationContext.class,0);
		}
		public ChardeclarationContext chardeclaration() {
			return getRuleContext(ChardeclarationContext.class,0);
		}
		public BooleandeclarationContext booleandeclaration() {
			return getRuleContext(BooleandeclarationContext.class,0);
		}
		public StringdeclarationContext stringdeclaration() {
			return getRuleContext(StringdeclarationContext.class,0);
		}
		public SingledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSingledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSingledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSingledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingledeclarationContext singledeclaration() throws RecognitionException {
		SingledeclarationContext _localctx = new SingledeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singledeclaration);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				intdeclaration();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				floatdeclaration();
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				chardeclaration();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				booleandeclaration();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				stringdeclaration();
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

	public static class ArraydeclarationContext extends ParserRuleContext {
		public IntarrdeclarationContext intarrdeclaration() {
			return getRuleContext(IntarrdeclarationContext.class,0);
		}
		public FloatarrdeclarationContext floatarrdeclaration() {
			return getRuleContext(FloatarrdeclarationContext.class,0);
		}
		public ChararrdeclarationContext chararrdeclaration() {
			return getRuleContext(ChararrdeclarationContext.class,0);
		}
		public BooleanarrdeclarationContext booleanarrdeclaration() {
			return getRuleContext(BooleanarrdeclarationContext.class,0);
		}
		public ArraydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArraydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArraydeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArraydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclarationContext arraydeclaration() throws RecognitionException {
		ArraydeclarationContext _localctx = new ArraydeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arraydeclaration);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				intarrdeclaration();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				floatarrdeclaration();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				chararrdeclaration();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				booleanarrdeclaration();
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

	public static class BooleandeclarationContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_TYPE() { return getToken(ExprParser.BOOLEAN_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public BooleandeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleandeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleandeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleandeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleandeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleandeclarationContext booleandeclaration() throws RecognitionException {
		BooleandeclarationContext _localctx = new BooleandeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleandeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(BOOLEAN_TYPE);
			setState(240);
			match(ID);
			{
			setState(241);
			match(EQUALS);
			setState(242);
			booleanexp();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(243);
				logic();
				setState(244);
				booleanexp();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
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

	public static class BooleanarrdeclarationContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN_TYPE() { return getTokens(ExprParser.BOOLEAN_TYPE); }
		public TerminalNode BOOLEAN_TYPE(int i) {
			return getToken(ExprParser.BOOLEAN_TYPE, i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(ExprParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ExprParser.RIGHT_BRACKET, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public BooleanarrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanarrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanarrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleanarrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleanarrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanarrdeclarationContext booleanarrdeclaration() throws RecognitionException {
		BooleanarrdeclarationContext _localctx = new BooleanarrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(BOOLEAN_TYPE);
			setState(252);
			match(LEFT_BRACKET);
			setState(253);
			match(RIGHT_BRACKET);
			setState(254);
			match(ID);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(255);
				match(EQUALS);
				setState(256);
				match(T__0);
				setState(257);
				match(BOOLEAN_TYPE);
				setState(258);
				booleanexp();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(259);
					logic();
					setState(260);
					booleanexp();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class IntdeclarationContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(ExprParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode INT_VALUE() { return getToken(ExprParser.INT_VALUE, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public IntdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIntdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIntdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIntdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntdeclarationContext intdeclaration() throws RecognitionException {
		IntdeclarationContext _localctx = new IntdeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_intdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(INT_TYPE);
			setState(270);
			match(ID);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(271);
				match(EQUALS);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(272);
					match(INT_VALUE);
					}
					break;
				case 2:
					{
					setState(273);
					opr(0);
					}
					break;
				}
				}
			}

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

	public static class StringdeclarationContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(ExprParser.STRING_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode STRING_VALUE() { return getToken(ExprParser.STRING_VALUE, 0); }
		public StringdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStringdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStringdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStringdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdeclarationContext stringdeclaration() throws RecognitionException {
		StringdeclarationContext _localctx = new StringdeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stringdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(STRING_TYPE);
			setState(279);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(280);
				match(EQUALS);
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==STRING_VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

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

	public static class IntarrdeclarationContext extends ParserRuleContext {
		public List<TerminalNode> INT_TYPE() { return getTokens(ExprParser.INT_TYPE); }
		public TerminalNode INT_TYPE(int i) {
			return getToken(ExprParser.INT_TYPE, i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(ExprParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(ExprParser.LEFT_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(ExprParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(ExprParser.RIGHT_BRACKET, i);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public List<TerminalNode> INT_VALUE() { return getTokens(ExprParser.INT_VALUE); }
		public TerminalNode INT_VALUE(int i) {
			return getToken(ExprParser.INT_VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public IntarrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intarrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIntarrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIntarrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIntarrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntarrdeclarationContext intarrdeclaration() throws RecognitionException {
		IntarrdeclarationContext _localctx = new IntarrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(INT_TYPE);
			setState(285);
			match(LEFT_BRACKET);
			setState(286);
			match(RIGHT_BRACKET);
			setState(287);
			match(ID);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(288);
				match(EQUALS);
				setState(289);
				match(T__0);
				setState(290);
				match(INT_TYPE);
				setState(291);
				match(LEFT_BRACKET);
				setState(292);
				match(INT_VALUE);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(293);
					match(COMMA);
					setState(294);
					match(INT_VALUE);
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(RIGHT_BRACKET);
				}
			}

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

	public static class FloatdeclarationContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(ExprParser.FLOAT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(ExprParser.FLOAT_VALUE, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public FloatdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFloatdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFloatdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFloatdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatdeclarationContext floatdeclaration() throws RecognitionException {
		FloatdeclarationContext _localctx = new FloatdeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_floatdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(FLOAT_TYPE);
			setState(304);
			match(ID);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(305);
				match(EQUALS);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(306);
					match(FLOAT_VALUE);
					}
					break;
				case 2:
					{
					setState(307);
					opr(0);
					}
					break;
				}
				}
			}

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

	public static class FloatarrdeclarationContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT_TYPE() { return getTokens(ExprParser.FLOAT_TYPE); }
		public TerminalNode FLOAT_TYPE(int i) {
			return getToken(ExprParser.FLOAT_TYPE, i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(ExprParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(ExprParser.LEFT_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(ExprParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(ExprParser.RIGHT_BRACKET, i);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public List<TerminalNode> FLOAT_VALUE() { return getTokens(ExprParser.FLOAT_VALUE); }
		public TerminalNode FLOAT_VALUE(int i) {
			return getToken(ExprParser.FLOAT_VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public FloatarrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatarrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFloatarrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFloatarrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFloatarrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatarrdeclarationContext floatarrdeclaration() throws RecognitionException {
		FloatarrdeclarationContext _localctx = new FloatarrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_floatarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(FLOAT_TYPE);
			setState(313);
			match(LEFT_BRACKET);
			setState(314);
			match(RIGHT_BRACKET);
			setState(315);
			match(ID);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(316);
				match(EQUALS);
				setState(317);
				match(T__0);
				setState(318);
				match(FLOAT_TYPE);
				setState(319);
				match(LEFT_BRACKET);
				setState(320);
				match(FLOAT_VALUE);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(321);
					match(COMMA);
					setState(322);
					match(FLOAT_VALUE);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(RIGHT_BRACKET);
				}
			}

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

	public static class ChardeclarationContext extends ParserRuleContext {
		public TerminalNode CHAR_TYPE() { return getToken(ExprParser.CHAR_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode CHAR_VALUE() { return getToken(ExprParser.CHAR_VALUE, 0); }
		public ChardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterChardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitChardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitChardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclarationContext chardeclaration() throws RecognitionException {
		ChardeclarationContext _localctx = new ChardeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_chardeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(CHAR_TYPE);
			setState(332);
			match(ID);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(333);
				match(EQUALS);
				setState(334);
				match(CHAR_VALUE);
				}
			}

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

	public static class ChararrdeclarationContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(ExprParser.STRING_TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ExprParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(ExprParser.STRING_VALUE, 0); }
		public ChararrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chararrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterChararrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitChararrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitChararrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChararrdeclarationContext chararrdeclaration() throws RecognitionException {
		ChararrdeclarationContext _localctx = new ChararrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_chararrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(STRING_TYPE);
			setState(338);
			match(ID);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(339);
				match(EQUALS);
				setState(340);
				match(T__0);
				setState(341);
				match(CHAR_TYPE);
				setState(342);
				match(STRING_VALUE);
				}
			}

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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public TerminalNode CHAR_VALUE() { return getToken(ExprParser.CHAR_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(ExprParser.STRING_VALUE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ID);
			setState(346);
			match(EQUALS);
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
			case FLOAT_VALUE:
			case ID:
			case LEFT_PAREN:
				{
				setState(347);
				opr(0);
				}
				break;
			case CHAR_VALUE:
				{
				setState(348);
				match(CHAR_VALUE);
				}
				break;
			case STRING_VALUE:
				{
				setState(349);
				match(STRING_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(ExprParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(ExprParser.LEFT_PAREN, i);
		}
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(ExprParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(ExprParser.RIGHT_PAREN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(ExprParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ExprParser.THEN, i);
		}
		public List<TerminalNode> LEFT_BRACE() { return getTokens(ExprParser.LEFT_BRACE); }
		public TerminalNode LEFT_BRACE(int i) {
			return getToken(ExprParser.LEFT_BRACE, i);
		}
		public List<TerminalNode> RIGHT_BRACE() { return getTokens(ExprParser.RIGHT_BRACE); }
		public TerminalNode RIGHT_BRACE(int i) {
			return getToken(ExprParser.RIGHT_BRACE, i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public List<Block_contentContext> block_content() {
			return getRuleContexts(Block_contentContext.class);
		}
		public Block_contentContext block_content(int i) {
			return getRuleContext(Block_contentContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(ExprParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(ExprParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(IF);
			setState(353);
			match(LEFT_PAREN);
			setState(354);
			booleanexp();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(355);
				logic();
				setState(356);
				booleanexp();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(RIGHT_PAREN);
			setState(364);
			match(THEN);
			setState(365);
			match(LEFT_BRACE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(366);
				block_content();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(RIGHT_BRACE);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(373);
				match(ELSEIF);
				setState(374);
				match(LEFT_PAREN);
				setState(375);
				booleanexp();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(376);
					logic();
					setState(377);
					booleanexp();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384);
				match(RIGHT_PAREN);
				setState(385);
				match(THEN);
				setState(386);
				match(LEFT_BRACE);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
					{
					{
					setState(387);
					block_content();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				match(RIGHT_BRACE);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(400);
				match(ELSE);
				setState(401);
				match(LEFT_BRACE);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
					{
					{
					setState(402);
					block_content();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(RIGHT_BRACE);
				}
			}

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

	public static class LoopContext extends ParserRuleContext {
		public LoopforContext loopfor() {
			return getRuleContext(LoopforContext.class,0);
		}
		public LoopwhileContext loopwhile() {
			return getRuleContext(LoopwhileContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loop);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				loopfor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				loopwhile();
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

	public static class LoopforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ExprParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ExprParser.RIGHT_BRACE, 0); }
		public TerminalNode UP() { return getToken(ExprParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(ExprParser.DOWN, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode INT_VALUE() { return getToken(ExprParser.INT_VALUE, 0); }
		public IntdeclarationContext intdeclaration() {
			return getRuleContext(IntdeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<Block_contentContext> block_content() {
			return getRuleContexts(Block_contentContext.class);
		}
		public Block_contentContext block_content(int i) {
			return getRuleContext(Block_contentContext.class,i);
		}
		public LoopforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoopfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoopfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLoopfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopforContext loopfor() throws RecognitionException {
		LoopforContext _localctx = new LoopforContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(FOR);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(416);
				match(ID);
				}
				break;
			case 2:
				{
				setState(417);
				intdeclaration();
				}
				break;
			case 3:
				{
				setState(418);
				assignment();
				}
				break;
			}
			setState(421);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(422);
			match(TO);
			setState(423);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(424);
			match(LEFT_BRACE);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(425);
				block_content();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(RIGHT_BRACE);
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

	public static class LoopwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ExprParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ExprParser.RIGHT_BRACE, 0); }
		public List<Block_contentContext> block_content() {
			return getRuleContexts(Block_contentContext.class);
		}
		public Block_contentContext block_content(int i) {
			return getRuleContext(Block_contentContext.class,i);
		}
		public LoopwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoopwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoopwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLoopwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopwhileContext loopwhile() throws RecognitionException {
		LoopwhileContext _localctx = new LoopwhileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loopwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(WHILE);
			setState(434);
			match(LEFT_PAREN);
			setState(435);
			booleanexp();
			setState(436);
			match(RIGHT_PAREN);
			setState(437);
			match(LEFT_BRACE);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(438);
				block_content();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(RIGHT_BRACE);
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

	public static class LoopdowhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ExprParser.DO, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ExprParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ExprParser.RIGHT_BRACE, 0); }
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public List<Block_contentContext> block_content() {
			return getRuleContexts(Block_contentContext.class);
		}
		public Block_contentContext block_content(int i) {
			return getRuleContext(Block_contentContext.class,i);
		}
		public LoopdowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopdowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoopdowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoopdowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLoopdowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopdowhileContext loopdowhile() throws RecognitionException {
		LoopdowhileContext _localctx = new LoopdowhileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loopdowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(DO);
			setState(447);
			match(LEFT_BRACE);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(448);
				block_content();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(RIGHT_BRACE);
			setState(455);
			match(WHILE);
			setState(456);
			match(LEFT_PAREN);
			setState(457);
			booleanexp();
			setState(458);
			match(RIGHT_PAREN);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public ShortoprContext shortopr() {
			return getRuleContext(ShortoprContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operation);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(ID);
				setState(461);
				match(EQUALS);
				setState(462);
				opr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(ID);
				setState(464);
				shortopr();
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

	public static class OprContext extends ParserRuleContext {
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public Plus_minusContext plus_minus() {
			return getRuleContext(Plus_minusContext.class,0);
		}
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		return opr(0);
	}

	private OprContext opr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OprContext _localctx = new OprContext(_ctx, _parentState);
		OprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_opr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			multopr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_opr);
					setState(470);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(471);
					plus_minus();
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class Plus_minusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ExprParser.MINUS, 0); }
		public Plus_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPlus_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPlus_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPlus_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plus_minusContext plus_minus() throws RecognitionException {
		Plus_minusContext _localctx = new Plus_minusContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_plus_minus);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(PLUS);
				setState(478);
				multopr(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(MINUS);
				setState(480);
				multopr(0);
				}
				break;
			case INT_VALUE:
			case FLOAT_VALUE:
			case ID:
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				multopr(0);
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

	public static class MultoprContext extends ParserRuleContext {
		public TerminaloprContext terminalopr() {
			return getRuleContext(TerminaloprContext.class,0);
		}
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public Mult_div_modContext mult_div_mod() {
			return getRuleContext(Mult_div_modContext.class,0);
		}
		public MultoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultoprContext multopr() throws RecognitionException {
		return multopr(0);
	}

	private MultoprContext multopr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultoprContext _localctx = new MultoprContext(_ctx, _parentState);
		MultoprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_multopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(485);
			terminalopr();
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultoprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multopr);
					setState(487);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(488);
					mult_div_mod();
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class Mult_div_modContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminaloprContext terminalopr() {
			return getRuleContext(TerminaloprContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ExprParser.MOD, 0); }
		public Mult_div_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_div_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMult_div_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMult_div_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMult_div_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_div_modContext mult_div_mod() throws RecognitionException {
		Mult_div_modContext _localctx = new Mult_div_modContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mult_div_mod);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(MUL);
				setState(495);
				terminalopr();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(DIV);
				setState(497);
				terminalopr();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(MOD);
				setState(499);
				terminalopr();
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

	public static class TerminaloprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode INT_VALUE() { return getToken(ExprParser.INT_VALUE, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(ExprParser.FLOAT_VALUE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public TerminaloprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTerminalopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTerminalopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTerminalopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminaloprContext terminalopr() throws RecognitionException {
		TerminaloprContext _localctx = new TerminaloprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_terminalopr);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(ID);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(INT_VALUE);
				}
				break;
			case FLOAT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(FLOAT_VALUE);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(LEFT_PAREN);
				setState(506);
				opr(0);
				setState(507);
				match(RIGHT_PAREN);
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

	public static class ShortoprContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(ExprParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(ExprParser.MINUS_MINUS, 0); }
		public TerminalNode INT_VALUE() { return getToken(ExprParser.INT_VALUE, 0); }
		public TerminalNode PLUS_EQUALS() { return getToken(ExprParser.PLUS_EQUALS, 0); }
		public TerminalNode MIN_EQUALS() { return getToken(ExprParser.MIN_EQUALS, 0); }
		public TerminalNode MUL_EQUALS() { return getToken(ExprParser.MUL_EQUALS, 0); }
		public TerminalNode DIV_EQUALS() { return getToken(ExprParser.DIV_EQUALS, 0); }
		public ShortoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterShortopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitShortopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitShortopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortoprContext shortopr() throws RecognitionException {
		ShortoprContext _localctx = new ShortoprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shortopr);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(PLUS_PLUS);
				}
				break;
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(MINUS_MINUS);
				}
				break;
			case PLUS_EQUALS:
			case MIN_EQUALS:
			case MUL_EQUALS:
			case DIV_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUALS) | (1L << MIN_EQUALS) | (1L << MUL_EQUALS) | (1L << DIV_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(514);
				match(INT_VALUE);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ExprParser.PRINT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> PLUS() { return getTokens(ExprParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExprParser.PLUS, i);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(ExprParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(ExprParser.STRING_VALUE, i);
		}
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(PRINT);
			setState(518);
			match(LEFT_PAREN);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_VALUE || _la==ID) {
				{
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==STRING_VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(522);
				match(PLUS);
				setState(523);
				_la = _input.LA(1);
				if ( !(_la==STRING_VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(RIGHT_PAREN);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ExprParser.SCAN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public TerminalNode STRING_VALUE() { return getToken(ExprParser.STRING_VALUE, 0); }
		public TerminalNode COMMA() { return getToken(ExprParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(SCAN);
			setState(532);
			match(LEFT_PAREN);
			setState(533);
			match(STRING_VALUE);
			setState(534);
			match(COMMA);
			setState(535);
			match(ID);
			setState(536);
			match(RIGHT_PAREN);
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

	public static class BooleanexpContext extends ParserRuleContext {
		public List<BooleanvalueContext> booleanvalue() {
			return getRuleContexts(BooleanvalueContext.class);
		}
		public BooleanvalueContext booleanvalue(int i) {
			return getRuleContext(BooleanvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public BooleanexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleanexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleanexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanexpContext booleanexp() throws RecognitionException {
		BooleanexpContext _localctx = new BooleanexpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanexp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(538);
				match(NOT);
				}
			}

			setState(541);
			booleanvalue();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS_EQUALS) | (1L << NOT_EQUALS))) != 0)) {
				{
				setState(542);
				relation();
				setState(543);
				booleanvalue();
				}
			}

			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(547);
					logic();
					setState(548);
					booleanexp();
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
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

	public static class BooleanvalueContext extends ParserRuleContext {
		public TerminalNode INT_VALUE() { return getToken(ExprParser.INT_VALUE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode STRING_VALUE() { return getToken(ExprParser.STRING_VALUE, 0); }
		public TerminalNode CHAR_VALUE() { return getToken(ExprParser.CHAR_VALUE, 0); }
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ExprParser.LEFT_PAREN, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ExprParser.RIGHT_PAREN, 0); }
		public BooleanvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleanvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleanvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanvalueContext booleanvalue() throws RecognitionException {
		BooleanvalueContext _localctx = new BooleanvalueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_booleanvalue);
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				match(INT_VALUE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(ID);
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				match(STRING_VALUE);
				}
				break;
			case CHAR_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				match(CHAR_VALUE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(560);
				match(FALSE);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(561);
				match(LEFT_PAREN);
				setState(562);
				booleanexp();
				setState(563);
				match(RIGHT_PAREN);
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

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode EQUALS_EQUALS() { return getToken(ExprParser.EQUALS_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(ExprParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(ExprParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(ExprParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(ExprParser.GREATER_THAN_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ExprParser.GREATER_THAN, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS_EQUALS) | (1L << NOT_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		case 33:
			return opr_sempred((OprContext)_localctx, predIndex);
		case 35:
			return multopr_sempred((MultoprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean opr_sempred(OprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multopr_sempred(MultoprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u023e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\7\2e\n\2\f\2\16\2"+
		"h\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3t\n\3\3\3\3\3\3\3\3"+
		"\3\5\3z\n\3\5\3|\n\3\3\4\3\4\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4\u0086"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0095"+
		"\n\5\f\5\16\5\u0098\13\5\5\5\u009a\n\5\3\5\3\5\3\5\7\5\u009f\n\5\f\5\16"+
		"\5\u00a2\13\5\3\5\5\5\u00a5\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00bd"+
		"\n\7\f\7\16\7\u00c0\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c8\n\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\5\17\u00e0\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00ea\n\21\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u00f9\n\23\f\23\16\23\u00fc\13\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24"+
		"\16\24\u010c\13\24\5\24\u010e\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0115"+
		"\n\25\5\25\u0117\n\25\3\26\3\26\3\26\3\26\5\26\u011d\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012a\n\27\f\27\16\27"+
		"\u012d\13\27\3\27\5\27\u0130\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0137"+
		"\n\30\5\30\u0139\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0146\n\31\f\31\16\31\u0149\13\31\3\31\5\31\u014c\n\31\3\32"+
		"\3\32\3\32\3\32\5\32\u0152\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015a"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0161\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0169\n\35\f\35\16\35\u016c\13\35\3\35\3\35\3\35\3\35\7\35"+
		"\u0172\n\35\f\35\16\35\u0175\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u017e\n\35\f\35\16\35\u0181\13\35\3\35\3\35\3\35\3\35\7\35\u0187"+
		"\n\35\f\35\16\35\u018a\13\35\3\35\3\35\7\35\u018e\n\35\f\35\16\35\u0191"+
		"\13\35\3\35\3\35\3\35\7\35\u0196\n\35\f\35\16\35\u0199\13\35\3\35\5\35"+
		"\u019c\n\35\3\36\3\36\5\36\u01a0\n\36\3\37\3\37\3\37\3\37\5\37\u01a6\n"+
		"\37\3\37\3\37\3\37\3\37\3\37\7\37\u01ad\n\37\f\37\16\37\u01b0\13\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \7 \u01ba\n \f \16 \u01bd\13 \3 \3 \3!\3!\3"+
		"!\7!\u01c4\n!\f!\16!\u01c7\13!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u01d4\n\"\3#\3#\3#\3#\3#\7#\u01db\n#\f#\16#\u01de\13#\3$\3$\3$\3$\3"+
		"$\5$\u01e5\n$\3%\3%\3%\3%\3%\7%\u01ec\n%\f%\16%\u01ef\13%\3&\3&\3&\3&"+
		"\3&\3&\5&\u01f7\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0200\n\'\3(\3(\3("+
		"\3(\5(\u0206\n(\3)\3)\3)\5)\u020b\n)\3)\3)\7)\u020f\n)\f)\16)\u0212\13"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\5+\u021e\n+\3+\3+\3+\3+\5+\u0224\n+\3"+
		"+\3+\3+\7+\u0229\n+\f+\16+\u022c\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,"+
		"\u0238\n,\3-\3-\3.\3.\3.\2\4DH/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\n\4\2\23\26\30\30\4\2\23\25"+
		"\27\27\4\2\6\6  \3\2\20\21\4\2\7\7  \3\2\64\67\3\28=\3\2>?\2\u026c\2_"+
		"\3\2\2\2\4{\3\2\2\2\6}\3\2\2\2\b\u0089\3\2\2\2\n\u00a8\3\2\2\2\f\u00b8"+
		"\3\2\2\2\16\u00c7\3\2\2\2\20\u00c9\3\2\2\2\22\u00cc\3\2\2\2\24\u00cf\3"+
		"\2\2\2\26\u00d2\3\2\2\2\30\u00d5\3\2\2\2\32\u00d8\3\2\2\2\34\u00df\3\2"+
		"\2\2\36\u00e1\3\2\2\2 \u00e9\3\2\2\2\"\u00ef\3\2\2\2$\u00f1\3\2\2\2&\u00fd"+
		"\3\2\2\2(\u010f\3\2\2\2*\u0118\3\2\2\2,\u011e\3\2\2\2.\u0131\3\2\2\2\60"+
		"\u013a\3\2\2\2\62\u014d\3\2\2\2\64\u0153\3\2\2\2\66\u015b\3\2\2\28\u0162"+
		"\3\2\2\2:\u019f\3\2\2\2<\u01a1\3\2\2\2>\u01b3\3\2\2\2@\u01c0\3\2\2\2B"+
		"\u01d3\3\2\2\2D\u01d5\3\2\2\2F\u01e4\3\2\2\2H\u01e6\3\2\2\2J\u01f6\3\2"+
		"\2\2L\u01ff\3\2\2\2N\u0205\3\2\2\2P\u0207\3\2\2\2R\u0215\3\2\2\2T\u021d"+
		"\3\2\2\2V\u0237\3\2\2\2X\u0239\3\2\2\2Z\u023b\3\2\2\2\\^\5\b\5\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\5\6\4\2ce\5"+
		"\b\5\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7"+
		"\2\2\3j\3\3\2\2\2kt\5\34\17\2lt\5\36\20\2mt\5\66\34\2nt\5@!\2ot\5B\"\2"+
		"pt\5P)\2qt\5R*\2rt\5\n\6\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3"+
		"\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2uv\7(\2\2v|\3\2\2\2wz\5"+
		":\36\2xz\58\35\2yw\3\2\2\2yx\3\2\2\2z|\3\2\2\2{s\3\2\2\2{y\3\2\2\2|\5"+
		"\3\2\2\2}~\7\34\2\2~\177\7#\2\2\177\u0080\7$\2\2\u0080\u0084\7%\2\2\u0081"+
		"\u0083\5\4\3\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7&\2\2\u0088\7\3\2\2\2\u0089\u008a\7\31\2\2\u008a\u008d\t\2\2\2"+
		"\u008b\u008c\7!\2\2\u008c\u008e\7\"\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7 \2\2\u0090\u0099\7#\2\2\u0091"+
		"\u0096\5\16\b\2\u0092\u0093\7\'\2\2\u0093\u0095\5\16\b\2\u0094\u0092\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7$\2\2\u009c\u00a0\7%\2\2\u009d\u009f"+
		"\5\4\3\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5\f"+
		"\7\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\7&\2\2\u00a7\t\3\2\2\2\u00a8\u00a9\7 \2\2\u00a9\u00b3\7#\2\2\u00aa"+
		"\u00b2\7\7\2\2\u00ab\u00b2\7\b\2\2\u00ac\u00b2\7\6\2\2\u00ad\u00b2\7\5"+
		"\2\2\u00ae\u00b2\5T+\2\u00af\u00b2\5D#\2\u00b0\u00b2\7 \2\2\u00b1\u00aa"+
		"\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7\13\3\2\2\2\u00b8\u00be\7\35\2"+
		"\2\u00b9\u00bd\5T+\2\u00ba\u00bd\5D#\2\u00bb\u00bd\7 \2\2\u00bc\u00b9"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\r\3\2\2\2\u00c0\u00be\3\2\2\2"+
		"\u00c1\u00c8\5\20\t\2\u00c2\u00c8\5\22\n\2\u00c3\u00c8\5\26\f\2\u00c4"+
		"\u00c8\5\30\r\2\u00c5\u00c8\5\32\16\2\u00c6\u00c8\5\24\13\2\u00c7\u00c1"+
		"\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\17\3\2\2\2\u00c9\u00ca\7\23\2"+
		"\2\u00ca\u00cb\7 \2\2\u00cb\21\3\2\2\2\u00cc\u00cd\7\27\2\2\u00cd\u00ce"+
		"\7 \2\2\u00ce\23\3\2\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\7 \2\2\u00d1"+
		"\25\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\7 \2\2\u00d4\27\3\2\2\2\u00d5"+
		"\u00d6\7\25\2\2\u00d6\u00d7\7 \2\2\u00d7\31\3\2\2\2\u00d8\u00d9\t\3\2"+
		"\2\u00d9\u00da\7!\2\2\u00da\u00db\7\"\2\2\u00db\u00dc\7 \2\2\u00dc\33"+
		"\3\2\2\2\u00dd\u00e0\5 \21\2\u00de\u00e0\5\"\22\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0\35\3\2\2\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3"+
		"\5\34\17\2\u00e3\37\3\2\2\2\u00e4\u00ea\5(\25\2\u00e5\u00ea\5.\30\2\u00e6"+
		"\u00ea\5\62\32\2\u00e7\u00ea\5$\23\2\u00e8\u00ea\5*\26\2\u00e9\u00e4\3"+
		"\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea!\3\2\2\2\u00eb\u00f0\5,\27\2\u00ec\u00f0\5\60\31"+
		"\2\u00ed\u00f0\5\64\33\2\u00ee\u00f0\5&\24\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0#\3\2\2\2"+
		"\u00f1\u00f2\7\27\2\2\u00f2\u00f3\7 \2\2\u00f3\u00f4\7\63\2\2\u00f4\u00fa"+
		"\5T+\2\u00f5\u00f6\5Z.\2\u00f6\u00f7\5T+\2\u00f7\u00f9\3\2\2\2\u00f8\u00f5"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"%\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff\7!\2\2"+
		"\u00ff\u0100\7\"\2\2\u0100\u010d\7 \2\2\u0101\u0102\7\63\2\2\u0102\u0103"+
		"\7\3\2\2\u0103\u0104\7\27\2\2\u0104\u010a\5T+\2\u0105\u0106\5Z.\2\u0106"+
		"\u0107\5T+\2\u0107\u0109\3\2\2\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2"+
		"\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u010e\3\2\2\2\u010e\'\3\2\2\2\u010f"+
		"\u0110\7\23\2\2\u0110\u0116\7 \2\2\u0111\u0114\7\63\2\2\u0112\u0115\7"+
		"\7\2\2\u0113\u0115\5D#\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0117\3\2\2\2\u0117)\3\2\2\2"+
		"\u0118\u0119\7\26\2\2\u0119\u011c\7 \2\2\u011a\u011b\7\63\2\2\u011b\u011d"+
		"\t\4\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d+\3\2\2\2\u011e"+
		"\u011f\7\23\2\2\u011f\u0120\7!\2\2\u0120\u0121\7\"\2\2\u0121\u012f\7 "+
		"\2\2\u0122\u0123\7\63\2\2\u0123\u0124\7\3\2\2\u0124\u0125\7\23\2\2\u0125"+
		"\u0126\7!\2\2\u0126\u012b\7\7\2\2\u0127\u0128\7\'\2\2\u0128\u012a\7\7"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\7\""+
		"\2\2\u012f\u0122\3\2\2\2\u012f\u0130\3\2\2\2\u0130-\3\2\2\2\u0131\u0132"+
		"\7\24\2\2\u0132\u0138\7 \2\2\u0133\u0136\7\63\2\2\u0134\u0137\7\b\2\2"+
		"\u0135\u0137\5D#\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0139\3\2\2\2\u0139/\3\2\2\2\u013a"+
		"\u013b\7\24\2\2\u013b\u013c\7!\2\2\u013c\u013d\7\"\2\2\u013d\u014b\7 "+
		"\2\2\u013e\u013f\7\63\2\2\u013f\u0140\7\3\2\2\u0140\u0141\7\24\2\2\u0141"+
		"\u0142\7!\2\2\u0142\u0147\7\b\2\2\u0143\u0144\7\'\2\2\u0144\u0146\7\b"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c\7\""+
		"\2\2\u014b\u013e\3\2\2\2\u014b\u014c\3\2\2\2\u014c\61\3\2\2\2\u014d\u014e"+
		"\7\25\2\2\u014e\u0151\7 \2\2\u014f\u0150\7\63\2\2\u0150\u0152\7\5\2\2"+
		"\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\63\3\2\2\2\u0153\u0154"+
		"\7\26\2\2\u0154\u0159\7 \2\2\u0155\u0156\7\63\2\2\u0156\u0157\7\3\2\2"+
		"\u0157\u0158\7\25\2\2\u0158\u015a\7\6\2\2\u0159\u0155\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\65\3\2\2\2\u015b\u015c\7 \2\2\u015c\u0160\7\63\2\2\u015d"+
		"\u0161\5D#\2\u015e\u0161\7\5\2\2\u015f\u0161\7\6\2\2\u0160\u015d\3\2\2"+
		"\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\67\3\2\2\2\u0162\u0163"+
		"\7\t\2\2\u0163\u0164\7#\2\2\u0164\u016a\5T+\2\u0165\u0166\5Z.\2\u0166"+
		"\u0167\5T+\2\u0167\u0169\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2"+
		"\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016e\7$\2\2\u016e\u016f\7\f\2\2\u016f\u0173\7%\2\2\u0170"+
		"\u0172\5\4\3\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u018f\7&\2\2\u0177\u0178\7\13\2\2\u0178\u0179\7#\2\2\u0179\u017f\5T+"+
		"\2\u017a\u017b\5Z.\2\u017b\u017c\5T+\2\u017c\u017e\3\2\2\2\u017d\u017a"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7$\2\2\u0183\u0184\7\f"+
		"\2\2\u0184\u0188\7%\2\2\u0185\u0187\5\4\3\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7&\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u0177\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u019b\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7\n\2\2\u0193"+
		"\u0197\7%\2\2\u0194\u0196\5\4\3\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019c\7&\2\2\u019b\u0192\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c9\3\2\2\2\u019d\u01a0\5<\37\2\u019e\u01a0\5> \2\u019f\u019d"+
		"\3\2\2\2\u019f\u019e\3\2\2\2\u01a0;\3\2\2\2\u01a1\u01a5\7\r\2\2\u01a2"+
		"\u01a6\7 \2\2\u01a3\u01a6\5(\25\2\u01a4\u01a6\5\66\34\2\u01a5\u01a2\3"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\t\5\2\2\u01a8\u01a9\7\22\2\2\u01a9\u01aa\t\6\2\2\u01aa\u01ae\7"+
		"%\2\2\u01ab\u01ad\5\4\3\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b1\u01b2\7&\2\2\u01b2=\3\2\2\2\u01b3\u01b4\7\16\2\2\u01b4\u01b5"+
		"\7#\2\2\u01b5\u01b6\5T+\2\u01b6\u01b7\7$\2\2\u01b7\u01bb\7%\2\2\u01b8"+
		"\u01ba\5\4\3\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01bf\7&\2\2\u01bf?\3\2\2\2\u01c0\u01c1\7\17\2\2\u01c1\u01c5\7%\2\2\u01c2"+
		"\u01c4\5\4\3\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\7&\2\2\u01c9\u01ca\7\16\2\2\u01ca\u01cb\7#\2\2\u01cb\u01cc\5T+"+
		"\2\u01cc\u01cd\7$\2\2\u01cdA\3\2\2\2\u01ce\u01cf\7 \2\2\u01cf\u01d0\7"+
		"\63\2\2\u01d0\u01d4\5D#\2\u01d1\u01d2\7 \2\2\u01d2\u01d4\5N(\2\u01d3\u01ce"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4C\3\2\2\2\u01d5\u01d6\b#\1\2\u01d6\u01d7"+
		"\5H%\2\u01d7\u01dc\3\2\2\2\u01d8\u01d9\f\4\2\2\u01d9\u01db\5F$\2\u01da"+
		"\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01ddE\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7.\2\2\u01e0\u01e5"+
		"\5H%\2\u01e1\u01e2\7/\2\2\u01e2\u01e5\5H%\2\u01e3\u01e5\5H%\2\u01e4\u01df"+
		"\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5G\3\2\2\2\u01e6"+
		"\u01e7\b%\1\2\u01e7\u01e8\5L\'\2\u01e8\u01ed\3\2\2\2\u01e9\u01ea\f\4\2"+
		"\2\u01ea\u01ec\5J&\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeI\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f1\7\60\2\2\u01f1\u01f7\5L\'\2\u01f2\u01f3\7\61\2\2\u01f3\u01f7\5"+
		"L\'\2\u01f4\u01f5\7\62\2\2\u01f5\u01f7\5L\'\2\u01f6\u01f0\3\2\2\2\u01f6"+
		"\u01f2\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7K\3\2\2\2\u01f8\u0200\7 \2\2\u01f9"+
		"\u0200\7\7\2\2\u01fa\u0200\7\b\2\2\u01fb\u01fc\7#\2\2\u01fc\u01fd\5D#"+
		"\2\u01fd\u01fe\7$\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f8\3\2\2\2\u01ff\u01f9"+
		"\3\2\2\2\u01ff\u01fa\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200M\3\2\2\2\u0201"+
		"\u0206\7,\2\2\u0202\u0206\7-\2\2\u0203\u0204\t\7\2\2\u0204\u0206\7\7\2"+
		"\2\u0205\u0201\3\2\2\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0206O"+
		"\3\2\2\2\u0207\u0208\7\32\2\2\u0208\u020a\7#\2\2\u0209\u020b\t\4\2\2\u020a"+
		"\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0210\3\2\2\2\u020c\u020d\7."+
		"\2\2\u020d\u020f\t\4\2\2\u020e\u020c\3\2\2\2\u020f\u0212\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0213\u0214\7$\2\2\u0214Q\3\2\2\2\u0215\u0216\7\33\2\2\u0216\u0217"+
		"\7#\2\2\u0217\u0218\7\6\2\2\u0218\u0219\7\'\2\2\u0219\u021a\7 \2\2\u021a"+
		"\u021b\7$\2\2\u021bS\3\2\2\2\u021c\u021e\7@\2\2\u021d\u021c\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0223\5V,\2\u0220\u0221\5X-\2"+
		"\u0221\u0222\5V,\2\u0222\u0224\3\2\2\2\u0223\u0220\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u022a\3\2\2\2\u0225\u0226\5Z.\2\u0226\u0227\5T+\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0225\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022bU\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u0238"+
		"\7\7\2\2\u022e\u0238\7 \2\2\u022f\u0238\7\6\2\2\u0230\u0238\7\5\2\2\u0231"+
		"\u0238\7\36\2\2\u0232\u0238\7\37\2\2\u0233\u0234\7#\2\2\u0234\u0235\5"+
		"T+\2\u0235\u0236\7$\2\2\u0236\u0238\3\2\2\2\u0237\u022d\3\2\2\2\u0237"+
		"\u022e\3\2\2\2\u0237\u022f\3\2\2\2\u0237\u0230\3\2\2\2\u0237\u0231\3\2"+
		"\2\2\u0237\u0232\3\2\2\2\u0237\u0233\3\2\2\2\u0238W\3\2\2\2\u0239\u023a"+
		"\t\b\2\2\u023aY\3\2\2\2\u023b\u023c\t\t\2\2\u023c[\3\2\2\2=_fsy{\u0084"+
		"\u008d\u0096\u0099\u00a0\u00a4\u00b1\u00b3\u00bc\u00be\u00c7\u00df\u00e9"+
		"\u00ef\u00fa\u010a\u010d\u0114\u0116\u011c\u012b\u012f\u0136\u0138\u0147"+
		"\u014b\u0151\u0159\u0160\u016a\u0173\u017f\u0188\u018f\u0197\u019b\u019f"+
		"\u01a5\u01ae\u01bb\u01c5\u01d3\u01dc\u01e4\u01ed\u01f6\u01ff\u0205\u020a"+
		"\u0210\u021d\u0223\u022a\u0237";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}