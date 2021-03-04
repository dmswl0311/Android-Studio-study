package com.CEJ.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {
    private FrameLayout layout_frame;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frame);

    }

    public void clickFunc(View v) {
        if (v.getId() == R.id.oneBTN) {
            btn=findViewById(R.id.oneBTN);
            btn.setVisibility(View.INVISIBLE);
        } else if (v.getId() == R.id.twoBTN) {
            btn=findViewById(R.id.twoBTN);
            btn.setVisibility(View.INVISIBLE);
        }
        else if (v.getId() == R.id.threeBTN) {
            btn=findViewById(R.id.threeBTN);
            btn.setVisibility(View.INVISIBLE);
        }
        else if (v.getId() == R.id.fourBTN) {
            btn=findViewById(R.id.fourBTN);
            btn.setVisibility(View.INVISIBLE);
        }
        else if (v.getId() == R.id.fiveBTN) {
            btn=findViewById(R.id.fiveBTN);
            btn.setVisibility(View.INVISIBLE);
        }
    }
}