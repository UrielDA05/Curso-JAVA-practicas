public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        // Creacion de objetos de la clase persona
        Persona obj1 = new Persona();
        obj1.nombre = "Uriel";
        obj1.apellido = "Atenogenes";
        obj1.mostrarPersona();

        
    }
}
