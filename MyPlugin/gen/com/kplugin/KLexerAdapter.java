package com.kplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class KLexerAdapter extends FlexAdapter {
    public KLexerAdapter() {
        super(new KLexer((Reader) null));
    }
}