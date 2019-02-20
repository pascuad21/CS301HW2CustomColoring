package com.example.cs301hw2customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class WindowShape2 extends HouseShape {
    private int r,g,b;

    private float topLeftX = 800 , topLeftY = 430;
    private float topRightX= 950 , topRightY = 430;
    private float botRightX = 950 , botRightY = 600;
    private float botLeftX = 800, botLeftY = 600 ;

    protected String id = "Right Window";

    public String getId(){
        return id;
    }

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

    public WindowShape2(){
        /*Default color is light blue */
        r = 153;
        g = 255;
        b = 255;
    }
    public void setR(int value){
        r = value;
    }

    public  void setG(int value){
        g = value;
    }

    public void setB(int value){
        b = value;
    }

    public void Draw(Canvas canvas){
        Paint windowColor = new Paint();
        windowColor.setColor(Color.rgb(r,g,b));
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
