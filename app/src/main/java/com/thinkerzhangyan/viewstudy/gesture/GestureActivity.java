package com.thinkerzhangyan.viewstudy.gesture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.thinkerzhangyan.viewstudy.R;
import com.thinkerzhangyan.viewstudy.gesture.demo.BallActivity;
import com.thinkerzhangyan.viewstudy.gesture.fling.GestureDectorActivity;

public class GestureActivity extends AppCompatActivity {


    private TextView mGestureDectorText;
    private TextView mGestureTextDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);

        mGestureDectorText = findViewById(R.id.text_gesture_dector);
        mGestureDectorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GestureActivity.this, GestureDectorActivity.class);
                startActivity(intent);
            }
        });
        mGestureTextDemo = findViewById(R.id.text_gesture_demo);
        mGestureTextDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GestureActivity.this, BallActivity.class);
                startActivity(intent);
            }
        });

    }
}
