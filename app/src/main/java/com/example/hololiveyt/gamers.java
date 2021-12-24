package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class gamers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamers);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.mio:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UCp-5t9SrOQwXMU7iIjQfARg"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;
            case R.id.okayu:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/channel/UCvaTdHTWBGv3MKj3KVqJVCw"));
                intent2.setPackage("com.google.android.youtube");
                startActivity(intent2);
                break;
            case R.id.korone:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.youtube.com/channel/UChAnqc_AY5_I3Px5dig3X1Q"));
                intent3.setPackage("com.google.android.youtube");
                startActivity(intent3);
                break;
            case R.id.fubuki:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.youtube.com/channel/UCdn5BQ06XqgXoAxIhbqw5Rg"));
                intent4.setPackage("com.google.android.youtube");
                startActivity(intent4);
                break;

        }
    }
}