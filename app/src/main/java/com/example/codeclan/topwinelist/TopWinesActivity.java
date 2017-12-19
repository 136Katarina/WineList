package com.example.codeclan.topwinelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopWinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_list);

        TopWines topWines = new TopWines();
        ArrayList<Wine> list = topWines.getList();

        TopWinesAdapter winesAdapter = new TopWinesAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(winesAdapter);
    }

    public void getWine(View listItem){
        Wine wine = (Wine) listItem.getTag();
        Log.d("Wine Title: ", wine.getTitle());
        Intent intent = new Intent(this, WineActivity.class);
        intent.putExtra("wine", wine);
        startActivity(intent);
    }


}
