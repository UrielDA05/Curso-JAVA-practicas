import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("CAlCULO DE AREA DE RECTANGULO");
        System.out.print("Ingrese la medida de la base: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la medida de la altura: ");
        var altura = Integer.parseInt(consola.nextLine());
        var area = 0;
        area = base * altura;
        
    }
}
