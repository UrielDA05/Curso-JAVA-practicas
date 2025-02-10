package persona;
import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private String apellido;

    public void Persona(String nombre, String apellido){
        this.nombre = nombre;
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
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    // Mostrar datos
    public void mostrar(){
        var name = "Su nombre es " + this.nombre + " " + this.apellido;
        JOptionPane.showMessageDialog(null,name);
    }
}
