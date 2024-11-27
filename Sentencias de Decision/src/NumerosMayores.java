import java.util.Scanner;

public class NumerosMayores {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        var num2 = Integer.parseInt(consola.nextLine());
        if (num1 == num2 ){
            System.out.println("Ambos numeros son iguales");
        } else if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        }
        else {
            System.out.println("El numero mayor es: " + num2);
        }
    }
}
