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
ASSIGN: '='

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
    | WHILE '(' expr ')' block
    | PRINT '(' expr ')' SEPARATOR
    | SEPARATOR
    ;

expr: expr op=( '*' | '/' | '%' ) expr                  # MulDivMod
    | expr op=('+' | '-') expr							#add or sub
    | expr op=('<' | '<='| '>'| '>='| '==' ) expr		#gt, ls, eq
    | FUNCTION '('expr')? (',' expr)*')' block 			# function declaration
    | IDENTIFIER '('expr')? (',' expr)*')'				#function application
    | VAR IDENTIFIER ASSIGN expr							# var declaration
    | IDENTIFIER										# var ref
    | IDENTIFIER ASSIGN expr								# var asgn
    | INT    											#int constant
    | BOOL												#bool constant
    | NULL                          					#null constant         
    | '(' expr ')'                                      #expr in parenthesis 
    ;

block: '{' stat* '}'                                    # fullBlock
     | stat                                             # simpBlock
     ;
