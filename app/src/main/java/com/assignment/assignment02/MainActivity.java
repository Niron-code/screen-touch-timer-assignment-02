package com.assignment.assignment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.main_layout);
        TextView timeView = (TextView) findViewById(R.id.time);


        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Date currentTime = Calendar.getInstance().getTime();
                //Log.i("Touchevt", "Touch Detected");
                Log.i("Touchevt", currentTime.toString());
                String time = currentTime.toString();
                timeView.setText(time);

                return true;
            }
        });
    }
}