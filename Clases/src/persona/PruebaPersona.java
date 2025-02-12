package persona;
import javax.swing.JOptionPane;

public class PruebaPersona {
    public static void main(String[] args) {

        var obj1 = new Persona();
        obj1.setNombre("Uriel");
        obj1.setApellido(" De Jesus");
        obj1.mostrar();

        var obj2 = new Persona();
        obj2.setNombre("Gustavo");
        obj2.setApellido("Atenogenes");
        obj2.mostrar();
    }
}
