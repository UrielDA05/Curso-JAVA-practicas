import java.util.Scanner;

public class EjemDetalleLibro {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("Ingresa el titulo del libro");
        var titulo=console.nextLine();
        System.out.println("Ingresa el autor del libro");
        var autor=console.nextLine();
        System.out.println(titulo+ " fue escrito por " + autor);
    }
}
