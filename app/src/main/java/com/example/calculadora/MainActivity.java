package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Bsuma, Bresta, Bmulti, Bdivide;

        Bsuma = findViewById(R.id.B_Suma);
        Bresta = findViewById(R.id.B_Resta);
        Bmulti = findViewById(R.id.B_Product);
        Bdivide = findViewById(R.id.B_Divide);

        Bsuma.setOnClickListener(this);
        Bresta.setOnClickListener(this);
        Bmulti.setOnClickListener(this);
        Bdivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int result;
        int op1, op2;
        EditText EditOp1, EditOp2;

        EditOp1 = findViewById(R.id.Operando1);
        EditOp2 = findViewById(R.id.Operando2);
        op1 = Integer.parseInt(String.valueOf(EditOp1.getText()));

        switch (view.getId()) {
            case R.id.B_Suma:
                // result =
        break;
        }
    }
}