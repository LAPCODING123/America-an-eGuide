package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class HaveAFamily extends AppCompatActivity {
    private ImageView[] children;
    private Button continueButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_have_afamily);
        children = new ImageView[]{
                findViewById(R.id.child1ImageViewID),
                findViewById(R.id.child2ImageViewID),
                findViewById(R.id.child3ImageViewID)
        };

        continueButton = findViewById(R.id.continueButtonID);

        if(MainActivity.NUMBER_OF_CHILDREN != 2)
            MainActivity.NUMBER_OF_CHILDREN = MainActivity.rand.nextInt(3) + 1;

        for(int i = children.length-1; i > MainActivity.NUMBER_OF_CHILDREN - 1; i--)
            children[i].setVisibility(View.INVISIBLE); //show number of children has

        if(MainActivity.NUMBER_OF_CHILDREN == 1)
            Toast.makeText(HaveAFamily.this, "You had " + Integer.toString(MainActivity.NUMBER_OF_CHILDREN) + " child.\n Cost for todolos per day: " + Double.toString(MainActivity.COST_OF_RAISING_CHILD_PER_DAY) + "\nBalance: " + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();

        else
            Toast.makeText(HaveAFamily.this, "You had " + Integer.toString(MainActivity.NUMBER_OF_CHILDREN) + " children.\n Cost for todolo per day: " + Double.toString(MainActivity.COST_OF_RAISING_CHILD_PER_DAY*MainActivity.NUMBER_OF_CHILDREN) + "\nBalance: " + Double.toString(MainActivity.balance), Toast.LENGTH_LONG).show();


        MainActivity.costsOfHavingChildren();

        MainActivity.payLoan();

        MainActivity.costsOfHavingChildren();

        //Toast.makeText(HaveAFamily.this, "Cost of raising children per day: " + Double.toString(MainActivity.COST_OF_RAISING_CHILD_PER_DAY) + ".", Toast.LENGTH_LONG).show();

        MainActivity.getPaid();

       // Toast.makeText(HaveAFamily.this, "Balance: " + Double.toString(MainActivity.balance) + ".", Toast.LENGTH_LONG).show();

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToRedscare();
            }
        });
    }

    private void switchToRedscare(){
        startActivity(new Intent(HaveAFamily.this, Redscare.class));
        finish();
    }
}
