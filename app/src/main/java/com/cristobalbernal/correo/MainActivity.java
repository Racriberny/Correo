package com.cristobalbernal.correo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cristobalbernal.correo.ui.Model.Cuenta;
import com.cristobalbernal.correo.ui.Model.ParseCorreo;

public class MainActivity extends AppCompatActivity {
    private Cuenta cuentas;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ParseCorreo parser = new ParseCorreo(this);
        if(parser.parse()) {
            this.cuentas = parser.getCuenta();
        }
        System.out.println(cuentas);




    }
}