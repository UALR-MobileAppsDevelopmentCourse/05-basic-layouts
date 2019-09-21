package com.ualr.basiclayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        Class targetActivity = getTargetFromButtonId(view.getId());
        if (targetActivity == null) return;
        Intent intent = new Intent(MainActivity.this, targetActivity);
        startActivity(intent);
    }

    private Class getTargetFromButtonId(int buttonId) {
        Class resultClass = null;
        switch (buttonId) {
            case R.id.basic_layout_btn:
                resultClass = LayoutBasicsActivity.class;
                break;
            case R.id.frame_layout_btn:
                resultClass = FrameLayoutActivity.class;
                break;
            case R.id.linear_layout_btn:
                resultClass = LinearLayoutActivity.class;
                break;
            case R.id.relative_layout_btn:
                resultClass = RelativeLayoutActivity.class;
                break;
            case R.id.grid_layout_btn:
                resultClass = GridLayoutActivity.class;
                break;
            case R.id.table_layout_btn:
                resultClass = TableLayoutActivity.class;
                break;
        }
        return resultClass;
    }
}
