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
  private ArrayList<houseShape> houseParts = new ArrayList<houseShape>();

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
        houseShape base = new houseShape();
        base.Draw(canvas);
        houseParts.add(base);
        roofShape roof = new roofShape();
        roof.Draw(canvas);
        houseParts.add(roof);
        windowShape1 leftWindow = new windowShape1();
        leftWindow.Draw(canvas);
        houseParts.add(leftWindow);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int xTouch = (int) event.getX();
        int yTouch = (int) event.getY();

        this.invalidate();
        return true;
    }
}
