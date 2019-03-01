/**
 * RESEARCH
 * http://www.pewsocialtrends.org/2018/07/12/incomes-of-whites-blacks-hispanics-and-asians-in-the-u-s-1970-and-2016/
 *
 */

package com.csee.americathegame;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ChooseEthnicity extends AppCompatActivity {
    @DrawableRes
    static int selectedEthnicity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_ethnicity);
    }
}
