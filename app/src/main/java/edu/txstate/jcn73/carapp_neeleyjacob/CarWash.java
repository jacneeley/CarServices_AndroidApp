package edu.txstate.jcn73.carapp_neeleyjacob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CarWash extends AppCompatActivity {
    //global variables
    public static double EXTERIOR =10.50;
    public static double EXT_PLUS = 15.00;
    double washCount;
    double washType;
    double washTotal;
    String selectedWash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_wash);

        //UI
        EditText txtWashAmount = findViewById(R.id.txtWashNum);
        RadioButton exterior = findViewById(R.id.radExterior);
        RadioButton exteriorPlus = findViewById(R.id.radExteriorPlus);
        Button calcWash = findViewById(R.id.btnCalcWash);
        TextView washResult = findViewById(R.id.txtWashResult);

        //Event
        calcWash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                washCount = Double.parseDouble(txtWashAmount.getText().toString());

                if (exterior.isChecked()){
                    washType = EXTERIOR;
                    selectedWash = "Exterior Wash";
                }
                else {
                    washType=EXT_PLUS;
                    selectedWash = "Exterior Wash w/Vacuum Interior Service";
                }
                washTotal = washType * washCount;

                DecimalFormat formatter = new DecimalFormat("###,###.##");
                washResult.setText("Wash Type: " + selectedWash + " Total: " + washTotal);
            }
        });

    }
}