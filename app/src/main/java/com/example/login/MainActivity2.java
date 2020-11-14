package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String alpha[];
    String User1[] = {"a@gmail.com", "1"};
    String User2[] = {"b@gmail.com", "2"};
    String User3[] = {"c@gmail.com", "3"};
    String User4[] = {"d@gmail.com", "4"};
    String User5[] = {"e@gmail.com", "5"};
    String User6[] = {"f@gmail.com", "6"};
    String User7[] = {"g@gmail.com", "7"};
    String User8[] = {"h@gmail.com", "8"};
    String User9[] = {"i@gmail.com", "9"};
    String User10[] = {"j@gmail.com", "10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String email = getIntent().getStringExtra("keyemail");
        String password = getIntent().getStringExtra("keypassword");

        if((email.equals(User1[0]) && password.equals(User1[1])) ||
                (email.equals(User2[0]) && password.equals(User2[1])) ||
                (email.equals(User3[0]) && password.equals(User3[1])) ||
                (email.equals(User4[0]) && password.equals(User4[1])) ||
                (email.equals(User5[0]) && password.equals(User5[1])) ||
                (email.equals(User6[0]) && password.equals(User6[1])) ||
                (email.equals(User7[0]) && password.equals(User7[1])) ||
                (email.equals(User8[0]) && password.equals(User8[1])) ||
                (email.equals(User9[0]) && password.equals(User9[1])) ||
                (email.equals(User10[0]) && password.equals(User10[1]))){

            alpha=getResources().getStringArray(R.array.alphabets);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alpha);
            GridView gridview = (GridView) findViewById(R.id.gridView1);
            gridview.setAdapter(adapter);
            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id)
                {
                    Intent in= new Intent(MainActivity2.this, MainActivity3.class);
                   in.putExtra("alpha",alpha[position]);
                    startActivity(in);
                }
            });
        }

       else if ((!email.equals(User1[0]) || !password.equals(User1[1])) && (!email.equals(User2[0]) || !password.equals(User2[1])) &&
                (!email.equals(User3[0]) || !password.equals(User3[1])) && (!email.equals(User4[0]) || !password.equals(User4[1])) &&
                (!email.equals(User5[0]) || !password.equals(User5[1])) && (!email.equals(User6[0]) || !password.equals(User6[1])) &&
                (!email.equals(User7[0]) || !password.equals(User7[1])) && (!email.equals(User8[0]) || !password.equals(User8[1])) &&
                (!email.equals(User9[0]) || !password.equals(User9[1])) &&
                (!email.equals(User10[0]) || !password.equals(User10[1]))) {

            Toast.makeText(MainActivity2.this, "INVALID EMAIL OR PASSWORD!", Toast.LENGTH_LONG).show();
        }
    }
}