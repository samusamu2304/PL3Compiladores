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

for: FOR LPAREN declaracion SEMICOLON expresion SEMICOLON asignacion RPAREN LCURLY NLINE* ((sentencia SEMICOLON  NLINE*)*sentencia SEMICOLON) NLINE* RCURLY;

while: WHILE LPAREN expresion RPAREN LCURLY NLINE* ((sentencia SEMICOLON  NLINE*)*sentencia SEMICOLON) NLINE* RCURLY;

condicional: IF LPAREN expresion RPAREN THEN
 LCURLY NLINE* ((sentencia SEMICOLON  NLINE*)*sentencia SEMICOLON) NLINE* RCURLY
 (ELSEIF LPAREN expresion RPAREN THEN LCURLY NLINE* ((sentencia SEMICOLON  NLINE*)*sentencia SEMICOLON) NLINE* RCURLY)*
 (ELSE LCURLY NLINE* ((sentencia SEMICOLON  NLINE*)*sentencia SEMICOLON) NLINE* RCURLY)?;

funcion: FUN ID LPAREN params RPAREN ARROW (sentencia);

params: ID (COMMA ID)*;

show: SHOW LPAREN expresion RPAREN;

match: MATCH expresion WITH case+ (NLINE PIPE QEST ARROW expresion)?;
case: NLINE PIPE expresion ARROW expresion;

expresion:  expresion (MUL | DIV) expresion # MulDiv
        | expresion (PLUS | MINUS) expresion    # AddSub
        | expresion (GT | GTE | EQ | LT | LTE) expresion    # Rel
        | expresion (AND | OR) expresion    # AndOr
        | LPAREN expresion RPAREN   # Parentesis
        | BOOLEAN  # Boolean
        | ID    # Id
        | INT   # Int
        | FLOAT # Float
        | STRING    # String
        | ID LPAREN args RPAREN   # LlamadaFuncion
        ;



args: expresion (COMMA expresion)*;
