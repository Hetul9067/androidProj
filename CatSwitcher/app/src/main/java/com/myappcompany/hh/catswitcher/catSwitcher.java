package com.myappcompany.hh.catswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class catSwitcher extends AppCompatActivity {

    public void switchCat(View view){
        Log.i("Info","Button Pressed!");
        ImageView image= (ImageView) findViewById(R.id.catImageView);
        image.setImageResource(R.drawable.cat2);

//        image.setImageResource(R.drawable.xxx);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_switcher);
    }
}
