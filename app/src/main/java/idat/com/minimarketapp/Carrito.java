package idat.com.minimarketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Instant;


public class Carrito extends AppCompatActivity {

    private TextView texPrecioTXT;
    private Button btnmas, btnmenos;
    private EditText total, cantidad;
    private Button flecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        btnmas = findViewById(R.id.btnmas);
        btnmenos = findViewById(R.id.btnmenos);
        texPrecioTXT = findViewById(R.id.texPrecioTXT);
        total = findViewById(R.id.total);
        cantidad = findViewById(R.id.cantidad);
        flecha = findViewById(R.id.flecha);
        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _cantidad = cantidad.getText().toString();
                int Incremento = Integer.parseInt(_cantidad) + 1;
                cantidad.setText(String.valueOf(Incremento));
            }
        });

        btnmenos.setOnClickListener((view) -> {
            String _cantidad = cantidad.getText().toString();
            int Incremento = Integer.parseInt(_cantidad) - 1;
            if (Incremento < 0)
                Incremento = 0;
            cantidad.setText(String.valueOf(Incremento));
        });

        cantidad.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                String _cantidad = cantidad.getText().toString();
                int Incremento = Integer.parseInt(_cantidad);
            }
        });

        getSupportActionBar().hide();
    }

   public void regresar(View view){
       Intent intent=new Intent(Carrito.this,ListadoActivity.class);
       startActivity(intent);
   }

}