package idat.com.minimarketapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frmregistro);
        getSupportActionBar().hide();

    }

    public void screenDatos(View view){
        Toast.makeText(RegistroActivity.this, "¡Te has registrado con exito!", Toast.LENGTH_SHORT).show();
        Intent personalData = new Intent(RegistroActivity.this,Datos_personales.class);
        startActivity(personalData);
    }

}
