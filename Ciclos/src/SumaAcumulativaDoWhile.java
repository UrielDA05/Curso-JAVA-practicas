import java.util.Scanner;

public class SumaAcumulativaDoWhile {
    public static void main(String[] args) {
        
        do {
            System.out.println("Acumulado de suma + numero: " + acumulado + " + " + contador);
            acumulado += contador;
            System.out.println("Suma de acumulado mas  el numero: " + acumulado);
            contador ++;
        } while (contador <= num);
        System.out.println("Resultado final: " + acumulado);
    }
}
