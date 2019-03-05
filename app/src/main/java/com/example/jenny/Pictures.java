package com.example.jenny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Pictures extends AppCompatActivity {



    public void fade(View view){
        ImageView mattress=(ImageView) findViewById(R.id.mattress);
        ImageView chair =(ImageView) findViewById(R.id.chair);
        ImageView table=(ImageView) findViewById(R.id.table);


            mattress.animate().rotationBy(360).scaleX(0.5f).scaleY(0.5f).scaleX(0.5f).alpha(1).setDuration(2000);
            chair.animate().rotationBy(360).scaleX(0.5f).scaleY(0.5f).alpha(1).setDuration(2000);
            table.animate().rotationBy(360).scaleX(0.5f).scaleY(0.5f).alpha(1).setDuration(2000);


        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);



    }
}
