package com.codeburrow.render;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup activityContainer = (ViewGroup) findViewById(R.id.activity_main_container);

        addButton(ChatumLatinumActivity.class,
                getString(R.string.title_activity_chatum_latinum), activityContainer);

        addButton(DroidCardsActivity.class,
                getString(R.string.title_activity_droid_cards), activityContainer);

        addButton(CompareLayoutsActivity.class,
                getString(R.string.title_activity_compare_layouts), activityContainer);
    }

    private void addButton(final Class destination, String description, ViewGroup parent) {
        Button button = new Button(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problemIntent = new Intent(MainActivity.this, destination);
                startActivity(problemIntent);
            }
        });
        button.setText(description);
        parent.addView(button);
    }
}