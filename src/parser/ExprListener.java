// Generated from Expr.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlock_content(ExprParser.Block_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlock_content(ExprParser.Block_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ExprParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ExprParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ExprParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ExprParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(ExprParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(ExprParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(ExprParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(ExprParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ExprParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ExprParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#intparameter}.
	 * @param ctx the parse tree
	 */
	void enterIntparameter(ExprParser.IntparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#intparameter}.
	 * @param ctx the parse tree
	 */
	void exitIntparameter(ExprParser.IntparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanparameter}.
	 * @param ctx the parse tree
	 */
	void enterBooleanparameter(ExprParser.BooleanparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanparameter}.
	 * @param ctx the parse tree
	 */
	void exitBooleanparameter(ExprParser.BooleanparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatparameter}.
	 * @param ctx the parse tree
	 */
	void enterFloatparameter(ExprParser.FloatparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatparameter}.
	 * @param ctx the parse tree
	 */
	void exitFloatparameter(ExprParser.FloatparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stringparameter}.
	 * @param ctx the parse tree
	 */
	void enterStringparameter(ExprParser.StringparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stringparameter}.
	 * @param ctx the parse tree
	 */
	void exitStringparameter(ExprParser.StringparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#charparameter}.
	 * @param ctx the parse tree
	 */
	void enterCharparameter(ExprParser.CharparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#charparameter}.
	 * @param ctx the parse tree
	 */
	void exitCharparameter(ExprParser.CharparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arrayparameter}.
	 * @param ctx the parse tree
	 */
	void enterArrayparameter(ExprParser.ArrayparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arrayparameter}.
	 * @param ctx the parse tree
	 */
	void exitArrayparameter(ExprParser.ArrayparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantdeclaration(ExprParser.ConstantdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantdeclaration(ExprParser.ConstantdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingledeclaration(ExprParser.SingledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingledeclaration(ExprParser.SingledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArraydeclaration(ExprParser.ArraydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArraydeclaration(ExprParser.ArraydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleandeclaration(ExprParser.BooleandeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleandeclaration(ExprParser.BooleandeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanarrdeclaration(ExprParser.BooleanarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanarrdeclaration(ExprParser.BooleanarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntdeclaration(ExprParser.IntdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntdeclaration(ExprParser.IntdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringdeclaration(ExprParser.StringdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringdeclaration(ExprParser.StringdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntarrdeclaration(ExprParser.IntarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntarrdeclaration(ExprParser.IntarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatdeclaration(ExprParser.FloatdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatdeclaration(ExprParser.FloatdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatarrdeclaration(ExprParser.FloatarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatarrdeclaration(ExprParser.FloatarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChardeclaration(ExprParser.ChardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChardeclaration(ExprParser.ChardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChararrdeclaration(ExprParser.ChararrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChararrdeclaration(ExprParser.ChararrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExprParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExprParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ExprParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ExprParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void enterLoopfor(ExprParser.LoopforContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void exitLoopfor(ExprParser.LoopforContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopwhile(ExprParser.LoopwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopwhile(ExprParser.LoopwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopdowhile(ExprParser.LoopdowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopdowhile(ExprParser.LoopdowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ExprParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ExprParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(ExprParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(ExprParser.OprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#addopr}.
	 * @param ctx the parse tree
	 */
	void enterAddopr(ExprParser.AddoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#addopr}.
	 * @param ctx the parse tree
	 */
	void exitAddopr(ExprParser.AddoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multopr}.
	 * @param ctx the parse tree
	 */
	void enterMultopr(ExprParser.MultoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multopr}.
	 * @param ctx the parse tree
	 */
	void exitMultopr(ExprParser.MultoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void enterTerminalopr(ExprParser.TerminaloprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void exitTerminalopr(ExprParser.TerminaloprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void enterShortopr(ExprParser.ShortoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void exitShortopr(ExprParser.ShortoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ExprParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ExprParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(ExprParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(ExprParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(ExprParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(ExprParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(ExprParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(ExprParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ExprParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ExprParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(ExprParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(ExprParser.LogicContext ctx);
}