package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * WindowShape1 is a subclass of HouseShape
 * that draws the left window of the House
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

import static android.graphics.Color.rgb;

public class WindowShape1 extends HouseShape {
    private int r,g,b;

    /*Position of the Window in the  DrawingView's plane*/
    private float topLeftX = 550 , topLeftY = 430;
    private float topRightX= 700 , topRightY = 430;
    private float botRightX = 700 , botRightY = 600;
    private float botLeftX = 550, botLeftY = 600 ;

    protected String id = "Left Window";

    Paint windowColor = new Paint();

    public WindowShape1(){
        /*Default color is light blue */
        r = 153;
        g = 255;
        b = 255;
        windowColor.setColor(rgb(r,g,b));
    }

    public Paint getPaint(){
        return  windowColor;
    }

    public String getId(){
        return id;
    }

    /* these getter methods are used to determine
  the bounds in the onTouch method in Controller
   */
    public int getLowerX(){
        return (int) topLeftX;
    }
    public int getUpperX(){
        return (int) topRightX;
    }
    public int getLowerY(){
        return (int) topRightY;
    }
    public int getUpperY(){
        return (int) botRightY;
    }

    public void Draw(Canvas canvas){
        windowColor.setStyle(Paint.Style.FILL);

        Path window = new Path();
        window.moveTo(topLeftX,topLeftY);
        window.lineTo(topRightX,topRightY);
        window.lineTo(botRightX,botRightY);
        window.lineTo(botLeftX,botLeftY);
        window.close();

        canvas.drawPath(window,windowColor);

    }
}

