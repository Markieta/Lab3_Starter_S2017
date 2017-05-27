package com.example.mareklaskowski.lab3_starter_s2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tempView = new TextView(this);
        tempView.setText("enjoy the rest of the lab!");

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        linearLayout.addView(tempView, layoutParams);

        //TODO: change things so that TextViews are added in response to button clicks
        //TODO: populate the AutoCompleteTextView using an ArrayAdapter for String arrays

    }
}