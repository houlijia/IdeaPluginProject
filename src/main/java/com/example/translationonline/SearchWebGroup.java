package com.example.translationonline;

import com.intellij.ide.plugins.newui.UIPluginGroup;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.editor.Caret;
import org.jetbrains.annotations.NotNull;

/**
 * @Author houlijia
 * @Date 2025-07-13 10:24
 * @Desc
 **/
public class SearchWebGroup extends DefaultActionGroup {
    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabledAndVisible(isEnabledAndVisible(e));
    }

    private boolean isEnabledAndVisible(@NotNull AnActionEvent e) {

        Caret caret = e.getData(CommonDataKeys.CARET);
        if (caret == null) {
            return false;
        }

        boolean hasSelection = caret.hasSelection();
        if (!hasSelection) {
            return false;
        }

        String selectedText = caret.getSelectedText();
        if (selectedText == null || selectedText.isEmpty()) {
            return false;
        }
        return true;
    }
}
