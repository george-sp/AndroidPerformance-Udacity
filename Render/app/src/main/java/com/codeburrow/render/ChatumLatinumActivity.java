package com.codeburrow.render;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Displays a fragment that contains a ListView holding several Chat objects.
 * Used in this lesson to show
 * a) how to reduce overdraws, and
 * b) how to flatten needlessly nested hierarchies.
 */
public class ChatumLatinumActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatum_latinum);

        /*
         * The Theme's windowBackground is masked by the opaque background of the activity,
         * and the windowBackground causes an unnecessary overdraw.
         * Nullifying the windowBackground removes that overdraw.
         */
        getWindow().setBackgroundDrawable(null);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_chatum_latinum_container, new ChatsFragment())
                    .commit();
        }
    }
}
