import java.util.Scanner;

public class If_Or {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Tiene dia de descanso? ");
        var diaDescanso = consola.nextLine();
        System.out.print("Tiene dia de vacaciones? ");
        var vacaciones = consola.nextLine();
        var diaD = "si";
        var vac = "si";
        if (diaD.equalsIgnoreCase(diaDescanso) || vac.equalsIgnoreCase(vacaciones)){
            System.out.println("Puede ir al juego de su hijo");
        }else {
            System.out.println("No puede asistir al juego de su hijo");
        }
    }
}
