package com.example.nurmemet.touchdispatchexample;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by nurmemet on 2016/10/24.
 */

public class TestImageView extends ImageView {
    public TestImageView(Context context) {
        super(context);
    }

    public TestImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        final int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            default:
                break;
            case MotionEvent.ACTION_DOWN:
                System.out.println("TestImageView_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                System.out.println("TestImageView_ACTION_POINTER_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                //System.out.println("ACTION_MOVE");
                break;
            case MotionEvent.ACTION_POINTER_UP:
                System.out.println("TestImageView_ACTION_POINTER_UP");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("TestImageView_ACTION_UP");
                break;
        }
        return true;
    }
}
