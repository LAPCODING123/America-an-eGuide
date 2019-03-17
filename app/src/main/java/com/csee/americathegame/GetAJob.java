package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class GetAJob extends AppCompatActivity {

    ImageButton[] imageButtons = new ImageButton[4];
    private String jobMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_ajob);

        imageButtons[0] = findViewById(R.id.doctorImageButtonID);
        imageButtons[1] = findViewById(R.id.nurseImageBurttonID);
        imageButtons[2] = findViewById(R.id.teacherImageButtonID);
        imageButtons[3] = findViewById(R.id.mcDWorkerImageButtonID);

        imageButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!MainActivity.collegEducated){
                    Toast.makeText(GetAJob.this, "Need a degree", Toast.LENGTH_LONG).show();
                }

                else {
                    MainActivity.pay = 189000.00;
                    if(MainActivity.isWoman)
                        MainActivity.pay *= 0.98; // 2% less pay
                    MainActivity.getPaid();
                    jobMessage = "You are a doctor now. Annual Pay: $" + Double.toString(MainActivity.pay) + "\n Balance $" + Double.toString(MainActivity.balance);
                    if(MainActivity.isWoman)
                        jobMessage += "\nWoman so less money";
                    Toast.makeText(GetAJob.this, jobMessage, Toast.LENGTH_LONG).show();
                    switchToFindHousing();
                }
            }
        });

        imageButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!MainActivity.collegEducated){
                    Toast.makeText(GetAJob.this, "Need a degree", Toast.LENGTH_LONG).show();
                }

                else {
                    MainActivity.pay = 68450;
                    if(MainActivity.isWoman)
                        MainActivity.pay *= 0.98; // 2% less pay
                    MainActivity.getPaid();
                    jobMessage = "You are a nurse now. Annual Pay: $" + Double.toString(MainActivity.pay) + "\n Balance $" + Double.toString(MainActivity.balance);
                    if(MainActivity.isWoman)
                        jobMessage += "\nWoman so less money";
                    Toast.makeText(GetAJob.this, jobMessage, Toast.LENGTH_LONG).show();
                    switchToFindHousing();
                }
            }
        });

        imageButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!MainActivity.collegEducated){
                    Toast.makeText(GetAJob.this, "Need a degree", Toast.LENGTH_LONG).show();
                }

                else {
                    MainActivity.pay = 45622;
                    if(MainActivity.isWoman)
                        MainActivity.pay *= 0.99; // 1% less pay
                    MainActivity.getPaid();
                    jobMessage = "You are a teacher now. Annual Pay: $" + Double.toString(MainActivity.pay) + "\n Balance $" + Double.toString(MainActivity.balance);
                    if(MainActivity.isWoman)
                        jobMessage += "\nWoman, so a little less money";
                    Toast.makeText(GetAJob.this, jobMessage, Toast.LENGTH_LONG).show();
                    switchToFindHousing();
                }
            }
        });

        imageButtons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.pay = 2646.25;
                MainActivity.getPaid();
                Toast.makeText(GetAJob.this, "Welcome to the crew. Pay: $" + Double.toString(MainActivity.pay) + "\n Balance $" + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();
                switchToFindHousing();
            }
        });
    }

    private void switchToFindHousing() {
        startActivity(new Intent(GetAJob.this, GetAPlaceToLive.class));
        finish();
    }
}
