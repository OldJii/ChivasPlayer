package com.example.videoplayer.player;

import android.graphics.Bitmap;

import com.example.videoplayer.Constants;

/**
 * Created by OldJii
 * on 1/24/21
 */
public interface IVideoPlayer {

    void start();

    void pause();

    void seekTo();

    long getDuration();

    long getCurrPosition();

    boolean isPlaying();

    int getBufferedPercentage();

    void setSpeed(float speed);

    float getSpeed();

    void startFullScreen();

    void stopFullScreen();

    boolean isFullScreen();

    void setMute(boolean isMute);

    boolean isMute();

    void setScreenScaleType(@Constants.ScreenScaleType int screenScaleType);

    long getTcpSpeed();

    void replay(boolean resetPosition);

    void setMirrorRotation(boolean enable);

    Bitmap doScreenShot();

    int[] getVideoSize();

    void setRotation(float rotation);

    void startTinyScreen();

    void stopTinyScreen();

    boolean isTinyScreen();
}
