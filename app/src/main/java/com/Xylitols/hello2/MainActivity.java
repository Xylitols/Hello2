package com.Xylitols.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 버튼이 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount = 0;

    /**
     * MainActivity 가 최초 실행될때 시작한다.
     * 자바독 주석을 확인하려면 F1 키를 누르자.
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Activity 의 UI 를 R.layout.activit_main 으로 지정한다.
        setContentView(R.layout.activity_main);

        // "프로그래밍을 시작해보자!" 메세지를 잠시 보여준다.
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        // 레이아웃에 button 이라는 ID 로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 클릭 카운트를 1회 증가시킨다.
                clickCount = clickCount +1;

                // 버튼이 클릭되면 클릭된 횟수를 증가하면서 토스트 메세지를 보여준다.
                Toast.makeText(getApplicationContext(), "clickCount: " + clickCount, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
