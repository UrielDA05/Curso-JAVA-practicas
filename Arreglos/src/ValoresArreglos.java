import java.util.Scanner;

public class ValoresArreglos {
    public static void main(String[] args) {
       var consola  = new Scanner(System.in);
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        int[] enteros = new int[largoArreglo] ;
        for (int i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona el valor enteros[" + i + "]: ");
            enteros[i] = Integer.parseInt(consola.nextLine());
            {
        System.out.println("\n Impresion del arreglo: ");
        for (int i = 0; i < largoArreglo; i++){
            System.out.println("enterso[" + i + "]: "+enteros[i]);
        }
    }
}
