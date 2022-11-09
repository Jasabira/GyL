package herenciaej02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.List;

public class HerenciaEj02 {

    public static void main(String[] args) {

        List<Electrodomestico> lista = new ArrayList();
        Lavadora e2 = new Lavadora(31, 0, "blanco", 'A', 40); //3000
        Lavadora e1 = new Lavadora(20, 0, "negro", 'C', 81); //2600
        Televisor e4 = new Televisor(41, false, 0, "negro", 'A', 21);//3250
        Televisor e3 = new Televisor(20, true, 0, "negro", 'F', 3);//1700
        
        lista.add(e2);
        lista.add(e1);
        lista.add(e4);
        lista.add(e3);
        
        double precioso = 0;
        for (Electrodomestico aux : lista) {
            aux.precioFinal();
            precioso += aux.getPrecio();
            System.out.println(aux.toString());
        }
        
        System.out.println("PRECIO DE LOS " + lista.size() + " ELECTRODOMESTICOS ES DE: " + precioso + "$");
    }

}
