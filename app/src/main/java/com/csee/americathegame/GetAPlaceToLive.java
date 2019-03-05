package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class GetAPlaceToLive extends AppCompatActivity {
    ImageButton[] imageButtons = new ImageButton[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_aplace_to_live);

        imageButtons[0] = findViewById(R.id.liveWithParentsImageButtonID);
        imageButtons[1] = findViewById(R.id.getAHouseImageButtonID);
        imageButtons[2] = findViewById(R.id.communiyHousingImageButtonID);

        imageButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.pay < 100000.0) {
                    Toast.makeText(GetAPlaceToLive.this, "Can't afford this", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(GetAPlaceToLive.this, "You got a loan on a house", Toast.LENGTH_LONG).show();
                    switchToExperienceNostalgia();
                }
            }
        });

        imageButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.pay <  40000.0) {
                    Toast.makeText(GetAPlaceToLive.this, "Can't afford this", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(GetAPlaceToLive.this, "A cheaper alternative that is not living in your parents house", Toast.LENGTH_LONG).show();
                    switchToExperienceNostalgia();
                }
            }
        });

        imageButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GetAPlaceToLive.this, "No home, no loan :)", Toast.LENGTH_LONG).show();
                switchToExperienceNostalgia();
            }
        });


    }

    private void switchToExperienceNostalgia(){
        startActivity(new Intent(GetAPlaceToLive.this, SeeButDontKeepNostalgia.class));
        finish();
    }
}
