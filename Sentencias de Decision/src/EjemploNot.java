public class EjemploNot {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al sistema bancario ***");
        var salirSistema = true;
        if (!salirSistema){
            System.out.println("Continuamos dentro del sistema");
        }
        else {
            System.out.println("Saliendo del sistema");
        }
        //
        if (salirSistema){
            System.out.println("Saliendo del sistema");
        }
        else {
            System.out.println("Continueamos en el sistema");
        }
    }
}
