/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package pooej14;

import Entidad.Puntos;
import Servicio.Servicio;

public class POOEJ14 {

    public static void main(String[] args) {
        Servicio ser = new Servicio();
        Puntos puntito1 = ser.crearPunto();
        Puntos puntazo = ser.crearPunto();
        
        System.out.println(ser.calcularDistancia(puntito1, puntazo));
        
    }
    
}
