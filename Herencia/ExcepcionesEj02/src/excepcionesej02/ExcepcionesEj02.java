/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package excepcionesej02;

/**
 *
 * @author jasbir
 */
public class ExcepcionesEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

            System.out.println(cars[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
