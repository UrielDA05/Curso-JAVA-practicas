import javax.swing.*;

public class GeneradorID {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre, apellido;
        short anioNacimineto;
        // Solicitud de valores
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        apellido = JOptionPane.showInputDialog("Ingresa tu apellido");
        anioNacimineto =Short.parseShort(JOptionPane.showInputDialog("Ingresa tu anio de nacimiento"));


    }
}
