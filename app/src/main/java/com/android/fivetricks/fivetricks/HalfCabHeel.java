package com.android.fivetricks.fivetricks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HalfCabHeel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_half_cab_heel);
    }

    /** clicking on Trickipedia button */
    public void hcheelTrickipedia (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://theberrics.com/trickipedia-frontside-halfcab-heelflip-hd/"));
        startActivity(intent);
    }
}
