package com.example.perritos2022jun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private static final String USERNAME= "practica";
    private static final String PASSWORD = "pass1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextInputLayout passwordTextInput = findViewById(R.id.password);
        TextInputLayout usernameTextInput = findViewById(R.id.username);
        TextInputEditText passwordEditText = findViewById(R.id.password_edit_text);
        TextInputEditText usernameEditText = findViewById(R.id.username_edit_text);
        Button nextButton = findViewById(R.id.next_button);
        Button cancelButton = findViewById(R.id.cancel_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //manejador butón next
                //setear password menor de 8 caract.

                boolean error=false;
                if (usernameEditText.getText().toString().equals("")){
                    error= true;
                    usernameTextInput.setError("Username esta vacio");

                }else{
                    usernameTextInput.setError(null);
                }
                if ((passwordEditText.getText()==null) || (passwordEditText.getText().length()<8)) {
                    error = true;
                    passwordTextInput.setError("password debe tener 8 o mas caracteres");
                }else{
                    passwordTextInput.setError(null);
                }
                if (!error){
                    if (login(usernameEditText.getText().toString(), passwordEditText.getText().toString() )){
                        //usuario validado correctamente
                        //iniciar segunda actividad

                        Intent intent = new Intent(MainActivity.this, ActivityMostrar.class);

                        startActivity(intent);



                    }else{
                        //falla usuario o password
                        Toast toast = Toast.makeText(MainActivity.this, "Login incorrecto. Intentalo de nuevo", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                }

            }
        });

       //limpia error de usarname
        usernameEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (usernameEditText.getText().toString() != ""){
                    usernameTextInput.setError(null); // limpiar el error
                }

                return false;
            }
        });

        passwordEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (passwordEditText.getText().toString().length() >=8){
                    passwordTextInput.setError(null); //limpiear el error
                }
                return false;
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernameEditText.getText().clear();
                passwordEditText.getText().clear();
            }
        });

    }

    private boolean login( String username, String password){
        //validacion del uauario logado
        return username.equalsIgnoreCase(USERNAME) && password.equals(PASSWORD);
    }



}