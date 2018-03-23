package com.example.justbeyourself.findit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ErrorActivity extends AppCompatActivity {
    private Button btn_again;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        ExitApplication.getInstance().addActivity(this);

        btn_again=(Button)findViewById(R.id.again);

        btn_again.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent =new Intent(ErrorActivity.this,MainActivity.class);
                startActivity(intent);
                ExitApplication.getInstance().exit();
            }});
    }
}
