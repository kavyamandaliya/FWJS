// Generated from FeatherweightJavaScript.g4 by ANTLR 4.7.2
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FeatherweightJavaScriptParser}.
 */
public interface FeatherweightJavaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FeatherweightJavaScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FeatherweightJavaScriptParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatherweightJavaScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FeatherweightJavaScriptParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bareExpr}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bareExpr}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThen}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(FeatherweightJavaScriptParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThen}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(FeatherweightJavaScriptParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(FeatherweightJavaScriptParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(FeatherweightJavaScriptParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FeatherweightJavaScriptParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FeatherweightJavaScriptParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code separator}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(FeatherweightJavaScriptParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code separator}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(FeatherweightJavaScriptParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprinParenthesis}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprinParenthesis(FeatherweightJavaScriptParser.ExprinParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprinParenthesis}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprinParenthesis(FeatherweightJavaScriptParser.ExprinParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionApplication}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApplication(FeatherweightJavaScriptParser.FunctionApplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionApplication}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApplication(FeatherweightJavaScriptParser.FunctionApplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntConstant(FeatherweightJavaScriptParser.IntConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntConstant(FeatherweightJavaScriptParser.IntConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(FeatherweightJavaScriptParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(FeatherweightJavaScriptParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtLsEq}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtLsEq(FeatherweightJavaScriptParser.GtLsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtLsEq}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtLsEq(FeatherweightJavaScriptParser.GtLsEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varRef}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(FeatherweightJavaScriptParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varRef}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(FeatherweightJavaScriptParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullConstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullConstant(FeatherweightJavaScriptParser.NullConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullConstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullConstant(FeatherweightJavaScriptParser.NullConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(FeatherweightJavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(FeatherweightJavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolConstant(FeatherweightJavaScriptParser.BoolConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolConstant(FeatherweightJavaScriptParser.BoolConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(FeatherweightJavaScriptParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(FeatherweightJavaScriptParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssign}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(FeatherweightJavaScriptParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssign}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(FeatherweightJavaScriptParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx);
}