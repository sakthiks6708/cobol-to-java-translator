grammar CobolFull_fixed;

/* =========================
   PARSER RULES
   ========================= */

program
    : idDivision dataDivision procedureDivision EOF
    ;

idDivision
    : ID DIVISION DOT
      PROGRAM_ID DOT IDENTIFIER DOT
    ;

dataDivision
    : DATA DIVISION DOT
      WORKING_STORAGE SECTION DOT
      dataItem*
    ;

dataItem
    : NUMBER IDENTIFIER PIC IDENTIFIER DOT
    ;

procedureDivision
    : PROCEDURE DIVISION DOT
      statement*
    ;

statement
    : displayStmt
    | moveStmt
    | addStmt
    | stopStmt
    ;

displayStmt
    : DISPLAY STRING DOT
    ;

moveStmt
    : MOVE IDENTIFIER TO IDENTIFIER DOT
    ;

addStmt
    : ADD IDENTIFIER TO IDENTIFIER DOT
    ;

stopStmt
    : STOP RUN DOT
    ;

/* =========================
   LEXER RULES (TOKENS)
   ========================= */

ID              : 'ID' ;
DIVISION        : 'DIVISION' ;
PROGRAM_ID      : 'PROGRAM-ID' ;

DATA            : 'DATA' ;
WORKING_STORAGE : 'WORKING-STORAGE' ;
SECTION         : 'SECTION' ;
PIC             : 'PIC' ;

PROCEDURE       : 'PROCEDURE' ;

DISPLAY         : 'DISPLAY' ;
MOVE            : 'MOVE' ;
ADD             : 'ADD' ;
TO              : 'TO' ;
STOP            : 'STOP' ;
RUN             : 'RUN' ;

DOT             : '.' ;

IDENTIFIER
    : [A-Z][A-Z0-9-]*
    ;

NUMBER
    : [0-9]+
    ;

STRING
    : '\'' .*? '\''
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
