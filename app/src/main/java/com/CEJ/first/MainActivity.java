package com.CEJ.first;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //    멤버 변수 선언
    private final static String TAG="FIRST APP";
    //    멤버 메서드
    //    AppCompatActivity's method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 사용자에게 보여지는 화면 설정
        setContentView(R.layout.join);

        // 디버깅
        Log.i(TAG,"onCreate()");
        Toast.makeText(MainActivity.this,"앱 실행",Toast.LENGTH_SHORT).show();
    }

    // onClick 속성 지원 Method
    // UI 요소 중 onClick 속성 설정한 경우 실행되는 메서드

    public void clickFunc(View v){
        if (v.getId()==R.id.cancelBtn){
            Toast.makeText(MainActivity.this,"취소",Toast.LENGTH_SHORT).show();
        }
        else if (v.getId()==R.id.okBtn){
            Toast.makeText(MainActivity.this,"가입 완료",Toast.LENGTH_SHORT).show();
        }
    }
}