import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de cadenas
        var cadena1 = "Juan";
        var cadena2 = "Juan";
        var consola = new Scanner (System.in);
        System.out.print("Proporcione una cadena: ");
        var cadena3 = consola.nextLine();
        if (cadena1 == cadena3){
            System.out.println("Las cadenas son iguales (en referencia de memoria)");
        }
        else {
            System.out.println("Las cadenas son diferentes (en referencia de memoria)");
        }
        // comparacion metodo equals
        if (cadena1.equalsIgnoreCase(cadena3)){
            // IgnoreCase anula minusculas y mayusculas
            System.out.println("Las cadenas son iguales (en contenido)");
        }
        else {
            System.out.println("Las cadenas no son iguales (en contenido)");
        }
    }
}
