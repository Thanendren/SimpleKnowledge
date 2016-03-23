package com.example.thanendren.simpleknowledge;

/**
 * Created by Thanendren on 21/3/2016.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class Result extends AppCompatActivity {

    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Your Final Result Is" + Questions.correct + "/" + Questions.questions.length);


    }
}