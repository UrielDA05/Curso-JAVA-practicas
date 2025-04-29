package persona;
import javax.swing.JOptionPane;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("**** Creacion de objetos de la clase perosna ****");
        System.out.println("Varible estatica: " + Persona.contadorPersonas);

        var n1 = JOptionPane.showInputDialog("Ingrese su nombre");
        var a1 = JOptionPane.showInputDialog("Ingrese su apellido");
        var obj1 = new Persona(n1,a1);
        System.out.println(obj1.toString());
        obj1.setNombre(n1);
        obj1.setApellido(a1);
        System.out.println("Variable estatica despues de la creacion del objeto: " + Persona.contadorPersonas);

        var n2 = JOptionPane.showInputDialog("Ingrese su nombre");
        var a2 = JOptionPane.showInputDialog("Ingrese su apellido");
        var obj2 = new Persona(n2,a2);
        System.out.println(obj2);
        System.out.println("Variable estatica despues de la creacion del objeto: " + Persona.contadorPersonas);


        /*
        Asignacion de valores


         En automatico con println llama al metodo .toString sin necesidad de llamarlo
        System.out.println(obj1.toString()); */


    }
}
