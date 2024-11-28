public class CicloWhile {
    public static void main(String[] args) {
        var contador = 1;
        final var VALOR_MAXIMO = 5;
        while (contador <= VALOR_MAXIMO){
            System.out.println("Valor: " + contador);
            contador++;
        }
    }
}
