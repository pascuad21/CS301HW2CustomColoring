package com.example.cs301hw2customcoloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

/**
 * @Author: Dylan Pascua
 * @Version:  2/11/2019
 */
public class drawingView extends SurfaceView implements View.OnTouchListener {

    public drawingView(Context context) {
        super(context);
        init();
    }


    private void init() {
        setWillNotDraw(false);
        this.setOnTouchListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint testColor = new Paint(Color.BLUE);
        canvas.drawCircle(500,500,500,testColor);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int xTouch = (int)event.getX();
        int yTouch = (int) event.getY();

        return false;
    }
}
