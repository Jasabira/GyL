
package Entidad;

import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = 1000;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    /** *  Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto.Este método se debe invocar al crear el
    objeto y no será visible.
     * @param letra
     * @return  **/

    public char comprobarConsumoEnergetico(char letra){
        if (letra >= 'A' || letra <= 'F') {
            return letra;
        }else{
            return 'F';
        }
    }
    
    /** * Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto.Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris.No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.
     * @param color
     * @return **/
    
    public String comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        }else{
            return "blanco";
        }
    }
    
    /** * Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo.Al
    precio se le da un valor base de $1000. **/
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el color");
        String colorsito = leer.next();
        setColor(comprobarColor(colorsito));
        
        System.out.println("Ingrese el consumo energetico");
        char letrita = leer.next().charAt(0);
        setConsumoEnergetico(comprobarConsumoEnergetico(letrita));
        
        System.out.println("Ingrese el peso");
        double pesito = leer.nextDouble();
        setPeso(pesito);

//        Electrodomestico e = new Electrodomestico(costo, colorsito, letrita, pesito);
//        
//        return e;
    }
        
    public double precioFinal(){
        getConsumoEnergetico();
        double precioF = 0;
        switch (getConsumoEnergetico()) {
            case 'A' -> {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioF = getPrecio() + 1000 + 100;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioF = getPrecio() + 1000 + 500;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioF = getPrecio() + 1000 + 800;
                    setPrecio(precioF);
                    return precioF;
                }else{
                    precioF = getPrecio() + 1000 + 1000;
                    setPrecio(precioF);
                    return precioF;
                }
            }
            case 'B' -> {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioF = getPrecio() + 800 + 100;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioF = getPrecio() + 800 + 500;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioF = getPrecio() + 800 + 800;
                    setPrecio(precioF);
                    return precioF;
                }else{
                    precioF = getPrecio() + 800 + 1000;
                    setPrecio(precioF);
                    return precioF;
                }
            }
            case 'C' -> {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioF = getPrecio() + 600 + 100;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioF = getPrecio() + 600 + 500;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioF = getPrecio() + 600 + 800;
                    setPrecio(precioF);
                    return precioF;
                }else{
                    precioF = getPrecio() + 600 + 1000;
                    setPrecio(precioF);
                    return precioF;
                }
            }
            case 'D' -> {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioF = getPrecio() + 500 + 100;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioF = getPrecio() + 500 + 500;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioF = getPrecio() + 500 + 800;
                    setPrecio(precioF);
                    return precioF;
                }else{
                    precioF = getPrecio() + 500 + 1000;
                    setPrecio(precioF);
                    return precioF;
                }
            }
            case 'E' -> {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioF = getPrecio() + 300 + 100;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioF = getPrecio() + 300 + 500;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioF = getPrecio() + 300 + 800;
                    setPrecio(precioF);
                    return precioF;
                }else{
                    precioF = getPrecio() + 300 + 1000;
                    setPrecio(precioF);
                    return precioF;
                }
            }
            case 'F' -> {
                if (getPeso() >= 1 && getPeso() <= 19) {
                    precioF = getPrecio() + 100 + 100;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 20 && getPeso() <= 49){
                    precioF = getPrecio() + 100 + 500;
                    setPrecio(precioF);
                    return precioF;
                }else if(getPeso() >= 50 && getPeso() <= 79){
                    precioF = getPrecio() + 100 + 800;
                    setPrecio(precioF);
                    return precioF;
                }else{
                    precioF = getPrecio() + 100 + 1000;
                    setPrecio(precioF);
                    return precioF;
                }
            }
            default -> System.out.println("Letra incorrecta");
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}
