import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un numero: ");
        var numero = Integer.parseInt(consola.nextLine());
        if (numero > 0) {
            System.out.println(numero + " Es positivo");
        }else if (numero < 0) {
            System.out.println(numero + " Es negativo");
        
        }
    }
}
