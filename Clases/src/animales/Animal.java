package animales;

public class Animal {
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

// Clase 2
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Puedo ladrar");
    }
}
// Clase 3
class Gato extends Animal {
    public void hacer_sonido() {
        System.out.println("Puedo mauyar");
    }

    @Override
    public void dormir(){
        System.out.println("Paso mas de 18 horas durmiendo");
        System.out.println("Metodo de la clase padre");
        super.dormir();
    }
}


class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Herencia ***");
        System.out.println("Clase Padre: soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacersonido(); // Este metodo no existe en la clase padre

        System.out.println("\n Clase hija, soy un perro");
        var perro1 = new Perro();
        perro1.hacer_sonido();
        perro1.comer();
        perro1.dormir();

        System.out.println("\n Clase hija, soy un gato");
        var gato1 = new Gato();
        gato1.dormir();
        gato1.hacer_sonido();
        gato1.comer();
    }
}