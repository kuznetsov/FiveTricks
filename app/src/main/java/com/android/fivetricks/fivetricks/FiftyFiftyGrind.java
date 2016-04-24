package com.android.fivetricks.fivetricks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FiftyFiftyGrind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_fifty_grind);
    }

    /** clicking on Trickipedia button */
    public void fiftyTrickipedia (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://theberrics.com/trickipedia-kickflip-fs-50-50/"));
        startActivity(intent);
    }
}
