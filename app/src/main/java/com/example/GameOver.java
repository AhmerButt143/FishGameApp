package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.flyingfish.MainActivity;
import com.example.flyingfish.R;

public class GameOver extends AppCompatActivity {

    private Button startgameagain;
    TextView DisplayScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        score=getIntent().getExtras().get("Score").toString();


        startgameagain=(Button)findViewById(R.id.play_again_btn);

        DisplayScore=(TextView)findViewById(R.id.displayScore);

        startgameagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainintent=new Intent(GameOver.this, MainActivity.class);
                startActivity(mainintent);


            }

        });

        DisplayScore.setText("your score :"+score);

    }
}
