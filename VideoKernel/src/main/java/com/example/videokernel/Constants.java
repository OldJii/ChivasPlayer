package com.example.videokernel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by OldJii
 * on 1/24/21
 */
public final class Constants {

    /**
     * 播放器内核
     * TYPE_IJK                 IjkPlayer
     * TYPE_NATIVE              MediaPlayer
     * TYPE_EXO                 ExoPlayer
     * TYPE_RTC                 RtcPlayer
     */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerType {
        int TYPE_IJK = 1;
        int TYPE_NATIVE = 2;
        int TYPE_EXO = 3;
        int TYPE_RTC = 4;
    }

    /**
     * 错误类型
     * TYPE_SOURCE              链接异常
     * TYPE_PARSE               解析异常
     * TYPE_UNEXPECTED          其他异常
     */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorType {
        int TYPE_SOURCE = 1;
        int TYPE_PARSE = 2;
        int TYPE_UNEXPECTED = 3;
    }
}
