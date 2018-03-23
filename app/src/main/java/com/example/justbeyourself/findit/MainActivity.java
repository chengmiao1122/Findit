package com.example.justbeyourself.findit;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Button btn_play,btn_exit;
    private List<Activity> activityList = new LinkedList();

    public void exit()
    {

        for(Activity act:activityList)
        {
            act.finish();
        }

        System.exit(0);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExitApplication.getInstance().addActivity(this);

        btn_play=(Button)findViewById(R.id.btn_play);
        btn_exit=(Button)findViewById(R.id.btn_exit);

        Typeface tf = Typeface.createFromAsset(getAssets(),"font/Roboto-Regular.ttf");
        btn_play.setTypeface(tf);
        btn_exit.setTypeface(tf);


        btn_play.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }});

        btn_exit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                ExitApplication.getInstance().exit();
            }});



    }



}
