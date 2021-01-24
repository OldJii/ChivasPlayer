package com.example.videoplayer.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.videokernel.abstractive.AbstractVideoPlayer;
import com.example.videokernel.abstractive.VideoPlayerListener;

/**
 * Created by OldJii
 * on 1/24/21
 */
public class VideoPlayer<T extends AbstractVideoPlayer> extends FrameLayout implements VideoPlayerListener {

    public VideoPlayer(@NonNull Context context) {
        super(context);
    }

    public VideoPlayer(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public VideoPlayer(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

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
}
