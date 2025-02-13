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

    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre );
        JOptionPane.showMessageDialog(null, "Apellido: " + this.apellido);
    }
}
