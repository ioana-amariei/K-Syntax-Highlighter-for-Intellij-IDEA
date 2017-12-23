package com.kplugin.old;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

/**
 * Created by AMI on 2017-12-19.
 */
public class MyPluginRegistration implements ApplicationComponent {
    // Returns the component name (any unique string value).
    @NotNull
    public String getComponentName() {
        return "K Plugin";
    }

    public void initComponent() {
        ActionManager actionManager = ActionManager.getInstance();
        TextBoxes action = new TextBoxes();

        // Passes an instance of your custom com.kplugin.old.TextBoxes class to the registerAction method of the ActionManager class.
        actionManager.registerAction("MyPluginAction", action);

        // Gets an instance of the WindowMenu action group.
        DefaultActionGroup newFileMenu = (DefaultActionGroup) actionManager.getAction("NewGroup");

        // Adds a separator and a new menu command to the NewFileMenu group on the file menu.
        newFileMenu.addSeparator();
        newFileMenu.add(action);
    }

    // Disposes system resources.
    public void disposeComponent() {
    }
}
