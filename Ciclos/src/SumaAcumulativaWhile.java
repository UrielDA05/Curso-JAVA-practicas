import java.util.Scanner;

public class SumaAcumulativaWhile {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el numero de la sumatoria: ");
        var num = Integer.parseInt(consola.nextLine());
        var acumulado = 0;
        var contador = 1;
        while (contador <= num){
            System.out.println("Acumulado de suma + numero: " + acumulado + " + " + contador);
            acumulado += contador;
            System.out.println("Suma de acumulado mas  el numero: " + acumulado);
            contador ++;
        }
        System.out.println("Resultado final: " + acumulado);
    }
}
