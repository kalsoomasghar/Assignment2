package com.example.madassignment2_q2_kalsoomasghar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relative extends AppCompatActivity {


    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

b=findViewById(R.id.rb);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v)
                                 {
                                     Intent i=new Intent(relative.this, MainActivity.class);
                                     i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                     startActivity(i);
                                 }
                             }

        );


    }
}
