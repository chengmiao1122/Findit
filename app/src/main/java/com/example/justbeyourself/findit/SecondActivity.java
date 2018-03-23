package com.example.justbeyourself.findit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    private ImageView imageView_house;
    private ImageView imageView_honey;
    private ImageView imageView_fish;
    private ImageView imageView_flower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ExitApplication.getInstance().addActivity(this);

        imageView_house= (ImageView) findViewById(R.id.house);
        imageView_honey=(ImageView)findViewById(R.id.honey);
        imageView_fish=(ImageView)findViewById(R.id.fish);
        imageView_flower=(ImageView)findViewById(R.id.flower);

        imageView_house.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(SecondActivity.this,ErrorActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
        });

        imageView_honey.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(SecondActivity.this,ErrorActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
        });

        imageView_fish.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(SecondActivity.this,ErrorActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
        });

        imageView_flower.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(SecondActivity.this,GoodActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }
        });
    }
}
