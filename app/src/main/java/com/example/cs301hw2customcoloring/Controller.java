package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * Controller class is a class that controls all of
 * the changes that happens to the layout when a
 * user does something. It implements
 * OnTouchListener and SeekBarListener.
 */
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.rgb;

public class Controller implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    /* All the Layout View objects */
    private SeekBar redSeekBar = null;
    private SeekBar blueSeekBar = null;
    private SeekBar greenSeekBar = null;
    private TextView currentElement = null;
    private DrawingView mainSurfaceView = null;
    private TextView redIntensity = null;
    private TextView greenIntensity = null;
    private TextView blueIntensity = null;

    /* A HouseShape Object used in the OnTouch Method */
    private HouseShape myShape = null;

    /* A List of the shapes in the Drawing View Class */
    ArrayList<HouseShape> houseParts = new ArrayList<>();

    /*The R,G,B values and their string versions */
    int redVal, greenVal, blueVal;
    String redValString, blueValString, greenValString;

    /*The constructor that takes in all the views from the Main Activity Class */
    public Controller(SeekBar initRedSeekBar, SeekBar initBlueSeekBar, SeekBar initGreenSeekBar,
                       TextView initCurrentElement, DrawingView initSurfaceView, TextView redText,
                       TextView greenText, TextView blueText){
        redSeekBar = initRedSeekBar;
        blueSeekBar = initBlueSeekBar;
        greenSeekBar = initGreenSeekBar;
        currentElement = initCurrentElement;
        mainSurfaceView = initSurfaceView;
        redIntensity = redText;
        blueIntensity = blueText;
        greenIntensity = greenText;
        houseParts = mainSurfaceView.getArrayList();
    }



    public boolean onTouch(View v, MotionEvent event) {
        int xTouch = (int) event.getX();
        int yTouch = (int) event.getY();

        /*If the touch is within the bounds a Shape, the seek
        bars will be set to the colors of that shape and the
        Shape name will be set to the current element text
        view
         */
        for(HouseShape s : houseParts ){
            if(xTouch >= s.getLowerX() && xTouch <= s.getUpperX() &&
                yTouch >= s.getLowerY() && yTouch <= s.getUpperY()){
                if(s == houseParts.get(0)){
                    myShape = houseParts.get(0);
                    currentElement.setText(s.getId());
                    redVal = Color.red(s.getPaint().getColor());
                    blueVal = Color.blue(s.getPaint().getColor());
                    greenVal = Color.green(s.getPaint().getColor());
                    redSeekBar.setProgress(redVal);
                    greenSeekBar.setProgress(greenVal);
                    blueSeekBar.setProgress(blueVal);
                    redValString = Integer.toString(redVal);
                    greenValString = Integer.toString(greenVal);
                    blueValString = Integer.toString(blueVal);
                    redIntensity.setText(redValString);
                    greenIntensity.setText(greenValString);
                    blueIntensity.setText(blueValString);

                }
                else if(s == houseParts.get(1)){
                    myShape = houseParts.get(1);
                    currentElement.setText(s.getId());
                    redVal = Color.red(s.getPaint().getColor());
                    blueVal = Color.blue(s.getPaint().getColor());
                    greenVal = Color.green(s.getPaint().getColor());
                    redSeekBar.setProgress(redVal);
                    greenSeekBar.setProgress(greenVal);
                    blueSeekBar.setProgress(blueVal);
                    redValString = Integer.toString(redVal);
                    greenValString = Integer.toString(greenVal);
                    blueValString = Integer.toString(blueVal);
                    redIntensity.setText(redValString);
                    greenIntensity.setText(greenValString);
                    blueIntensity.setText(blueValString);

                }
                else if(s == houseParts.get(2)){
                    myShape = houseParts.get(2);
                    currentElement.setText(s.getId());
                    redVal = Color.red(s.getPaint().getColor());
                    blueVal = Color.blue(s.getPaint().getColor());
                    greenVal = Color.green(s.getPaint().getColor());
                    redSeekBar.setProgress(redVal);
                    greenSeekBar.setProgress(greenVal);
                    blueSeekBar.setProgress(blueVal);
                    redValString = Integer.toString(redVal);
                    greenValString = Integer.toString(greenVal);
                    blueValString = Integer.toString(blueVal);
                    redIntensity.setText(redValString);
                    greenIntensity.setText(greenValString);
                    blueIntensity.setText(blueValString);

                }
                else if (s == houseParts.get(3)){
                    myShape = houseParts.get(3);
                    currentElement.setText(s.getId());
                    redVal = Color.red(s.getPaint().getColor());
                    blueVal = Color.blue(s.getPaint().getColor());
                    greenVal = Color.green(s.getPaint().getColor());
                    redSeekBar.setProgress(redVal);
                    greenSeekBar.setProgress(greenVal);
                    blueSeekBar.setProgress(blueVal);
                    redValString = Integer.toString(redVal);
                    greenValString = Integer.toString(greenVal);
                    blueValString = Integer.toString(blueVal);
                    redIntensity.setText(redValString);
                    greenIntensity.setText(greenValString);
                    blueIntensity.setText(blueValString);

                }
                else if (s == houseParts.get(4)){
                    myShape = houseParts.get(4);
                    currentElement.setText(s.getId());
                    redVal = Color.red(s.getPaint().getColor());
                    blueVal = Color.blue(s.getPaint().getColor());
                    greenVal = Color.green(s.getPaint().getColor());
                    redSeekBar.setProgress(redVal);
                    greenSeekBar.setProgress(greenVal);
                    blueSeekBar.setProgress(blueVal);
                    redValString = Integer.toString(redVal);
                    greenValString = Integer.toString(greenVal);
                    blueValString = Integer.toString(blueVal);
                    redIntensity.setText(redValString);
                    greenIntensity.setText(greenValString);
                    blueIntensity.setText(blueValString);

                }
                else if (s == houseParts.get(5)){
                    myShape = houseParts.get(5);
                    currentElement.setText(s.getId());
                    redVal = Color.red(s.getPaint().getColor());
                    blueVal = Color.blue(s.getPaint().getColor());
                    greenVal = Color.green(s.getPaint().getColor());
                    redSeekBar.setProgress(redVal);
                    greenSeekBar.setProgress(greenVal);
                    blueSeekBar.setProgress(blueVal);
                    redValString = Integer.toString(redVal);
                    greenValString = Integer.toString(greenVal);
                    blueValString = Integer.toString(blueVal);
                    redIntensity.setText(redValString);
                    greenIntensity.setText(greenValString);
                    blueIntensity.setText(blueValString);

                }
            }
        }
        return true;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        /* Depending of what Shape is selected, the rgb seek bars
        will change their respective color values based on the
        progress and set that Shape's color.
         */
        if (myShape == mainSurfaceView.chimney && fromUser) {
            if (seekBar == redSeekBar) {
                redVal = progress;
                String redProgress = Integer.toString(progress);
                redIntensity.setText(redProgress);
            } else if (seekBar == greenSeekBar) {
                greenVal = progress;
                String greenProgress = Integer.toString(progress);
                greenIntensity.setText(greenProgress);
            } else if (seekBar == blueSeekBar) {
                blueVal = progress;
                String blueProgress = Integer.toString(progress);
                blueIntensity.setText(blueProgress);
            }
            mainSurfaceView.chimney.chimneyColor.setColor(rgb(redVal,greenVal,blueVal));
            mainSurfaceView.invalidate();
        }
        else if (myShape == mainSurfaceView.base && fromUser) {
            if (seekBar == redSeekBar) {
                redVal = progress;
                String redProgress = Integer.toString(progress);
                redIntensity.setText(redProgress);
            } else if (seekBar == greenSeekBar) {
                greenVal = progress;
                String greenProgress = Integer.toString(progress);
                greenIntensity.setText(greenProgress);
            } else if (seekBar == blueSeekBar) {
                blueVal = progress;
                String blueProgress = Integer.toString(progress);
                blueIntensity.setText(blueProgress);
            }
            mainSurfaceView.base.houseColor.setColor(rgb(redVal,greenVal,blueVal));
            mainSurfaceView.invalidate();
        }
        else if (myShape == mainSurfaceView.roof && fromUser) {
            if (seekBar == redSeekBar) {
                redVal = progress;
                String redProgress = Integer.toString(progress);
                redIntensity.setText(redProgress);
            } else if (seekBar == greenSeekBar) {
                greenVal = progress;
                String greenProgress = Integer.toString(progress);
                greenIntensity.setText(greenProgress);
            } else if (seekBar == blueSeekBar) {
                blueVal = progress;
                String blueProgress = Integer.toString(progress);
                blueIntensity.setText(blueProgress);
            }
            mainSurfaceView.roof.roofColor.setColor(rgb(redVal,greenVal,blueVal));
            mainSurfaceView.invalidate();
        }
        else if (myShape == mainSurfaceView.leftWindow && fromUser) {
            if (seekBar == redSeekBar) {
                redVal = progress;
                String redProgress = Integer.toString(progress);
                redIntensity.setText(redProgress);
            } else if (seekBar == greenSeekBar) {
                greenVal = progress;
                String greenProgress = Integer.toString(progress);
                greenIntensity.setText(greenProgress);
            } else if (seekBar == blueSeekBar) {
                blueVal = progress;
                String blueProgress = Integer.toString(progress);
                blueIntensity.setText(blueProgress);
            }
            mainSurfaceView.leftWindow.windowColor.setColor(rgb(redVal,greenVal,blueVal));
            mainSurfaceView.invalidate();
        }
        else if (myShape == mainSurfaceView.rightWindow & fromUser) {
            if (seekBar == redSeekBar) {
                redVal = progress;
                String redProgress = Integer.toString(progress);
                redIntensity.setText(redProgress);
            } else if (seekBar == greenSeekBar) {
                greenVal = progress;
                String greenProgress = Integer.toString(progress);
                greenIntensity.setText(greenProgress);
            } else if (seekBar == blueSeekBar) {
                blueVal = progress;
                String blueProgress = Integer.toString(progress);
                blueIntensity.setText(blueProgress);
            }
            mainSurfaceView.rightWindow.windowColor.setColor(rgb(redVal,greenVal,blueVal));
            mainSurfaceView.invalidate();
        }
        else if (myShape == mainSurfaceView.door && fromUser) {
            if (seekBar == redSeekBar) {
                redVal = progress;
                String redProgress = Integer.toString(progress);
                redIntensity.setText(redProgress);
            } else if (seekBar == greenSeekBar) {
                greenVal = progress;
                String greenProgress = Integer.toString(progress);
                greenIntensity.setText(greenProgress);
            } else if (seekBar == blueSeekBar) {
                blueVal = progress;
                String blueProgress = Integer.toString(progress);
                blueIntensity.setText(blueProgress);
            }
            mainSurfaceView.door.doorColor.setColor(rgb(redVal,greenVal,blueVal));
            mainSurfaceView.invalidate();
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
    /*
    External Citation:
    Date: 2/20/19
    Problem: I had trouble changing the colors
    Gabe and Justin helped me figure it out
     */
}
