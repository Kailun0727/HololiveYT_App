package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class en_vsinger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_vsinger);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.irys:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UC8rcEBzJSleTkf_-agPM20g"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;

        }
    }
}