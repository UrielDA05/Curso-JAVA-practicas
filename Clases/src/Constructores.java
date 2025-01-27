import javax.swing.*;

public class Constructores {
    int operando1;
    int operando2;

    // Constructor vacio
    public Constructores(){

    }
    // Constructor con parametros
    public Constructores(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
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
        var op = new Constructores( );
        op.sumar();
    }
}

