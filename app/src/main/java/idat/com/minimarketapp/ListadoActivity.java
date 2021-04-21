package idat.com.minimarketapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.ProductosAdapter;
import Modelo.Productos;

public class ListadoActivity  extends AppCompatActivity {

    List<Productos> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        getSupportActionBar().hide();
        init();
    }

    public void init(){
        productos = new ArrayList<>();
        productos.add(new Productos("fresas","Fresas 500gr","S/ 9.56"));
        productos.add(new Productos("arandanos","Arándanos 250gr","S/ 7.88"));
        productos.add(new Productos("arroz","Arroz Costeño 750gr","S/ 3.50"));
        productos.add(new Productos("camote","Camote Amarrillo 1k","S/ 2.69"));
        productos.add(new Productos("fideos","Fideos Don Vittorio","S/ 2.89"));
        productos.add(new Productos("gelatina","Gelatina  Universal 75gr","S/ 2.20"));
        productos.add(new Productos("globopop","Globo Pop Led Print","S/ 1.00"));
        productos.add(new Productos("guarana","Guarana 3L","S/ 7.00"));
        productos.add(new Productos("harina","Harina Blanca Flor 1k","S/ 6.99"));
        productos.add(new Productos("mayonesa","Mayonesa 95gr","S/ 13.22"));
        productos.add(new Productos("papaslays","Papas Lays 85gr","S/ 4.10"));
        productos.add(new Productos("sal","Sal Marina 1k","S/ 1.89"));

        ProductosAdapter productosAdapter = new ProductosAdapter(productos,this);
        RecyclerView recyclerView = findViewById(R.id.listReyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(productosAdapter);
    }
}