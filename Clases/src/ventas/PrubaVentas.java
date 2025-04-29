package ventas;


public class PrubaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de ventas ***");
        var camisa1 = new Producto("Camisa", 50.00);
        System.out.println(camisa1);
        var pantalon1 = new Producto("Pantalon", 100.00);
        System.out.println(pantalon1);

    }
}
