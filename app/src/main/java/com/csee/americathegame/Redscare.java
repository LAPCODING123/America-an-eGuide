package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Redscare extends AppCompatActivity {

    ImageView china;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redscare);

        china = findViewById(R.id.chinaImageViewID);

        china.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                china.setVisibility(View.INVISIBLE);
                Toast.makeText(Redscare.this,"Hooray, you got rid of Chjina. \nAmericanization Complete! Play Again by Restarting App", Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }

    /*

    private void switchToGameSummary(){
        startActivity(new Intent(HaveFreedom.this, GetCollegeEducation.class));
        finish();
    }
    */
}
