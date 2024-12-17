import java.util.Scanner;

public class IntroducirValores {
    public static void main(String[] args) {
        // Introducir valores
        int renglones,columnas;
        var consola = new Scanner(System.in);

        // solicitar valores
        for (int ren = 0; ren < renglones; ren ++){
            for (int col = 0; col < columnas; col ++){
                System.out.print("Valor [" + ren + "][" + col + "]: ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // iterar valores en matriz
        System.out.println();
        for (int ren = 0; ren < renglones; ren ++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Matriz [" + ren + "][" + col + "] = "
                        + matriz[ren][col] + " ");
            }
        }
    }
}
