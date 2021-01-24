package com.example.videoplayer.controller;

import com.example.videoplayer.ui.IControlView;

/**
 * Created by OldJii
 * on 1/25/21
 */
public interface IViewController {

    /**
     * 添加组件
     */
    void addControlComponent(IControlView... controlViews);

    /**
     * 添加组件
     * @param controlView                           controlView
     * @param isPrivate                             是否添加到控制器
     */
    void addControlComponent(IControlView controlView, boolean isPrivate);

    /**
     * 移除组件
     */
    void removeControlComponent(IControlView controlView);

    /**
     * 移除所有组件
     */
    void removeAllControlComponent();

    /**
     * 移除所有独有组件
     */
    void removeAllPrivateComponents();
}
