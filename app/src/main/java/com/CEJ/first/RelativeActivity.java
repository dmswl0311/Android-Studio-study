package com.CEJ.first;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {
    // --------------------------------------------------
    // Member Variable
    // --------------------------------------------------

    // --------------------------------------------------
    // Member Method - Override Method
    // --------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // contentView 설정
        setContentView(R.layout.layout_profile);
    }

}