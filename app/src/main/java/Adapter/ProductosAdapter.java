package Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Modelo.Productos;
import idat.com.minimarketapp.DetailsActivity;
import idat.com.minimarketapp.R;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder> {
    private List<Productos> mData;
    private LayoutInflater mInflater;
    private Context context;



    public ProductosAdapter(List<Productos> itemsList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_lista,null);
        //evento a los botones
        return new ProductosAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ProductosAdapter.ViewHolder holder,final int position) {
        holder.bindData(mData.get(position));

        //eventos del boton
        holder.setOnClickListener();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setItems(List<Productos> items){
        mData = items;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        //context
        Context context;

        TextView titulo, precio;
        ImageView imagen;
        //botones
        Button btnver;

         ViewHolder(View itemView) {
            super(itemView);

            // context
            context = itemView.getContext();

            imagen = itemView.findViewById(R.id.imagen);
             titulo = itemView.findViewById(R.id.titulo);
             precio = itemView.findViewById(R.id.precio);
             //boton
             btnver = (Button) itemView.findViewById(R.id.btnvermas);
        }

        //asignar los eventos click
        void setOnClickListener(){
             btnver.setOnClickListener(this);
        }

        void bindData(final Productos item){
            int resID = context.getResources().getIdentifier(item.getImagen() , "drawable", context.getPackageName());
            if (resID!=-1)
                imagen.setImageResource(resID);

            titulo.setText(item.getTitulo());
            precio.setText(item.getPrecio());
        }

        //ahora tiene acceso al context
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnvermas:
                    Intent intent = new Intent(context, DetailsActivity.class);//invocando a la actividad del detalle del producto
                    intent.putExtra("titulo",titulo.getText());
                    intent.putExtra("precio",precio.getText());
                    context.startActivity(intent);
                    break;
            }
        }
    }

}
