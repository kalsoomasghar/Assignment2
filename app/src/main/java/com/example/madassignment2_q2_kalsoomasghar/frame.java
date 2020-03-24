package com.example.madassignment2_q2_kalsoomasghar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class frame extends AppCompatActivity implements View.OnClickListener {

    ImageView b;
    ImageView b2;
    ImageView b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        b=findViewById(R.id.fb);
        b2=findViewById(R.id.fb2);
        b3=findViewById(R.id.fb3);

        b.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
   /*     b.setOnClickListener(new View.OnClickListener()
                             {
                                 @Override
                                 public void onClick(View v)
                                 {
                                     Intent i=new Intent(frame.this, relative.class);
                                     startActivity(i);
                                 }
                             }

        );*/




    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.fb)
        {
            b.setVisibility(v.GONE);
            b2.setVisibility(v.VISIBLE);
            b3.setVisibility(v.GONE);
        }
        else  if(v.getId()==R.id.fb2)
        {
            b.setVisibility(v.GONE);
            b2.setVisibility(v.GONE);
            b3.setVisibility(v.VISIBLE);
        }
        else
        {
            b.setVisibility(v.GONE);
            b2.setVisibility(v.GONE);
            b3.setVisibility(v.GONE);
            Intent i=new Intent(frame.this, relative.class);
            startActivity(i);
        }

    }
}
