package com.Xylitols.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    // testButton1 의 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount1 = 0;
    // testButton2 의 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // "프로그래밍을 시작해보자!" 메시지를 잠시 보여준다.
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        // 레이아웃에 testButton1 ID 로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 클릭 카운트를 1회 증가시킨다.
                clickCount1 = clickCount1 + 1;

                // 클릭 횟수만큼 반복하면서 반복된 횟수 메시지를 보여준다.
                if (clickCount1 % 2 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "클릭횟수:" + clickCount1,
                            Toast.LENGTH_SHORT).show();
                } else if (clickCount1 % 3 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Hello, World!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Hello",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 레이아웃에 testButton2 ID 로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 클릭 카운트를 1회 증가시킨다.
                clickCount2 = clickCount2 + 1;

                // 클릿 횟수만큼 반복하면서 반복된 횟수 메시지를 보여준다.
                if (clickCount2 % 2 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "클릭횟수" + clickCount2,
                            Toast.LENGTH_SHORT).show();
                } else if (clickCount2 % 3 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Hello, World!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Hello",
                            Toast.LENGTH_SHORT).show();
                }
            }
       });

    }
}
