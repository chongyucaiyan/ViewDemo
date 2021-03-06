package com.github.cyc.viewevent.demo01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

import com.github.cyc.viewevent.R;
import com.github.cyc.viewevent.utils.Utils;

public class Demo01Activity extends AppCompatActivity {
    private static final String TAG = "Demo01Activity";

    public static void start(Context context) {
        Intent intent = new Intent(context, Demo01Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo01);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG, "dispatchTouchEvent(), " + Utils.getActionString(event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent(), " + Utils.getActionString(event));
        return super.onTouchEvent(event);
    }
}
