package com.example.cs301hw2customcoloring;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;

/**
 * @Author: Dylan Pascua
 * @Version:  2/11/2019
 */
public class drawingView extends SurfaceView {
    public drawingView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {

    }
}
