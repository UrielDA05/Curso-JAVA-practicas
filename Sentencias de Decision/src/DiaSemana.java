import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el dia de la semana: ");
        var diaSemana = Integer.parseInt(consola.nextLine());
        // Sintaxis mejorada
        switch (diaSemana){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Valor de dia erroneo: " + diaSemana);
        }
    }
}
