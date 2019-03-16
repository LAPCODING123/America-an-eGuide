package com.csee.americathegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HaveAFamily extends AppCompatActivity {
    private static ImageView[] children;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_have_afamily);
        children = new ImageView[]{
                findViewById(R.id.child1ImageViewID),
                findViewById(R.id.child2ImageViewID),
                findViewById(R.id.child3ImageViewID)
        };

        for(int i = children.length; i < MainActivity.NUMBER_OF_CHILDREN; i++)
            children[i].setVisibility(View.INVISIBLE);

    }
}
