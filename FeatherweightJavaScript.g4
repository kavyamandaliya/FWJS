grammar FeatherweightJavaScript;


@header { package edu.sjsu.fwjs.parser; }

// Reserved words
IF        : 'if' ;
ELSE      : 'else' ;
WHILE     : 'while';
FUNCTION  : 'function';
VAR		  : 'var';
PRINT     : 'print';

// Literals
INT       : [1-9][0-9]* | '0' ;
BOOL      : 'true' | 'false';
NULL      : 'null';

// Symbols
MUL       : '*' ;
DIV       : '/' ;
SEPARATOR : ';' ;
ADD       : '+';
SUB       : '-';
MOD       : '%';
GT        : '>';
LT        : '<';
GTE       : '>=';
LTE       : '<=';
EQUAL     : '==';

//Identifiers
IDENTIFIER: ([a-zA-Z]|'_') ([a-zA-Z0-9]|'_')*;
ASSIGN: '=';

// Whitespace and comments
NEWLINE   : '\r'? '\n' -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT  : '//' ~[\n\r]* -> skip ;
WS            : [ \t]+ -> skip ; // ignore whitespace


// ***Parsing rules ***

/** The start rule */
prog: stat+ ;

stat: expr SEPARATOR                                    # bareExpr
    | IF '(' expr ')' block ELSE block                  # ifThenElse
    | IF '(' expr ')' block                             # ifThen
    | WHILE '(' expr ')' block                          # while
    | PRINT '(' expr ')' SEPARATOR                      # print
    | SEPARATOR                                         # separator
    ;

expr: expr op=( '*' | '/' | '%' ) expr                  # MulDivMod
    | expr op=('+' | '-') expr							# addSub
    | expr op=('<' | '<='| '>'| '>='| '==' ) expr		# gtLsEq
    | FUNCTION params '{' stat* '}'              	    # functionDeclaration
    | IDENTIFIER '(' (expr)? (',' expr)* ')'			# functionApplication
    | VAR IDENTIFIER ASSIGN expr						# varDeclaration
    | IDENTIFIER										# varRef
    | IDENTIFIER ASSIGN expr							# varAssign
    | INT    											# intConstant
    | BOOL												# boolConstant
    | NULL                          					# nullConstant
    | '(' expr ')'                                      # exprinParenthesis
    ;

args: '(' (expr (',' expr)*)? ')' # arguments;

params: '(' (IDENTIFIER (',' IDENTIFIER)*)? ')' # parameters;

block: '{' stat* '}'                                    # fullBlock
     | stat                                             # simpBlock
     ;
