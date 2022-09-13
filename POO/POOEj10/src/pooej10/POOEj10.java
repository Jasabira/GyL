
/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package pooej10;

import Entidad.Array;
import java.util.Arrays;

public class POOEj10 {
    
    public static void main(String[] args) {
        //Array a1 = new Array();
        //Array a2 = new Array();
        
        //a1.crearArray(50);
        //a2.crearArray(20);
        
        double arr50[];
        arr50 = new double[50];
        
        
        for (int i = 0; i < arr50.length; i++) {
            arr50[i] = (double) (Math.random() * 10+1);
            System.out.println("[" + arr50[i] + "]");
            
        }
        System.out.println("----------------------");
        
        Arrays.sort(arr50);
        
        double arr20[];
        arr20 = new double[20];
        
        for (int i = 0; i < arr20.length; i++) {
            arr20[i] = (double) (Math.random() * 10+1);
            System.out.println("[" + arr20[i] + "]");
        }
        
        double arrAux[];
        arrAux = new double[20];
        
        for (int i = 0; i < 10; i++) {
            arrAux[i] = arr50[i];
        }
        
        for (int i = 10; i < 20; i++) {
            arrAux[i] = arr20[i];
            arrAux[i] = 0.5;
        }
        
        //MOSTRANDO ARR50 ORDENADO
        System.out.println("-----------------------");
        
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + arr50[i] + "]");
        }
        
        //MOSTRANDO ARRAY DE 20 CON MODIFICACION
        System.out.println("------------------------");
        for (int i = 0; i < 20; i++) {
            System.out.println("[" + arrAux[i] + "]");
        }
    }
    
}
