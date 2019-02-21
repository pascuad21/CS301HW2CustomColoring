package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * DoorShape is a subclass of HouseShape
 * that draws the brown door.
 */
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

import static android.graphics.Color.rgb;

public class DoorShape extends HouseShape {
    private int r,g,b;

    /*the position of the Door */
    private float topLeftX = 680 , topLeftY =700 ;
    private float topRightX= 810 , topRightY =700 ;
    private float botRightX = 810 , botRightY =950 ;
    private float botLeftX = 680, botLeftY = 950 ;

    protected String id = "the Door";

    Paint doorColor = new Paint();

    public String getId(){ return id; }

    /* these getter methods are used to determine
      the bounds in the onTouch method in Controller
       */
    public int getLowerX(){ return (int) topLeftX; }
    public int getUpperX(){ return (int) topRightX; }
    public int getLowerY(){ return (int) topRightY; }
    public int getUpperY(){ return (int) botRightY; }

    public DoorShape(){
        /*Default color is dark brown */
        r = 102;
        g = 51;
        b = 0;
        doorColor.setColor(rgb(r,g,b));
    }

    public Paint getPaint(){
        return  doorColor;
    }

    public void Draw(Canvas canvas){
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
