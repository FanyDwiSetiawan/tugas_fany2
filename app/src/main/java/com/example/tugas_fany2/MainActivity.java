package com.example.tugas_fany2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tugas_fany2.Menu1;
import com.example.tugas_fany2.Menu2;
import com.example.tugas_fany2.Menu3;
import com.example.tugas_fany2.Menu4;


public class MainActivity extends AppCompatActivity {

    ImageView ivapel, ivpisang, ivanggur, ivjeruk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivapel = findViewById(R.id.iv_apel);
        ivapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Menu1.class);
                startActivity(intent);
            }
        });

        ivpisang = findViewById(R.id.iv_pisang);
        ivpisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Menu2.class);
                startActivity(intent);
            }
        });

        ivanggur= findViewById(R.id.iv_anggur);
        ivanggur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Menu3.class);
                startActivity(intent);
            }
        });

        ivjeruk = findViewById(R.id.iv_jeruk);
        ivjeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Menu4.class);
                startActivity(intent);
            }
        });



    }
}