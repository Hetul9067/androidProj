package com.myappcompany.hh.timestable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView myListView;

    public void generateTimesTable(int timesTableNumber){
        ArrayList<String> timesTableContent = new ArrayList<>();

        for(int j=1; j<=10; j++){
            timesTableContent.add(Integer.toString(j * timesTableNumber));

        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,timesTableContent);

        myListView.setAdapter(arrayAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SeekBar mySeekBar = findViewById(R.id.seekBar);

        int max = 20;
        int startingPosition = 10;
        mySeekBar.setMax(max);
        mySeekBar.setProgress(startingPosition);

        myListView  = findViewById(R.id.myListView);




        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int i , boolean b){
                int min = 1;
                int timesTableNumber;


                if(i < min){
                    timesTableNumber = min;
                    seekBar.setProgress(min);
                } else{
                    timesTableNumber = i;
                }
                Log.i("Seekbar value", Integer.toString(timesTableNumber));

                generateTimesTable(timesTableNumber);




            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){

            }

        });


    }
}
