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
	 * Enter a parse tree produced by the {@code vardeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(FeatherweightJavaScriptParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(FeatherweightJavaScriptParser.VardeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code varref}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarref(FeatherweightJavaScriptParser.VarrefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varref}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarref(FeatherweightJavaScriptParser.VarrefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intconstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntconstant(FeatherweightJavaScriptParser.IntconstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intconstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntconstant(FeatherweightJavaScriptParser.IntconstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullconstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullconstant(FeatherweightJavaScriptParser.NullconstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullconstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullconstant(FeatherweightJavaScriptParser.NullconstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functiondeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(FeatherweightJavaScriptParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functiondeclaration}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(FeatherweightJavaScriptParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolconstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolconstant(FeatherweightJavaScriptParser.BoolconstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolconstant}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolconstant(FeatherweightJavaScriptParser.BoolconstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprinparenthesis}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprinparenthesis(FeatherweightJavaScriptParser.ExprinparenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprinparenthesis}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprinparenthesis(FeatherweightJavaScriptParser.ExprinparenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varasgn}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarasgn(FeatherweightJavaScriptParser.VarasgnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varasgn}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarasgn(FeatherweightJavaScriptParser.VarasgnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionapplication}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionapplication(FeatherweightJavaScriptParser.FunctionapplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionapplication}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionapplication(FeatherweightJavaScriptParser.FunctionapplicationContext ctx);
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