package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * HouseShape is the parent class of all
 * the other shapes and draws the base
 * square of the house.
 */
import android.graphics.Canvas;
import android.graphics.Paint;

import static android.graphics.Color.rgb;

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

    Paint houseColor = new Paint();

    protected String id = "Main Body";

    public HouseShape(){
        /* default color is tan */
        r = 222;
        g = 184;
        b = 135;
        houseColor.setColor(rgb(r,g,b));
    }

    public String getId(){
        return id;
    }
    /* these getter methods are used to determine
    the bounds in the onTouch method in Controller
     */
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

    public Paint getPaint(){
        return  houseColor;
    }

    public void Draw(Canvas canvas){
        canvas.drawRect(left,top,right,bottom,houseColor);
    }



}
