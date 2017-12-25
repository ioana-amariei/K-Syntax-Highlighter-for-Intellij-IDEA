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
WHITE_SPACE=[\ \n\t\f]+
//WHITE_SPACE=[\s]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
MODULE=module
ENDMODULE=endmodule
MODULE_NAME=[A-Za-z]+
IMPORTS=imports

%state WAITING_VALUE

%%

<YYINITIAL> {CRLF}                           { yybegin(YYINITIAL); return KTypes.CRLF; }
<YYINITIAL> {MODULE}                           { yybegin(YYINITIAL); return KTypes.MODULE; }
<YYINITIAL> {IMPORTS}                           { yybegin(YYINITIAL); return KTypes.IMPORTS; }
<YYINITIAL> {ENDMODULE}                           { yybegin(YYINITIAL); return KTypes.ENDMODULE; }
<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return KTypes.COMMENT; }
<YYINITIAL> {MODULE_NAME}                           { yybegin(YYINITIAL); return KTypes.MODULE_NAME; }
<YYINITIAL> {WHITE_SPACE}                           { yybegin(YYINITIAL); return KTypes.WHITE_SPACE; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
({CRLF}|{WHITE_SPACE})+                         { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return KTypes.KEY; }
//
//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return KTypes.SEPARATOR; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return KTypes.VALUE; }

.                                                           { return TokenType.BAD_CHARACTER; }

