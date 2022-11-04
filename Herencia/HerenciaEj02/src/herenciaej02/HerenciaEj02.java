
package herenciaej02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;

public class HerenciaEj02 {

    public static void main(String[] args) {
        
        //Electrodomestico e1 = new Electrodomestico();
        //e1.crearElectrodomestico();
        
        Lavadora e1 = new Lavadora();
        e1.crearLavadora();
        e1.precioFinal();
        System.out.println(e1.toString());
        
//        Lavadora e2 = new Lavadora();
//        e2.crearLavadora();
//        e2.precioFinal();
//        System.out.println(e2.toString());
        
        Televisor t1 = new Televisor();
        t1.crearTelevisor();
        t1.precioFinal();
        System.out.println(t1.toString());
        
//        Televisor t2 = new Televisor();
//        t2.crearTelevisor();
//        t2.precioFinal();
//        System.out.println(t2.toString());
    }
    
}
