grammar Flecha;

/*
 * Parser Rules
 */

program                 : program1  ;

program1                : definition program1
                        |
                        ;

definition              : DEF LOWERID parameters DEFEQ expression ;

expression              : externalExpression
                        | externalExpression SEMICOLON expression ;


externalExpression      : ifExpression
                        | caseExpression
                        | letExpression
                        | internalExpression
                        | lambdaExpression
                        ;

ifExpression            : IF internalExpression THEN internalExpression elseBranch ;

elseBranch              : ELIF internalExpression THEN internalExpression elseBranch;

caseExpression          : CASE internalExpression caseBranches;

caseBranches            : caseBranch caseBranch
                        |
                        ;

caseBranch              : PIPE UPPERID parameters ARROW internalExpression ;

letExpression           : LET ID parameters DEFEQ internalExpression IN externalExpression;

lambdaExpression        : LAMBDA parameters ARROW externalExpression ;


internalExpression      : applicationExpresion internalExpression2
                        | unaryOperator internalExpression internalExpression2
                        ;

internalExpression2 :	binaryOperator internalExpression internalExpression2
                        |
                        ;

binaryOperator          : AND | OR | EQ | NE | GE | LE | GT | LT | PLUS | MINUS | TIMES | DIV | MOD ;

unaryOperator           : NEGATION | MINUS ;

applicationExpresion    : listExpression | atomicExpression | applicationExpresion atomicExpression ;

listExpression          : UPPERID atomicExpression listSubExpression;
listSubExpression       : listBraceExpression | listAtomicExpression;
listBraceExpression     : LBRACKET expression RBRACKET ;
listAtomicExpression    : atomicExpression;

atomicExpression        : NUMBER | LOWERID | UPPERID | CHAR | LITERAL
                        | atomicExpression2;
atomicExpression2       : LBRACKET expression RBRACKET;


parameters              : LOWERID parameters
                        | ;

/*
 * Lexer Rules
 */

// definitions
DEF                     : 'def' ;


// conditionals
IF                      : 'if' ;
THEN                    : 'then' ;
ELIF                    : 'elif' ;
ELSE                    : 'else' ;

//pattern matchin
CASE                    : 'case' ;

//local declarations
LET                     : 'let' ;
IN                      : 'in' ;

// delimiters
DEFEQ                   : '=' ;
SEMICOLON               : ';' ;
LBRACKET                : '(' ;
RBRACKET                : ')' ;
BACKSLASH               : '\\' ;
PIPE                    : '|' ;
ARROW                   : '->';
SINGLEQUOTE             : '\'';
QUOTE                   : '"';

// logic operators
AND                     : '&&' ;
OR                      : '||' ;
NEGATION                : '!' ;

// relational operaotors
EQ                      : '==' ;
NE                      : '!=' ;
GE                      : '>=' ;
LE                      : '<=' ;
GT                      : '>' ;
LT                      : '<' ;

// aritmetic operators
PLUS                    : '+' ;
MINUS                   : '-' ;
TIMES                   : '*' ;
DIV                     : '/' ;
MOD                     : '%' ;


WHITESPACE              : ' ' -> skip ;
NEWLINE                 : ('\r'? '\n' | '\r' | '\t')+ -> skip ;
COMMENT                 : '--' ~[\r\n]* -> skip ;
NUMBER                  : [0-9]+ ;
ID                      : [0-9]+ ;


LOWERID                 : [a-z]+CHARS* ;
UPPERID                 : [A-Z]+CHARS* ;
LITERAL                 : QUOTE CHARS* QUOTE;
CHARS                   : [a-zA-Z0-9_] ;
CHAR                    : SINGLEQUOTE([a-zA-Z0-9=()]|' '|'\\\\'|'\\t'|'\\n'|'\\r'|'\\'SINGLEQUOTE|'\\"')SINGLEQUOTE;
LAMBDA                  : LOWERID BACKSLASH ;
STRING                  : .+?;
