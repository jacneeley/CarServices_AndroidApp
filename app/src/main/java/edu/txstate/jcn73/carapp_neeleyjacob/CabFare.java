package edu.txstate.jcn73.carapp_neeleyjacob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CabFare extends AppCompatActivity {
    //global variables
    public static double CAB_FEE = 5.50;
    public static double MILEAGE_FEE = 3.25;
    double inDistance;
    double costDistance;
    String cabType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab_fare);

        //UI Components
        EditText txtMileNum = findViewById(R.id.txtMileNum);
        Spinner group = findViewById(R.id.spnCabType);
        Button calculate = findViewById(R.id.btnCalc);
        TextView result = findViewById(R.id.txtResult);

        //Event Handling
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inDistance = Double.parseDouble(txtMileNum.getText().toString());
                costDistance = CAB_FEE + (MILEAGE_FEE * inDistance);
                cabType = group.getSelectedItem().toString();
                DecimalFormat formatter = new DecimalFormat("###,###.##");
                result.setText("Cab Type Requested: "+cabType+" fare cost: "+formatter.format(costDistance));

            }
        });

    }
}