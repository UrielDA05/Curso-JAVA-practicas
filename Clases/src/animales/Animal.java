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
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Herencia ***");
        System.out.println("Clase Padre: soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacersonido(); // Este metodo no existe en la clase padre
        
    }
}