package com.example.eggshell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            //로딩시간 2초
            Thread.sleep(2000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
