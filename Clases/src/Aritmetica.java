import javax.swing.*;

public class Aritmetica {
    int operando1;
    int operando2;

    // constructor
   // public Aritmetica(int op1,int op2){
    // operando1 = op1;
    // operando2 = op2
    //}
   
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

    public static void main(String [] args) {
        var aritmetica1 = new Aritmetica();
        var aritmetica2 = new Aritmetica();

        // Solicitud de valores para aritmetica 1
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
        aritmetica1.operando1 = v1;
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor"));
        aritmetica1.operando2 = v2;

        // Solicitud de valores para aritmetica 2
        int val1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
        aritmetica2.operando1 = val1;
        int val2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        aritmetica2.operando2 = val2;

        // Seleccion d eoperacion
        var seleccion = Integer.parseInt(JOptionPane.showInputDialog("""
                LISTA DE OPERACIONES
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division\t
                Ingrese el numero de la operacion a realizar"""));
        switch (seleccion){
            case 1:
                aritmetica1.sumar();
                aritmetica2.sumar();
            break;
            case 2:
                aritmetica1.restar();
                aritmetica2.restar();
            break;
            case 3:
                aritmetica1.multiplicar();
                aritmetica2.multiplicar();
            break;
            case 4:
                aritmetica1.dividir();
                aritmetica2.dividir();
            break;
            default:
                JOptionPane.showMessageDialog(null,"Ingrese un valor valido");
        }

    }
}
