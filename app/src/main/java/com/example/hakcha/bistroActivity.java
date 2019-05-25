package com.example.hakcha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bistroActivity extends AppCompatActivity {

    Button button1,button2,button3;
    String ID, PW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bistro);
        Intent intent = getIntent();  // 넘어온 Intent 객체를 받는다
        ID = intent.getStringExtra("ID");
        PW = intent.getStringExtra("PW");
        button1 =  (Button) findViewById(R.id.button1);
        button2 =  (Button) findViewById(R.id.button2);
        button3 =  (Button) findViewById(R.id.button3);



       button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), Old_MenuActivity.class);
                    Toast.makeText(getApplicationContext(), ID + " || " + PW, Toast.LENGTH_LONG).show();
                    startActivity(intent);

            }
        });
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), New_MenuActivity.class);
                Toast.makeText(getApplicationContext(), ID + " || " + PW, Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Stone_MenuActivity.class);
                Toast.makeText(getApplicationContext(), ID + " || " + PW, Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });
    }

}
