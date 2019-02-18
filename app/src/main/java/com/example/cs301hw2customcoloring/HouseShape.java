package com.example.cs301hw2customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class  HouseShape{
    /* rgb values */
    private int r;
    private int g;
    private int b;

    /* the position of the square */
    private float left = 500;
    private float top = 400;
    private float right = 1000;
    private float bottom = 1000;

    protected String id = "Main Body";

    public HouseShape(){
        /* default color is tan */
        r = 222;
        g = 184;
        b = 135;
    }

    public String getId(){
        return id;
    }

    public int getLowerX(){
        return (int) left;
    }

    public int getUpperX(){
        return (int) right;
    }

    public int getLowerY(){
        return (int) top;
    }
    public int getUpperY(){
        return (int) bottom;
    }
    public void Draw(Canvas canvas){
        Paint houseColor = new Paint();
        houseColor.setColor(Color.rgb(r,g,b));
        canvas.drawRect(left,top,right,bottom,houseColor);
    }



}
