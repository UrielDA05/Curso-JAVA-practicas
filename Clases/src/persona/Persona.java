package persona;

public class Persona {
    private String nombre;
    private String apellido;

    void mostrarPersona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static void main(String[] args) {
        // Creacion de objetos de la clase persona
        Persona obj1 = new Persona();
        obj1.nombre = "Uriel";
        obj1.apellido = "Atenogenes";
        obj1.mostrarPersona();
        
        var obj2 = new Persona();
        obj2.nombre = "Layla";
        obj2.apellido = "Acosta";
        obj2.mostrarPersona();
    }
}
