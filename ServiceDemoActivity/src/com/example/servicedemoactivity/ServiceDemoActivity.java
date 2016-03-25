package com.example.servicedemoactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class ServiceDemoActivity extends Activity {
	
	Button bindBtn;
	Button startBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        bindBtn = (Button)findViewById(R.id.bindBtn);
        startBtn = (Button)findViewById(R.id.startBtn);

    }
}