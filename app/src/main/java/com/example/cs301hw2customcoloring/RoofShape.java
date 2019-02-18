package com.example.cs301hw2customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class RoofShape extends HouseShape {
    private int r,g,b;

    private float leftX = 500, leftY = 400;
    private float topX = 750, topY = 100;
    private float rightX = 1000, rightY = 400;

    protected String id = "The Roof";

    public RoofShape() {
        /* default color is maroon */
        r = 128;
        g = 0;
        b = 0;
    }

    public String getId(){
        return id;
    }

    public int getLowerX(){
        return (int) leftX;
    }

    public int getUpperX(){
        return (int) rightX;
    }

    public int getLowerY(){
        return (int) topY;
    }
    public int getUpperY(){
        return (int) leftY;
    }

    public void Draw(Canvas canvas){
        Paint roofColor = new Paint();
        roofColor.setColor(Color.rgb(r,g,b));
        roofColor.setStyle(Paint.Style.FILL);

        Path triangle = new Path();
        triangle.moveTo(leftX,leftY);
        triangle.lineTo(topX,topY);
        triangle.lineTo(rightX,rightY);
        triangle.lineTo(leftX,leftY);
        triangle.close();

        canvas.drawPath(triangle,roofColor);
    }
}

/*
External Citation
    Date: 2/14/19
    Problem: I didn't know how to draw a triangle.
    Resource:
https://stackoverflow.com/questions/3501126/how-to
-draw-a-filled-triangle-in-android-canvas
 */
