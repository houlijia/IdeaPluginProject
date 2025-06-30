package com.example.ideapluginproject;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

/**
 * @Author houlijia
 * @Date 2025-06-30 22:25
 * @Desc
 **/
public class ReportAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Messages.showMessageDialog("这是一条消息测试plugin的消息弹窗", "标题", Messages.getInformationIcon());
    }
}
