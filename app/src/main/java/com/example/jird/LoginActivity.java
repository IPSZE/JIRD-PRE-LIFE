package com.example.jird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username,password;
    Button login;
    String name,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.login_btn_confirm);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username  = (EditText)findViewById(R.id.login_edit_phone);
                password = (EditText)findViewById(R.id.login_edit_psw);
                name = username.getText().toString();
                pass = password.getText().toString();
                if(name.equals("") || pass.equals("")){
                    Toast.makeText(LoginActivity.this, "Please enter the correct username and password", Toast.LENGTH_LONG).show();
                }else{

                }
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
