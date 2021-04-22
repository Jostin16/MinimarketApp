package idat.com.minimarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String titulo = "";
        String precio = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null){
             titulo = extras.getString("titulo");
             precio = extras.getString("precio");
        }

        TextView tvTitulo = (TextView) findViewById(R.id.tvdetalletitulo);
        TextView tvPrecio = (TextView) findViewById(R.id.tvdetalledescripcion);

        tvTitulo.setText(titulo);
        tvPrecio.setText(precio);

        getSupportActionBar().hide();
    }

    public void nextButton(View view){
        Intent screenCarrito = new Intent(DetailsActivity.this,Carrito.class);
        startActivity(screenCarrito);
    }
}