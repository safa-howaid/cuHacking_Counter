package com.example.cuhackingcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class Counter extends AppCompatActivity {

    private int count;
    private TextView counter;
    private Dialog popup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide the title bar
        getSupportActionBar().hide();

        //Hide the notification bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_counter);

        //TextView Object used to display the value of the counter on the screen
        counter = findViewById(R.id.counter);

        //An integer used to keep track of the value of the counter
        count = 0;

        //Dialog object used to display a popup message providing information about the application
        popup = new Dialog(this);

    }

    /**
     * A method that executes when btnIncrement is clicked.
     * Used to increment the value of int count by 1 and display it in TextView counter
     */
    public void onClickIncrement(View view){
        counter.setText(""+ (++count));
    }

    /**
     * A method that executes when btnDecrement is clicked.
     * Used to decrement the value of the counter by 1 and display it in TextView counter
     * Gives a warning and limits the counter from going under 0
     */
    public void onClickDecrement(View view){
        if (count == 0) {
            Toast.makeText(this, "Counter CANNOT go below zero!", Toast.LENGTH_SHORT).show();
        }
        else {
            counter.setText("" + (--count));
        }
    }

    /**
     * A method that executes when btnReset is clicked.
     * Used to set the value of counter to 0 and display it in TextView counter
     */
    public void onClickReset(View view){
        count = 0;
        counter.setText(""+ count);
    }

    /**
     * A method that executes when infoIcon is clicked.
     * Shows the dialogue popup layout defined in info_popup.xml
     */
    public void showInfoPopup(View view){
        popup.setContentView(R.layout.info_popup);
        popup.show();
    }

    /**
     * A method that executes when btnExit is clicked.
     * Closes the dialogue popup defined in info_popup.xml and returns to the layout defined in activity_counter.xml
     */
    public void onClickBtnExit(View view){
        popup.dismiss();
    }
}
