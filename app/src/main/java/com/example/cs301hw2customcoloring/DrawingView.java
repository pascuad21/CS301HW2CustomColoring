package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * DrawingView is a custom surface view that displays
 * the drawing and the view that the onTouchListner is
 * being used on.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;
import java.util.ArrayList;

public class DrawingView extends SurfaceView{

    /* Initializes all the parts of the Drawing and creates a list of them */
  protected ArrayList<HouseShape> houseParts = new ArrayList<HouseShape>();
  protected ChimneyShape chimney = new ChimneyShape();
  protected HouseShape base = new HouseShape();
  protected RoofShape roof = new RoofShape();
  protected WindowShape1 leftWindow = new WindowShape1();
  protected WindowShape2 rightWindow = new WindowShape2();
  protected DoorShape door = new DoorShape();

  /*Default methods for the Surface View Class */
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

    /* Draws each specific shape and adds each part to the List */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        chimney.Draw(canvas);
        houseParts.add(chimney);
        base.Draw(canvas);
        houseParts.add(base);
        roof.Draw(canvas);
        houseParts.add(roof);
        leftWindow.Draw(canvas);
        houseParts.add(leftWindow);
        rightWindow.Draw(canvas);
        houseParts.add(rightWindow);
        door.Draw(canvas);
        houseParts.add(door);

    }

}
