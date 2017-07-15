package com.github.cyc.viewevent.demo01;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.github.cyc.viewevent.utils.Utils;

/**
 * Created by cyc on 2017/7/14.
 */

public class MyLinearLayout01 extends LinearLayout {
    private static final String TAG = "MyLinearLayout01";

    public MyLinearLayout01(Context context) {
        super(context);
    }

    public MyLinearLayout01(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG, "dispatchTouchEvent(), " + Utils.getActionString(event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean intercepted = super.onInterceptTouchEvent(event);
        Log.i(TAG, "onInterceptTouchEvent(), " + Utils.getActionString(event) + ", intercepted = " + intercepted);
        return intercepted;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean consumed = super.onTouchEvent(event);
        Log.i(TAG, "onTouchEvent(), " + Utils.getActionString(event) + ", consumed = " + consumed);
        return consumed;
    }
}
