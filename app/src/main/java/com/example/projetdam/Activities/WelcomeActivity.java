package com.example.projetdam.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Pair;
import android.os.Handler;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projetdam.R;


public class WelcomeActivity extends AppCompatActivity {
    private static int DELAY_TIME = 4000;

    private Animation topAnim, zoom, bottomAnim;
    ImageView imageView;

    TextView slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);

        imageView = findViewById(R.id.logo);
        slogan = findViewById(R.id.slogan);

        imageView.setAnimation(topAnim);

        slogan.setAnimation(bottomAnim);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                Intent intent = new Intent(WelcomeActivity. this,LoginActivity.class);
                startActivity(intent);
                finish();

            }
        }).start();
    }
}