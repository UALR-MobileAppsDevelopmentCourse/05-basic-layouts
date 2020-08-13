package com.ualr.basiclayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ualr.basiclayouts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
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
            case R.id.frame_layout_btn:
                resultClass = FrameLayoutActivity.class;
                break;
            case R.id.linear_layout_btn:
                resultClass = LinearLayoutActivity.class;
                break;
            case R.id.linear_layout_form_btn:
                resultClass = LinearLayoutFormActivity.class;
                break;
        }
        return resultClass;
    }
}
