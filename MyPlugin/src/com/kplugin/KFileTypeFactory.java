package com.kplugin;
import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

/**
 * Created by AMI on 2017-12-22.
 */

public class KFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(KFileType.INSTANCE, "k");
    }
}
