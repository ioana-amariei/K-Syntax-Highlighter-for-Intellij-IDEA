package com.kplugin;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;
/**
 * Created by AMI on 2017-12-22.
 */

public class KFileType extends LanguageFileType {
    public static final KFileType INSTANCE = new KFileType();

    private KFileType() {
        super(KLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "K file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "K language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "k";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return KIcons.FILE;
    }
}
