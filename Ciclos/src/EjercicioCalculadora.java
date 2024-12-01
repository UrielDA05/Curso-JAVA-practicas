import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("***  Calculadora en Java  ***");
        var salir = false;
        double cantidad1 = 0.00, cantidad2 = 0.00, resultado = 0.00;
        while (!salir){
            System.out.print("""
                    Menu:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    Escoge una opcion: \s""");
            var opcion = Byte.parseByte(consola.nextLine());
            switch (opcion){
                case 1: // Suma
                    System.out.print("Ingrese la primer cantidad: ");
                    cantidad1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese la segunda cantidad: ");
                    cantidad2 = Double.parseDouble(consola.nextLine());
                    resultado = cantidad1 + cantidad2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2: // Resta
                    System.out.print("Ingrese la primer cantidad: ");
                    cantidad1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese la segunda cantidad: ");
                    cantidad2 = Double.parseDouble(consola.nextLine());
                    resultado = cantidad1 - cantidad2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3: // Multiplicacion
                    System.out.print("Ingrese la primer cantidad: ");
                    cantidad1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese la segunda cantidad: ");
                    cantidad2 = Double.parseDouble(consola.nextLine());
                    resultado = cantidad1 * cantidad2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                case 4: // Divison
                    System.out.print("Ingrese la primer cantidad: ");
                    cantidad1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese la segunda cantidad: ");
                    cantidad2 = Double.parseDouble(consola.nextLine());
                    resultado = cantidad1 / cantidad2;
                    System.out.println("El resultado de la division es: " + resultado);
                    break;
                case 5: // Salir
                    System.out.println("Saliendo de la calculadora...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
