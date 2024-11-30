import java.util.Scanner;

public class EjercicioCajero {
    public static void main(String[] args) {
        System.out.println("***  Cajero Automatico ***");
        var salir = false;
        var saldo = 1000.00;
        while (!salir){
            System.out.print("""
                    Menu: 
                    1. Consultar saldo
                    2. Retirar 
                    3. Depositar
                    4. Salir
                    Escoge una opcion: \s""");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (opcion){
                case 1 -> System.out.println("Su saldo es de: $" + saldo);
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: $");
                    var retiro = Double.parseDouble(new Scanner(System.in).nextLine());
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Su saldo restante es de: $" + saldo);
                    } else {
                        System.out.println("No hay suficiente saldo: $" + saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a depositar: $");
                    var deposito = Double.parseDouble(new Scanner(System.in).nextLine());
                    saldo += deposito;
                    System.out.println("Su saldo disponible es de: $" + saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero...");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
