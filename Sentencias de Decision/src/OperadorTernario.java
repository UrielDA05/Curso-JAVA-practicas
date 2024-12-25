
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese un primer numero: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese un segundo numero");
        var num2 = Integer.parseInt(consola.nextLine());
        System.out.println( num1 >num2 ? num1 : num2);
    }
}
