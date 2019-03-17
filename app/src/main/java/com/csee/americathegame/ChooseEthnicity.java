/**
 * RESEARCH
 * http://www.pewsocialtrends.org/2018/07/12/incomes-of-whites-blacks-hispanics-and-asians-in-the-u-s-1970-and-2016/
 *
 */

package com.csee.americathegame;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChooseEthnicity extends AppCompatActivity {
    ImageButton[] imageButtons = new ImageButton[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_ethnicity);

        imageButtons[0] = findViewById(R.id.whiteMaleImageButtonID);
        imageButtons[1] = findViewById(R.id.tanMaleImageButtonID);
        imageButtons[2] = findViewById(R.id.tannerMaleImageButtonID);
        imageButtons[3] = findViewById(R.id.blackMaleImageButtonID);
        imageButtons[4] = findViewById(R.id.whiteFemaleImageButtonID);
        imageButtons[5] = findViewById(R.id.tanFemaleImageButtonID);
        imageButtons[6] = findViewById(R.id.tannerFemaleImageButtonID);
        imageButtons[7] = findViewById(R.id.blackFemaleImageButtonID);

        imageButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Hello Fellow Citizen", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.whiteMaleImageButtonID;
                switchToChooseCreed();
            }
        });


        imageButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Hello Southerner", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.tanMaleImageButtonID;
                MainActivity.balance -= 100.0;
                switchToChooseCreed();
            }
        });

        imageButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Hello foreigner", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.tannerMaleImageButtonID;
                MainActivity.balance -= 200.0;
                switchToChooseCreed();
            }
        });

        imageButtons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Hello, You matter*!", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.blackMaleImageButtonID;
                MainActivity.balance -= 300.0;
                switchToChooseCreed();
            }
        });

        imageButtons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Greetings Miss", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.whiteFemaleImageButtonID;
                MainActivity.isWoman = true;
                switchToChooseCreed();
            }
        });

        imageButtons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Hola señora", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.tanFemaleImageButtonID;
                MainActivity.balance -= 100.0;
                MainActivity.isWoman = true;
                switchToChooseCreed();
            }
        });

        imageButtons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Hello Foreigner", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.tannerFemaleImageButtonID;
                MainActivity.balance -= 200.0;
                MainActivity.isWoman = true;
                switchToChooseCreed();
            }
        });

        imageButtons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseEthnicity.this,"Hello ma\'am", Toast.LENGTH_LONG).show();
                MainActivity.choosenFace = R.id.blackFemaleImageButtonID;
                MainActivity.balance -= 300.0;
                MainActivity.isWoman = true;
                switchToChooseCreed();
            }
        });
    }

    private void switchToChooseCreed(){
        startActivity(new Intent(ChooseEthnicity.this, ChooseCreed.class));
        finish();
    }
}
