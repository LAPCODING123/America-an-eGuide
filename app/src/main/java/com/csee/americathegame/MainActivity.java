package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton nextPageButton;
    TextView[] introTextViews = new TextView[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextPageButton = findViewById(R.id.proceedToNextPageImageButtonID);
        introTextViews[0] = findViewById(R.id.americaTheeGuideTextViewID);
        introTextViews[1] = findViewById(R.id.notClickBaitTextViewID);

        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(TextView t : introTextViews){
                    t.setVisibility(View.INVISIBLE);
                }
            }
        });



    }
}
