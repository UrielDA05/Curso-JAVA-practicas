public class SintaxisSimplificada {
    public static void main(String[] args) {
        int[] enteros = {100,200,300,400,500};
        System.out.println("Valor 1: " + enteros[0]);
        System.out.println("Valor 2: " + enteros[1]);
        System.out.println("Valor 3: " + enteros[2]);
        System.out.println("Valor 4: " + enteros[3]);
        System.out.println("Valor 5: " + enteros[4]);
        System.out.println();
        // imprimir direccion de memoria
        System.out.println(enteros);
        System.out.println();
        // uso de ciclo para la lectura de elementos
        for (byte contador = 0; contador < enteros.length; contador++){
            contador++;
            System.out.printf("Valor " + contador );
            contador--;
            System.out.println(" con el indice " + contador + ": "+ enteros[contador]);
        }

    }
}
