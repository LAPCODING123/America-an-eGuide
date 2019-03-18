package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HaveFreedom extends AppCompatActivity {

    private WebView webView;
    private Button exitButton;
    private TextView americaHaveFreedomTextView;
    private String[] forbiddenSignUrlStrings = new String[]{"/signup", "facebook"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_have_freedom);

        exitButton = findViewById(R.id.thatsEnoughFreedomButtonID);
        americaHaveFreedomTextView = findViewById(R.id.americaHaveFreedomTextViewID);

        if(MainActivity.age < 13)
            americaHaveFreedomTextView.setText(americaHaveFreedomTextView.getText()+ " (but avoid any companies that let you sign up for an account to collect data)");

        webView = findViewById(R.id.webViewID);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        if(MainActivity.age < 13)
            webView.loadUrl("https://duckduckgo.com/");
        else
            webView.loadUrl("https://www.google.com");

        webView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(MainActivity.age < 13)
                {
                    for(String forbiddenSignUpUrlString: forbiddenSignUrlStrings){
                        if(webView.getUrl().contains(forbiddenSignUpUrlString))
                        {
                            webView.loadUrl("https://duckduckgo.com/");
                            Toast.makeText(HaveFreedom.this,"Sorry not old enough to sign up", Toast.LENGTH_LONG).show();
                            break; //save cpu resources
                        }

                    }
                }

                return false;
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HaveFreedom.this,"Don't worry; Your free because We know todolo.", Toast.LENGTH_LONG).show();
                switchToChooseCollegeEducation();

            }
        });


    }

    private void switchToChooseCollegeEducation(){
        startActivity(new Intent(HaveFreedom.this, GetCollegeEducation.class));
        finish();
    }
}
