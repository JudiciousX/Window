package com.example.window;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WindowManager.LayoutParams windowParams = new WindowManager.LayoutParams();
        windowParams.flags = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        Button view = new Button(this);
        getWindowManager().addView(view, windowParams);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
}