import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("CAlCULO DE AREA DE RECTANGULO");
        System.out.print("Ingrese el valor de la base: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el valor de la altura: ");
        var altura = Integer.parseInt(consola.nextLine());
        var area = 0;
        area = base * altura;
        System.out.println("El area del rectangulo es de: " + area);
        var perimetro = 0;
        perimetro = 2(base + altura)
        System.out.println("El perimetro del rectandulo es de: " + perimetro);
    }
}
