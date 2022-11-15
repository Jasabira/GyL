/*
el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package Entidad;

import java.time.LocalDate;
import java.util.*;
import static java.time.temporal.ChronoUnit.DAYS;


public abstract class Alquiler {
    protected String nombre;
    protected int documento;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected int posicion;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public LocalDate ingresarFecha(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese año: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia: ");
        int dia = leer.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }
    
    public void iniciarAlquiler(Barco b){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String name = leer.next();
        setNombre(name);
        System.out.println("Ingrese el documento: ");
        int doc = leer.nextInt();
        setDocumento(doc);
        System.out.println("Ingrese la fecha de alquiler: ");
        LocalDate fechaI = ingresarFecha();
        setFechaAlquiler(fechaI);
        System.out.println("Ingrese la fecha de devolucion aaaa/mm/dd: ");
        LocalDate fechaF = ingresarFecha();
        setFechaDevolucion(fechaF);
        System.out.println("Ingrese la posicion del barco: ");
        int p = leer.nextInt();
        setPosicion(p);
        setBarco(b);
    }
    
    /**
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).
     * @return 
     **/
    public long diasAlquiler(){
        LocalDate inicio = getFechaAlquiler();
        LocalDate fin = getFechaDevolucion();
        long dias = DAYS.between(inicio, fin);
        
        return dias;
//        long modulo = b.getEslora() * 10;
//        
//        int totalAlquiler = (int) (dias * modulo);
//        return totalAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicion=" + posicion + ", barco=" + barco + '}';
    }
}

