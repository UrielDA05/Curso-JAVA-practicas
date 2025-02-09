package persona;

import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private String apellido;

    public void datos(String nombre, String apellido){
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
        var name = "Su nombre es " + getNombre() + getApellido();
        JOptionPane.showMessageDialog(null,name);
    }
}
