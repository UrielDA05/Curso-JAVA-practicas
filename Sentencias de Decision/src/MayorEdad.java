import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = Byte.parseByte(consola.nextLine());
        if(edad >= 18) {
            System.out.println("La persona con " + edad + " anios, es mayor de edad");
        }else{
            System.out.println("La persona con " + edad + " anios, es menor de edad");
            
        }
    }
}
