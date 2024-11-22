public class IfElseIfElse {
    public static void main (String[] args) {
        // Sentencias de Decicion if/Else
        var llueve = false;
        var nublado = false;
        if (llueve){
            System.out.println("Llevar paraguas");
        } // Se puede quitar llaves si se cumple con una linea de codigo
        else if (nublado) {
             System.out.println("Llevar impermeable");
        } else {
            System.out.println("Dejar paraguas e impermeable en casa");
        }
    }
}


