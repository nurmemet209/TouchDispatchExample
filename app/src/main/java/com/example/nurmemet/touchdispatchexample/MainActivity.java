package com.example.nurmemet.touchdispatchexample;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        final int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            default:
                break;
            case MotionEvent.ACTION_DOWN:
                System.out.println("MainActivity_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                System.out.println("MainActivity_ACTION_POINTER_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                //System.out.println("ACTION_MOVE");
                break;
            case MotionEvent.ACTION_POINTER_UP:
                System.out.println("MainActivity_ACTION_POINTER_UP");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("MainActivity_ACTION_UP");
                break;
        }
        return false;
    }
}
