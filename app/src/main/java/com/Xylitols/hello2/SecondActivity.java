package com.Xylitols.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Car car1 = new Car(3, 100, 4);

    Car car2 = new Car(10, 50, 8);

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
                car1.accelerationPedal();
                car2.accelerationPedal();
                String info = "car1: " + car1.getCurrentSpeedText() + ", car2:" + car2.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car1.brakePedal();
                car2.brakePedal();
                String info = "car1: " + car1.getCurrentSpeedText() + ", car2:" + car2.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
