package com.github.cyc.viewevent.utils;

import android.view.MotionEvent;

/**
 * Created by cyc on 2017/7/14.
 */

public class Utils {

    public static String getActionString(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                return "ACTION_DOWN";

            case MotionEvent.ACTION_MOVE:
                return "ACTION_MOVE";

            case MotionEvent.ACTION_UP:
                return "ACTION_UP";

            case MotionEvent.ACTION_CANCEL:
                return "ACTION_CANCEL";

            default:
                return "ACTION_OTHER";
        }
    }
}
