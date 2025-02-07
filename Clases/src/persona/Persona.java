package persona;

import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private String apellido;

    public void mostrarNombre(String nombre){
        this.nombre = nombre;
    }
    public void mostrarApellido(String apellido){
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
    public void setApellido(){
        this.apellido =apellido;
    }

    // Mostrar datos
    public void mostrar{
        JOptionPane.showMessageDialog("Su nombre es: " + nombre + apellido);
    }
}
