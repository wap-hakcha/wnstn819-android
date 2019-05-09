package com.example.hakcha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText idText,passwordText;
    String ID, PW;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idText = (EditText)findViewById(R.id.idText);
        passwordText = (EditText)findViewById(R.id.passwordText);
        button =  (Button) findViewById(R.id.button);

      button.setOnClickListener(new Button.OnClickListener() {
           @Override
           public void onClick(View v) {
               ID= idText.getText().toString();
               PW= passwordText.getText().toString();
               if(ID.equals("") || PW.equals("")){
                   Toast.makeText(getApplicationContext(),"ID와 PW를 제대로 입력해주세요",Toast.LENGTH_LONG).show();
               }else {
                   Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                   intent.putExtra("name", ID); //ID넘겨주기
                   intent.putExtra("pass", PW); //PW넘겨주기
                   Toast.makeText(getApplicationContext(), ID + " || " + PW, Toast.LENGTH_LONG).show();
                   startActivity(intent);
               }
           }
       });



    }
}
