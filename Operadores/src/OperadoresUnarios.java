public class OperadoresUnarios {
    public static void main(String[] args) {
        //  Operadores Unarios
        int a = 3, b = -2, resultado = 0;
        // Operador unario -
        resultado = -a;
        System.out.println("-a = " + resultado);
        resultado = -b;
        System.out.println("-b = " + resultado);
        // Operador unario ++ (Incremento de 1)
        a = 3;
        resultado = ++a; // pre-incremento
        System.out.println("Pre-incremento ++a = " + resultado);
        a = 3;
        resultado = a++; // post-incremento
        System.out.println("Post-incremento a++ = " + resultado);
        System.out.println("a = " + a);
        // Operador unario -- (Decremento de 1)
        b = -2;
        resultado = --b; // pre-decremento
        System.out.println("Pre-decremento --b = " + resultado);
        b = -2;
        resultado = b--;// post-decremento
        System.out.println("Post-decremento b-- = " + resultado);
        System.out.println("b = " + b);
        // Negacion ! (Invierte el valor logico)
        var c = false;
        var resultado2 = !c;
        System.out.println("Negacion !c = " + resultado2);
    }
}
