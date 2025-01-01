import java.util.Scanner;

public class Numero_Par {
    // Funcion para saber si un numero es par
  
    public static void main(String[] args) {
        System.out.print("Proporciona un valor entero: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Numero par? " + esPar(numero));
    }
}
