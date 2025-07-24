package com.example.translationonline;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.util.io.URLUtil;
import org.jetbrains.annotations.NotNull;

/**
 * @Author houlijia
 * @Date 2025-07-06 16:25
 * @Desc
 **/
public class SearchWeb extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // 获取当前选中文本
        String text = e.getPresentation().getText();
        Caret caret = e.getData(CommonDataKeys.CARET);

        if (caret == null) {
            return;
        }
        boolean hasSelection = caret.hasSelection();
        if (!hasSelection) {
            return;
        }

        String selectedText = caret.getSelectedText();
        if (selectedText == null || selectedText.isEmpty()) {
            return;
        }
        String url = null;
        switch (text) {
            case "goole搜索":
                url = "https://www.google.com/search?q=";
                break;
            case "百度搜索":
                url = "https://www.baidu.com/s?wd=";
                break;
            case "Bing搜索":
                url = "https://cn.bing.com/?q=";
                break;
            default:
                break;
        }
        BrowserUtil.browse(url + URLUtil.encodeURIComponent(selectedText));
    }
}
