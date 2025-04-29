package ventas;

public class Producto {
    private final int IDPRODUCTO;
    private String nombre;
    private double precio;
    private static int contadorproductos;

    public Producto(String nombre, double precio){
        this.IDPRODUCTO = ++ Producto.contadorproductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString(){
        return "Producto{" + "idProducto = " + this.IDPRODUCTO
                + ", nombre = " + this.nombre + ", precio = " + this.precio + '}';
    }
}
