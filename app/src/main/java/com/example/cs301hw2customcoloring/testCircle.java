package com.example.cs301hw2customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class testCircle {
    private int r = (int)(Math.random()*256);
    private int g = (int)(Math.random()*256);
    private int b = (int)(Math.random()*256);

    public testCircle(Canvas canvas, int x, int y){
        Paint randomColor = new Paint();
        randomColor.setColor(Color.rgb(r,g,b));
        canvas.drawCircle(x,y,100,randomColor);
    }
}
