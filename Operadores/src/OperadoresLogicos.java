public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operador and (&&) true si ambos son verdaderos
        boolean a = true, b = false;
        System.out.println("a = " + a + ", b = " + b );
        var resultado = a && b;
        System.out.println("resultado a && b : " + resultado);
        // Operador or (||) true si cualquier valor es verdadero
        resultado = a || b;
        System.out.println("resultado a || b : " + resultado);
        // Operador not (!) invierte valor logico
        resultado = !a;
         var resultado2 = !b;
        System.out.println("resultado !a : " + resultado);
        System.out.println("resultado2 !b : " + resultado2);
    }
}
