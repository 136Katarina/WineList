package com.example.codeclan.topwinelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class WineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine);
        Intent intent =getIntent();
        Wine wine = (Wine) intent.getSerializableExtra("wine");
        Log.d("Wine Title:", wine.getTitle());
    }
}
