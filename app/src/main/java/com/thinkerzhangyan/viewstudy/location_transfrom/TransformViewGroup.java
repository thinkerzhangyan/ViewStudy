package com.thinkerzhangyan.viewstudy.location_transfrom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class TransformViewGroup extends LinearLayout {
    private View mFirstView;

    public TransformViewGroup(Context context) {
        super(context);
    }

    public TransformViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TransformViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TransformViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mFirstView = getChildAt(0);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean handled = false;
        
        float x = ev.getX();
        float y = ev.getY();

        System.out.println("父控件：x = " + x + ", y = " + y);

        if(x < mFirstView.getLeft() || x > mFirstView.getRight()) return true;
        if(y < mFirstView.getTop() || y > mFirstView.getBottom()) return true;

        int offetX = getScrollX() - mFirstView.getLeft();
        int offetY = getScrollY() - mFirstView.getTop();
        
        ev.offsetLocation(offetX, offetY);
        
        handled = mFirstView.dispatchTouchEvent(ev);
        
        ev.offsetLocation(-offetX, -offetY);

        return handled;
    }
}