
package Entidad;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse(){
        System.out.println("Perrito alimentandose");
    }
    
}
