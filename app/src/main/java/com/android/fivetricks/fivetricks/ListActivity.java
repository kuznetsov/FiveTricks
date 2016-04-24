package com.android.fivetricks.fivetricks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    }

    public void changeText(View view) {
        EditText nameEdit = (EditText)findViewById(R.id.editName);
        TextView text = (TextView)findViewById(R.id.nameText);
        String name = nameEdit.getText().toString();
        String total = getResources().getString(R.string.sentence) + name + "!";
        text.setText(total);
    }

    /** clicking on first image */
    public void image1(View view) {
        Intent intent = new Intent(this, Kickflip.class);
        startActivity(intent);
    }

    /** clocking on second image */
    public void image2(View view) {
        Intent intent = new Intent(this, TreFlip.class);
        startActivity(intent);
    }


    /** clicking on third image */
    public void image3(View view) {
        Intent intent = new Intent(this, FiftyFiftyGrind.class);
        startActivity(intent);
    }

    /** clicking on fourth image */
    public void image4(View view) {
        Intent intent = new Intent(this, BsOllie.class);
        startActivity(intent);
    }

    /** clicking on fifth image */
    public void image5(View view) {
        Intent intent = new Intent(this, HalfCabHeel.class);
        startActivity(intent);
    }

}
