package com.harsha.tempconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText centigrade = findViewById(R.id.edittext_centi);
        EditText farenhit = findViewById(R.id.edittext_faren);
        Button calculate = findViewById(R.id.button_calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String centi = centigrade.getText().toString();
                String faren = farenhit.getText().toString();

                    if (faren.isEmpty()) {

                        if(centi.isEmpty()){
                            Toast.makeText(MainActivity.this,"Enter the Input",Toast.LENGTH_SHORT).show();
                        }else{
                            int centiInt = Integer.parseInt(centi);
                            double farenhitint = (centiInt * 1.8) + 32;
                            DecimalFormat myNew = new DecimalFormat("0.00");
                            String faren_Final_1 = myNew.format(farenhitint);
                            farenhit.setText(faren_Final_1+"°F");
                        }

                    }
                    else{
                        int farenInt = Integer.parseInt(faren);
                        double centiint = (farenInt - 32) / 1.8;
                        DecimalFormat myNew = new DecimalFormat("0.00");
                        String centi_Final_1 = myNew.format(centiint);
                        centigrade.setText(centi_Final_1+"°C");
                    }


            }


        });


    }
}