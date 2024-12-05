import java.util.Scanner;

public class ValoresArreglos {
    public static void main(String[] args) {
        String materias[] = {"CalDif", "FunPro", "FunIve", "Quimic", "DesSus", "MatDis"};
        String encabezado[] = {"ASIGNATURA", "U1", "U2", "U3", "U4", "U5"};
        String[][] tabla = new String[materias.length + 1][encabezado.length];
        var  consola = new Scanner(System.in);
        for (int x = 0; x < encabezado.length; x++) {
            tabla[0][x] = encabezado[x];
        }
        for (int x = 0; x < materias.length; x++) {
            tabla[x + 1][0] = materias[x];
        }
        for (int x = 1; x < materias.length + 1; x++) {
            System.out.println("Ingrese las calificaciones " + tabla[x][0] + ":");
            for (int y = 1; y < encabezado.length; y++) {
                System.out.print(encabezado[y] + ": ");
                tabla[x][y] = consola.nextLine();
            }
        }
        System.out.println("\nTabla de calificaciones :");
        for (String[] fila : tabla) {
            for (String celda : fila) {
                System.out.print((celda != null ? celda : " ") + "   \t     ");
            }
            System.out.println();
        }
    }
}