package com.example.videoplayer;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by OldJii
 * on 1/24/21
 */
public class Constants {

    /**
     * 视频播放器宽高比
     */
    @IntDef({
            ScreenScaleType.SCREEN_SCALE_DEFAULT,
            ScreenScaleType.SCREEN_SCALE_16_9,
            ScreenScaleType.SCREEN_SCALE_4_3,
            ScreenScaleType.SCREEN_SCALE_MATCH_PARENT,
            ScreenScaleType.SCREEN_SCALE_ORIGINAL,
            ScreenScaleType.SCREEN_SCALE_CENTER_CROP
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScreenScaleType {
        // 默认
        int SCREEN_SCALE_DEFAULT = 0;
        // 16 : 9
        int SCREEN_SCALE_16_9 = 1;
        // 4 : 3
        int SCREEN_SCALE_4_3 = 2;
        // 拉伸填充
        int SCREEN_SCALE_MATCH_PARENT = 3;
        // 原始比例
        int SCREEN_SCALE_ORIGINAL = 4;
        // 居中裁剪
        int SCREEN_SCALE_CENTER_CROP = 5;
    }
}
