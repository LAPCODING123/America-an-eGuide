package com.csee.americathegame;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton nextPageButton;
    public static Random rand = new Random();
    @DrawableRes public static int choosenFace = 0;
    @DrawableRes public static int choosenCreed = 0;
    public static double balance = 18000.00; //average amount of money saved for college
    public static boolean collegEducated = false;
    public static double pay = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextPageButton = findViewById(R.id.proceedToNextPageImageButtonID);

        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChooseEthnicity.class));
                finish();
            }
        });



    }

    public static void getPaid(){
        balance += pay;
    }
}
