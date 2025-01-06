import java.util.Random;

public class ValoresAleatorios {
    public static void main(String[] args) {
        // Funcion Numeros Aleatorios
        var aleatorio = new Random();
        // Generar valores entre 0 y 100 (no se incluye el valor limite)
        var valorAleatorio = aleatorio.nextInt(0,100+1);
        System.out.println("Valor aleatorio (0 y 100): " + valorAleatorio);
        // Generar valor aleatorio entre 100 y 200
        
    }
}
