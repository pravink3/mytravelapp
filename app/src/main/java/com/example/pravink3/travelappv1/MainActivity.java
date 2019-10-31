package com.example.pravink3.travelappv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name =(EditText)findViewById(R.id.edname);
        Password = (EditText)findViewById(R.id.etpassword);
        Login = (Button)findViewById(R.id.btnlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private  void validate (String username,String userpassword){
        if((username.equals("Admin")) && (userpassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this , SecondActivity.class);
            startActivity(intent);
        }
    }

}
