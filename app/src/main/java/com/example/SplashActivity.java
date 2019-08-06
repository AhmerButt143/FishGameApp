package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.flyingfish.MainActivity;
import com.example.flyingfish.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread=new Thread()
        {
            @Override
            public void run() {

                try{
                    sleep(5000);

                }catch (Exception e)
                {
                 e.printStackTrace();
                }
                finally {
                    Intent mainintent=new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(mainintent);

                }


            }
        };
          thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();

    }
}
