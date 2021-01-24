package com.example.videoplayer.controller;

/**
 * Created by OldJii
 * on 1/25/21
 *
 * 播放器控件层 控制接口
 */
public interface IVideoController {

    /**
     * 显示控件层
     */
    void show();

    /**
     * 隐藏控件层
     */
    void hide();

    /**
     * 控件层是否显示
     */
    boolean isShowing();

    /**
     * 开启控件层自动消失
     */
    void startFadeOut();

    /**
     * 关闭控件层自动消失
     */
    void stopFadeOut();

    /**
     * 设置锁屏
     */
    void setLocked(boolean locked);

    /**
     * 是否锁屏
     */
    boolean isLocked();

    /**
     * 开始刷新播放进度
     */
    void startProgress();

    /**
     * 停止刷新播放进度
     */
    void stopProgress();

    /**
     * 是否需要适配刘海
     */
    boolean hasCutout();

    /**
     * 获取刘海的高度
     */
    int getCutoutHeight();
}
