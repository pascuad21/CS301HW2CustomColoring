package com.example.cs301hw2customcoloring;
/**
 * @Author: Dylan Pascua
 * @Version: 2/11/19
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes View objects
        SurfaceView thePicture = findViewById(R.id.drawingSurfaceView);
        SeekBar redSeekBar = findViewById(R.id.redSeekBar);
        SeekBar blueSeekBar = findViewById(R.id.blueSeekBar);
        SeekBar greenSeekBar = findViewById(R.id.greenSeekBar);

    }
}
