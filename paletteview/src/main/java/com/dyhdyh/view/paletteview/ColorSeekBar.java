package com.dyhdyh.view.paletteview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;

/**
 * author  dengyuhan
 * created 2017/5/31 20:28
 */
public class ColorSeekBar extends AppCompatSeekBar {
    private int[] mGradientColors = ColorConstant.DEFAULT_GRADIENT_COLORS;
    private LinearGradient mGradient;

    public ColorSeekBar(Context context) {
        super(context);
    }

    public ColorSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColorSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mGradient = new LinearGradient(0, 0, getWidth(), 0, mGradientColors, null,
                Shader.TileMode.CLAMP);
        GradientDrawable drawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, mGradientColors);
        setProgressDrawable(drawable);
    }
}
