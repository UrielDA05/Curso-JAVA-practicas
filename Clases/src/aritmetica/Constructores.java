package aritmetica;
import javax.swing.*;

public class Constructores {
    int operando1;
    int operando2;

    // Constructor con parametros
    public Constructores(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        JOptionPane.showMessageDialog(null,"Direccion operador this: " + this);
    }
    public void sumar(){
        var resultado = operando1 + operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la suma: " + resultado);
    }

    public void restar(){
        var resultado = operando1 - operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la resta: " + resultado);
    }

    public void multiplicar(){
        var resultado = operando1 * operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la multiplicacion: " + resultado);
    }

    public void dividir(){
        var resultado = operando1 / operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la division: " + resultado);
    }


}

