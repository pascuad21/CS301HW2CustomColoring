package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * ChimneyShape is a subclass of HouseShape
 * that draws the grey chimney
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

import static android.graphics.Color.rgb;

public class ChimneyShape extends HouseShape {
    private int r,g,b;

    /*Position of the Chimney */
    private float topLeftX = 825 , topLeftY = 150;
    private float topRightX = 875 , topRightY = 150;
    private float botRightX = 875 , botRightY = 300;
    private float botLeftX = 825, botLeftY = 300 ;

    protected String id = "The Chimney";

    Paint chimneyColor = new Paint();

    public String getId(){
        return id;
    }

    /* these getter methods are used to determine
      the bounds in the onTouch method in Controller
       */
    public int getLowerX(){ return (int) topLeftX; }
    public int getUpperX(){ return (int) topRightX; }
    public int getLowerY(){ return (int) topRightY ; }
    public int getUpperY(){ return (int) botRightY; }

    public ChimneyShape(){
        /*Default color is light grey/gray */
        r = 160;
        b = 160;
        g = 160;
        chimneyColor.setColor(rgb(r,g,b));
    }

    public Paint getPaint(){
        return  chimneyColor;
    }

    public void Draw(Canvas canvas){
        chimneyColor.setStyle(Paint.Style.FILL);

        Path window = new Path();
        window.moveTo(topLeftX,topLeftY);
        window.lineTo(topRightX,topRightY);
        window.lineTo(botRightX,botRightY);
        window.lineTo(botLeftX,botLeftY);
        window.close();

        canvas.drawPath(window,chimneyColor);

    }
}
