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
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
MODULE=module
ENDMODULE=endmodule
MODULE_NAME=[A-Z]+(\-SYNTAX)?
IMPORTS=imports
REQUIRE=require
SYNTAX=syntax
RULE=rule
SORT_NAME=[A-Z][a-z]*
SIGN= \"[^A-Za-z0-9]\"
ASSIGN="::="
TYPE=Int|String|Float|{SORT_NAME}
OR_SIGN="|"
OPTION= \[(({KEYWORD}|[a-z]+)(\,\ )?)+\]
KEYWORD=  bracket | left | right | strict | strict\({NUMBER}\)
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
<YYINITIAL> {MODULE_NAME}                           { yybegin(YYINITIAL); return KTypes.MODULE_NAME; }
<YYINITIAL> {IMPORTS}                           { yybegin(YYINITIAL); return KTypes.IMPORTS; }
<YYINITIAL> {SYNTAX}                           { yybegin(YYINITIAL); return KTypes.SYNTAX; }
<YYINITIAL> {ASSIGN}                           { yybegin(YYINITIAL); return KTypes.ASSIGN; }
<YYINITIAL> {OR_SIGN}                           { yybegin(YYINITIAL); return KTypes.OR_SIGN; }
<YYINITIAL> {RULE}                           { yybegin(YYINITIAL); return KTypes.RULE; }
<YYINITIAL> {ENDMODULE}                           { yybegin(YYINITIAL); return KTypes.ENDMODULE; }
<YYINITIAL> {TYPE}                           { yybegin(YYINITIAL); return KTypes.TYPE; }
<YYINITIAL> {SIGN}                           { yybegin(YYINITIAL); return KTypes.SIGN; }
<YYINITIAL> {OPTION}                           { yybegin(YYINITIAL); return KTypes.OPTION; }
<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return KTypes.COMMENT; }

//<WAITING_VALUE> {CRLF}({CRLF}|{WS})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
//<WAITING_VALUE> {WS}+                               { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
//({CRLF}|{WS})+                         { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return KTypes.KEY; }
//
//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return KTypes.SEPARATOR; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return KTypes.VALUE; }

.                                                           { return TokenType.BAD_CHARACTER; }

