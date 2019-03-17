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
    boolean goesToCollege = MainActivity.rand.nextBoolean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_college_education);

        goToCollegeImageButton = findViewById(R.id.goToCollegeImageButtonID);

        dontGoToCollegeButton = findViewById(R.id.dontGoToCollegeButtonID);

        goToCollegeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.choosenFace == R.id.whiteMaleImageButtonID ||
                        MainActivity.choosenFace == R.id.whiteFemaleImageButtonID)
                    if(!goesToCollege)
                        goesToCollege = MainActivity.rand.nextBoolean(); //they get another chance

                if(goesToCollege)
                {
                    MainActivity.balance -= 30000;
                    MainActivity.collegEducated = true;
                    Toast.makeText(GetCollegeEducation.this, "Hooray,you have a degree. \nBalance: " + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();
                    if(!MainActivity.HAVE_RICH_CHEATING_PARENTS)
                        MainActivity.hasToPayCollegeLoan = true;
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
                if(MainActivity.HAVE_RICH_CHEATING_PARENTS)
                {
                    Toast.makeText(GetCollegeEducation.this, "But wait, your parents have money and cheated for you!", Toast.LENGTH_LONG).show();
                    dontGoToCollegeButton.setVisibility(View.INVISIBLE);
                    goToCollegeImageButton.setVisibility(View.VISIBLE);
                    goesToCollege = true; //guranteed for the upper class. Also, the Rich actors
                }

                else{
                    Toast.makeText(GetCollegeEducation.this, "No degree for you. \nBalance: " + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();
                    MainActivity.collegEducated = false;
                    switchToGetJob();
                }
            }
        });
    }

    private void switchToGetJob(){
        startActivity(new Intent(GetCollegeEducation.this, GetAJob.class));
        finish();
    }
}
