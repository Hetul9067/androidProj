package com.myappcompany.hh.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.myappcompany.hh.sharedpreferences", Context.MODE_PRIVATE);

        /*
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Akshay");
        friends.add("Rohan");
        friends.add("Drijesh");
        try {
            sharedPreferences.edit().putString("friends", ObjectSerializer.serialize(friends)).apply();
            Log.i("friends", ObjectSerializer.serialize(friends));

        }catch (Exception e) {
            e.printStackTrace();
        }
        */
        /*
        ArrayList<String> newFriends = new ArrayList<>();
        try {
            newFriends = (ArrayList<String>) ObjectSerializer.deserialize(sharedPreferences.getString("friends",ObjectSerializer.serialize(new ArrayList<String>())));
        }catch (Exception e){
            e.printStackTrace();
        }

        Log.i("new Friends", newFriends.toString());


*/

//        sharedPreferences.edit().putString("username", "Hetul").apply();

//        String username = sharedPreferences.getString("username","");
//
//        Log.i("this is the username", username);



    }
}
