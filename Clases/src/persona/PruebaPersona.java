package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        var nom = new Persona();
        nom.setNombre("Uriel");
        var ape = new Persona();
        ape.setApellido("Atenogenes");
        var mos = new Persona();
        mos.mostrar();
    }
}
