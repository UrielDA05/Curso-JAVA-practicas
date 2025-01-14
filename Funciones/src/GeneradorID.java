import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class GeneradorID {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre, apellido;
        short anioNacimineto;
        var aleatoirio = new Random();
        var formato = "# # # #";
        var decimalFormat = new DecimalFormat(formato);

        // Solicitud de valores
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        apellido = JOptionPane.showInputDialog("Ingresa tu apellido");
        anioNacimineto =Short.parseShort(JOptionPane.showInputDialog("Ingresa tu anio de nacimiento"));

        // Pasar datos a mayusculas
        nombre = nombre.toUpperCase();
        apellido = apellido.toUpperCase();

        // Extraccion de caracteres
        var subcadena1 = nombre.substring(0,2);
        var subcadena2 = apellido.substring(0,2);

        // Valores aleatorios
        var valorAleatorio = aleatoirio.nextInt(0,10000);
        var valorAleatorioFor = decimalFormat.format(valorAleatorio);

        JOptionPane.showMessageDialog(null,"Su ID es: " +subcadena1 + subcadena2 + anioNacimineto + valorAleatorioFor );
    }
}
