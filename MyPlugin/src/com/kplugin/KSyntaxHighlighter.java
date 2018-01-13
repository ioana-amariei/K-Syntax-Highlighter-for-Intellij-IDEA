package com.kplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.kplugin.psi.KTypes;
import org.jetbrains.annotations.NotNull;
import sun.security.krb5.internal.tools.Ktab;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by AMI on 2017-12-23.
 */


public class KSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("K_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("K_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("K_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("K_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("K_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new KLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(KTypes.SEPARATOR)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(KTypes.MODULE)) {
            return KEY_KEYS;
        } else if (tokenType.equals(KTypes.ENDMODULE)) {
            return KEY_KEYS;
        } else if (tokenType.equals(KTypes.IMPORTS)) {
            return KEY_KEYS;
        } else if (tokenType.equals(KTypes.REQUIRE)) {
            return KEY_KEYS;
        } else if (tokenType.equals(KTypes.RULE)) {
            return KEY_KEYS;
        } else if (tokenType.equals(KTypes.TYPE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(KTypes.CONFIGURATION)) {
            return KEY_KEYS;
        }
        else if(tokenType.equals(KTypes.SYNTAX)){
            return KEY_KEYS;
        } else if (tokenType.equals(KTypes.STRING_VALUE)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(KTypes.ASSIGN)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(KTypes.OPTION)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(KTypes.KEY)) {
            return KEY_KEYS;
        } else if (tokenType.equals(KTypes.VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(KTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
