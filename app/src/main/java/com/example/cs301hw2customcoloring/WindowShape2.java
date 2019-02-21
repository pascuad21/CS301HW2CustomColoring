package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * WindowShape2 is a subclass of HouseShape
 * that draws the right window of the House
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

import static android.graphics.Color.rgb;

public class WindowShape2 extends HouseShape {
    private int r,g,b;

    /*Position of the window in DrawingView's plane */
    private float topLeftX = 800 , topLeftY = 430;
    private float topRightX= 950 , topRightY = 430;
    private float botRightX = 950 , botRightY = 600;
    private float botLeftX = 800, botLeftY = 600 ;

    protected String id = "Right Window";

    Paint windowColor = new Paint();

    public String getId(){ return id; }

    /* these getter methods are used to determine
      the bounds in the onTouch method in Controller
       */
    public int getLowerX(){ return (int) topLeftX; }
    public int getUpperX(){ return (int) topRightX; }
    public int getLowerY(){ return (int) topRightY; }
    public int getUpperY(){ return (int) botRightY; }

    public WindowShape2(){
        /*Default color is light blue */
        r = 153;
        g = 255;
        b = 255;
        windowColor.setColor(rgb(r,g,b));
    }
    public Paint getPaint(){
        return  windowColor;
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
