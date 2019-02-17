grammar LabeledExpr; // rename to distinguish from Expr.g4

prog:   stat+ ;




stat:   expr NEWLINE                # PrintExpr
    |   ID '=' expr NEWLINE         # Assign
    |   ID '+=' expr NEWLINE        # AssignPlus
    |   ID '-=' expr NEWLINE        # AssignMinus
    |   ID '*=' expr NEWLINE        # AssignMultiply
    |   ID '/=' expr NEWLINE        # AssignDivide    
    |   NEWLINE                     # Blank
    ;

expr:   expr op='^'  expr          # Pow
    |   expr op='*'  expr          # Mul
    |   expr op='/'  expr          # Div
    |   expr op='-'  expr          # Sub
    |   expr op='+'  expr          # Add    
    |   expr op='%'  expr          # Modulo 
    |        op='-'  ID            # Negate 
    |        op='++' ID            # IncrementLeft
    |        op='--' ID            # DecrementLeft
    |        ID     op='++'        # IncrementRight
    |        ID     op='--'        # DecrementRight
    |        op='!'  expr          # Not  
    |   expr op='&&' expr          # AndAnd
    |   expr op='||' expr          # OrOr
    |   SIN  expr ')'              # Sin
    |   COS  expr ')'              # Cos
    |   LN   expr ')'              # Ln
    |   EXP  expr ')'              # Exp
    |   SQRT expr ')'              # Sqrt 
    |   ID '=' READ                # Read
    |   INT                        # Int
    |   DOUBLE                     # Double 
    |   ID                         # id
    |   '(' expr ')'               # Parens
    ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
MOD :   '%' ;
POW :   '^' ;
NOT :   '!' ;
SIN :   's(' ;
COS :   'c(' ;
LN  :   'l(' ;
EXP :   'e(' ; 
SQRT:   'sqrt(' ;
READ:   'read()';
ANDAND: '&&';
OROR :  '||';
INCREMENT : '++';
DECREMENT : '--';
ASSIGNPLUS : '+=';
ASSIGNMINUS : '-=';
ASSIGNMULTIPLY : '*=';
ASSIGNDIVIDE : '/=';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
TRUE : 'true';
FALSE : 'false';
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
DOUBLE: '-'?[0-9]+('.'[0-9]+)?; //match doubles
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
COMMENT: '/*' .*? '*/' -> skip; //skip comments