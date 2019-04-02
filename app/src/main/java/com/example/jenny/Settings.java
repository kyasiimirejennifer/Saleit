package com.example.jenny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Settings extends AppCompatActivity {
    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        listView = (ListView) findViewById(R.id.listview);
        array = new ArrayList<>();

        array.add("Settings1");
        array.add("Settings2");
        array.add("Settings3");
        array.add("Settings4");
        array.add("Settings5");

        //setting up the adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
        listView.setAdapter(adapter);

        //adding onclick listner for the items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext()," "+array.get(position),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
