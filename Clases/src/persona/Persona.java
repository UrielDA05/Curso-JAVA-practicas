package persona;

public class Persona {
    private String nombre;
    private String apellido;

    void mostrarPersona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void getNombre(){
        return this.nombre;
    }
    public void getApellido(){
        return this.apellido ;
    }
}
