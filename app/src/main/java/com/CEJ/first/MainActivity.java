package com.CEJ.first;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //    멤버 변수 선언
    private final static String TAG="FIRST APP";
    private LinearLayout button_eventLAY;
    private TextView txt;

    //    멤버 메서드
    //    AppCompatActivity's method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 사용자에게 보여지는 화면 설정
        setContentView(R.layout.button_event);

        // 디버깅
        Log.i(TAG,"onCreate()");
        Toast.makeText(MainActivity.this,"앱 실행",Toast.LENGTH_SHORT).show();

//        joinLAY=findViewById(R.id.joinLAY);
        button_eventLAY=findViewById(R.id.button_eventLAY);
        txt=findViewById(R.id.textView6);

    }

    // onClick 속성 지원 Method
    // UI 요소 중 onClick 속성 설정한 경우 실행되는 메서드

    public void clickFunc(View v){
        if (v.getId()==R.id.btn1){
            Toast.makeText(MainActivity.this,"버튼1",Toast.LENGTH_SHORT).show();
            button_eventLAY.setBackgroundColor(Color.BLUE);
            txt.setText("BLUE");
        }
        else if (v.getId()==R.id.btn2){
            Toast.makeText(MainActivity.this,"버튼2",Toast.LENGTH_SHORT).show();
            button_eventLAY.setBackgroundColor(Color.YELLOW);
            txt.setText("YELLOW");
        }
    }
}