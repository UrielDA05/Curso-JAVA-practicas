import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu calificacion: ");
        var calificacion = Float.parseFloat(consola.nextLine());
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Tu nota es una A");
        
            System.out.println("Tu nota es una C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("Tu nota es una D");
        } else if (calificacion >= 5 && calificacion < 6) {
            System.out.println("Tu nota es una E");
        } else if (calificacion >= 0 && calificacion < 5) {
            System.out.println("Tu nota es una F");
        } else {
            System.out.println("Valor desconocido");
        }
    }
    }




