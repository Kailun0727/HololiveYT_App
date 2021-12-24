package com.example.hololiveyt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class gen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen1);
    }

    public void goChannel(View view) {
        switch (view.getId()) {
            case R.id.mel:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.youtube.com/channel/UCD8HOxPs4Xvsm8H0ZxXGiBw"));
                intent1.setPackage("com.google.android.youtube");
                startActivity(intent1);
                break;
            case R.id.aki:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/channel/UCFTLzh12_nrtzqBPsTCqenA"));
                intent2.setPackage("com.google.android.youtube");
                startActivity(intent2);
                break;
            case R.id.haato:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.youtube.com/channel/UC1CfXB_kRs3C-zaeTG3oGyg"));
                intent3.setPackage("com.google.android.youtube");
                startActivity(intent3);
                break;
            case R.id.fubuki:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.youtube.com/channel/UCdn5BQ06XqgXoAxIhbqw5Rg"));
                intent4.setPackage("com.google.android.youtube");
                startActivity(intent4);
                break;
            case R.id.matsuri:
                Intent intent5 = new Intent(Intent.ACTION_VIEW);
                intent5.setData(Uri.parse("https://www.youtube.com/channel/UCQ0UDLQCjY0rmuxCDE38FGg"));
                intent5.setPackage("com.google.android.youtube");
                startActivity(intent5);
                break;
        }
    }


}