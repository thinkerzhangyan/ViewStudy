package com.thinkerzhangyan.viewstudy.location_transfrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.thinkerzhangyan.viewstudy.R;

public class ViewLocationTransformActivity extends AppCompatActivity {

    private LinearLayout mTestLayout;

    private TextView mTestText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_location_transform);

        mTestLayout = findViewById(R.id.layout_test);
        mTestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTestLayout.scrollBy(-70, 0);
            }
        });

        mTestText = findViewById(R.id.text_test);
        mTestText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("yan", "mTestLayout.getScrollX():" + mTestLayout.getScrollX());
                Log.d("yan", "mTestText.getLeft():" + mTestText.getLeft());
                Log.d("yan", "mTestLayout.getScrollX()-mTestText.getLeft():" + (mTestLayout.getScrollX() - mTestText.getLeft()));
            }
        });


    }
}
