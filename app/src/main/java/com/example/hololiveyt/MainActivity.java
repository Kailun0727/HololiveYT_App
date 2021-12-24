package com.example.hololiveyt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void select_gen(View view) {
        switch (view.getId()){
            case R.id.gen0 :
                Intent gen0 = new Intent(MainActivity.this,gen0.class);
                startActivity(gen0);
                break;
            case R.id.gen1 :
                Intent gen1 = new Intent(MainActivity.this,gen1.class);
                startActivity(gen1);
                break;
            case R.id.gen2 :
                Intent gen2 = new Intent(MainActivity.this,gen2.class);
                startActivity(gen2);
                break;
            case R.id.gamers :
                Intent gamers = new Intent(MainActivity.this,gamers.class);
                startActivity(gamers);
                break;
            case R.id.gen3 :
                Intent gen3 = new Intent(MainActivity.this,gen3.class);
                startActivity(gen3);
                break;
            case R.id.gen4 :
                Intent gen4 = new Intent(MainActivity.this,gen4.class);
                startActivity(gen4);
                break;
            case R.id.gen5 :
                Intent gen5 = new Intent(MainActivity.this,gen5.class);
                startActivity(gen5);
                break;
            case R.id.gen6 :
                Intent gen6 = new Intent(MainActivity.this,gen6.class);
                startActivity(gen6);
                break;
            case R.id.schedule :
                Uri uri = Uri.parse("https://hololive.jetri.co/#/"); // missing 'http://' will cause crashed
                Intent schedule = new Intent(Intent.ACTION_VIEW, uri);
                startActivity( schedule);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //get menu resource
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_jp:
                Toast.makeText(this,"已切換至Hololive JP",Toast.LENGTH_SHORT).show();
                Intent intentJP = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentJP);
                break;
            case R.id.menu_en:
                Toast.makeText(this,"已切換至Hololive EN",Toast.LENGTH_SHORT).show();
                Intent intentEN = new Intent(MainActivity.this,hololive_en.class);
                startActivity(intentEN);
                break;
            case R.id.menu_id:
                Toast.makeText(this,"已切換至Hololive ID",Toast.LENGTH_SHORT).show();
                Intent intentID = new Intent(getApplicationContext(),hololive_id.class);
                startActivity(intentID);
                break;
        }
        return true;
    }

}