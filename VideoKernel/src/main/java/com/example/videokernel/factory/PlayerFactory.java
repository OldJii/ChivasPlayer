package com.example.videokernel.factory;

import android.content.Context;

import com.example.videokernel.abstractive.AbstractVideoPlayer;

/**
 * Created by OldJii
 * on 1/25/21
 */
public abstract class PlayerFactory<T extends AbstractVideoPlayer> {

    public abstract T createPlayer(Context context);

}
