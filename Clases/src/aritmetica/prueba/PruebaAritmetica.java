package aritmetica.prueba;
import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {

        var operando = new Aritmetica(9,8);
        operando.getOperando1(); // 9
        System.out.println("Valor de operando 1: " + operando.getOperando1());
        operando.setOperando1(5);
        System.out.println("Valor nuevo: " + operando.getOperando1());
        operando.sumar();
        var operacion1 = new Aritmetica(3,4);
        operacion1.getOperando2(); //3
        System.out.println("Valor de operando 2: " + operacion1.getOperando2());
        operacion1.setOperando2(4);
        operacion1.restar();
    }
}
