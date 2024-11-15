import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Registro de empleados ***");
        System.out.print("Proporciona tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Proporciona tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona tu sueldo (pesos):$");
        var sueldo = Float.parseFloat(consola.nextLine());
        System.out.print("Eres un empleado de confianza(true/false)? ");
        var respuesta = consola.nextLine();

        System.out.println("Informacion proporcionad: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Empleado de confianza: " + respuesta);

    }

}
