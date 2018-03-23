package com.example.justbeyourself.findit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private ImageView imageView_bear;
    private ImageView imageView_bird;
    private ImageView imageView_cat;
    private ImageView imageView_elephant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ExitApplication.getInstance().addActivity(this);

        imageView_bear= (ImageView) findViewById(R.id.bear);
        imageView_bird=(ImageView)findViewById(R.id.bird);
        imageView_cat=(ImageView)findViewById(R.id.cat);
        imageView_elephant=(ImageView)findViewById(R.id.elephant);

        imageView_bear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
            });

        imageView_bird.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(FirstActivity.this,ErrorActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
        });

        imageView_cat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(FirstActivity.this,ErrorActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
        });

        imageView_elephant.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(FirstActivity.this,ErrorActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
        });

    }
}
