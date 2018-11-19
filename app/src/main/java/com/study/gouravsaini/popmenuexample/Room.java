package com.study.gouravsaini.popmenuexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Room extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        getSupportActionBar().setTitle("Room Location");
        txt=findViewById(R.id.data);

        Intent intent=getIntent();
        String block=intent.getStringExtra("block");
        String room=intent.getStringExtra("room");


        txt.setText(block+" Block\n"+"Room no."+room);

    }
}
