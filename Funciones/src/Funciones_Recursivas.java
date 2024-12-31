public class Funciones_Recursivas {
    // Imprimir numeros del 5 al 1

    // Definir funcion recursiva
    static void funcionRecursiva(int numero){
        // Caso base
        if (numero == 1)
            System.out.println(numero);
        else {
            // Caso recursivo
            System.out.print(numero + " ");
            funcionRecursiva(numero - 1);
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
