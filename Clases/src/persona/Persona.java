package persona;

public class Persona {
    private String nombre;
    private String apellido;

    void mostrarNombre(String nombre){
        this.nombre = nombre;

    }
    void mostrarApellido(String apellido){
        this.apellido = apellido;

    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido ;
    }
}
