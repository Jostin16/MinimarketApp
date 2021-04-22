package idat.com.minimarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import idat.com.minimarketapp.databinding.ActivityDatosPersonalesBinding;
import idat.com.minimarketapp.databinding.ActivityMainBinding;

public class Datos_personales extends AppCompatActivity implements View.OnClickListener {

    private ActivityDatosPersonalesBinding binding;
    private RegistroActivity registroActivity;
    private TextView tvnombre,tvapellido,tvcorreo,tvtelefono,tvcontraseña,tvdireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatosPersonalesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rbhombre.setOnClickListener(this);
        binding.rbmujer.setOnClickListener(this);
        binding.rbotro.setOnClickListener(this);


        getSupportActionBar().hide();

    }






    @Override
    public void onClick(View view) {
        String genero = "";
        switch (view.getId()) {
                case R.id.rbhombre:
                    genero = "Hombre";
                    break;
                case R.id.rbmujer:
                    genero = "Mujer";
                    break;
                case R.id.rbotro:
                    genero = "Otro";
                    break;
            }
    }
}