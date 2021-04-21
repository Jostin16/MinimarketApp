package idat.com.minimarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import idat.com.minimarketapp.databinding.ActivityPantallaInicioBinding;

public class PantallaInicioActivity extends AppCompatActivity {

    private ActivityPantallaInicioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPantallaInicioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
    }

    public void loginButton(View view){
        Intent screenLogin = new Intent(PantallaInicioActivity.this,LoginActivity.class);
        startActivity(screenLogin);
    }
}