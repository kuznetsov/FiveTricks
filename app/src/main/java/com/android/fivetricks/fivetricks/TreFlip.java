package com.android.fivetricks.fivetricks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TreFlip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tre_flip);
    }

    /** clicking on Trickipedia button */
    public void treflipTrickipedia(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://theberrics.com/trickipedia-360-flip-hd//"));
        startActivity(intent);
    }
}
