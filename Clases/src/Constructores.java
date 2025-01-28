import javax.swing.*;

public class Constructores {
    int operando1;
    int operando2;

    // Constructor vacio
    public Constructores(){

    }
    // Constructor con parametros
    public Constructores(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        JOptionPane.showMessageDialog(null,"Direccion operador this: " + this);
    }
    void sumar(){
        var resultado = operando1 + operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la suma: " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la resta: " + resultado);
    }

    void multiplicar(){
        var resultado = operando1 * operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la multiplicacion: " + resultado);
    }

    void dividir(){
        var resultado = operando1 / operando2;
        JOptionPane.showMessageDialog(null,"Resultado de la division: " + resultado);
    }

    public static void main(String[] args) {

        var operando = new Constructores(9,8);
        operando.multiplicar();
        JOptionPane.showMessageDialog(null,"Direccion de memoria: " + operando);
        var operando2 = new Constructores(12,16);
        JOptionPane.showMessageDialog(null,"Dir. memoraia obj2: " + operando2);
    }
}

