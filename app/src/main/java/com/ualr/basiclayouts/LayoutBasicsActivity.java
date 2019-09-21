package com.ualr.basiclayouts;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

/**
 * Created by irconde on 2019-09-21.
 */
public class LayoutBasicsActivity extends AppCompatActivity {

    private final static String TAG = LayoutBasicsActivity.class.getSimpleName();

    TextInputLayout mTextInput;
    LinearLayout mButtonsLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load the layout resource
        setContentView(R.layout.activity_layoutbasics);
        // Once loaded we can get a reference to any View in the layout ...
        mTextInput = findViewById(R.id.textinputlayout_main);
        // or reference to any ViewGroup in the layout
        mButtonsLayout = findViewById(R.id.hlinearlayout_main);
        // We can get the number of child views of a ViewGroup
        int childViewsCount = mButtonsLayout.getChildCount();
        Log.d(TAG, String.format("The horizontal linear layout has %d buttons", childViewsCount));
        // We can try to find a View within a specific ViewGroup. Be careful
        mTextInput = mButtonsLayout.findViewById(R.id.textinputlayout_main);
        if (mTextInput == null) {
            Log.d(TAG, String.format("View is not within the ViewGroup"));
        }
        // We can access the child view of a View Group
        View button;
        for (int i = 0; i < childViewsCount; i++) {
            button = mButtonsLayout.getChildAt(i);
            if (button != null) {
                Log.d(TAG, String.format("Button %d has the id: %d", i, button.getId()));
            }
        }
    }
}
