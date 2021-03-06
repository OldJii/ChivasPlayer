package com.example.videoplayer.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.videokernel.abstractive.AbstractVideoPlayer;
import com.example.videokernel.abstractive.VideoPlayerListener;
import com.example.videokernel.factory.PlayerFactory;

/**
 * Created by OldJii
 * on 1/24/21
 */
public class VideoPlayer<T extends AbstractVideoPlayer> extends FrameLayout implements IVideoPlayer, VideoPlayerListener {

    private Context mContext;

    // 播放器
    protected T mMediaPlayer;

    // 播放器工厂
    protected PlayerFactory<T> mPlayerFactory;



    public VideoPlayer(@NonNull Context context) {
        this(context, null);
    }

    public VideoPlayer(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VideoPlayer(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*----------------------------VideoPlayerListener----------------------------*/
    @Override
    public void onInfo(int what, int extra) {

    }

    @Override
    public void onPrepared() {

    }

    @Override
    public void onCompletion() {

    }

    @Override
    public void onError(int type, String error) {

    }

    @Override
    public void onVideoSizeChanged(int width, int height) {

    }

    /*-------------------------------IVideoPlayer-------------------------------*/
    @Override
    public void start() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void seekTo() {

    }

    @Override
    public long getDuration() {
        return 0;
    }

    @Override
    public long getCurrPosition() {
        return 0;
    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public int getBufferedPercentage() {
        return 0;
    }

    @Override
    public void setSpeed(float speed) {

    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public void startFullScreen() {

    }

    @Override
    public void stopFullScreen() {

    }

    @Override
    public boolean isFullScreen() {
        return false;
    }

    @Override
    public void setMute(boolean isMute) {

    }

    @Override
    public boolean isMute() {
        return false;
    }

    @Override
    public void setScreenScaleType(int screenScaleType) {

    }

    @Override
    public long getTcpSpeed() {
        return 0;
    }

    @Override
    public void replay(boolean resetPosition) {

    }

    @Override
    public void setMirrorRotation(boolean enable) {

    }

    @Override
    public Bitmap doScreenShot() {
        return null;
    }

    @Override
    public int[] getVideoSize() {
        return new int[0];
    }

    @Override
    public void startTinyScreen() {

    }

    @Override
    public void stopTinyScreen() {

    }

    @Override
    public boolean isTinyScreen() {
        return false;
    }
}
