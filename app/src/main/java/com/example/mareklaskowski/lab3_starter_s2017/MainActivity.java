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

        //I will demonstrate how you can add a View dynamically to one of your LinearLayouts (at runtime)

        //ex. create a new TextView and add it to your LinearLayout (vertical)
        TextView tempView = new TextView(this);
        tempView.setText("enjoy the rest of the lab!");
        //add it to our LinearLayout
        //start by getting a reference to our LinearLayout
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        //we need to use a LayoutParams class to specify layout properties when adding a View to a Layout at runtime
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        //add the new view to the linearlayout using the layoutparams
        linearLayout.addView(tempView, layoutParams);

        //TODO: change things so that TextViews are added in response to button clicks
        //TODO: populate the AutoCompleteTextView using an ArrayAdapter for String arrays

    }
}












