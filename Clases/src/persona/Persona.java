package persona;
import javax.swing.JOptionPane;

public class Persona extends Object {
    static int contadorPersonas = 0;
    private String nombre;
    private String apellido;

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Direccion en memoria: "+ super.toString();
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        contadorPersonas ++;
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
        JOptionPane.showMessageDialog(null, "Nombrec de la primer persona: " + this.nombre );
        JOptionPane.showMessageDialog(null, "Apellido de la primer persona: " + this.apellido);
    }
    public void mostrar2(){
        JOptionPane.showMessageDialog(null, "Nombrec de la segunda persona: " + this.nombre );
        JOptionPane.showMessageDialog(null, "Apellido de la segunda persona: " + this.apellido);
    }
}
