package com.example.hololiveyt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class hololive_en extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hololive_en);
    }

    public void select_gen(View view) {
        switch (view.getId()){
            case R.id.myth :
                Intent en1 = new Intent(hololive_en.this,en_gen1.class);
                startActivity(en1);
                break;
            case R.id.council :
                Intent en2 =  new Intent(hololive_en.this,en_gen2.class);
                startActivity(en2);
                break;
            case R.id.vsinger :
                Intent vsinger =  new Intent(hololive_en.this,en_vsinger.class);
                startActivity(vsinger);
                break;
            case R.id.schedule :
                Uri uri = Uri.parse("https://hololive.jetri.co/#/"); // missing 'http://' will cause crashed
                Intent schedule = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(schedule);
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
                Intent intentEN = new Intent(getApplicationContext(),hololive_en.class);
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