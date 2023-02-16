package edu.txstate.jcn73.carapp_neeleyjacob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UI Components for Welcome Page
        Button viewCabFare = findViewById(R.id.btnFare);
        Button viewCarWash = findViewById(R.id.btnWash);


        //Event Handling
        viewCabFare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, CabFare.class);
                startActivity(next);
            }
        });

        viewCarWash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, CarWash.class);
                startActivity(next);
            }
        });
    }
}