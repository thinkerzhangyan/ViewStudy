package com.thinkerzhangyan.viewstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.thinkerzhangyan.viewstudy.fling.GestureActivity;
import com.thinkerzhangyan.viewstudy.location_transfrom.ViewLocationTransformActivity;
import com.thinkerzhangyan.viewstudy.scroller.ViewScrollerActivity;

public class MainActivity extends AppCompatActivity {


    private TextView mLocationTransfromText;
    private TextView mScrollerText;
    private TextView mGestureText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationTransfromText = findViewById(R.id.text_location_transform);
        mLocationTransfromText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewLocationTransformActivity.class);
                startActivity(intent);
            }
        });

        mScrollerText = findViewById(R.id.text_scroller);
        mScrollerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewScrollerActivity.class);
                startActivity(intent);
            }
        });
        mGestureText = findViewById(R.id.text_gesture);
        mGestureText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GestureActivity.class);
                startActivity(intent);
            }
        });


    }
}
