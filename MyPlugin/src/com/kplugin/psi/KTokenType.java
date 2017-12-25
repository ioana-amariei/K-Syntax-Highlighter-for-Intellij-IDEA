package com.kplugin.psi;

/**
 * Created by AMI on 2017-12-23.
 */

import com.intellij.psi.tree.IElementType;
import com.kplugin.KLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class KTokenType extends IElementType {
    public KTokenType(@NotNull @NonNls String debugName) {

        super(debugName, KLanguage.INSTANCE);
    }

    @Override
    public String toString() {

        return "KTokenType." + super.toString();
    }
}
