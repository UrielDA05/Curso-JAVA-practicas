import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un mes (1-12): ");
        var mes = Byte.parseByte(consola.nextLine());
        var estacion = "Estacion desconocida";
        switch (mes){
            case 1: case 2: case 12:
                System.out.println("La estacion es invierno");
                break;
            case 3: case 4: case 5:
                System.out.println("La estacion es primavera");
                break;
            case 6: case 7: case 8:
                System.out.println("La estacion es verano");
                break;
            case 9: case 10: case 11:
                System.out.println("La estacion es otonio");
                break;
            default:
                System.out.println(estacion);
        }

    }
}
