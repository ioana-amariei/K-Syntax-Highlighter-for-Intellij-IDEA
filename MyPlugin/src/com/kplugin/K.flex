package com.kplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.kplugin.psi.KTypes;
import com.intellij.psi.TokenType;
%%

%class KLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\r|\n|\r\n|\R
WS=[\ \n\t\f\s]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
COMMENT= (\/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+\/) | (\/\/.*?)
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
MODULE=module
ENDMODULE=endmodule
PGM=[$](PGM|pgm|Pgm)
MODULE_NAME=[A-Z]+(\-SYNTAX)?
IMPORTS=imports
REQUIRE=require
SYNTAX=syntax
RULE=rule
ID=([A-Z][0-9]) | [0-9] | "_" | [A-Z]
CONFIGURATION=configuration
STRING_VALUE= \"[a-zA-Z0-9(){}*!=></%+;\-\[\]&|,]*\"
WHEN=when
ASSIGN="::="
TYPE=Int | String | Float | Id | Map | List | {SORT_NAME}
SORT_NAME=[A-Z]+[a-z]+([A-Z][a-z]*)?
SPECIAL_SIGN="|" | ">" | ":" | "+" | "-" | "*" | "<" | "=>" | "." | "{" |  "}"
           | "<=" | "|->" | ";" | "~>" | "..." | "/" | "=/=" | "%" | "[" | "]"
           | "$" | "=" | "(" | ")" | "!" | ","
OPTION=\[(({KEYWORD}|[a-z]+)([ ,]?)*)+\] | {KEYWORD}
KEYWORD=bracket | left | right | strict | strict\({NUMBER}\)
STRING=[A-Za-z]+
NUMBER=[12]

%state WAITING_VALUE

%%

<WAITING_VALUE> {CRLF}({CRLF}|{WS})+               { yybegin(YYINITIAL); return KTypes.WS; }
<WAITING_VALUE> {WS}+                               { yybegin(WAITING_VALUE); return KTypes.WS; }
//({CRLF}|{WS})+                         { yybegin(YYINITIAL); return KTypes.WS; }
<YYINITIAL> {CRLF}+                          { yybegin(YYINITIAL); return KTypes.CRLF; }
<YYINITIAL> {WS}+                          { yybegin(YYINITIAL); return KTypes.WS; }

<YYINITIAL> {REQUIRE}                           { yybegin(YYINITIAL); return KTypes.REQUIRE; }
<YYINITIAL> {MODULE}                           { yybegin(YYINITIAL); return KTypes.MODULE; }
<YYINITIAL> {PGM}                           { yybegin(YYINITIAL); return KTypes.PGM; }
<YYINITIAL> {SPECIAL_SIGN}                           { yybegin(YYINITIAL); return KTypes.SPECIAL_SIGN; }
<YYINITIAL> {IMPORTS}                           { yybegin(YYINITIAL); return KTypes.IMPORTS; }
<YYINITIAL> {ID}                           { yybegin(YYINITIAL); return KTypes.ID; }
<YYINITIAL> {MODULE_NAME}                           { yybegin(YYINITIAL); return KTypes.MODULE_NAME; }
<YYINITIAL> {SYNTAX}                           { yybegin(YYINITIAL); return KTypes.SYNTAX; }
<YYINITIAL> {ASSIGN}                           { yybegin(YYINITIAL); return KTypes.ASSIGN; }
<YYINITIAL> {WHEN}                           { yybegin(YYINITIAL); return KTypes.WHEN; }
<YYINITIAL> {RULE}                           { yybegin(YYINITIAL); return KTypes.RULE; }
<YYINITIAL> {CONFIGURATION}                           { yybegin(YYINITIAL); return KTypes.CONFIGURATION; }
<YYINITIAL> {ENDMODULE}                           { yybegin(YYINITIAL); return KTypes.ENDMODULE; }
<YYINITIAL> {OPTION}                           { yybegin(YYINITIAL); return KTypes.OPTION; }
<YYINITIAL> {COMMENT}                           { yybegin(YYINITIAL); return KTypes.COMMENT; }
<YYINITIAL> {TYPE}                           { yybegin(YYINITIAL); return KTypes.TYPE; }
<YYINITIAL> {STRING_VALUE}                           { yybegin(YYINITIAL); return KTypes.STRING_VALUE; }
<YYINITIAL> {STRING}                           { yybegin(YYINITIAL); return KTypes.STRING; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return KTypes.VALUE; }

.                                                           { return TokenType.BAD_CHARACTER; }

