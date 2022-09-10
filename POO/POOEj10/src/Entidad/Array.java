
package Entidad;


public class Array {
    public int tamaño;

    public Array() {
    }

    public Array(int tamaño) {
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    //METODOS
    
    public void crearArray(int tam){
        double array[];
        array = new double[tam];
        
        llenarArray(array);
    }
    
    public void llenarArray(double array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) (Math.random()*10+1);
            System.out.println("[" + array[i] + "] ");
        }
    }
}
