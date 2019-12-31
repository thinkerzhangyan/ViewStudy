package com.thinkerzhangyan.viewstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.thinkerzhangyan.viewstudy.location_transfrom.ViewLocationTransformActivity;

public class MainActivity extends AppCompatActivity {


    private TextView mLocationTransfromText;

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


    }
}
