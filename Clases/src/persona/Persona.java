package persona;
import javax.swing.JOptionPane;

public class Persona{
    static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    @Override
    public String toString(){
        return "Id: " + this.idPersona +
                ", Nombre: " + this.nombre +
                ", Apellido: " + this.apellido;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        Persona.contadorPersonas ++;
        this.idPersona = Persona.contadorPersonas;
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

    public void mostrar1(){
        JOptionPane.showMessageDialog(null, "Nombre de la primer persona: " + this.nombre );
        JOptionPane.showMessageDialog(null, "Apellido de la primer persona: " + this.apellido);
    }
    public void mostrar2(){
        JOptionPane.showMessageDialog(null, "Nombre de la segunda persona: " + this.nombre );
        JOptionPane.showMessageDialog(null, "Apellido de la segunda persona: " + this.apellido);
    }
}
