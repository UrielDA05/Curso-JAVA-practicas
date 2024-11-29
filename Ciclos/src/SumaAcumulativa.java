import java.util.Scanner;

public class SumaAcumulativa {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el numero de la sumatori: ");
        var num = Integer.parseInt(consola.nextLine());
        var acumulado = 0;
        for (var contador = 1; contador <= num; contador++){
            System.out.println("Acumulado de suma + numero: " + acumulado + " + " + contador);
            acumulado += contador;
            System.out.println("Suma de acumulado mas numero: " + acumulado);
        }
        System.out.println("Resultado final: " + acumulado);
    }
}
// hacer con ciclo while y do-while
