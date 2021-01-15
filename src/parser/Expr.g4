grammar Expr;


program: function* main EOF;

block_content: (( declaration| constantdeclaration | assignment | loopdowhile | operation | print | scan | call) SEMICOLON) | (loop | condition);

//function declaration
main: MAIN LEFT_PAREN RIGHT_PAREN LEFT_BRACE block_content* RIGHT_BRACE;
function: FUNCTION (INT_TYPE | FLOAT_TYPE | CHAR_TYPE | STRING_TYPE | VOID_TYPE) (LEFT_BRACKET RIGHT_BRACKET)? ID LEFT_PAREN (parameter (COMMA parameter)*)? RIGHT_PAREN LEFT_BRACE block_content* (returnstatement)? RIGHT_BRACE;
//function: FUNCTION (INT_TYPE | FLOAT_TYPE | CHAR_TYPE | STRING_TYPE | VOID_TYPE) (LEFT_BRACKET RIGHT_BRACKET)? ID LEFT_PAREN (parameter (COMMA parameter)*)? RIGHT_PAREN LEFT_BRACE block_content* (returnstatement)? RIGHT_BRACE;
call: ID LEFT_PAREN ((INT_VALUE| FLOAT_VALUE | STRING_VALUE | CHAR_VALUE | booleanexp | opr | ID) (COMMA (INT_VALUE| FLOAT_VALUE | STRING_VALUE | CHAR_VALUE | booleanexp | opr | ID))* )? RIGHT_PAREN;


returnstatement: RETURN (booleanexp|opr|ID)*;

//parameter
parameter: intparameter | booleanparameter | stringparameter | charparameter| arrayparameter| floatparameter;
intparameter: INT_TYPE ID;
booleanparameter: BOOLEAN_TYPE ID;
floatparameter: FLOAT_TYPE ID;
stringparameter: STRING_TYPE ID;
charparameter: CHAR_TYPE ID;
arrayparameter: (INT_TYPE|FLOAT_TYPE|CHAR_TYPE|BOOLEAN_TYPE) LEFT_BRACKET RIGHT_BRACKET ID;


//declaration
declaration: singledeclaration | arraydeclaration;
constantdeclaration: 'constant' declaration;
singledeclaration: intdeclaration | floatdeclaration | chardeclaration | booleandeclaration | stringdeclaration;
arraydeclaration: intarrdeclaration | floatarrdeclaration | chararrdeclaration | booleanarrdeclaration;
booleandeclaration: BOOLEAN_TYPE ID ( EQUALS booleanexp (logic booleanexp)*);
booleanarrdeclaration: BOOLEAN_TYPE LEFT_BRACKET RIGHT_BRACKET ID (EQUALS 'create' BOOLEAN_TYPE booleanexp (logic booleanexp)*)?;
intdeclaration: INT_TYPE ID (EQUALS (INT_VALUE|opr))?;
stringdeclaration: STRING_TYPE ID (EQUALS (STRING_VALUE| ID))?;
intarrdeclaration: INT_TYPE LEFT_BRACKET RIGHT_BRACKET ID (EQUALS 'create' INT_TYPE LEFT_BRACKET INT_VALUE(COMMA INT_VALUE)* RIGHT_BRACKET)?;
floatdeclaration: FLOAT_TYPE ID(EQUALS (FLOAT_VALUE|opr))?;
floatarrdeclaration: FLOAT_TYPE LEFT_BRACKET RIGHT_BRACKET ID (EQUALS 'create' FLOAT_TYPE LEFT_BRACKET FLOAT_VALUE(COMMA FLOAT_VALUE)* RIGHT_BRACKET)?;
chardeclaration: CHAR_TYPE ID(EQUALS CHAR_VALUE)?;
chararrdeclaration: STRING_TYPE ID(EQUALS 'create' CHAR_TYPE STRING_VALUE)?;

//assignment expression
assignment: ID EQUALS ( opr | CHAR_VALUE | STRING_VALUE);

//conditional blocks
condition: IF LEFT_PAREN booleanexp (logic booleanexp)* RIGHT_PAREN THEN LEFT_BRACE block_content* RIGHT_BRACE (ELSEIF LEFT_PAREN booleanexp (logic booleanexp)* RIGHT_PAREN THEN LEFT_BRACE block_content* RIGHT_BRACE)* (ELSE LEFT_BRACE block_content* RIGHT_BRACE)?;

//looping blocks
//loopwhiledowhile : loopwhile | loopdowhile;
loop: loopfor | loopwhile;
loopfor: FOR (ID | intdeclaration | assignment)  (UP | DOWN) TO (ID | INT_VALUE) LEFT_BRACE block_content* RIGHT_BRACE;
loopwhile: WHILE (ID | intdeclaration | assignment)  (UP | DOWN) TO (ID | INT_VALUE) LEFT_BRACE block_content* RIGHT_BRACE;
loopdowhile: DO LEFT_BRACE block_content* RIGHT_BRACE WHILE (ID | intdeclaration | assignment)  (UP | DOWN) TO (ID | INT_VALUE);

//operations
operation: ID EQUALS opr | ID shortopr;
opr: addopr;
addopr: addopr PLUS multopr | addopr MINUS multopr | multopr;
multopr: multopr MUL terminalopr | multopr DIV terminalopr | multopr MOD terminalopr | terminalopr;
terminalopr: ID | INT_VALUE | FLOAT_VALUE | LEFT_PAREN opr RIGHT_PAREN;

shortopr: PLUS_PLUS | MINUS_MINUS | (PLUS_EQUALS | MIN_EQUALS | MUL_EQUALS | DIV_EQUALS) INT_VALUE;

//printing and scanning
print: PRINT LEFT_PAREN(STRING_VALUE | ID)? (PLUS (STRING_VALUE | ID))* RIGHT_PAREN;
scan: SCAN LEFT_PAREN STRING_VALUE COMMA ID RIGHT_PAREN;

//boolean parsing
booleanexp: (NOT)?booleanvalue(relation booleanvalue)? (logic booleanexp)*;
booleanvalue: INT_VALUE | ID | STRING_VALUE | CHAR_VALUE | TRUE | FALSE | LEFT_PAREN booleanexp RIGHT_PAREN;

relation: (EQUALS_EQUALS | NOT_EQUALS | LESS_THAN_EQUALS | LESS_THAN | GREATER_THAN_EQUALS | GREATER_THAN);
logic: (AND | OR);

// lexer
//literals
//CONSTANT: 'constant';
CHAR_VALUE: QUOTE_S . QUOTE_S;
STRING_VALUE: QUOTE_D ~('"')* QUOTE_D;
INT_VALUE: MINUS? DIGIT+;
FLOAT_VALUE: MINUS? DIGIT+ (DOT DIGIT+)?'f';

//Conditional keywords
IF: 'if';
ELSE: 'else';
ELSEIF: 'else if';
THEN: 'then';

//Looping keywords
FOR: 'for';
WHILE: 'while';
DO: 'do';
UP: 'up';
DOWN: 'down';
TO: 'to';


//Variable types
INT_TYPE: 'int';
FLOAT_TYPE: 'float';
CHAR_TYPE: 'char';
STRING_TYPE: 'string';
BOOLEAN_TYPE: 'bool';
VOID_TYPE: 'void';

//Function keywords
FUNCTION: 'func';
PRINT: 'print';
SCAN: 'scan';
MAIN: 'main';
RETURN: 'return';
//MYFUNCTION: LETTER LetterorDigit*;

//boolean keywords
TRUE: 'true';
FALSE: 'false';



//ID
ID: LETTER LetterorDigit*;

// Special Symbols
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
QUOTE_S: '\'';
QUOTE_D: '"';


//Math Operators
PLUS_PLUS: '++';
MINUS_MINUS: '--';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';

// Assignment Operator
EQUALS: '=';
PLUS_EQUALS: '+=';
MIN_EQUALS: '-=';
MUL_EQUALS: '*=';
DIV_EQUALS: '/=';

// Relational Operators
LESS_THAN: '<';
LESS_THAN_EQUALS: '<=';
GREATER_THAN: '>';
GREATER_THAN_EQUALS: '>=';
EQUALS_EQUALS: '==';
NOT_EQUALS: '!=';

// Logical Operators
AND: '&&';
OR: '||';
NOT: '!';

//digits and letters
DIGIT: [0-9];
LETTER:[a-zA-Z$_:?#@^];

fragment LetterorDigit: DIGIT | LETTER;

//skip
WS: [ \t\r\n]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;