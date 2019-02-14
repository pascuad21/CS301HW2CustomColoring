package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/11/19
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes View objects
        //SurfaceView thePicture = findViewById(R.id.drawingSurfaceView);
        SeekBar redSeekBar = findViewById(R.id.redSeekBar);
        SeekBar blueSeekBar = findViewById(R.id.blueSeekBar);
        SeekBar greenSeekBar = findViewById(R.id.greenSeekBar);


        redSeekBar.setOnSeekBarChangeListener(new seekRedBarListener());
        blueSeekBar.setOnSeekBarChangeListener(new seekBlueBarListener());
        greenSeekBar.setOnSeekBarChangeListener(new seekGreenBarListener());

    }
    // Seek bar listener classes that changes the display value for each respective seek bar
    private class seekRedBarListener implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            String redIntensity = Integer.toString(progress);
            TextView redValueText = findViewById(R.id.redNumValue);
            redValueText.setText(redIntensity);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class seekBlueBarListener implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            String blueIntensity = Integer.toString(progress);
            TextView blueValueText = findViewById(R.id.blueNumValue);
            blueValueText.setText(blueIntensity);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class seekGreenBarListener implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            String greenIntensity = Integer.toString(progress);
            TextView greenValueText = findViewById(R.id.greenNumValue);
            greenValueText.setText(greenIntensity);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }


}
