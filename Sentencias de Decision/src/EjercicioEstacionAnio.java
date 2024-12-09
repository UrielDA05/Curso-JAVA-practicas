import java.util.Scanner;

public class EjercicioEstacionAnio {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el numero de mes (1-12): ");
        var numeroMes = Byte.parseByte(consola.nextLine());
        if (numeroMes == 1 || numeroMes == 2 || numeroMes == 12 ){
            System.out.println("Estamos en invierno");
        } else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5) {
            System.out.println("Estamos en primavera");
        } else if (numeroMes == 6 || numeroMes == 7 || numeroMes == 8) {
            System.out.println("Estamos en verano");
        } else if (numeroMes == 9 || numeroMes == 10 || numeroMes == 11) {
            System.out.println("Estamos en Otonio");
        }
        else {
            System.out.println("Estacion desconocida");
        }
    }
}
