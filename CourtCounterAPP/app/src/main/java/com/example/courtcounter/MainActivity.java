package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score=0;
    private int score2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void A3(View view)
    {
     score+=3;
     display1(score);
    }
    public void A2(View view)
    {
        score+=2;
        display1(score);
    }
    public void A1(View view)
    {
        score+=1;
        display1(score);
    }
    public void display1(int num)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.teamA);
        quantityTextView.setText("" + num);
    }
    public void B3(View view)
    {
        score2+=3;
        display2(score2);
    }
    public void B2(View view)
    {
        score2+=2;
        display2(score2);
    }
    public void B1(View view)
    {
        score2+=1;
        display2(score2);
    }
    public void display2(int num)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.teamB);
        quantityTextView.setText("" + num);
    }
    public void reset(View view)
    {
        score=0;
        score2=0;
        display1(score);
        display2(score2);
    }
}
