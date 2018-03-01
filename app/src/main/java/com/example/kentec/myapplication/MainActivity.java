package com.example.kentec.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        try{
            Buddy buddyCurrent = (Buddy) getIntent().getSerializableExtra("Buddy1");
            BuddyList.add(buddyCurrent);
        }
        catch (Exception e){};
    }

    ArrayList <Buddy> BuddyList = new ArrayList<>();

    public void Buddy1(View view){
        Intent Buddy1 = new Intent(this,com.example.kentec.myapplication.Buddy1.class);
        startActivity(Buddy1);
    }

    public void Buddy2(View view){
        Intent Buddy2 = new Intent(this,com.example.kentec.myapplication.Buddy2.class);
        startActivity(Buddy2);
    }

    public void Match(View view){
        Intent Match = new Intent(this,com.example.kentec.myapplication.Match.class);
        int count = 1;
        for (Buddy a:BuddyList) {
            Match.putExtra("Buddy"+ count++, a);
        }
        startActivity(Match);
    }

}
