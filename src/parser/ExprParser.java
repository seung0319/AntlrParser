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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(95);
				function();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
			setState(119);
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
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(103);
					declaration();
					}
					break;
				case 2:
					{
					setState(104);
					constantdeclaration();
					}
					break;
				case 3:
					{
					setState(105);
					assignment();
					}
					break;
				case 4:
					{
					setState(106);
					loopdowhile();
					}
					break;
				case 5:
					{
					setState(107);
					operation();
					}
					break;
				case 6:
					{
					setState(108);
					print();
					}
					break;
				case 7:
					{
					setState(109);
					scan();
					}
					break;
				case 8:
					{
					setState(110);
					call();
					}
					break;
				}
				setState(113);
				match(SEMICOLON);
				}
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case WHILE:
					{
					setState(115);
					loop();
					}
					break;
				case IF:
					{
					setState(116);
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
			setState(121);
			match(MAIN);
			setState(122);
			match(LEFT_PAREN);
			setState(123);
			match(RIGHT_PAREN);
			setState(124);
			match(LEFT_BRACE);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(125);
				block_content();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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
			setState(133);
			match(FUNCTION);
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(135);
				match(LEFT_BRACKET);
				setState(136);
				match(RIGHT_BRACKET);
				}
			}

			setState(139);
			match(ID);
			setState(140);
			match(LEFT_PAREN);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(141);
				parameter();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(142);
					match(COMMA);
					setState(143);
					parameter();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(151);
			match(RIGHT_PAREN);
			setState(152);
			match(LEFT_BRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(153);
				block_content();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(159);
				returnstatement();
				}
			}

			setState(162);
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
			setState(164);
			match(ID);
			setState(165);
			match(LEFT_PAREN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_VALUE) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LEFT_PAREN) | (1L << NOT))) != 0)) {
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(166);
					match(INT_VALUE);
					}
					break;
				case 2:
					{
					setState(167);
					match(FLOAT_VALUE);
					}
					break;
				case 3:
					{
					setState(168);
					match(STRING_VALUE);
					}
					break;
				case 4:
					{
					setState(169);
					match(CHAR_VALUE);
					}
					break;
				case 5:
					{
					setState(170);
					booleanexp();
					}
					break;
				case 6:
					{
					setState(171);
					opr();
					}
					break;
				case 7:
					{
					setState(172);
					match(ID);
					}
					break;
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(175);
					match(COMMA);
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(176);
						match(INT_VALUE);
						}
						break;
					case 2:
						{
						setState(177);
						match(FLOAT_VALUE);
						}
						break;
					case 3:
						{
						setState(178);
						match(STRING_VALUE);
						}
						break;
					case 4:
						{
						setState(179);
						match(CHAR_VALUE);
						}
						break;
					case 5:
						{
						setState(180);
						booleanexp();
						}
						break;
					case 6:
						{
						setState(181);
						opr();
						}
						break;
					case 7:
						{
						setState(182);
						match(ID);
						}
						break;
					}
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(192);
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
			setState(194);
			match(RETURN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_VALUE) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LEFT_PAREN) | (1L << NOT))) != 0)) {
				{
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(195);
					booleanexp();
					}
					break;
				case 2:
					{
					setState(196);
					opr();
					}
					break;
				case 3:
					{
					setState(197);
					match(ID);
					}
					break;
				}
				}
				setState(202);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				intparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				booleanparameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				stringparameter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				charparameter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				arrayparameter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
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
			setState(211);
			match(INT_TYPE);
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
			setState(214);
			match(BOOLEAN_TYPE);
			setState(215);
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
			setState(217);
			match(FLOAT_TYPE);
			setState(218);
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
			setState(220);
			match(STRING_TYPE);
			setState(221);
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
			setState(223);
			match(CHAR_TYPE);
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
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			match(LEFT_BRACKET);
			setState(228);
			match(RIGHT_BRACKET);
			setState(229);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				singledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
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
			setState(235);
			match(T__0);
			setState(236);
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
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				intdeclaration();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				floatdeclaration();
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				chardeclaration();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				booleandeclaration();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				intarrdeclaration();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				floatarrdeclaration();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				chararrdeclaration();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
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
			setState(251);
			match(BOOLEAN_TYPE);
			setState(252);
			match(ID);
			{
			setState(253);
			match(EQUALS);
			setState(254);
			booleanexp();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(255);
				logic();
				setState(256);
				booleanexp();
				}
				}
				setState(262);
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
			setState(263);
			match(BOOLEAN_TYPE);
			setState(264);
			match(LEFT_BRACKET);
			setState(265);
			match(RIGHT_BRACKET);
			setState(266);
			match(ID);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(267);
				match(EQUALS);
				setState(268);
				match(T__1);
				setState(269);
				match(BOOLEAN_TYPE);
				setState(270);
				booleanexp();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(271);
					logic();
					setState(272);
					booleanexp();
					}
					}
					setState(278);
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
			setState(281);
			match(INT_TYPE);
			setState(282);
			match(ID);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(283);
				match(EQUALS);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(284);
					match(INT_VALUE);
					}
					break;
				case 2:
					{
					setState(285);
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
			setState(290);
			match(STRING_TYPE);
			setState(291);
			match(ID);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(292);
				match(EQUALS);
				setState(293);
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
			setState(296);
			match(INT_TYPE);
			setState(297);
			match(LEFT_BRACKET);
			setState(298);
			match(RIGHT_BRACKET);
			setState(299);
			match(ID);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(300);
				match(EQUALS);
				setState(301);
				match(T__1);
				setState(302);
				match(INT_TYPE);
				setState(303);
				match(LEFT_BRACKET);
				setState(304);
				match(INT_VALUE);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(305);
					match(COMMA);
					setState(306);
					match(INT_VALUE);
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
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
			setState(315);
			match(FLOAT_TYPE);
			setState(316);
			match(ID);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(317);
				match(EQUALS);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(318);
					match(FLOAT_VALUE);
					}
					break;
				case 2:
					{
					setState(319);
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
			setState(324);
			match(FLOAT_TYPE);
			setState(325);
			match(LEFT_BRACKET);
			setState(326);
			match(RIGHT_BRACKET);
			setState(327);
			match(ID);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(328);
				match(EQUALS);
				setState(329);
				match(T__1);
				setState(330);
				match(FLOAT_TYPE);
				setState(331);
				match(LEFT_BRACKET);
				setState(332);
				match(FLOAT_VALUE);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					match(FLOAT_VALUE);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
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
			setState(343);
			match(CHAR_TYPE);
			setState(344);
			match(ID);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(345);
				match(EQUALS);
				setState(346);
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
			setState(349);
			match(STRING_TYPE);
			setState(350);
			match(ID);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(351);
				match(EQUALS);
				setState(352);
				match(T__1);
				setState(353);
				match(CHAR_TYPE);
				setState(354);
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
			setState(357);
			match(ID);
			setState(358);
			match(EQUALS);
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
			case FLOAT_VALUE:
			case ID:
			case LEFT_PAREN:
				{
				setState(359);
				opr();
				}
				break;
			case CHAR_VALUE:
				{
				setState(360);
				match(CHAR_VALUE);
				}
				break;
			case STRING_VALUE:
				{
				setState(361);
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
			setState(364);
			match(IF);
			setState(365);
			match(LEFT_PAREN);
			setState(366);
			booleanexp();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(367);
				logic();
				setState(368);
				booleanexp();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(RIGHT_PAREN);
			setState(376);
			match(THEN);
			setState(377);
			match(LEFT_BRACE);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(378);
				block_content();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(RIGHT_BRACE);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(385);
				match(ELSEIF);
				setState(386);
				match(LEFT_PAREN);
				setState(387);
				booleanexp();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(388);
					logic();
					setState(389);
					booleanexp();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				match(RIGHT_PAREN);
				setState(397);
				match(THEN);
				setState(398);
				match(LEFT_BRACE);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
					{
					{
					setState(399);
					block_content();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(RIGHT_BRACE);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(412);
				match(ELSE);
				setState(413);
				match(LEFT_BRACE);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
					{
					{
					setState(414);
					block_content();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(420);
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
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				loopfor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
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
			setState(427);
			match(FOR);
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(428);
				match(ID);
				}
				break;
			case 2:
				{
				setState(429);
				intdeclaration();
				}
				break;
			case 3:
				{
				setState(430);
				assignment();
				}
				break;
			}
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(434);
			match(TO);
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(436);
			match(LEFT_BRACE);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(437);
				block_content();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
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
			setState(445);
			match(WHILE);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(446);
				match(ID);
				}
				break;
			case 2:
				{
				setState(447);
				intdeclaration();
				}
				break;
			case 3:
				{
				setState(448);
				assignment();
				}
				break;
			}
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(452);
			match(TO);
			setState(453);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(454);
			match(LEFT_BRACE);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(455);
				block_content();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
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
			setState(463);
			match(DO);
			setState(464);
			match(LEFT_BRACE);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << PRINT) | (1L << SCAN) | (1L << ID))) != 0)) {
				{
				{
				setState(465);
				block_content();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(RIGHT_BRACE);
			setState(472);
			match(WHILE);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(473);
				match(ID);
				}
				break;
			case 2:
				{
				setState(474);
				intdeclaration();
				}
				break;
			case 3:
				{
				setState(475);
				assignment();
				}
				break;
			}
			setState(478);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(479);
			match(TO);
			setState(480);
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(ID);
				setState(483);
				match(EQUALS);
				setState(484);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(ID);
				setState(486);
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
			setState(489);
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
			setState(492);
			multopr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(500);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(494);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(495);
						match(PLUS);
						setState(496);
						multopr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(497);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(498);
						match(MINUS);
						setState(499);
						multopr(0);
						}
						break;
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
			setState(506);
			terminalopr();
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(517);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(508);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(509);
						match(MUL);
						setState(510);
						terminalopr();
						}
						break;
					case 2:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(511);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(512);
						match(DIV);
						setState(513);
						terminalopr();
						}
						break;
					case 3:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(514);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(515);
						match(MOD);
						setState(516);
						terminalopr();
						}
						break;
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(ID);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(INT_VALUE);
				}
				break;
			case FLOAT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(FLOAT_VALUE);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				match(LEFT_PAREN);
				setState(526);
				opr();
				setState(527);
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
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(PLUS_PLUS);
				}
				break;
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(MINUS_MINUS);
				}
				break;
			case PLUS_EQUALS:
			case MIN_EQUALS:
			case MUL_EQUALS:
			case DIV_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUALS) | (1L << MIN_EQUALS) | (1L << MUL_EQUALS) | (1L << DIV_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(534);
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
			setState(537);
			match(PRINT);
			setState(538);
			match(LEFT_PAREN);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_VALUE || _la==ID) {
				{
				setState(539);
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

			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(542);
				match(PLUS);
				setState(543);
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
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
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
			setState(551);
			match(SCAN);
			setState(552);
			match(LEFT_PAREN);
			setState(553);
			match(STRING_VALUE);
			setState(554);
			match(COMMA);
			setState(555);
			match(ID);
			setState(556);
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
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(558);
				match(NOT);
				}
			}

			setState(561);
			booleanvalue();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS_EQUALS) | (1L << NOT_EQUALS))) != 0)) {
				{
				setState(562);
				relation();
				setState(563);
				booleanvalue();
				}
			}

			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(567);
					logic();
					setState(568);
					booleanexp();
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(INT_VALUE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(ID);
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(STRING_VALUE);
				}
				break;
			case CHAR_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(CHAR_VALUE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(579);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				match(FALSE);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(581);
				match(LEFT_PAREN);
				setState(582);
				booleanexp();
				setState(583);
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
			setState(587);
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
			setState(589);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0252\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\3\3\3\3\3\3\3\5"+
		"\3x\n\3\5\3z\n\3\3\4\3\4\3\4\3\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u008c\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0093\n"+
		"\5\f\5\16\5\u0096\13\5\5\5\u0098\n\5\3\5\3\5\3\5\7\5\u009d\n\5\f\5\16"+
		"\5\u00a0\13\5\3\5\5\5\u00a3\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00b0\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ba\n\6\7\6"+
		"\u00bc\n\6\f\6\16\6\u00bf\13\6\5\6\u00c1\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7\u00c9\n\7\f\7\16\7\u00cc\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d4\n\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\5\17\u00ec\n\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00f6\n\21\3\22\3\22\3\22\3\22\5\22\u00fc\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0105\n\23\f\23\16\23\u0108\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0115"+
		"\n\24\f\24\16\24\u0118\13\24\5\24\u011a\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0121\n\25\5\25\u0123\n\25\3\26\3\26\3\26\3\26\5\26\u0129\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0136\n\27"+
		"\f\27\16\27\u0139\13\27\3\27\5\27\u013c\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0143\n\30\5\30\u0145\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\7\31\u0152\n\31\f\31\16\31\u0155\13\31\3\31\5\31\u0158"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u015e\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0166\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u016d\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\7\35\u0175\n\35\f\35\16\35\u0178\13\35\3\35\3\35\3"+
		"\35\3\35\7\35\u017e\n\35\f\35\16\35\u0181\13\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\7\35\u018a\n\35\f\35\16\35\u018d\13\35\3\35\3\35\3\35\3"+
		"\35\7\35\u0193\n\35\f\35\16\35\u0196\13\35\3\35\3\35\7\35\u019a\n\35\f"+
		"\35\16\35\u019d\13\35\3\35\3\35\3\35\7\35\u01a2\n\35\f\35\16\35\u01a5"+
		"\13\35\3\35\5\35\u01a8\n\35\3\36\3\36\5\36\u01ac\n\36\3\37\3\37\3\37\3"+
		"\37\5\37\u01b2\n\37\3\37\3\37\3\37\3\37\3\37\7\37\u01b9\n\37\f\37\16\37"+
		"\u01bc\13\37\3\37\3\37\3 \3 \3 \3 \5 \u01c4\n \3 \3 \3 \3 \3 \7 \u01cb"+
		"\n \f \16 \u01ce\13 \3 \3 \3!\3!\3!\7!\u01d5\n!\f!\16!\u01d8\13!\3!\3"+
		"!\3!\3!\3!\5!\u01df\n!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u01ea\n\"\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u01f7\n$\f$\16$\u01fa\13$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0208\n%\f%\16%\u020b\13%\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u0214\n&\3\'\3\'\3\'\3\'\5\'\u021a\n\'\3(\3(\3(\5(\u021f\n"+
		"(\3(\3(\7(\u0223\n(\f(\16(\u0226\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\5*"+
		"\u0232\n*\3*\3*\3*\3*\5*\u0238\n*\3*\3*\3*\7*\u023d\n*\f*\16*\u0240\13"+
		"*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u024c\n+\3,\3,\3-\3-\3-\2\4FH.\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVX\2\n\4\2\23\26\30\30\4\2\23\25\27\27\4\2\6\6  \3\2\20\21\4\2\7\7 "+
		" \3\2\64\67\3\28=\3\2>?\2\u028b\2]\3\2\2\2\4y\3\2\2\2\6{\3\2\2\2\b\u0087"+
		"\3\2\2\2\n\u00a6\3\2\2\2\f\u00c4\3\2\2\2\16\u00d3\3\2\2\2\20\u00d5\3\2"+
		"\2\2\22\u00d8\3\2\2\2\24\u00db\3\2\2\2\26\u00de\3\2\2\2\30\u00e1\3\2\2"+
		"\2\32\u00e4\3\2\2\2\34\u00eb\3\2\2\2\36\u00ed\3\2\2\2 \u00f5\3\2\2\2\""+
		"\u00fb\3\2\2\2$\u00fd\3\2\2\2&\u0109\3\2\2\2(\u011b\3\2\2\2*\u0124\3\2"+
		"\2\2,\u012a\3\2\2\2.\u013d\3\2\2\2\60\u0146\3\2\2\2\62\u0159\3\2\2\2\64"+
		"\u015f\3\2\2\2\66\u0167\3\2\2\28\u016e\3\2\2\2:\u01ab\3\2\2\2<\u01ad\3"+
		"\2\2\2>\u01bf\3\2\2\2@\u01d1\3\2\2\2B\u01e9\3\2\2\2D\u01eb\3\2\2\2F\u01ed"+
		"\3\2\2\2H\u01fb\3\2\2\2J\u0213\3\2\2\2L\u0219\3\2\2\2N\u021b\3\2\2\2P"+
		"\u0229\3\2\2\2R\u0231\3\2\2\2T\u024b\3\2\2\2V\u024d\3\2\2\2X\u024f\3\2"+
		"\2\2Z\\\5\b\5\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3"+
		"\2\2\2`d\5\6\4\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3"+
		"\2\2\2fd\3\2\2\2gh\7\2\2\3h\3\3\2\2\2ir\5\34\17\2jr\5\36\20\2kr\5\66\34"+
		"\2lr\5@!\2mr\5B\"\2nr\5N(\2or\5P)\2pr\5\n\6\2qi\3\2\2\2qj\3\2\2\2qk\3"+
		"\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2rs\3\2\2\2st\7"+
		"(\2\2tz\3\2\2\2ux\5:\36\2vx\58\35\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2yq\3"+
		"\2\2\2yw\3\2\2\2z\5\3\2\2\2{|\7\34\2\2|}\7#\2\2}~\7$\2\2~\u0082\7%\2\2"+
		"\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7&\2\2\u0086\7\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u008b\t\2\2\2"+
		"\u0089\u008a\7!\2\2\u008a\u008c\7\"\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7 \2\2\u008e\u0097\7#\2\2\u008f"+
		"\u0094\5\16\b\2\u0090\u0091\7\'\2\2\u0091\u0093\5\16\b\2\u0092\u0090\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7$\2\2\u009a\u009e\7%\2\2\u009b\u009d"+
		"\5\4\3\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\f"+
		"\7\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\7&\2\2\u00a5\t\3\2\2\2\u00a6\u00a7\7 \2\2\u00a7\u00c0\7#\2\2\u00a8"+
		"\u00b0\7\7\2\2\u00a9\u00b0\7\b\2\2\u00aa\u00b0\7\6\2\2\u00ab\u00b0\7\5"+
		"\2\2\u00ac\u00b0\5R*\2\u00ad\u00b0\5D#\2\u00ae\u00b0\7 \2\2\u00af\u00a8"+
		"\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00bd\3\2"+
		"\2\2\u00b1\u00b9\7\'\2\2\u00b2\u00ba\7\7\2\2\u00b3\u00ba\7\b\2\2\u00b4"+
		"\u00ba\7\6\2\2\u00b5\u00ba\7\5\2\2\u00b6\u00ba\5R*\2\u00b7\u00ba\5D#\2"+
		"\u00b8\u00ba\7 \2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4"+
		"\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7$\2\2\u00c3\13\3\2\2\2\u00c4\u00ca\7\35\2\2\u00c5\u00c9"+
		"\5R*\2\u00c6\u00c9\5D#\2\u00c7\u00c9\7 \2\2\u00c8\u00c5\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\r\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d4"+
		"\5\20\t\2\u00ce\u00d4\5\22\n\2\u00cf\u00d4\5\26\f\2\u00d0\u00d4\5\30\r"+
		"\2\u00d1\u00d4\5\32\16\2\u00d2\u00d4\5\24\13\2\u00d3\u00cd\3\2\2\2\u00d3"+
		"\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\17\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7"+
		"\7 \2\2\u00d7\21\3\2\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00da\7 \2\2\u00da"+
		"\23\3\2\2\2\u00db\u00dc\7\24\2\2\u00dc\u00dd\7 \2\2\u00dd\25\3\2\2\2\u00de"+
		"\u00df\7\26\2\2\u00df\u00e0\7 \2\2\u00e0\27\3\2\2\2\u00e1\u00e2\7\25\2"+
		"\2\u00e2\u00e3\7 \2\2\u00e3\31\3\2\2\2\u00e4\u00e5\t\3\2\2\u00e5\u00e6"+
		"\7!\2\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\7 \2\2\u00e8\33\3\2\2\2\u00e9"+
		"\u00ec\5 \21\2\u00ea\u00ec\5\"\22\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3"+
		"\2\2\2\u00ec\35\3\2\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef\5\34\17\2\u00ef"+
		"\37\3\2\2\2\u00f0\u00f6\5(\25\2\u00f1\u00f6\5.\30\2\u00f2\u00f6\5\62\32"+
		"\2\u00f3\u00f6\5$\23\2\u00f4\u00f6\5*\26\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1"+
		"\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"!\3\2\2\2\u00f7\u00fc\5,\27\2\u00f8\u00fc\5\60\31\2\u00f9\u00fc\5\64\33"+
		"\2\u00fa\u00fc\5&\24\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc#\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe"+
		"\u00ff\7 \2\2\u00ff\u0100\7\63\2\2\u0100\u0106\5R*\2\u0101\u0102\5X-\2"+
		"\u0102\u0103\5R*\2\u0103\u0105\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107%\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\27\2\2\u010a\u010b\7!\2\2\u010b\u010c\7\""+
		"\2\2\u010c\u0119\7 \2\2\u010d\u010e\7\63\2\2\u010e\u010f\7\4\2\2\u010f"+
		"\u0110\7\27\2\2\u0110\u0116\5R*\2\u0111\u0112\5X-\2\u0112\u0113\5R*\2"+
		"\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u010d\3\2\2\2\u0119\u011a\3\2\2\2\u011a\'\3\2\2\2\u011b\u011c\7\23\2"+
		"\2\u011c\u0122\7 \2\2\u011d\u0120\7\63\2\2\u011e\u0121\7\7\2\2\u011f\u0121"+
		"\5D#\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u011d\3\2\2\2\u0122\u0123\3\2\2\2\u0123)\3\2\2\2\u0124\u0125\7\26\2\2"+
		"\u0125\u0128\7 \2\2\u0126\u0127\7\63\2\2\u0127\u0129\t\4\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129+\3\2\2\2\u012a\u012b\7\23\2\2\u012b"+
		"\u012c\7!\2\2\u012c\u012d\7\"\2\2\u012d\u013b\7 \2\2\u012e\u012f\7\63"+
		"\2\2\u012f\u0130\7\4\2\2\u0130\u0131\7\23\2\2\u0131\u0132\7!\2\2\u0132"+
		"\u0137\7\7\2\2\u0133\u0134\7\'\2\2\u0134\u0136\7\7\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\7\"\2\2\u013b\u012e\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c-\3\2\2\2\u013d\u013e\7\24\2\2\u013e\u0144"+
		"\7 \2\2\u013f\u0142\7\63\2\2\u0140\u0143\7\b\2\2\u0141\u0143\5D#\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u013f\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145/\3\2\2\2\u0146\u0147\7\24\2\2\u0147\u0148"+
		"\7!\2\2\u0148\u0149\7\"\2\2\u0149\u0157\7 \2\2\u014a\u014b\7\63\2\2\u014b"+
		"\u014c\7\4\2\2\u014c\u014d\7\24\2\2\u014d\u014e\7!\2\2\u014e\u0153\7\b"+
		"\2\2\u014f\u0150\7\'\2\2\u0150\u0152\7\b\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u0158\7\"\2\2\u0157\u014a\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\61\3\2\2\2\u0159\u015a\7\25\2\2\u015a\u015d\7 \2"+
		"\2\u015b\u015c\7\63\2\2\u015c\u015e\7\5\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\63\3\2\2\2\u015f\u0160\7\26\2\2\u0160\u0165\7 \2"+
		"\2\u0161\u0162\7\63\2\2\u0162\u0163\7\4\2\2\u0163\u0164\7\25\2\2\u0164"+
		"\u0166\7\6\2\2\u0165\u0161\3\2\2\2\u0165\u0166\3\2\2\2\u0166\65\3\2\2"+
		"\2\u0167\u0168\7 \2\2\u0168\u016c\7\63\2\2\u0169\u016d\5D#\2\u016a\u016d"+
		"\7\5\2\2\u016b\u016d\7\6\2\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016b\3\2\2\2\u016d\67\3\2\2\2\u016e\u016f\7\t\2\2\u016f\u0170\7#\2\2"+
		"\u0170\u0176\5R*\2\u0171\u0172\5X-\2\u0172\u0173\5R*\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0171\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7$"+
		"\2\2\u017a\u017b\7\f\2\2\u017b\u017f\7%\2\2\u017c\u017e\5\4\3\2\u017d"+
		"\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u019b\7&\2\2\u0183"+
		"\u0184\7\13\2\2\u0184\u0185\7#\2\2\u0185\u018b\5R*\2\u0186\u0187\5X-\2"+
		"\u0187\u0188\5R*\2\u0188\u018a\3\2\2\2\u0189\u0186\3\2\2\2\u018a\u018d"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u018f\7$\2\2\u018f\u0190\7\f\2\2\u0190\u0194\7%\2"+
		"\2\u0191\u0193\5\4\3\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0198\7&\2\2\u0198\u019a\3\2\2\2\u0199\u0183\3\2\2\2\u019a\u019d\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a7\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u019f\7\n\2\2\u019f\u01a3\7%\2\2\u01a0\u01a2\5\4"+
		"\3\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\7&"+
		"\2\2\u01a7\u019e\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a89\3\2\2\2\u01a9\u01ac"+
		"\5<\37\2\u01aa\u01ac\5> \2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac"+
		";\3\2\2\2\u01ad\u01b1\7\r\2\2\u01ae\u01b2\7 \2\2\u01af\u01b2\5(\25\2\u01b0"+
		"\u01b2\5\66\34\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3"+
		"\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\t\5\2\2\u01b4\u01b5\7\22\2\2\u01b5"+
		"\u01b6\t\6\2\2\u01b6\u01ba\7%\2\2\u01b7\u01b9\5\4\3\2\u01b8\u01b7\3\2"+
		"\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7&\2\2\u01be=\3\2\2\2\u01bf"+
		"\u01c3\7\16\2\2\u01c0\u01c4\7 \2\2\u01c1\u01c4\5(\25\2\u01c2\u01c4\5\66"+
		"\34\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\t\5\2\2\u01c6\u01c7\7\22\2\2\u01c7\u01c8\t"+
		"\6\2\2\u01c8\u01cc\7%\2\2\u01c9\u01cb\5\4\3\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7&\2\2\u01d0?\3\2\2\2\u01d1\u01d2"+
		"\7\17\2\2\u01d2\u01d6\7%\2\2\u01d3\u01d5\5\4\3\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7&\2\2\u01da\u01de\7\16\2\2\u01db"+
		"\u01df\7 \2\2\u01dc\u01df\5(\25\2\u01dd\u01df\5\66\34\2\u01de\u01db\3"+
		"\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\t\5\2\2\u01e1\u01e2\7\22\2\2\u01e2\u01e3\t\6\2\2\u01e3A\3\2\2\2"+
		"\u01e4\u01e5\7 \2\2\u01e5\u01e6\7\63\2\2\u01e6\u01ea\5D#\2\u01e7\u01e8"+
		"\7 \2\2\u01e8\u01ea\5L\'\2\u01e9\u01e4\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"C\3\2\2\2\u01eb\u01ec\5F$\2\u01ecE\3\2\2\2\u01ed\u01ee\b$\1\2\u01ee\u01ef"+
		"\5H%\2\u01ef\u01f8\3\2\2\2\u01f0\u01f1\f\5\2\2\u01f1\u01f2\7.\2\2\u01f2"+
		"\u01f7\5H%\2\u01f3\u01f4\f\4\2\2\u01f4\u01f5\7/\2\2\u01f5\u01f7\5H%\2"+
		"\u01f6\u01f0\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9G\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fc\b%\1\2\u01fc\u01fd\5J&\2\u01fd\u0209\3\2\2\2\u01fe\u01ff\f\6\2"+
		"\2\u01ff\u0200\7\60\2\2\u0200\u0208\5J&\2\u0201\u0202\f\5\2\2\u0202\u0203"+
		"\7\61\2\2\u0203\u0208\5J&\2\u0204\u0205\f\4\2\2\u0205\u0206\7\62\2\2\u0206"+
		"\u0208\5J&\2\u0207\u01fe\3\2\2\2\u0207\u0201\3\2\2\2\u0207\u0204\3\2\2"+
		"\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020aI"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0214\7 \2\2\u020d\u0214\7\7\2\2\u020e"+
		"\u0214\7\b\2\2\u020f\u0210\7#\2\2\u0210\u0211\5D#\2\u0211\u0212\7$\2\2"+
		"\u0212\u0214\3\2\2\2\u0213\u020c\3\2\2\2\u0213\u020d\3\2\2\2\u0213\u020e"+
		"\3\2\2\2\u0213\u020f\3\2\2\2\u0214K\3\2\2\2\u0215\u021a\7,\2\2\u0216\u021a"+
		"\7-\2\2\u0217\u0218\t\7\2\2\u0218\u021a\7\7\2\2\u0219\u0215\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u0219\u0217\3\2\2\2\u021aM\3\2\2\2\u021b\u021c\7\32\2\2"+
		"\u021c\u021e\7#\2\2\u021d\u021f\t\4\2\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0224\3\2\2\2\u0220\u0221\7.\2\2\u0221\u0223\t\4\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7$\2\2\u0228"+
		"O\3\2\2\2\u0229\u022a\7\33\2\2\u022a\u022b\7#\2\2\u022b\u022c\7\6\2\2"+
		"\u022c\u022d\7\'\2\2\u022d\u022e\7 \2\2\u022e\u022f\7$\2\2\u022fQ\3\2"+
		"\2\2\u0230\u0232\7@\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0237\5T+\2\u0234\u0235\5V,\2\u0235\u0236\5T+\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0234\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023e\3\2"+
		"\2\2\u0239\u023a\5X-\2\u023a\u023b\5R*\2\u023b\u023d\3\2\2\2\u023c\u0239"+
		"\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"S\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u024c\7\7\2\2\u0242\u024c\7 \2\2\u0243"+
		"\u024c\7\6\2\2\u0244\u024c\7\5\2\2\u0245\u024c\7\36\2\2\u0246\u024c\7"+
		"\37\2\2\u0247\u0248\7#\2\2\u0248\u0249\5R*\2\u0249\u024a\7$\2\2\u024a"+
		"\u024c\3\2\2\2\u024b\u0241\3\2\2\2\u024b\u0242\3\2\2\2\u024b\u0243\3\2"+
		"\2\2\u024b\u0244\3\2\2\2\u024b\u0245\3\2\2\2\u024b\u0246\3\2\2\2\u024b"+
		"\u0247\3\2\2\2\u024cU\3\2\2\2\u024d\u024e\t\b\2\2\u024eW\3\2\2\2\u024f"+
		"\u0250\t\t\2\2\u0250Y\3\2\2\2A]dqwy\u0082\u008b\u0094\u0097\u009e\u00a2"+
		"\u00af\u00b9\u00bd\u00c0\u00c8\u00ca\u00d3\u00eb\u00f5\u00fb\u0106\u0116"+
		"\u0119\u0120\u0122\u0128\u0137\u013b\u0142\u0144\u0153\u0157\u015d\u0165"+
		"\u016c\u0176\u017f\u018b\u0194\u019b\u01a3\u01a7\u01ab\u01b1\u01ba\u01c3"+
		"\u01cc\u01d6\u01de\u01e9\u01f6\u01f8\u0207\u0209\u0213\u0219\u021e\u0224"+
		"\u0231\u0237\u023e\u024b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}