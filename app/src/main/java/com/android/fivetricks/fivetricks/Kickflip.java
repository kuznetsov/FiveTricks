package com.android.fivetricks.fivetricks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Kickflip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kickflip);
    }

    /** clicking on Trickipedia button */
    public void kickflipTrickipedia (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://theberrics.com/trickipedia-kickflip-hd/"));
        startActivity(intent);
    }

}
