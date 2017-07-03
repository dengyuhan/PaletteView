package com.dyhdyh.view.paletteview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * author  dengyuhan
 * created 2017/5/31 20:37
 */
public class ColorRingView extends View{
    private int[] mGradientColors = ColorConstant.DEFAULT_GRADIENT_COLORS;
    private Paint mPaint;

    public ColorRingView(Context context) {
        this(context,null);
    }

    public ColorRingView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ColorRingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //SweepGradient RadialGradient
        Shader mGradient = new SweepGradient(0, 0,mGradientColors,null);
        mPaint.setShader(mGradient);
        canvas.drawCircle(0,0,getWidth(),mPaint);
    }
}
