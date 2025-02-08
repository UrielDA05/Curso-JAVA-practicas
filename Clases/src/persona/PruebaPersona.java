package persona;

import javax.swing.*;

public class PruebaPersona {
    public static void main(String[] args) {
        var nom = new Persona();
        var n = JOptionPane.showInputDialog("Ingrese su nombre");
        nom.setNombre(n);

        var ape = new Persona();
        var a = JOptionPane.showInputDialog("Ingrese su apellido");
        ape.setApellido(a);
        var mos = new Persona();
        mos.mostrar();
    }
}
