import javax.swing.*;

public class Aritmetica {
    int operando1;
    int operando2;

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    void multiplicar(){
        var resultado = operando1 * operando2;
        System.out.println("Resultado de la multiplicacion: " + resultado);
    }

    void dividir(){
        var resultado = operando1 / operando2;
        System.out.println("Resultado de la division: " + resultado);
    }

    public static void main() {
        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1 = JOptionPane.showInputDialog("Ingrese un valor");
        var seleccion = JOptionPane.showInputDialog("""
                LISTA DE OPERACIONES
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division\t
                Ingrese el numero de la operacion a realizar""");
        switch (seleccion){
            case 1:
                aritmetica1.sumar();
            break;
            case 2:
                aritmetica1.restar();
            break;

        }

    }
}
