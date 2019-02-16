grammar LabeledExpr; // rename to distinguish from Expr.g4

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op='^'  expr          # Pow
    |   expr op='*'  expr          # Mul
    |   expr op='/'  expr          # Div
    |   expr op='-'  expr          # Sub
    |   expr op='+'  expr          # Add    
    |   expr op='%'  expr          # Modulo 
    |        op='++' ID            # Increment
    |   SIN  expr ')'              # Sin
    |   INT                        # int
    |   ID                         # id
    |   '(' expr ')'               # parens
    ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
MOD :   '%' ;
POW :   '^' ;
SIN :   's(' ;
INCREMENT : '++';
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
COMMENT: '/*' .*? '*/' -> skip;