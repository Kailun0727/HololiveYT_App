package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class en_gen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_gen2);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.sana:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UCsUj0dszADCGbF3gNrQEuSQ"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;
            case R.id.fauna:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/channel/UCO_aKKYxn4tvrqPjcTzZ6EQ"));
                intent2.setPackage("com.google.android.youtube");
                startActivity(intent2);
                break;
            case R.id.kronii:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.youtube.com/channel/UCmbs8T6MWqUHP1tIQvSgKrg"));
                intent3.setPackage("com.google.android.youtube");
                startActivity(intent3);
                break;
            case R.id.mumei:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.youtube.com/channel/UC3n5uGu18FoCy23ggWWp8tA"));
                intent4.setPackage("com.google.android.youtube");
                startActivity(intent4);
                break;
            case R.id.bae:
                Intent intent5 = new Intent(Intent.ACTION_VIEW);
                intent5.setData(Uri.parse("https://www.youtube.com/channel/UCgmPnx-EEeOrZSg5Tiw7ZRQ"));
                intent5.setPackage("com.google.android.youtube");
                startActivity(intent5);
                break;
        }
    }
}