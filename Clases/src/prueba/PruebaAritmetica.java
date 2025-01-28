package prueba;

import aritmetica.Constructores;


public class PruebaAritmetica {
    public static void main(String[] args) {

        var operando = new Constructores(9,8);
        operando.multiplicar();
        var operando2 = new Constructores(12,16);
        operando2.sumar();
    }
}
