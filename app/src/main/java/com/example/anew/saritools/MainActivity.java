package com.example.anew.saritools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    Button btnPrice, btnInventory, btnNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrice = (Button)findViewById(R.id.btnPrice);
        btnInventory = (Button)findViewById(R.id.btnInventory);
        btnNote = (Button)findViewById(R.id.btnNote);

        btnPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PriceActivity.class);
                startActivity(i);
            }
        });

        btnInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, InventoryActivity.class);
                startActivity(i);
            }
        });

        btnNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NoteActivity.class);
                startActivity(i);
            }
        });

    }

}