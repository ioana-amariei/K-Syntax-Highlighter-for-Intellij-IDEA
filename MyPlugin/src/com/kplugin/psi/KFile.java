package com.kplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.kplugin.KFileType;
import com.kplugin.KLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by AMI on 2017-12-23.
 */

public class KFile extends PsiFileBase {
    public KFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, KLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return KFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "K File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
