import java.util.Scanner;

public class ValorEnRango {
    public static void main(String[] args) {
        // Definicion del rango a evaluar
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el valor inicial: ");
        var valorI = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el valor final: ");
        var valorF = Integer.parseInt(consola.nextLine());
        // Solicitud del valor a encontrar
        System.out.print("Ingrese el valor a encontrar: ");
        var valorE = Integer.parseInt(consola.nextLine());
        // Evaluacion
        var respuesta = (valorE >= valorI && valorE <= valorF);
        // Res
        System.out.println(valorE  + " se encuentra en el rango de " + valorI + " a " + valorF + ": " + respuesta);
    }
}
