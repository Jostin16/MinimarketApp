package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Modelo.Productos;
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
        return new ProductosAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ProductosAdapter.ViewHolder holder,final int position) {
        holder.bindData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setItems(List<Productos> items){
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo, precio;
        ImageView imagen;

         ViewHolder(View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagen);
             titulo = itemView.findViewById(R.id.titulo);
             precio = itemView.findViewById(R.id.precio);
        }

        void bindData(final Productos item){
            int resID = context.getResources().getIdentifier(item.getImagen() , "drawable", context.getPackageName());
            if (resID!=-1)
                imagen.setImageResource(resID);

            titulo.setText(item.getTitulo());
            precio.setText(item.getPrecio());
        }
    }

}
