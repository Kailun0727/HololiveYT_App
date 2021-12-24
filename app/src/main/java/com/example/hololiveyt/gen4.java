package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class gen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen4);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.kanata:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UCZlDXzGoo7d44bwdNObFacg"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;
            case R.id.watame:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/channel/UCqm3BQLlJfvkTsX_hvm0UmA"));
                intent2.setPackage("com.google.android.youtube");
                startActivity(intent2);
                break;
            case R.id.towa:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.youtube.com/channel/UC1uv2Oq6kNxgATlCiez59hw"));
                intent3.setPackage("com.google.android.youtube");
                startActivity(intent3);
                break;
            case R.id.luna:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.youtube.com/channel/UCa9Y57gfeY0Zro_noHRVrnw"));
                intent4.setPackage("com.google.android.youtube");
                startActivity(intent4);
                break;

        }
    }
}