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
    ImageButton[] imageButtons = new ImageButton[MainActivity.NUMBER_OF_SELECTABLE_ETHNICITIES];

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
                Toast.makeText(ChooseEthnicity.this,"Welcome Back", Toast.LENGTH_LONG).show();
                switchToChooseCreed();
            }
        });
    }

    private void switchToChooseCreed(){
        startActivity(new Intent(ChooseEthnicity.this, ChooseCreed.class));
        finish();
    }
}
