parser grammar LinguineParser;

options {
        tokenVocab = LinguineLexer;
        language = Java;
}

// Reglas sintácticas
program: (sentencia SEMICOLON NLINE?)*;

sentencia: asignacion
        | declaracion
        | condicional
        | show
        | match
        | for
        | while
        | expresion
        | funcion
        ;

declaracion: LET ID ASSIGN (expresion | condicional | match);

asignacion: ID ASSIGN expresion # AsigSimple
        |ID ASSIGN condicional # AsigCond
        |ID ASSIGN match # AsigMatch
        |ID PLUSPLUS    # Inc
        |ID MINUSMINUS  # Dec
        ;

for: FOR LPAREN declaracion SEMICOLON expresion SEMICOLON asignacion RPAREN sentencia;

while: WHILE LPAREN expresion RPAREN sentencia;

condicional: IF LPAREN expresion RPAREN THEN sentencia (ELSE sentencia)?;

funcion: FUN ID LPAREN params RPAREN ARROW (sentencia);

params: ID (COMMA ID)*;

show: SHOW LPAREN expresion RPAREN;

match: MATCH expresion WITH cases;

cases: (NLINE case)+;

case: PIPE (expresion | QEST) ARROW expresion;

expresion:  expresion (MUL | DIV) expresion # MulDiv
        | expresion (PLUS | MINUS) expresion    # AddSub
        | expresion (GT | GTE | EQ | LT | LTE) expresion    # Rel
        | expresion (AND | OR) expresion    # AndOr
        | LPAREN expresion RPAREN   # Parentesis
        | ID    # Id
        | INT   # Int
        | FLOAT # Float
        | BOOLEAN  # Bool
        | STRING    # String
        | ID LPAREN args RPAREN   # LlamadaFuncion
        ;



args: expresion (COMMA expresion)*;
