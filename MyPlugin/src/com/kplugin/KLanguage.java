/**
 * Created by AMI on 2017-12-22.
 */
package com.kplugin;

import com.intellij.lang.Language;

public class KLanguage extends Language {
    public static final KLanguage INSTANCE = new KLanguage();

    private KLanguage() {
        super("K");
    }
}
