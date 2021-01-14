// Generated from Expr.g4 by ANTLR 4.4
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(@NotNull ExprParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(@NotNull ExprParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#addopr}.
	 * @param ctx the parse tree
	 */
	void enterAddopr(@NotNull ExprParser.AddoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#addopr}.
	 * @param ctx the parse tree
	 */
	void exitAddopr(@NotNull ExprParser.AddoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(@NotNull ExprParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(@NotNull ExprParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatarrdeclaration(@NotNull ExprParser.FloatarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatarrdeclaration(@NotNull ExprParser.FloatarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull ExprParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull ExprParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatdeclaration(@NotNull ExprParser.FloatdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatdeclaration(@NotNull ExprParser.FloatdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlock_content(@NotNull ExprParser.Block_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlock_content(@NotNull ExprParser.Block_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull ExprParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull ExprParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatparameter}.
	 * @param ctx the parse tree
	 */
	void enterFloatparameter(@NotNull ExprParser.FloatparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatparameter}.
	 * @param ctx the parse tree
	 */
	void exitFloatparameter(@NotNull ExprParser.FloatparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void enterTerminalopr(@NotNull ExprParser.TerminaloprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void exitTerminalopr(@NotNull ExprParser.TerminaloprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ExprParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ExprParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull ExprParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull ExprParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull ExprParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull ExprParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantdeclaration(@NotNull ExprParser.ConstantdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantdeclaration(@NotNull ExprParser.ConstantdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multopr}.
	 * @param ctx the parse tree
	 */
	void enterMultopr(@NotNull ExprParser.MultoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multopr}.
	 * @param ctx the parse tree
	 */
	void exitMultopr(@NotNull ExprParser.MultoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(@NotNull ExprParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(@NotNull ExprParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(@NotNull ExprParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(@NotNull ExprParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#charparameter}.
	 * @param ctx the parse tree
	 */
	void enterCharparameter(@NotNull ExprParser.CharparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#charparameter}.
	 * @param ctx the parse tree
	 */
	void exitCharparameter(@NotNull ExprParser.CharparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void enterShortopr(@NotNull ExprParser.ShortoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void exitShortopr(@NotNull ExprParser.ShortoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingledeclaration(@NotNull ExprParser.SingledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingledeclaration(@NotNull ExprParser.SingledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChardeclaration(@NotNull ExprParser.ChardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChardeclaration(@NotNull ExprParser.ChardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arrayparameter}.
	 * @param ctx the parse tree
	 */
	void enterArrayparameter(@NotNull ExprParser.ArrayparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arrayparameter}.
	 * @param ctx the parse tree
	 */
	void exitArrayparameter(@NotNull ExprParser.ArrayparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stringparameter}.
	 * @param ctx the parse tree
	 */
	void enterStringparameter(@NotNull ExprParser.StringparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stringparameter}.
	 * @param ctx the parse tree
	 */
	void exitStringparameter(@NotNull ExprParser.StringparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanarrdeclaration(@NotNull ExprParser.BooleanarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanarrdeclaration(@NotNull ExprParser.BooleanarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull ExprParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull ExprParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleandeclaration(@NotNull ExprParser.BooleandeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleandeclaration(@NotNull ExprParser.BooleandeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(@NotNull ExprParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(@NotNull ExprParser.OprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntdeclaration(@NotNull ExprParser.IntdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntdeclaration(@NotNull ExprParser.IntdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntarrdeclaration(@NotNull ExprParser.IntarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntarrdeclaration(@NotNull ExprParser.IntarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull ExprParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull ExprParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull ExprParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull ExprParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArraydeclaration(@NotNull ExprParser.ArraydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArraydeclaration(@NotNull ExprParser.ArraydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChararrdeclaration(@NotNull ExprParser.ChararrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChararrdeclaration(@NotNull ExprParser.ChararrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanparameter}.
	 * @param ctx the parse tree
	 */
	void enterBooleanparameter(@NotNull ExprParser.BooleanparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanparameter}.
	 * @param ctx the parse tree
	 */
	void exitBooleanparameter(@NotNull ExprParser.BooleanparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopdowhile(@NotNull ExprParser.LoopdowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopdowhile(@NotNull ExprParser.LoopdowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringdeclaration(@NotNull ExprParser.StringdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringdeclaration(@NotNull ExprParser.StringdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(@NotNull ExprParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(@NotNull ExprParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopwhile(@NotNull ExprParser.LoopwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopwhile(@NotNull ExprParser.LoopwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#intparameter}.
	 * @param ctx the parse tree
	 */
	void enterIntparameter(@NotNull ExprParser.IntparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#intparameter}.
	 * @param ctx the parse tree
	 */
	void exitIntparameter(@NotNull ExprParser.IntparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull ExprParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull ExprParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void enterLoopfor(@NotNull ExprParser.LoopforContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void exitLoopfor(@NotNull ExprParser.LoopforContext ctx);
}