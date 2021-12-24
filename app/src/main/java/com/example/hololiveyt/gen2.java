package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class gen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen2);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.aqua:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UC1opHUrw8rvnsadT-iGp7Cg"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;
            case R.id.shion:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/channel/UCXTpFs_3PqI41qX2d9tL2Rw"));
                intent2.setPackage("com.google.android.youtube");
                startActivity(intent2);
                break;
            case R.id.ayame:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.youtube.com/channel/UC7fk0CB07ly8oSl0aqKkqFg"));
                intent3.setPackage("com.google.android.youtube");
                startActivity(intent3);
                break;
            case R.id.choco:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.youtube.com/channel/UC1suqwovbL1kzsoaZgFZLKg"));
                intent4.setPackage("com.google.android.youtube");
                startActivity(intent4);
                break;
            case R.id.subaru:
                Intent intent5 = new Intent(Intent.ACTION_VIEW);
                intent5.setData(Uri.parse("https://www.youtube.com/channel/UCvzGlP9oQwU--Y0r9id_jnA"));
                intent5.setPackage("com.google.android.youtube");
                startActivity(intent5);
                break;
        }
    }
}