package com.example.anuradha.authorassig;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.eg);
        b1= (Button) findViewById(R.id.button);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data= e1.getText().toString();

               LayoutInflater inflater= getLayoutInflater();
                View view=inflater.inflate(R.layout.auth,null);
                Toast ref=Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT);
                ref.setView(view);
                ref.show();
            }
        });
    }
}
