package com.github.cyc.viewevent.demo02;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

import com.github.cyc.viewevent.utils.Utils;

/**
 * Created by cyc on 2017/7/14.
 */

public class MyButton02 extends Button {
    private static final String TAG = "MyButton02";

    public MyButton02(Context context) {
        super(context);
    }

    public MyButton02(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG, "dispatchTouchEvent(), " + Utils.getActionString(event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean consumed = super.onTouchEvent(event);
        Log.i(TAG, "onTouchEvent(), " + Utils.getActionString(event) + ", consumed = " + consumed);
        return consumed;
    }
}
