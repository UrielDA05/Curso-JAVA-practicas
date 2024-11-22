import java.util.Scanner;

public class UsuarioPassword {
    public static void main(String[] args) {
        // Revisar si ususario y password son iguales
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu usuario? ");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu password? ");
        var password = consola.nextLine();
        // Revision ususario=admin y passwors=12345
        var usuarioV = "admin";
        var passwordV = "12345";
        if (usuarioV.equals(usuario) && passwordV.equals(password)) {
            System.out.println("Entrando al sistema");
        } else if (usuarioV.equals(usuario) && !passwordV.equals(password)) {
            System.out.println("El password es incorrecto");
        } else if (!usuarioV.equals(usuario) && passwordV.equals(password)) {
            System.out.println("El usuario es incorrecto");
        } else {
            System.out.println("Valores incorrectos");
        }
    }
}
