package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class HaveFreedom extends AppCompatActivity {

    private WebView webView;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_have_freedom);

        exitButton = findViewById(R.id.thatsEnoughFreedomButtonID);

        webView = findViewById(R.id.webViewID);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webView.loadUrl("https://www.google.com");

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HaveFreedom.this,"Don't worry; Your free because We know todolo.", Toast.LENGTH_LONG).show();
                switchToChooseCollegeEducation();;
            }
        });


    }

    private void switchToChooseCollegeEducation(){
        startActivity(new Intent(HaveFreedom.this, GetCollegeEducation.class));
        finish();
    }
}
