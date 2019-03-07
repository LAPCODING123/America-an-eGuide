package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SeeButDontKeepNostalgia extends AppCompatActivity {

    ImageButton nostalgiaImageButton;
    Button noNostalgiaImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_but_dont_keep_nostalgia);

        nostalgiaImageButton = findViewById(R.id.nostalgiaImageButtonID);
        noNostalgiaImageButton = findViewById(R.id.noNostalgiaImageButtoniD);

        nostalgiaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeeButDontKeepNostalgia.this, "Can't timetravel", Toast.LENGTH_LONG).show();
                nostalgiaImageButton.setVisibility(View.INVISIBLE);
                noNostalgiaImageButton.setVisibility(View.VISIBLE);
            }
        });


        noNostalgiaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeeButDontKeepNostalgia.this, "Welcome back to today", Toast.LENGTH_LONG).show();
            }
        });

    }
}
