import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Sistema de calificaciones ***");
        System.out.print("Cuantas calificaciones desea agregar? ");
        var numMaterias = Integer.parseInt(consola.nextLine());
        float[] calificaciion = new float[numMaterias];
        double acum = 0.0;
        for (int x = 0; x < numMaterias; x++){
            System.out.print("Ingrese la calificacion[" + x + "] = ");
            calificaciion[x] =Float.parseFloat(consola.nextLine());
            acum += calificaciion[x];
        }
        System.out.println("Promedio: " + (acum/numMaterias));
    }
}
