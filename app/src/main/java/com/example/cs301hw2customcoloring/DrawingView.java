package com.example.cs301hw2customcoloring;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.ArrayList;

/**
 * @Author: Dylan Pascua
 * @Version:  2/11/2019
 */
public class DrawingView extends SurfaceView{
  private ArrayList<HouseShape> houseParts = new ArrayList<HouseShape>();

    public DrawingView(Context context) {
        super(context);
        init();
    }
    public DrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
        init();
    }

    public DrawingView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
        init();
    }

    private void init() {
        setWillNotDraw(false);
    }

    public ArrayList getArrayList(){
        return houseParts;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        ChimneyShape chimney = new ChimneyShape();
        chimney.Draw(canvas);
        houseParts.add(chimney);
        HouseShape base = new HouseShape();
        base.Draw(canvas);
        houseParts.add(base);
        RoofShape roof = new RoofShape();
        roof.Draw(canvas);
        houseParts.add(roof);
        WindowShape1 leftWindow = new WindowShape1();
        leftWindow.Draw(canvas);
        houseParts.add(leftWindow);
        WindowShape2 rightWindow = new WindowShape2();
        rightWindow.Draw(canvas);
        houseParts.add(rightWindow);
        DoorShape door = new DoorShape();
        door.Draw(canvas);
        houseParts.add(door);

        this.invalidate();

    }

}
