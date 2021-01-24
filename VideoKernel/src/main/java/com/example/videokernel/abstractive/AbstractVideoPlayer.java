package com.example.videokernel.abstractive;

import android.content.res.AssetFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;

import java.util.Map;

/**
 * Created by OldJii
 * on 1/24/21
 */
public abstract class AbstractVideoPlayer {

    protected VideoPlayerListener mVideoPlayerListener;

    /**
     * 初始化播放器
     */
    public abstract void initPlayer();

    /**
     * 设置媒体地址
     * @param path              地址
     * @param headers           请求头
     */
    public abstract void setDataSource(String path, Map<String, String> headers);

    /**
     * 设置播放地址
     * @param fileDescriptor    Raw/Asset目录下的文件
     */
    public abstract void setDataSource(AssetFileDescriptor fileDescriptor);

    /**
     * 设置渲染View
     * @param surface           TextureView
     */
    public abstract void setSurface(Surface surface);

    /**
     * 设置渲染的View
     * @param holder            SurfaceView
     */
    public abstract void setDisplay(SurfaceHolder holder);

    /**
     * 加载媒体资源（异步）
     */
    public abstract void prepare();

    /**
     * 开始播放
     */
    public abstract void start();

    /**
     * 暂停播放
     */
    public abstract void pause();

    /**
     * 停止播放
     */
    public abstract void stop();

    /**
     * 重置播放器
     */
    public abstract void reset();

    /**
     * 是否正在播放
     */
    public abstract boolean isPlaying();

    /**
     * 调整进度
     */
    public abstract void seekTo();

    /**
     * 释放播放器
     */
    public abstract void release();

    /**
     * 获取当前播放的位置
     */
    public abstract long getCurrentPosition();

    /**
     * 获取总时长
     */
    public abstract long getDuration();

    /**
     * 获取缓冲进度
     */
    public abstract int getBufferedPercentage();

    /**
     * 设置音量
     * @param leftVolume                左声道音量
     * @param rightVolume               右声道音量
     */
    public abstract void setVolume(float leftVolume, float rightVolume);

    /**
     * 设置是否循环播放
     */
    public abstract void setLooping(boolean isLooping);

    /**
     * 其他播放器设置
     */
    public abstract void setOption();

    /**
     * 设置播放速度
     */
    public abstract void setSpeed(float speed);

    /**
     * 获取播放速度
     */
    public abstract float getSpeed();

    /**
     * 获取当前缓冲网速
     */
    public abstract long getTcpSpeed();

    /**
     * 设置播放器监听器
     */
    public void setVideoPlayerListener(VideoPlayerListener videoPlayerListener) {
        mVideoPlayerListener = videoPlayerListener;
    }
}
