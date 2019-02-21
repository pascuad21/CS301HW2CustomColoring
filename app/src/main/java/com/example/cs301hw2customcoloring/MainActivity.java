package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/20/19
 *
 * The main class that initializes the layout
 * and it's controller.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes all the View objects
        TextView currentElement = findViewById(R.id.currentElementText);
        DrawingView mainPicture = findViewById(R.id.drawingSurfaceView);

        SeekBar redSeekBar = findViewById(R.id.redSeekBar);
        SeekBar blueSeekBar = findViewById(R.id.blueSeekBar);
        SeekBar greenSeekBar = findViewById(R.id.greenSeekBar);

        TextView redValueText = findViewById(R.id.redNumValue);
        TextView blueValueText = findViewById(R.id.blueNumValue);
        TextView greenValueText = findViewById(R.id.greenNumValue);

        Controller theController = new Controller(redSeekBar,blueSeekBar,greenSeekBar,
                currentElement, mainPicture, redValueText, greenValueText, blueValueText);

        //Sets all the listeners to the Controller Method
        redSeekBar.setOnSeekBarChangeListener(theController);
        greenSeekBar.setOnSeekBarChangeListener(theController);
        blueSeekBar.setOnSeekBarChangeListener(theController);
        mainPicture.setOnTouchListener(theController);

    }





}
