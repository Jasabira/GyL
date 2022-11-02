
package Entidad;

public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse(){
        System.out.println("Gatito alimentandose");
    }
}
