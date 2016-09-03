package com.codeburrow.render;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

public class CompareLayoutsActivity extends ActionBarActivity {

    protected static final String TAG = "CompareLayoutActivity";

    ImageView chat_author_avatar1;
    ImageView chat_author_avatar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_layouts);
    }
}