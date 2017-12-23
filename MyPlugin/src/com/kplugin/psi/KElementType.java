package com.kplugin.psi;

/**
 * Created by AMI on 2017-12-23.
 */
import com.intellij.psi.tree.IElementType;
import com.kplugin.KLanguage;
import org.jetbrains.annotations.*;

public class KElementType extends IElementType {
    public KElementType(@NotNull @NonNls String debugName) {
        super(debugName, KLanguage.INSTANCE);
    }
}
