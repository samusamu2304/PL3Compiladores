lexer grammar LinguineLexer;

LET: 'let';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ELSEIF: 'elseif';
FOR: 'for';
WHILE: 'while';
FUN: 'fun';
SHOW: 'show';
MATCH: 'match';
WITH: 'with';
BOOLEAN: 'true' | 'false';
PIPE: '|';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
FLOAT: [0-9]+[.][0-9]+;
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
AND: '&&';
OR: '||';
ASSIGN: '=';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
ARROW: '->';
LCURLY: '{';
RCURLY: '}';
SEMICOLON: ';';
NLINE: [\r\n]+;
QEST: '?';



ESPACIO_BLANCO: [ \t\n\r]+ -> skip;