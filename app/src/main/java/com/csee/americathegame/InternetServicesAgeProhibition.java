package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class InternetServicesAgeProhibition extends AppCompatActivity {

    private EditText enterAgeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_services_age_prohibition);

        enterAgeEditText = findViewById(R.id.inputAgeEditTextID);

        enterAgeEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                MainActivity.age = Integer.parseInt(enterAgeEditText.getText().toString());
                switchToHaveFreedom();
                return false;
            }
        });

    }
    
    private void switchToHaveFreedom(){
        startActivity(new Intent(InternetServicesAgeProhibition.this, HaveFreedom.class));
        finish();
    }

}
