parser grammar LinguineParser;

options {
        tokenVocab = LinguineLexer;
        language = Java;
}

// Reglas sintácticas
program: (sentencia SEMICOLON NLINE?)*;

sentencia: (asignacion
        | condicional
        | show
        | match
        | llamada_funcion
        | expresion
        | funcion)
        ;

asignacion: LET ID ASSIGN (expresion | condicional | match);

condicional: IF LPAREN expresion RPAREN THEN sentencia (ELSE sentencia)?;

funcion: FUN ID LPAREN params RPAREN ARROW (sentencia);

params: ID (COMMA ID)*;

show: SHOW expresion;

match: MATCH expresion WITH cases;

cases: (NLINE case)+;

case: PIPE (expresion | QEST) ARROW expresion;

expresion:  expresion (MUL | DIV) expresion
        | expresion (PLUS | MINUS) expresion
        | expresion (GT | GTE | EQ | LT | LTE) expresion
        | LPAREN expresion RPAREN
        | ID
        | INT
        | STRING
        | llamada_funcion;

llamada_funcion: ID LPAREN args RPAREN;


args: expresion (COMMA expresion)*;
