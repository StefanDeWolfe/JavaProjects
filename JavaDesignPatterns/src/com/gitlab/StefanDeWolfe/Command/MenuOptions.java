package com.gitlab.StefanDeWolfe.Command;

public class MenuOptions { // was missing from example, made from interpolation of final executable
    ActionSave saveAction;
    ActionOpen openAction;

    public MenuOptions(ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
        saveAction = (ActionSave) clickSave;
        openAction = (ActionOpen) clickOpen;
    }
    public void clickOpen() {
        openAction.execute();
    }
    public void clickSave() {
        saveAction.execute();
    }
}
