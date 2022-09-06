
package Entidad;

import java.util.Scanner;


public class Cafetera {
    public int capacidadMaxima = 1000;
    public int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //METODOS
    Scanner leer = new Scanner(System.in);
    
    public int llenarCafetera(){
        return cantidadActual = capacidadMaxima;
    }
    
    public int servirTaza(int cantidad){
        if (cantidad > cantidadActual) {
            System.out.println("No se llenara completamente ya que la taza es muy grande");
            System.out.println("Se lleno la taza con: " + cantidadActual + "ml");
            cantidadActual = 0;
        }else{
            System.out.println("Se lleno tu taza completamente");
            cantidadActual -= cantidad;
        }
        return cantidadActual;
    }
    
    public int vaciarCafetera(){
        return cantidadActual = 0;
    }
    
    public int agregarCafe(int cantidad){
        return cantidadActual = cantidad;
    }
    
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
}
