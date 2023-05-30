package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.Math;

public class TipCalculatorActivity extends AppCompatActivity {

    private EditText checkamount_;
    private EditText Partysize_;
    private Button TipCalc_;

    private EditText tip1;
    private EditText tip2;
    private EditText tip3;
    private EditText total1;
    private EditText total2;
    private EditText total3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        checkamount_ = (EditText) findViewById(R.id.checkAmountValue);
        Partysize_ = (EditText) findViewById(R.id.partySizeValue);
        TipCalc_ = (Button) findViewById(R.id.buttonCompute);

        tip1 = (EditText) findViewById(R.id.fifteenPercentTipValue);
        tip2 = (EditText) findViewById(R.id.twentyPercentTipValue);
        tip3 = (EditText) findViewById(R.id.twentyfivePercentTipValue);
        total1 = (EditText) findViewById(R.id.fifteenPercentTotalValue);
        total2 = (EditText) findViewById(R.id.twentyPercentTotalValue);
        total3 = (EditText) findViewById(R.id.twentyfivePercentTotalValue);

        TipCalc_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkamount_.getText().toString().isEmpty() || Partysize_.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), R.string.toastError, Toast.LENGTH_SHORT).show();
                    tip1.setText("");
                    tip2.setText("");
                    tip3.setText("");
                    total1.setText("");
                    total2.setText("");
                    total3.setText("");
                }
                else {
                    double checkamount = Double.parseDouble(checkamount_.getText().toString()); //convert to Double
                    int Partysize = Integer.parseInt(Partysize_.getText().toString());
                    double eqDist = checkamount / Partysize; //convert to Double
                    if (checkamount <= 0 || Partysize <= 0) {
                        Toast.makeText(getApplicationContext(), R.string.toastError, Toast.LENGTH_SHORT).show();
                        tip1.setText("");
                        tip2.setText("");
                        tip3.setText("");
                        total1.setText("");
                        total2.setText("");
                        total3.setText("");
                    }
                    else{
                        //convert all to Double
                        long valtip1 = Math.round((15 * eqDist)/100);
                        long valtip2 = Math.round((20 * eqDist)/100);
                        long valtip3 = Math.round((25 * eqDist)/100);
                        long valtotal1 = Math.round(valtip1 + eqDist);
                        long valtotal2 = Math.round(valtip2 + eqDist);
                        long valtotal3 = Math.round(valtip3 + eqDist);

                        tip1.setText(String.valueOf(valtip1));
                        tip2.setText(String.valueOf(valtip2));
                        tip3.setText(String.valueOf(valtip3));
                        total1.setText(String.valueOf(valtotal1));
                        total2.setText(String.valueOf(valtotal2));
                        total3.setText(String.valueOf(valtotal3));
                    }
                }
            }
        });
    }
}