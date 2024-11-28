public class CicloDoWhile {
    public static void main(String[] args) {
        var contador = 1;
        final var VALOR_MAXIMO = 9;
        do {
            System.out.println("Valor: " + contador);
            contador++;
        } while (contador <= VALOR_MAXIMO);
    }
}
