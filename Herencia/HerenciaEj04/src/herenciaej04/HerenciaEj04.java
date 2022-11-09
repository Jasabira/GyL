//En el main se crearán las formas y se mostrará el
//resultado final.
package herenciaej04;

import Entidad.Circulo;
import Entidad.Rectangulo;

public class HerenciaEj04 {

    public static void main(String[] args) {
        
        Circulo c2 = new Circulo(2,4);
        Rectangulo r2 = new Rectangulo(4,8);
        
        
        System.out.println("El area de c1 es: " + c2.calculaArea() + " y el perimetro es: " + c2.calculaPerimetro());
        System.out.println("El area de r1 es: " + r2.calculaArea() + " y el perimetro es: " + r2.calculaPerimetro());
    }
    
}
