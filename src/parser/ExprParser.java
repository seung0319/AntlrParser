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
		T__0=1, T__1=2, CHAR_VALUE=3, STRING_VALUE=4, INT_VALUE=5, FLOAT_VALUE=6, 
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
		RULE_addopr = 34, RULE_multopr = 35, RULE_terminalopr = 36, RULE_shortopr = 37, 
		RULE_print = 38, RULE_scan = 39, RULE_booleanexp = 40, RULE_booleanvalue = 41, 
		RULE_relation = 42, RULE_logic = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block_content", "main", "function", "call", "returnstatement", 
			"parameter", "intparameter", "booleanparameter", "floatparameter", "stringparameter", 
			"charparameter", "arrayparameter", "declaration", "constantdeclaration", 
			"singledeclaration", "arraydeclaration", "booleandeclaration", "booleanarrdeclaration", 
			"intdeclaration", "stringdeclaration", "intarrdeclaration", "floatdeclaration", 
			"floatarrdeclaration", "chardeclaration", "chararrdeclaration", "assignment", 
			"condition", "loop", "loopfor", "loopwhile", "loopdowhile", "operation", 
			"opr", "addopr", "multopr", "terminalopr", "shortopr", "print", "scan", 
			"booleanexp", "booleanvalue", "relation", "logic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'constant'", "'create'", null, null, null, null, "'if'", "'else'", 
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
			null, null, null, "CHAR_VALUE", "STRING_VALUE", "INT_VALUE", "FLOAT_VALUE", 
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(88);
				function();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			main();
			setState(95);
			function();
			setState(96);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
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
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(98);
					declaration();
					}
					break;
				case 2:
					{
					setState(99);
					constantdeclaration();
					}
					break;
				case 3:
					{
					setState(100);
					assignment();
					}
					break;
				case 4:
					{
					setState(101);
					loopdowhile();
					}
					break;
				case 5:
					{
					setState(102);
					operation();
					}
					break;
				case 6:
					{
					setState(103);
					print();
					}
					break;
				case 7:
					{
					setState(104);
					scan();
					}
					break;
				case 8:
					{
					setState(105);
					call();
					}
					break;
				}
				setState(108);
				match(SEMICOLON);
				}
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case WHILE:
					{
					setState(110);
					loop();
					}
					break;
				case IF:
					{
					setState(111);
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
			setState(116);
			match(MAIN);
			setState(117);
			match(LEFT_PAREN);
			setState(118);
			match(RIGHT_PAREN);
			setState(119);
			match(LEFT_BRACE);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(120);
				block_content();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
			setState(128);
			match(FUNCTION);
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(130);
				match(LEFT_BRACKET);
				setState(131);
				match(RIGHT_BRACKET);
				}
			}

			setState(134);
			match(ID);
			setState(135);
			match(LEFT_PAREN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(136);
				parameter();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(137);
					match(COMMA);
					setState(138);
					parameter();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146);
			match(RIGHT_PAREN);
			setState(147);
			match(LEFT_BRACE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(148);
				block_content();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(154);
				returnstatement();
				}
			}

			setState(157);
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
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
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
			setState(159);
			match(ID);
			setState(160);
			match(LEFT_PAREN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_VALUE) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LEFT_PAREN) | (1L << NOT))) != 0)) {
				{
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(161);
					match(INT_VALUE);
					}
					break;
				case 2:
					{
					setState(162);
					match(FLOAT_VALUE);
					}
					break;
				case 3:
					{
					setState(163);
					match(STRING_VALUE);
					}
					break;
				case 4:
					{
					setState(164);
					match(CHAR_VALUE);
					}
					break;
				case 5:
					{
					setState(165);
					booleanexp();
					}
					break;
				case 6:
					{
					setState(166);
					opr();
					}
					break;
				case 7:
					{
					setState(167);
					match(ID);
					}
					break;
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(170);
					match(COMMA);
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(171);
						match(INT_VALUE);
						}
						break;
					case 2:
						{
						setState(172);
						match(FLOAT_VALUE);
						}
						break;
					case 3:
						{
						setState(173);
						match(STRING_VALUE);
						}
						break;
					case 4:
						{
						setState(174);
						match(CHAR_VALUE);
						}
						break;
					case 5:
						{
						setState(175);
						booleanexp();
						}
						break;
					case 6:
						{
						setState(176);
						opr();
						}
						break;
					case 7:
						{
						setState(177);
						match(ID);
						}
						break;
					}
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187);
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
			setState(189);
			match(RETURN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_VALUE) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LEFT_PAREN) | (1L << NOT))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(190);
					booleanexp();
					}
					break;
				case 2:
					{
					setState(191);
					opr();
					}
					break;
				case 3:
					{
					setState(192);
					match(ID);
					}
					break;
				}
				}
				setState(197);
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				intparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				booleanparameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				stringparameter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				charparameter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				arrayparameter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
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
			setState(206);
			match(INT_TYPE);
			setState(207);
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
			setState(209);
			match(BOOLEAN_TYPE);
			setState(210);
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
			setState(212);
			match(FLOAT_TYPE);
			setState(213);
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
			setState(215);
			match(STRING_TYPE);
			setState(216);
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
			setState(218);
			match(CHAR_TYPE);
			setState(219);
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
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			match(LEFT_BRACKET);
			setState(223);
			match(RIGHT_BRACKET);
			setState(224);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				singledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
			setState(230);
			match(T__0);
			setState(231);
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
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				intdeclaration();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				floatdeclaration();
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				chardeclaration();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				booleandeclaration();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				intarrdeclaration();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				floatarrdeclaration();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				chararrdeclaration();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
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
			setState(246);
			match(BOOLEAN_TYPE);
			setState(247);
			match(ID);
			{
			setState(248);
			match(EQUALS);
			setState(249);
			booleanexp();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(250);
				logic();
				setState(251);
				booleanexp();
				}
				}
				setState(257);
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
			setState(258);
			match(BOOLEAN_TYPE);
			setState(259);
			match(LEFT_BRACKET);
			setState(260);
			match(RIGHT_BRACKET);
			setState(261);
			match(ID);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(262);
				match(EQUALS);
				setState(263);
				match(T__1);
				setState(264);
				match(BOOLEAN_TYPE);
				setState(265);
				booleanexp();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(266);
					logic();
					setState(267);
					booleanexp();
					}
					}
					setState(273);
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
			setState(276);
			match(INT_TYPE);
			setState(277);
			match(ID);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(278);
				match(EQUALS);
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(279);
					match(INT_VALUE);
					}
					break;
				case 2:
					{
					setState(280);
					opr();
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
			setState(285);
			match(STRING_TYPE);
			setState(286);
			match(ID);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(287);
				match(EQUALS);
				setState(288);
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
			setState(291);
			match(INT_TYPE);
			setState(292);
			match(LEFT_BRACKET);
			setState(293);
			match(RIGHT_BRACKET);
			setState(294);
			match(ID);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(295);
				match(EQUALS);
				setState(296);
				match(T__1);
				setState(297);
				match(INT_TYPE);
				setState(298);
				match(LEFT_BRACKET);
				setState(299);
				match(INT_VALUE);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					match(INT_VALUE);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
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
			setState(310);
			match(FLOAT_TYPE);
			setState(311);
			match(ID);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(312);
				match(EQUALS);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(313);
					match(FLOAT_VALUE);
					}
					break;
				case 2:
					{
					setState(314);
					opr();
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
			setState(319);
			match(FLOAT_TYPE);
			setState(320);
			match(LEFT_BRACKET);
			setState(321);
			match(RIGHT_BRACKET);
			setState(322);
			match(ID);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(323);
				match(EQUALS);
				setState(324);
				match(T__1);
				setState(325);
				match(FLOAT_TYPE);
				setState(326);
				match(LEFT_BRACKET);
				setState(327);
				match(FLOAT_VALUE);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(328);
					match(COMMA);
					setState(329);
					match(FLOAT_VALUE);
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
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
			setState(338);
			match(CHAR_TYPE);
			setState(339);
			match(ID);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(340);
				match(EQUALS);
				setState(341);
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
			setState(344);
			match(STRING_TYPE);
			setState(345);
			match(ID);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(346);
				match(EQUALS);
				setState(347);
				match(T__1);
				setState(348);
				match(CHAR_TYPE);
				setState(349);
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
			setState(352);
			match(ID);
			setState(353);
			match(EQUALS);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
			case FLOAT_VALUE:
			case ID:
			case LEFT_PAREN:
				{
				setState(354);
				opr();
				}
				break;
			case CHAR_VALUE:
				{
				setState(355);
				match(CHAR_VALUE);
				}
				break;
			case STRING_VALUE:
				{
				setState(356);
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
			setState(359);
			match(IF);
			setState(360);
			match(LEFT_PAREN);
			setState(361);
			booleanexp();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(362);
				logic();
				setState(363);
				booleanexp();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(RIGHT_PAREN);
			setState(371);
			match(THEN);
			setState(372);
			match(LEFT_BRACE);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(373);
				block_content();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(RIGHT_BRACE);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(380);
				match(ELSEIF);
				setState(381);
				match(LEFT_PAREN);
				setState(382);
				booleanexp();
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(383);
					logic();
					setState(384);
					booleanexp();
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
				match(RIGHT_PAREN);
				setState(392);
				match(THEN);
				setState(393);
				match(LEFT_BRACE);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
					{
					{
					setState(394);
					block_content();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400);
				match(RIGHT_BRACE);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(407);
				match(ELSE);
				setState(408);
				match(LEFT_BRACE);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
					{
					{
					setState(409);
					block_content();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
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
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				loopfor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
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
			setState(422);
			match(FOR);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(423);
				match(ID);
				}
				break;
			case 2:
				{
				setState(424);
				intdeclaration();
				}
				break;
			case 3:
				{
				setState(425);
				assignment();
				}
				break;
			}
			setState(428);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(429);
			match(TO);
			setState(430);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(431);
			match(LEFT_BRACE);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(432);
				block_content();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
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
			setState(440);
			match(WHILE);
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(441);
				match(ID);
				}
				break;
			case 2:
				{
				setState(442);
				intdeclaration();
				}
				break;
			case 3:
				{
				setState(443);
				assignment();
				}
				break;
			}
			setState(446);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(447);
			match(TO);
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(449);
			match(LEFT_BRACE);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(450);
				block_content();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
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
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
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
			setState(458);
			match(DO);
			setState(459);
			match(LEFT_BRACE);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(460);
				block_content();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(RIGHT_BRACE);
			setState(467);
			match(WHILE);
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(468);
				match(ID);
				}
				break;
			case 2:
				{
				setState(469);
				intdeclaration();
				}
				break;
			case 3:
				{
				setState(470);
				assignment();
				}
				break;
			}
			setState(473);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(474);
			match(TO);
			setState(475);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==ID) ) {
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
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(ID);
				setState(478);
				match(EQUALS);
				setState(479);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(ID);
				setState(481);
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
		public AddoprContext addopr() {
			return getRuleContext(AddoprContext.class,0);
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
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_opr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			addopr(0);
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

	public static class AddoprContext extends ParserRuleContext {
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public AddoprContext addopr() {
			return getRuleContext(AddoprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExprParser.MINUS, 0); }
		public AddoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAddopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAddopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddoprContext addopr() throws RecognitionException {
		return addopr(0);
	}

	private AddoprContext addopr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddoprContext _localctx = new AddoprContext(_ctx, _parentState);
		AddoprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_addopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487);
			multopr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(495);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(489);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(490);
						match(PLUS);
						setState(491);
						multopr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(492);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(493);
						match(MINUS);
						setState(494);
						multopr(0);
						}
						break;
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class MultoprContext extends ParserRuleContext {
		public TerminaloprContext terminalopr() {
			return getRuleContext(TerminaloprContext.class,0);
		}
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ExprParser.MOD, 0); }
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
			setState(501);
			terminalopr();
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(503);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(504);
						match(MUL);
						setState(505);
						terminalopr();
						}
						break;
					case 2:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(506);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(507);
						match(DIV);
						setState(508);
						terminalopr();
						}
						break;
					case 3:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(509);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(510);
						match(MOD);
						setState(511);
						terminalopr();
						}
						break;
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 72, RULE_terminalopr);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(ID);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(INT_VALUE);
				}
				break;
			case FLOAT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(FLOAT_VALUE);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(LEFT_PAREN);
				setState(521);
				opr();
				setState(522);
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
		enterRule(_localctx, 74, RULE_shortopr);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(PLUS_PLUS);
				}
				break;
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(MINUS_MINUS);
				}
				break;
			case PLUS_EQUALS:
			case MIN_EQUALS:
			case MUL_EQUALS:
			case DIV_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUALS) | (1L << MIN_EQUALS) | (1L << MUL_EQUALS) | (1L << DIV_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(529);
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
		enterRule(_localctx, 76, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(PRINT);
			setState(533);
			match(LEFT_PAREN);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_VALUE || _la==ID) {
				{
				setState(534);
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

			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(537);
				match(PLUS);
				setState(538);
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
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
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
		enterRule(_localctx, 78, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(SCAN);
			setState(547);
			match(LEFT_PAREN);
			setState(548);
			match(STRING_VALUE);
			setState(549);
			match(COMMA);
			setState(550);
			match(ID);
			setState(551);
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
		enterRule(_localctx, 80, RULE_booleanexp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(553);
				match(NOT);
				}
			}

			setState(556);
			booleanvalue();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS_EQUALS) | (1L << NOT_EQUALS))) != 0)) {
				{
				setState(557);
				relation();
				setState(558);
				booleanvalue();
				}
			}

			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(562);
					logic();
					setState(563);
					booleanexp();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 82, RULE_booleanvalue);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(INT_VALUE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(ID);
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				match(STRING_VALUE);
				}
				break;
			case CHAR_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				match(CHAR_VALUE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				match(FALSE);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(576);
				match(LEFT_PAREN);
				setState(577);
				booleanexp();
				setState(578);
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
		enterRule(_localctx, 84, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
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
		enterRule(_localctx, 86, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
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
		case 34:
			return addopr_sempred((AddoprContext)_localctx, predIndex);
		case 35:
			return multopr_sempred((MultoprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addopr_sempred(AddoprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multopr_sempred(MultoprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u024d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\3\3\3\3\3\3\3\5\3s\n\3\5\3u\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0087"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\5\5\u0093\n"+
		"\5\3\5\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\5\5\5\u009e\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u00b5\n\6\7\6\u00b7\n\6\f\6\16\6\u00ba\13\6\5\6\u00bc"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00cf\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00e7"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f1\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00f7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0100"+
		"\n\23\f\23\16\23\u0103\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u0110\n\24\f\24\16\24\u0113\13\24\5\24\u0115\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u011c\n\25\5\25\u011e\n\25\3\26\3\26\3\26"+
		"\3\26\5\26\u0124\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0131\n\27\f\27\16\27\u0134\13\27\3\27\5\27\u0137\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u013e\n\30\5\30\u0140\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u014d\n\31\f\31\16\31\u0150"+
		"\13\31\3\31\5\31\u0153\n\31\3\32\3\32\3\32\3\32\5\32\u0159\n\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0161\n\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0168\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0170\n\35\f\35\16\35\u0173"+
		"\13\35\3\35\3\35\3\35\3\35\7\35\u0179\n\35\f\35\16\35\u017c\13\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0185\n\35\f\35\16\35\u0188\13\35"+
		"\3\35\3\35\3\35\3\35\7\35\u018e\n\35\f\35\16\35\u0191\13\35\3\35\3\35"+
		"\7\35\u0195\n\35\f\35\16\35\u0198\13\35\3\35\3\35\3\35\7\35\u019d\n\35"+
		"\f\35\16\35\u01a0\13\35\3\35\5\35\u01a3\n\35\3\36\3\36\5\36\u01a7\n\36"+
		"\3\37\3\37\3\37\3\37\5\37\u01ad\n\37\3\37\3\37\3\37\3\37\3\37\7\37\u01b4"+
		"\n\37\f\37\16\37\u01b7\13\37\3\37\3\37\3 \3 \3 \3 \5 \u01bf\n \3 \3 \3"+
		" \3 \3 \7 \u01c6\n \f \16 \u01c9\13 \3 \3 \3!\3!\3!\7!\u01d0\n!\f!\16"+
		"!\u01d3\13!\3!\3!\3!\3!\3!\5!\u01da\n!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u01e5\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u01f2\n$\f$\16$\u01f5"+
		"\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0203\n%\f%\16%\u0206\13%"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u020f\n&\3\'\3\'\3\'\3\'\5\'\u0215\n\'\3(\3("+
		"\3(\5(\u021a\n(\3(\3(\7(\u021e\n(\f(\16(\u0221\13(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3*\5*\u022d\n*\3*\3*\3*\3*\5*\u0233\n*\3*\3*\3*\7*\u0238\n*\f"+
		"*\16*\u023b\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0247\n+\3,\3,\3-\3-"+
		"\3-\2\4FH.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVX\2\n\4\2\23\26\30\30\4\2\23\25\27\27\4\2\6\6  \3\2\20"+
		"\21\4\2\7\7  \3\2\64\67\3\28=\3\2>?\2\u0285\2]\3\2\2\2\4t\3\2\2\2\6v\3"+
		"\2\2\2\b\u0082\3\2\2\2\n\u00a1\3\2\2\2\f\u00bf\3\2\2\2\16\u00ce\3\2\2"+
		"\2\20\u00d0\3\2\2\2\22\u00d3\3\2\2\2\24\u00d6\3\2\2\2\26\u00d9\3\2\2\2"+
		"\30\u00dc\3\2\2\2\32\u00df\3\2\2\2\34\u00e6\3\2\2\2\36\u00e8\3\2\2\2 "+
		"\u00f0\3\2\2\2\"\u00f6\3\2\2\2$\u00f8\3\2\2\2&\u0104\3\2\2\2(\u0116\3"+
		"\2\2\2*\u011f\3\2\2\2,\u0125\3\2\2\2.\u0138\3\2\2\2\60\u0141\3\2\2\2\62"+
		"\u0154\3\2\2\2\64\u015a\3\2\2\2\66\u0162\3\2\2\28\u0169\3\2\2\2:\u01a6"+
		"\3\2\2\2<\u01a8\3\2\2\2>\u01ba\3\2\2\2@\u01cc\3\2\2\2B\u01e4\3\2\2\2D"+
		"\u01e6\3\2\2\2F\u01e8\3\2\2\2H\u01f6\3\2\2\2J\u020e\3\2\2\2L\u0214\3\2"+
		"\2\2N\u0216\3\2\2\2P\u0224\3\2\2\2R\u022c\3\2\2\2T\u0246\3\2\2\2V\u0248"+
		"\3\2\2\2X\u024a\3\2\2\2Z\\\5\b\5\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^`\3\2\2\2_]\3\2\2\2`a\5\6\4\2ab\5\b\5\2bc\7\2\2\3c\3\3\2\2\2dm"+
		"\5\34\17\2em\5\36\20\2fm\5\66\34\2gm\5@!\2hm\5B\"\2im\5N(\2jm\5P)\2km"+
		"\5\n\6\2ld\3\2\2\2le\3\2\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2l"+
		"j\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\7(\2\2ou\3\2\2\2ps\5:\36\2qs\58\35\2r"+
		"p\3\2\2\2rq\3\2\2\2su\3\2\2\2tl\3\2\2\2tr\3\2\2\2u\5\3\2\2\2vw\7\34\2"+
		"\2wx\7#\2\2xy\7$\2\2y}\7%\2\2z|\5\4\3\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7&\2\2\u0081\7\3"+
		"\2\2\2\u0082\u0083\7\31\2\2\u0083\u0086\t\2\2\2\u0084\u0085\7!\2\2\u0085"+
		"\u0087\7\"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\7 \2\2\u0089\u0092\7#\2\2\u008a\u008f\5\16\b\2\u008b"+
		"\u008c\7\'\2\2\u008c\u008e\5\16\b\2\u008d\u008b\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\7$\2\2\u0095\u0099\7%\2\2\u0096\u0098\5\4\3\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\5\f\7\2\u009d\u009c\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7&\2\2\u00a0"+
		"\t\3\2\2\2\u00a1\u00a2\7 \2\2\u00a2\u00bb\7#\2\2\u00a3\u00ab\7\7\2\2\u00a4"+
		"\u00ab\7\b\2\2\u00a5\u00ab\7\6\2\2\u00a6\u00ab\7\5\2\2\u00a7\u00ab\5R"+
		"*\2\u00a8\u00ab\5D#\2\u00a9\u00ab\7 \2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a4"+
		"\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00b8\3\2\2\2\u00ac\u00b4\7\'"+
		"\2\2\u00ad\u00b5\7\7\2\2\u00ae\u00b5\7\b\2\2\u00af\u00b5\7\6\2\2\u00b0"+
		"\u00b5\7\5\2\2\u00b1\u00b5\5R*\2\u00b2\u00b5\5D#\2\u00b3\u00b5\7 \2\2"+
		"\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0"+
		"\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00aa\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7$"+
		"\2\2\u00be\13\3\2\2\2\u00bf\u00c5\7\35\2\2\u00c0\u00c4\5R*\2\u00c1\u00c4"+
		"\5D#\2\u00c2\u00c4\7 \2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\r\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cf\5\20\t\2\u00c9\u00cf"+
		"\5\22\n\2\u00ca\u00cf\5\26\f\2\u00cb\u00cf\5\30\r\2\u00cc\u00cf\5\32\16"+
		"\2\u00cd\u00cf\5\24\13\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00cf\17\3\2\2\2\u00d0\u00d1\7\23\2\2\u00d1\u00d2\7 \2\2\u00d2\21"+
		"\3\2\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5\7 \2\2\u00d5\23\3\2\2\2\u00d6"+
		"\u00d7\7\24\2\2\u00d7\u00d8\7 \2\2\u00d8\25\3\2\2\2\u00d9\u00da\7\26\2"+
		"\2\u00da\u00db\7 \2\2\u00db\27\3\2\2\2\u00dc\u00dd\7\25\2\2\u00dd\u00de"+
		"\7 \2\2\u00de\31\3\2\2\2\u00df\u00e0\t\3\2\2\u00e0\u00e1\7!\2\2\u00e1"+
		"\u00e2\7\"\2\2\u00e2\u00e3\7 \2\2\u00e3\33\3\2\2\2\u00e4\u00e7\5 \21\2"+
		"\u00e5\u00e7\5\"\22\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\35"+
		"\3\2\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5\34\17\2\u00ea\37\3\2\2\2\u00eb"+
		"\u00f1\5(\25\2\u00ec\u00f1\5.\30\2\u00ed\u00f1\5\62\32\2\u00ee\u00f1\5"+
		"$\23\2\u00ef\u00f1\5*\26\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1!\3\2\2\2"+
		"\u00f2\u00f7\5,\27\2\u00f3\u00f7\5\60\31\2\u00f4\u00f7\5\64\33\2\u00f5"+
		"\u00f7\5&\24\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7#\3\2\2\2\u00f8\u00f9\7\27\2\2\u00f9\u00fa"+
		"\7 \2\2\u00fa\u00fb\7\63\2\2\u00fb\u0101\5R*\2\u00fc\u00fd\5X-\2\u00fd"+
		"\u00fe\5R*\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102%\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0105\7\27\2\2\u0105\u0106\7!\2\2\u0106\u0107\7\"\2\2\u0107"+
		"\u0114\7 \2\2\u0108\u0109\7\63\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7\27"+
		"\2\2\u010b\u0111\5R*\2\u010c\u010d\5X-\2\u010d\u010e\5R*\2\u010e\u0110"+
		"\3\2\2\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0108\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\'\3\2\2\2\u0116\u0117\7\23\2\2\u0117\u011d"+
		"\7 \2\2\u0118\u011b\7\63\2\2\u0119\u011c\7\7\2\2\u011a\u011c\5D#\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0118\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e)\3\2\2\2\u011f\u0120\7\26\2\2\u0120\u0123"+
		"\7 \2\2\u0121\u0122\7\63\2\2\u0122\u0124\t\4\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124+\3\2\2\2\u0125\u0126\7\23\2\2\u0126\u0127\7!\2\2"+
		"\u0127\u0128\7\"\2\2\u0128\u0136\7 \2\2\u0129\u012a\7\63\2\2\u012a\u012b"+
		"\7\4\2\2\u012b\u012c\7\23\2\2\u012c\u012d\7!\2\2\u012d\u0132\7\7\2\2\u012e"+
		"\u012f\7\'\2\2\u012f\u0131\7\7\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0137\7\"\2\2\u0136\u0129\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137-\3\2\2\2\u0138\u0139\7\24\2\2\u0139\u013f\7 \2\2\u013a\u013d"+
		"\7\63\2\2\u013b\u013e\7\b\2\2\u013c\u013e\5D#\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140/\3\2\2\2\u0141\u0142\7\24\2\2\u0142\u0143\7!\2\2\u0143\u0144"+
		"\7\"\2\2\u0144\u0152\7 \2\2\u0145\u0146\7\63\2\2\u0146\u0147\7\4\2\2\u0147"+
		"\u0148\7\24\2\2\u0148\u0149\7!\2\2\u0149\u014e\7\b\2\2\u014a\u014b\7\'"+
		"\2\2\u014b\u014d\7\b\2\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0153\7\"\2\2\u0152\u0145\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\61\3\2\2\2\u0154\u0155\7\25\2\2\u0155\u0158\7 \2\2\u0156\u0157\7\63\2"+
		"\2\u0157\u0159\7\5\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\63"+
		"\3\2\2\2\u015a\u015b\7\26\2\2\u015b\u0160\7 \2\2\u015c\u015d\7\63\2\2"+
		"\u015d\u015e\7\4\2\2\u015e\u015f\7\25\2\2\u015f\u0161\7\6\2\2\u0160\u015c"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\65\3\2\2\2\u0162\u0163\7 \2\2\u0163"+
		"\u0167\7\63\2\2\u0164\u0168\5D#\2\u0165\u0168\7\5\2\2\u0166\u0168\7\6"+
		"\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\67\3\2\2\2\u0169\u016a\7\t\2\2\u016a\u016b\7#\2\2\u016b\u0171\5R*\2\u016c"+
		"\u016d\5X-\2\u016d\u016e\5R*\2\u016e\u0170\3\2\2\2\u016f\u016c\3\2\2\2"+
		"\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7$\2\2\u0175\u0176\7\f\2\2\u0176"+
		"\u017a\7%\2\2\u0177\u0179\5\4\3\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u0196\7&\2\2\u017e\u017f\7\13\2\2\u017f\u0180\7#"+
		"\2\2\u0180\u0186\5R*\2\u0181\u0182\5X-\2\u0182\u0183\5R*\2\u0183\u0185"+
		"\3\2\2\2\u0184\u0181\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7$"+
		"\2\2\u018a\u018b\7\f\2\2\u018b\u018f\7%\2\2\u018c\u018e\5\4\3\2\u018d"+
		"\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7&\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u017e\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u01a2\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019a\7\n\2\2\u019a\u019e\7%\2\2\u019b\u019d\5\4\3\2\u019c\u019b\3\2"+
		"\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\7&\2\2\u01a2\u0199\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a39\3\2\2\2\u01a4\u01a7\5<\37\2\u01a5\u01a7"+
		"\5> \2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7;\3\2\2\2\u01a8\u01ac"+
		"\7\r\2\2\u01a9\u01ad\7 \2\2\u01aa\u01ad\5(\25\2\u01ab\u01ad\5\66\34\2"+
		"\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\t\5\2\2\u01af\u01b0\7\22\2\2\u01b0\u01b1\t\6\2\2"+
		"\u01b1\u01b5\7%\2\2\u01b2\u01b4\5\4\3\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\7&\2\2\u01b9=\3\2\2\2\u01ba\u01be\7\16\2\2"+
		"\u01bb\u01bf\7 \2\2\u01bc\u01bf\5(\25\2\u01bd\u01bf\5\66\34\2\u01be\u01bb"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\t\5\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c3\t\6\2\2\u01c3\u01c7\7"+
		"%\2\2\u01c4\u01c6\5\4\3\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01cb\7&\2\2\u01cb?\3\2\2\2\u01cc\u01cd\7\17\2\2\u01cd\u01d1"+
		"\7%\2\2\u01ce\u01d0\5\4\3\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d4\u01d5\7&\2\2\u01d5\u01d9\7\16\2\2\u01d6\u01da\7 \2\2\u01d7"+
		"\u01da\5(\25\2\u01d8\u01da\5\66\34\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3"+
		"\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\t\5\2\2\u01dc"+
		"\u01dd\7\22\2\2\u01dd\u01de\t\6\2\2\u01deA\3\2\2\2\u01df\u01e0\7 \2\2"+
		"\u01e0\u01e1\7\63\2\2\u01e1\u01e5\5D#\2\u01e2\u01e3\7 \2\2\u01e3\u01e5"+
		"\5L\'\2\u01e4\u01df\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5C\3\2\2\2\u01e6\u01e7"+
		"\5F$\2\u01e7E\3\2\2\2\u01e8\u01e9\b$\1\2\u01e9\u01ea\5H%\2\u01ea\u01f3"+
		"\3\2\2\2\u01eb\u01ec\f\5\2\2\u01ec\u01ed\7.\2\2\u01ed\u01f2\5H%\2\u01ee"+
		"\u01ef\f\4\2\2\u01ef\u01f0\7/\2\2\u01f0\u01f2\5H%\2\u01f1\u01eb\3\2\2"+
		"\2\u01f1\u01ee\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4G\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\b%\1\2\u01f7\u01f8"+
		"\5J&\2\u01f8\u0204\3\2\2\2\u01f9\u01fa\f\6\2\2\u01fa\u01fb\7\60\2\2\u01fb"+
		"\u0203\5J&\2\u01fc\u01fd\f\5\2\2\u01fd\u01fe\7\61\2\2\u01fe\u0203\5J&"+
		"\2\u01ff\u0200\f\4\2\2\u0200\u0201\7\62\2\2\u0201\u0203\5J&\2\u0202\u01f9"+
		"\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u01ff\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205I\3\2\2\2\u0206\u0204\3\2\2\2"+
		"\u0207\u020f\7 \2\2\u0208\u020f\7\7\2\2\u0209\u020f\7\b\2\2\u020a\u020b"+
		"\7#\2\2\u020b\u020c\5D#\2\u020c\u020d\7$\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u0207\3\2\2\2\u020e\u0208\3\2\2\2\u020e\u0209\3\2\2\2\u020e\u020a\3\2"+
		"\2\2\u020fK\3\2\2\2\u0210\u0215\7,\2\2\u0211\u0215\7-\2\2\u0212\u0213"+
		"\t\7\2\2\u0213\u0215\7\7\2\2\u0214\u0210\3\2\2\2\u0214\u0211\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215M\3\2\2\2\u0216\u0217\7\32\2\2\u0217\u0219\7#\2\2"+
		"\u0218\u021a\t\4\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021f"+
		"\3\2\2\2\u021b\u021c\7.\2\2\u021c\u021e\t\4\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2"+
		"\2\2\u0221\u021f\3\2\2\2\u0222\u0223\7$\2\2\u0223O\3\2\2\2\u0224\u0225"+
		"\7\33\2\2\u0225\u0226\7#\2\2\u0226\u0227\7\6\2\2\u0227\u0228\7\'\2\2\u0228"+
		"\u0229\7 \2\2\u0229\u022a\7$\2\2\u022aQ\3\2\2\2\u022b\u022d\7@\2\2\u022c"+
		"\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\5T"+
		"+\2\u022f\u0230\5V,\2\u0230\u0231\5T+\2\u0231\u0233\3\2\2\2\u0232\u022f"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0239\3\2\2\2\u0234\u0235\5X-\2\u0235"+
		"\u0236\5R*\2\u0236\u0238\3\2\2\2\u0237\u0234\3\2\2\2\u0238\u023b\3\2\2"+
		"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023aS\3\2\2\2\u023b\u0239"+
		"\3\2\2\2\u023c\u0247\7\7\2\2\u023d\u0247\7 \2\2\u023e\u0247\7\6\2\2\u023f"+
		"\u0247\7\5\2\2\u0240\u0247\7\36\2\2\u0241\u0247\7\37\2\2\u0242\u0243\7"+
		"#\2\2\u0243\u0244\5R*\2\u0244\u0245\7$\2\2\u0245\u0247\3\2\2\2\u0246\u023c"+
		"\3\2\2\2\u0246\u023d\3\2\2\2\u0246\u023e\3\2\2\2\u0246\u023f\3\2\2\2\u0246"+
		"\u0240\3\2\2\2\u0246\u0241\3\2\2\2\u0246\u0242\3\2\2\2\u0247U\3\2\2\2"+
		"\u0248\u0249\t\b\2\2\u0249W\3\2\2\2\u024a\u024b\t\t\2\2\u024bY\3\2\2\2"+
		"@]lrt}\u0086\u008f\u0092\u0099\u009d\u00aa\u00b4\u00b8\u00bb\u00c3\u00c5"+
		"\u00ce\u00e6\u00f0\u00f6\u0101\u0111\u0114\u011b\u011d\u0123\u0132\u0136"+
		"\u013d\u013f\u014e\u0152\u0158\u0160\u0167\u0171\u017a\u0186\u018f\u0196"+
		"\u019e\u01a2\u01a6\u01ac\u01b5\u01be\u01c7\u01d1\u01d9\u01e4\u01f1\u01f3"+
		"\u0202\u0204\u020e\u0214\u0219\u021f\u022c\u0232\u0239\u0246";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}