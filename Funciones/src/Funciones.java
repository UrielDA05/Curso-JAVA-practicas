public class Funciones {
    // Definir la funcion sumar
    static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int arg1 = 5, arg2 = 3;
        var res = sumar(arg1,arg2);
        System.out.println("Resultado: " + res);
        res = sumar(12,43);
        System.out.println("Resultado: " + res);
    }
}
