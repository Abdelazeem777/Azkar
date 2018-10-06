package com.ahk.azkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button bu_azkarat,bu_tatbeak,bu_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bu_azkarat=(Button)findViewById(R.id.bu_askarat);
        bu_tatbeak=(Button)findViewById(R.id.bu_tatbeak);
        bu_close=(Button)findViewById(R.id.bu_close);

        bu_azkarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(Main.this,Page1.class);
                startActivity(i1);
            }
        });
        bu_tatbeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Main.this,Page2.class);
                startActivity(i2);
            }
        });
        bu_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
