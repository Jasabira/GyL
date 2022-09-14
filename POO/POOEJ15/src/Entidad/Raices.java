/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package Entidad;

public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double getDiscriminante(){
        //(b^2)-4*a*c
        double discriminante = (double) Math.pow(b, 2)-4 * a * c;
        return discriminante;
    }
    
    public boolean tieneRaices(){
        boolean band = false;
        
        band = getDiscriminante() >= 0;
        return band;
    }
    
    public boolean tieneRaiz(){
        boolean band = false;
        
        band = getDiscriminante() == 0;
        return band;
    }
    
    public void obtenerRaices(){
        System.out.println("res 1 = " + (-b + Math.sqrt(getDiscriminante()))/(2 * a));
        System.out.println("res 2 = " + (-b - Math.sqrt(getDiscriminante()))/(2 * a));
    }
    
    public void obtenerRaiz(){
        System.out.println("res = " + (-b + Math.sqrt(getDiscriminante()))/(2 * a));
    }
    
    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje.*/
    
    public void calcular(){
        if (tieneRaices()) {
            obtenerRaices();
        }else if (tieneRaiz()) {
            obtenerRaiz();
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
