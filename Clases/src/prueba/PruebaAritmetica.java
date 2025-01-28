package prueba;

import aritmetica.Constructores;

import javax.swing.*;

public class PruebaAritmetica {
    public static void main(String[] args) {

        var operando = new Constructores(9,8);
        operando.multiplicar();
        JOptionPane.showMessageDialog(null,"Direccion de memoria: " + operando);
        var operando2 = new Constructores(12,16);
        JOptionPane.showMessageDialog(null,"Dir. memoraia obj2: " + operando2);
    }
}
