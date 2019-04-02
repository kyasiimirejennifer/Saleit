package com.example.jenny;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


            //    Kyasiimire Jennifer
           //    2017/BIT/173

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=findViewById(R.id.imageView);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.advert:
                Intent intent = new Intent(getApplicationContext(), Music.class);
                startActivity(intent);
                return true;

            case R.id.pictures:
                Intent m = new Intent(getApplicationContext(), Pictures.class);
                startActivity(m);

                return true;

            case R.id.settings:
                Intent n = new Intent(MainActivity.this, Settings.class);
                startActivity(n);
                return true;

            case R.id.Help:
                setFragment(new Help());


            default:

                return super.onOptionsItemSelected(item);

        }


    }
    void setFragment(Fragment fragment){

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }
}
