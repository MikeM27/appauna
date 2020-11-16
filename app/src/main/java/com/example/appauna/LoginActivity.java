package com.example.appauna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    Button btnIngresar;
    String user = "user";
    String pass = "0000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser=(EditText)findViewById(R.id.edtUser);
        edtPass=(EditText)findViewById(R.id.edtPass);
        btnIngresar=(Button) findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtUser.getText().toString().equals(user) &&
                        edtPass.getText().toString().equals(pass)){
                    Toast.makeText(LoginActivity.this, "¡Bienvenido!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), EnviarMaterialActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña Incorrecto!", Toast.LENGTH_LONG).show();
                }
                edtUser.setText("");
                edtPass.setText("");
                edtUser.findFocus();
            }
        });

    }
}