package com.ahk.azkar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Page1  extends AppCompatActivity {
    Button bu_start1,bu_start2,bu_start3,bu_pusse1,bu_pusse2,bu_pusse3,bu_plus1,bu_plus2,bu_plus3,bu_min1,bu_min2,bu_min3;
    TextView t1,t2,t3;
    MediaPlayer mp1,mp2,mp3;
    int ts1,ts2,ts3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);

        bu_start1=(Button)findViewById(R.id.bu_start1);
        bu_start2=(Button)findViewById(R.id.bu_start2);
        bu_start3=(Button)findViewById(R.id.bu_start3);
        bu_pusse1=(Button)findViewById(R.id.bu_pusse1);
        bu_pusse2=(Button)findViewById(R.id.bu_pusse2);
        bu_pusse3=(Button)findViewById(R.id.bu_pusse3);
        bu_plus1=(Button)findViewById(R.id.bu_plus1);
        bu_plus2=(Button)findViewById(R.id.bu_plus2);
        bu_plus3=(Button)findViewById(R.id.bu_plus3);
        bu_min1=(Button)findViewById(R.id.bu_min1);
        bu_min2=(Button)findViewById(R.id.bu_min2);
        bu_min3=(Button)findViewById(R.id.bu_min3);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        mp1 = MediaPlayer.create(this,R.raw.mp01);
        mp2 = MediaPlayer.create(this,R.raw.mp02);
        mp3 = MediaPlayer.create(this,R.raw.mp03);
        ts1=((int) t1.getTextSize())/3;
        ts2=((int) t2.getTextSize())/3;
        ts3=((int) t3.getTextSize())/3;

        bu_start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        bu_start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        bu_start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        bu_pusse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.pause();
            }
        });
        bu_pusse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();
            }
        });
        bu_pusse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();
            }
        });


        bu_plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ts1<40)
                {ts1++;
                    t1.setTextSize(ts1);
                }
                else
                {
                    Toast.makeText(Page1.this, "لا يمكن ان يزيد الخط", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bu_plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ts2<40)
                {
                    ts2++;
                    t2.setTextSize(ts2);
                }
                else
                {
                    Toast.makeText(Page1.this, "لا يمكن ان يزيد الخط", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bu_plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ts3<40)
                {ts3++;
                    t3.setTextSize(ts3);
                }
                else
                {
                    Toast.makeText(Page1.this, "لا يمكن ان يزيد الخط", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bu_min1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ts1>15)
                {ts1--;
                    t1.setTextSize(ts1);
                }
                else
                {
                    Toast.makeText(Page1.this, "لا يمكن ان يقل الخط", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bu_min2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ts2>15)
                {ts2--;
                    t2.setTextSize(ts2);
                }
                else
                {
                    Toast.makeText(Page1.this, "لا يمكن ان يقل الخط", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bu_min3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ts3>15)
                {ts3--;
                    t3.setTextSize(ts3);
                }
                else
                {
                    Toast.makeText(Page1.this, "لا يمكن ان يقل الخط", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
