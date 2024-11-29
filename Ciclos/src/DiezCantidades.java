import javax.swing.JOptionPane;
import java.util.Scanner;

public class DiezCantidades {
    public static void main(String[] args) {
        int num, res, ast;
        short numVeces = 1;
        var consola = new Scanner(System.in);
        do{
            System.out.println("\n Ingrese el valor: ");
            num = Integer.parseInt(consola.nextLine());
            res = num % 2;
            if (res == 0) {
                ast = num / 2;
                for (int nAst = 1; nAst <= ast; nAst++) {
                    System.out.print(" * ");
                }
            } else {
                System.out.println (" IMPAR ");
            }
            numVeces++;
        } while (numVeces <= 10);
    }
}
