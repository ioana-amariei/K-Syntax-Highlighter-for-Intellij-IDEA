package com.kplugin;

/**
 * Created by AMI on 2017-12-25.
 */

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class KLexerAdapter extends FlexAdapter {
    public KLexerAdapter() {
        super(new KLexer((Reader) null));
    }
}

