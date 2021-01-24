package com.example.videoplayer.ui;

import android.view.View;
import android.view.animation.Animation;

import androidx.annotation.NonNull;

import com.example.videoplayer.Wrapper.ControlWrapper;

/**
 * Created by OldJii
 * on 1/25/21
 */
public interface IControlView {

    /**
     * 绑定视图
     *
     * @param controlWrapper                自定义控制器包装类
     */
    void attach(@NonNull ControlWrapper controlWrapper);

    /**
     * 获取视图view
     */
    View getView();

    /**
     * 视图可见性监听
     *
     * @param isVisible                     是否可见
     * @param anim                          动画
     */
    void onVisibilityChanged(boolean isVisible, Animation anim);

    /**
     * 播放状态监听
     */
    void onPlayStateChanged(int playState);

    /**
     * 播放模式监听
     */
    void onPlayerStateChanged(int playerState);

    /**
     * 设置进度操作
     * @param duration                      时间
     * @param position                      进度position
     */
    void setProgress(int duration, int position);

    /**
     * 锁屏状态监听
     * @param isLocked                      是否锁屏
     */
    void onLockStateChanged(boolean isLocked);
}
