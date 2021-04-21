package idat.com.minimarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import idat.com.minimarketapp.databinding.ActivityLoginBinding;
import idat.com.minimarketapp.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
    }

    public void nextButton(View view){
        Intent screenProductos = new Intent(LoginActivity.this,ListadoActivity.class);
        startActivity(screenProductos);
    }



}