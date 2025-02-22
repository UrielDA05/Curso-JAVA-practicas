package animales;

public class Animal {
    public void comer(){
        System.out.println("Come muchas veces al dia");
    }

    public void dormir(){
        System.out.println("Duermo muchas horas");
    }
}

// Clase 2
class Perro extends Animal{
    public void hacer_sonido(){
        System.out.println("Puedo ladrar");
    }
    @Override
    public void dormir() {
        System.out.println("Duermo 15 horas al dia");
    }

// Clase 3
class Gato extends Animal {
    public void hacer_sonido() {
        System.out.println("Puedo mauyar");
    }
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
    }
}