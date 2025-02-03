package prueba;
import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {

        var operando = new Aritmetica(9,8);
        operando.getOperando1(); // 9
        System.out.println("Valor de operando 1: " + operando.getOperando1());

    }
}
