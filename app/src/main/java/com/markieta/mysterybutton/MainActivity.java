package com.markieta.mysterybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    LinearLayout linearLayout;
    LinearLayout.LayoutParams layoutParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        //TODO: populate the AutoCompleteTextView using an ArrayAdapter for String arrays

        Button pressMe = (Button) findViewById(R.id.pressMeButton);
        pressMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressMeHandler();
            }
        });
    }

    private void pressMeHandler() {
        String autoCompleteText = autoCompleteTextView.getText().toString();

        if(autoCompleteText.length() > 0) {
            TextView tempView = new TextView(this);
            tempView.setText(autoCompleteText);

            linearLayout.addView(tempView, layoutParams);
            autoCompleteTextView.getText().clear();
        }
        else {
            autoCompleteTextView.setError(getString(R.string.auto_complete_text_view_error));
        }
    }
}