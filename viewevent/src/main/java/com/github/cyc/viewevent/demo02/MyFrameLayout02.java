package com.github.cyc.viewevent.demo02;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import com.github.cyc.viewevent.utils.Utils;

/**
 * Created by cyc on 2017/7/14.
 */

public class MyFrameLayout02 extends FrameLayout {
    private static final String TAG = "MyFrameLayout02";

    public MyFrameLayout02(Context context) {
        super(context);
    }

    public MyFrameLayout02(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG, "dispatchTouchEvent(), " + Utils.getActionString(event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean intercepted;
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                intercepted = false;
                break;

            case MotionEvent.ACTION_MOVE:
                intercepted = true;
                break;

            case MotionEvent.ACTION_UP:
                intercepted = false;
                break;

            default:
                intercepted = super.onInterceptTouchEvent(event);
                break;
        }
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
