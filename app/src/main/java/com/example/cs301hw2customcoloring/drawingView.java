package com.example.cs301hw2customcoloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;

/**
 * @Author: Dylan Pascua
 * @Version:  2/11/2019
 */
public class drawingView extends SurfaceView implements View.OnTouchListener {
    ArrayList<testCircle> circleList = new ArrayList<testCircle>();

    public drawingView(Context context) {
        super(context);
        init();
    }
    public drawingView(Context context, AttributeSet attrs){
        super(context, attrs);
        init();
    }

    public drawingView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
        init();
    }

    private void init() {
        setWillNotDraw(false);
        setOnTouchListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Paint testColor = new Paint();
//        testColor.setColor(Color.BLUE);
//        canvas.drawCircle(500,500,500,testColor);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int xTouch = (int) event.getX();
        int yTouch = (int) event.getY();

        testCircle theCircle = new testCircle();
        return false;
    }
}
