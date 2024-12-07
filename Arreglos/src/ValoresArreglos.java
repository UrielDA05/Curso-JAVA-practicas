import java.util.Scanner;

public class ValoresArreglos {
    public static void main(String[] uriel) {
       var consola  = new Scanner(System.in);
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        int[] enteros = new int[largoArreglo] ;
        for (int i = 0; i < largoArreglo; i++){
            System.out.print("Prporciona el valor enteros[" + i + "]: ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        System.out.println("\nImpresion del arreglo: ");
        for (int i = 0; i < largoArreglo; i++){
            System.out.println("enterso[" + i + "]: "+enteros[i]);
        }
    }
}