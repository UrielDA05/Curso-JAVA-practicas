import javax.swing.*;

public class GeneradorCorreo {
    public static void main(String[] args) {
        correo();
    }
    static void correo(){
        // Solicitud de nombre
        var nombre = JOptionPane.showInputDialog("Ingresa tu nombre").toLowerCase();

        // Solicitud de apellido
        var apellido = JOptionPane.showInputDialog("Ingresa tu apellido").toLowerCase();

        //
        // Concatenacion
        var cadena = nombre + '.' + apellido +
    }
}
