package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * RoofShape is a subclass of HouseShape that
 * draws the red roof
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

import static android.graphics.Color.rgb;

public class RoofShape extends HouseShape {
    private int r,g,b;

    /*The position of the roof in the DrawingView's
    plane.
     */
    private float leftX = 500, leftY = 400;
    private float topX = 750, topY = 100;
    private float rightX = 1000, rightY = 400;

    protected String id = "The Roof";

    Paint roofColor = new Paint();

    public RoofShape() {
        /* default color is maroon */
        r = 128;
        g = 0;
        b = 0;
        roofColor.setColor(rgb(r,g,b));
    }
    public Paint getPaint(){
        return  roofColor;
    }

    public String getId(){
        return id;
    }

    /* these getter methods are used to determine
      the bounds in the onTouch method in Controller
       */
    public int getLowerX(){
        return (int) leftX;
    }

    public int getUpperX(){
        return (int) rightX;
    }

    public int getLowerY(){
        return (int) topY + 100; // to accommodate for the chimney
    }
    public int getUpperY(){
        return (int) leftY;
    }

    public void Draw(Canvas canvas){
        roofColor.setStyle(Paint.Style.FILL);

        /* this created the polygon using the
        path class. Which is just creating
        points using x & y values
         */
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
