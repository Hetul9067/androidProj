package com.myappcompany.hh.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

//        final ArrayList<String> myFriend = new ArrayList<String>(asList("Akshay","Krupal","Piyush","Akash"));

        final ArrayList<String> myFriend = new ArrayList<String>();

        myFriend.add("Akshay");
        myFriend.add("Krupal");
        myFriend.add("Piyush");
        myFriend.add("Akash");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFriend);

        myListView.setAdapter(arrayAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(getApplicationContext(), "Hello "+ myFriend.get(i), Toast.LENGTH_SHORT).show();
            }
        });






//
//
//        ListView myListView = findViewById(R.id.myListView);
//
//        final ArrayList<String> myFamily = new ArrayList<String>();
//
//        myFamily.add("Hardik");
//        myFamily.add("SantokBen");
//        myFamily.add("Kesharbhai");
//        myFamily.add("Maitri");
//        myFamily.add("Anjali");
//        myFamily.add("Feni");
//        myFamily.add("Dilip");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
//
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i , long l){
////                 adapterView.setVisibility(View.GONE);
//                 Log.i("Person selected: ", myFamily.get(i));
//            }
//        });




    }
}
