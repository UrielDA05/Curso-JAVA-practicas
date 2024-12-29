public class Arreglos {
    public static void main(String[] args) {
        int[] enteros = new int[5];
        // mopdificacion de valores
        enteros [0] = 13;
        enteros [1] = 21;
        enteros [2] = 32;
        enteros [3] = 56;
        // lectura de valores en los arreglos
        System.out.println("Valor 1 = " + enteros[0]);
        // Al no cambiar el valor se queda en 0
        System.out.println("Valor 5 = " + enteros[4]);
    }
}
