import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class GeneradorID {
    public static void main(String[] args) {

        generadorID();
    }
        static void generadorID(){
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



    }

