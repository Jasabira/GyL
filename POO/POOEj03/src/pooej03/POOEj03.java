
package pooej03;

import Entidad.Operacion;

public class POOEj03 {

    
    public static void main(String[] args) {
        
        //Crear obj
        Operacion Op2 = new Operacion();
        Op2.crearOperacion();
        
        //Op2.setNumero1(3);
        //Op2.setNumero2(5);
        
        System.out.println(Op2.toString());
        
        System.out.println("La suma da: ");
        Op2.calcularSuma(Op2.getNumero1(), Op2.getNumero2());
        
        System.out.println("La resta da: ");
        Op2.calcularResta(Op2.getNumero1(), Op2.getNumero2());
        
        System.out.println("La multiplicacion da: ");
        Op2.calcularMultiplicacion(Op2.getNumero1(), Op2.getNumero2());
        
        System.out.println("La division da: ");
        Op2.calcularDivision(Op2.getNumero1(), Op2.getNumero2());
        
    }

    
}
