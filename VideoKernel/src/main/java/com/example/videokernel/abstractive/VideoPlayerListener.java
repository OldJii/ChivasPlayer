package com.example.videokernel.abstractive;

import com.example.videokernel.Constants;

/**
 * Created by OldJii
 * on 1/24/21
 */
public interface VideoPlayerListener {

    void onInfo(int what, int extra);

    void onPrepared();

    void onCompletion();

    void onError(@Constants.ErrorType int type, String error);

    void onVideoSizeChanged(int width, int height);
}
