// Generated from Expr.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_content(ExprParser.Block_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ExprParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ExprParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(ExprParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(ExprParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ExprParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#intparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntparameter(ExprParser.IntparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#booleanparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanparameter(ExprParser.BooleanparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#floatparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatparameter(ExprParser.FloatparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stringparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringparameter(ExprParser.StringparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#charparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharparameter(ExprParser.CharparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arrayparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayparameter(ExprParser.ArrayparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#constantdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantdeclaration(ExprParser.ConstantdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#singledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingledeclaration(ExprParser.SingledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arraydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydeclaration(ExprParser.ArraydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#booleandeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleandeclaration(ExprParser.BooleandeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanarrdeclaration(ExprParser.BooleanarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#intdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntdeclaration(ExprParser.IntdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stringdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdeclaration(ExprParser.StringdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntarrdeclaration(ExprParser.IntarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#floatdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatdeclaration(ExprParser.FloatdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatarrdeclaration(ExprParser.FloatarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#chardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardeclaration(ExprParser.ChardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChararrdeclaration(ExprParser.ChararrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ExprParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ExprParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#loopfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopfor(ExprParser.LoopforContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#loopwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopwhile(ExprParser.LoopwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#loopdowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopdowhile(ExprParser.LoopdowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ExprParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(ExprParser.OprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#addopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddopr(ExprParser.AddoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#multopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultopr(ExprParser.MultoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#terminalopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalopr(ExprParser.TerminaloprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#shortopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortopr(ExprParser.ShortoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ExprParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(ExprParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#booleanexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanexp(ExprParser.BooleanexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#booleanvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanvalue(ExprParser.BooleanvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(ExprParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(ExprParser.LogicContext ctx);
}