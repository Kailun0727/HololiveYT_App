package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class gen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen3);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.pekora:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UC1DCedRgGHBdm81E1llLhOQ"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;
            case R.id.rushia:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/channel/UCl_gCybOJRIgOXw6Qb4qJzQ"));
                intent2.setPackage("com.google.android.youtube");
                startActivity(intent2);
                break;
            case R.id.flare:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.youtube.com/channel/UCvInZx9h3jC2JzsIzoOebWg"));
                intent3.setPackage("com.google.android.youtube");
                startActivity(intent3);
                break;
            case R.id.noel:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.youtube.com/channel/UCdyqAaZDKHXg4Ahi7VENThQ"));
                intent4.setPackage("com.google.android.youtube");
                startActivity(intent4);
                break;
            case R.id.marine:
                Intent intent5 = new Intent(Intent.ACTION_VIEW);
                intent5.setData(Uri.parse("https://www.youtube.com/channel/UCCzUftO8KOVkV4wQG1vkUvg"));
                intent5.setPackage("com.google.android.youtube");
                startActivity(intent5);
                break;
        }
    }
}