import java.util.Scanner;
public class Presentacion {
    public static void main(String[] args) {
        var consola = new Scanner (System.in);
        System.out.println("Mi presentacion");
        System.out.print("Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Hijo unico: ");
        var hijoUnico = Boolean.parseBoolean(consola.nextLine());
        System.out.print("Bebida favorita: ");
        var bebidaFavorita = consola.nextLine();
        System.out.print("Precio de bebida favorita: ");
        var precioBebida = Float.parseFloat(consola.nextLine());

        System.out.println("Valores recibidos");
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("hijoUnico = " + hijoUnico);
        System.out.println("bebidaFavorita = " + bebidaFavorita);
        System.out.println("precioBebida =$" + precioBebida);
    }




}
