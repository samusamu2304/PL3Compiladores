lexer grammar LinguineLexer;

LET: 'let';
IF: 'if';
THEN: 'then';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
FUN: 'fun';
SHOW: 'show';
MATCH: 'match';
WITH: 'with';
PIPE: '|';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
STRING: '"' ~["]* '"';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
EQ: '==';
PLUSPLUS: '++';
MINUSMINUS: '--';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
ASSIGN: '=';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
ARROW: '->';
SEMICOLON: ';';
NLINE: [\r\n]+;
QEST: '?';



ESPACIO_BLANCO: [ \t\n\r]+ -> skip;