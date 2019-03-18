package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChooseCreed extends AppCompatActivity {
    private ImageButton[] imageButtons  = new ImageButton[5];
    private Button noReligionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_creed);

        noReligionButton = findViewById(R.id.noReligionButton);

        imageButtons[0] = findViewById(R.id.chistianityImageButtonID);
        imageButtons[1] = findViewById(R.id.judaismImageButtonID);
        imageButtons[2] = findViewById(R.id.islamImageButtonID);
        imageButtons[3] = findViewById(R.id.buddhismImageButtonID);
        imageButtons[4] = findViewById(R.id.hindiusiImageButtonID);

        imageButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseCreed.this,"Welcome to the US. God Bless America!", Toast.LENGTH_LONG).show();
                MainActivity.choosenCreed = R.id.chistianityImageButtonID;
                switchToGetEnterAgeForFreedom();
            }
        });

        imageButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseCreed.this,"Shalom!", Toast.LENGTH_LONG).show();
                MainActivity.choosenCreed = R.id.judaismImageButtonID;
                switchToGetEnterAgeForFreedom();
            }
        });

        imageButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseCreed.this,"Careful with your clothing...", Toast.LENGTH_LONG).show();
                MainActivity.choosenCreed = R.id.islamImageButtonID;
                switchToGetEnterAgeForFreedom();
            }
        });

        imageButtons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseCreed.this,"Not American (to be fair though, like the other creeds)", Toast.LENGTH_LONG).show();
                MainActivity.choosenCreed = R.id.buddhismImageButtonID;
                switchToGetEnterAgeForFreedom();
            }
        });

        imageButtons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseCreed.this,"Not American (to be fair though, like the other creeds)", Toast.LENGTH_LONG).show();
                MainActivity.choosenCreed = R.id.hindiusiImageButtonID;
                switchToGetEnterAgeForFreedom();
            }
        });

        noReligionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseCreed.this,"Can\'t beat \'em don\'t join \' I guess", Toast.LENGTH_LONG).show();
                MainActivity.choosenCreed = R.id.hindiusiImageButtonID;
                switchToGetEnterAgeForFreedom();
            }
        });

    }

    private void switchToGetEnterAgeForFreedom(){
        startActivity(new Intent(ChooseCreed.this, InternetServicesAgeProhibition.class));
        finish();
    }
}
