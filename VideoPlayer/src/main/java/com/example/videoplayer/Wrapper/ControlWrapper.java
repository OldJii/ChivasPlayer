package com.example.videoplayer.Wrapper;

import android.graphics.Bitmap;

import com.example.videoplayer.controller.IVideoController;
import com.example.videoplayer.player.IVideoPlayer;

/**
 * Created by OldJii
 * on 1/25/21
 *
 * 连接播放器接口IVideoPlayer与控件层接口IVideoController
 */
public class ControlWrapper implements IVideoPlayer, IVideoController {
    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public boolean isShowing() {
        return false;
    }

    @Override
    public void startFadeOut() {

    }

    @Override
    public void stopFadeOut() {

    }

    @Override
    public void setLocked(boolean locked) {

    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public void startProgress() {

    }

    @Override
    public void stopProgress() {

    }

    @Override
    public boolean hasCutout() {
        return false;
    }

    @Override
    public int getCutoutHeight() {
        return 0;
    }

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
    public void setRotation(float rotation) {

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
