package com.kplugin.old;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by AMI on 2017-12-19.
 */


public class TextBoxes extends AnAction {
    public TextBoxes() {
        // Set the menu item name.
        super("K _File");
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String inputFileName = Messages.showInputDialog("Enter a new file name:", "New file", Messages.getInformationIcon());

        FileManipulation file = new FileManipulation(inputFileName);
        file.createFile();


    }
}