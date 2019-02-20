package com.example.cs301hw2customcoloring;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Controller implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    private SeekBar redSeekBar = null;
    private SeekBar blueSeekBar = null;
    private SeekBar greenSeekBar = null;
    private TextView currentElement = null;
    private DrawingView mainSurfaceView = null;
    private TextView redIntensity = null;
    private TextView greenIntensity = null;
    private TextView blueIntensity = null;
    ArrayList<HouseShape> houseParts = new ArrayList<>();

    public  Controller(SeekBar initRedSeekBar, SeekBar initBlueSeekBar, SeekBar initGreenSeekBar,
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

        for(HouseShape s : houseParts ){
            if(xTouch >= s.getLowerX() && xTouch <= s.getUpperX() &&
                yTouch >= s.getLowerY() && yTouch <= s.getUpperY()){
                currentElement.setText(s.getId());
                s.setR(redSeekBar.getProgress());
                s.setB(blueSeekBar.getProgress());
                s.setG(greenSeekBar.getProgress());
            }
        }
        return true;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(seekBar == redSeekBar){
            String redProgress = Integer.toString(progress);
            redIntensity.setText(redProgress);
        }
        else if (seekBar == greenSeekBar){
            String greenProgress = Integer.toString(progress);
            greenIntensity.setText(greenProgress);
        }
        else if (seekBar == blueSeekBar){
            String blueProgress = Integer.toString(progress);
            blueIntensity.setText(blueProgress);
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
