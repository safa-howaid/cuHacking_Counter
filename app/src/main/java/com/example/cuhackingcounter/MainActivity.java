package com.example.cuhackingcounter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide the title bar
        getSupportActionBar().hide();

        //Hide the notification bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
    }

    /**
     * A method that executes when btnNo is clicked.
     * Starts BadDecision.java
     */
    public void onBtnNoClick(View view){
        Intent intent = new Intent(this, BadDecision.class);
        startActivity(intent);
    }

    /**
     * A method that executes when btnYes is clicked.
     * Starts Counter.java
     */
    public void onBtnYesClick(View view){
        Intent intent = new Intent(this, Counter.class);
        startActivity(intent);
    }


}
