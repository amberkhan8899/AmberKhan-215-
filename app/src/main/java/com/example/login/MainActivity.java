package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText E,P;
    Button B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        E = (EditText) findViewById(R.id.email);
        P = (EditText) findViewById(R.id.password);
        B = (Button) findViewById(R.id.SignIn);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E.getText().toString().equals("") || P.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "PLEASE FILL THE EMPTY FIELDS!", Toast.LENGTH_LONG).show();
                }
                else {
                    String email= E.getText().toString();
                    String password= P.getText().toString();
                    Intent in= new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("keyemail",email);
                    in.putExtra("keypassword", password);
                    startActivity(in);
                }
            }
        });
    }
}