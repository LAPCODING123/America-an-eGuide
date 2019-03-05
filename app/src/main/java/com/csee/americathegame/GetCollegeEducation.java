package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class GetCollegeEducation extends AppCompatActivity {

    ImageButton goToCollegeImageButton;
    Button dontGoToCollegeButton;
    boolean goesToCollege = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_college_education);

        goToCollegeImageButton = findViewById(R.id.goToCollegeImageButtonID);

        dontGoToCollegeButton = findViewById(R.id.dontGoToCollegeButtonID);

        goToCollegeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.choosenFace != R.id.whiteMaleImageButtonID || MainActivity.choosenFace != R.id.whiteFemaleImageButtonID)
                    goesToCollege = MainActivity.rand.nextBoolean();

                if(goesToCollege)
                {
                    MainActivity.balance -= 30000;
                    MainActivity.collegEducated = true;
                    Toast.makeText(GetCollegeEducation.this, "Hooray,you have a degree. \nBalance: " + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();
                    switchToGetJob();
                }

                else{
                    goToCollegeImageButton.setVisibility(View.INVISIBLE);
                    Toast.makeText(GetCollegeEducation.this, "Sorry, sometimes college is not the way. \nBalance: " + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();
                }

            }
        });

        dontGoToCollegeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.collegEducated = false;
                Toast.makeText(GetCollegeEducation.this, "No degree for you. \nBalance: " + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();
                switchToGetJob();
            }
        });
    }

    private void switchToGetJob(){
        startActivity(new Intent(GetCollegeEducation.this, GetAJob.class));
        finish();
    }
}
