package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class gen6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen6);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.laplus:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UCENwRMx5Yh42zWpzURebzTw"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;
            case R.id.lui:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/channel/UCs9_O1tRPMQTHQ-N_L6FU2g"));
                intent2.setPackage("com.google.android.youtube");
                startActivity(intent2);
                break;
            case R.id.koyori:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.youtube.com/channel/UC6eWCld0KwmyHFbAqK3V-Rw"));
                intent3.setPackage("com.google.android.youtube");
                startActivity(intent3);
                break;
            case R.id.chloe:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.youtube.com/channel/UCIBY1ollUsauvVi4hW4cumw"));
                intent4.setPackage("com.google.android.youtube");
                startActivity(intent4);
                break;
            case R.id.iroha:
                Intent intent5 = new Intent(Intent.ACTION_VIEW);
                intent5.setData(Uri.parse("https://www.youtube.com/channel/UC_vMYWcDjmfdpH6r4TTn1MQ"));
                intent5.setPackage("com.google.android.youtube");
                startActivity(intent5);
                break;
        }
    }
}