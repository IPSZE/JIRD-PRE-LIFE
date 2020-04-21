package com.example.jird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_orders,btn_clients,btn_finance;
    TextView welcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeMessage = (TextView)findViewById(R.id.welcome);
        btn_orders = (Button)findViewById(R.id.btn_orders);
        btn_clients = (Button)findViewById(R.id.btn_clients);
        btn_finance = (Button)findViewById(R.id.btn_finance);


        Intent intent = getIntent();
        String nameString = intent.getStringExtra("name");

        welcomeMessage.setText("Hello, " + nameString);
    }
}

