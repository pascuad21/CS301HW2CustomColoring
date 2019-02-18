package com.example.cs301hw2customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class ChimneyShape extends HouseShape {
    private int r,g,b;

    private float topLeftX = 825 , topLeftY = 150;
    private float topRightX = 875 , topRightY = 150;
    private float botRightX = 875 , botRightY = 300;
    private float botLeftX = 825, botLeftY = 300 ;

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
    public ChimneyShape(){
        /*Default color is light grey/gray */
        r = 160;
        b = 160;
        g = 160;
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
