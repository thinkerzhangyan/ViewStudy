package com.thinkerzhangyan.viewstudy.location_transfrom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class TransformView extends TextView {


    public TransformView(Context context) {
        super(context);
    }

    public TransformView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TransformView(Context context,@Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TransformView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean handled = false;
        float x = ev.getX();
        float y = ev.getY();
        System.out.println("子控件：x = " + x + ", y = " + y);
        return super.dispatchTouchEvent(ev);
    }
}