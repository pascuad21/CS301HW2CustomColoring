package com.example.cs301hw2customcoloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class DoorShape extends HouseShape {
    private int r,g,b;

    private float topLeftX = 680 , topLeftY =700 ;
    private float topRightX= 810 , topRightY =700 ;
    private float botRightX = 810 , botRightY =950 ;
    private float botLeftX = 680, botLeftY = 950 ;

    protected String id = "the Door";

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

    public DoorShape(){
        /*Default color is dark brown */
        r = 102;
        g = 51;
        b = 0;
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
        Paint doorColor = new Paint();
        doorColor.setColor(Color.rgb(r,g,b));
        doorColor.setStyle(Paint.Style.FILL);

        Path door = new Path();
        door.moveTo(topLeftX,topLeftY);
        door.lineTo(topRightX,topRightY);
        door.lineTo(botRightX,botRightY);
        door.lineTo(botLeftX,botLeftY);
        door.close();

        Paint doorKnob = new Paint();
        doorKnob.setColor(Color.YELLOW);

        canvas.drawPath(door,doorColor);
        canvas.drawCircle(790,810,10,doorKnob);
    }
}
