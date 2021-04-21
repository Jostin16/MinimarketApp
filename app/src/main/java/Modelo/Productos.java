package Modelo;

public class Productos {
    public String imagen;
    public String titulo;
    public String precio;


    public Productos(String imagen, String titulo, String precio) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
