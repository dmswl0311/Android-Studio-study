package com.CEJ.first;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // 멤버 변수 선언
    // Debug ------------------------------------------------
    private final static String TAG="FIRST APP";

    // UI ---------------------------------------------------
    private LinearLayout button_eventLAY;
    private TextView txt;
    private Button btn;

    // Control ----------------------------------------------
    private Random random=new Random(); // 선언과 동시에 객체 만듦
    private int red;
    private int green;
    private int blue;

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
            red=random.nextInt(255);
            green=random.nextInt(255);
            blue=random.nextInt(255);

            button_eventLAY.setBackgroundColor(Color.rgb(red,green,blue));
            txt.setText("Random");
            btn=findViewById(R.id.btn2);
            btn.setVisibility(View.VISIBLE);
        }
        else if (v.getId()==R.id.btn2){
            Toast.makeText(MainActivity.this,"버튼2",Toast.LENGTH_SHORT).show();
            button_eventLAY.setBackgroundColor(Color.YELLOW);
            txt.setText("YELLOW");
            btn.setVisibility(View.GONE);
        }
        if (v.getId()==R.id.textView6){
            Log.i(TAG,"Title CLICK");
        }
    }
}