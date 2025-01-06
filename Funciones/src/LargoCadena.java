public class LargoCadena {
    public static void main(String[] args) {
        // Ejemplo obtener largo de una cadena
        var cadena = "Hola Mundo";
        System.out.println("Largo de la cadena: " + cadena.length());

        // Recorrer la cadena
        for (int i = 0; i < cadena.length(); i++){
            System.out.println(i + " " + cadena.charAt(i));
        }
        // Subcadenas
        // substring (indice_inicio, indice_fin)
        
    }
}
