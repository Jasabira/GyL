/*
//Ej 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
//Ej 14 
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
*/
package javaintroej00.pkg13.pkg14;
import java.util.Scanner;

public class JavaIntroEj001314 {

    public static void main(String[] args) {
        /* Declaración y creación de un Vector:
        tipo[] arregloV = new tipo[Tamaño];
        vector[0] = 5;

        Declaración y creación de una Matriz
        tipo[][] arregloM = new tipo[Filas][Columnas];
        matriz[0][0] = 6; */
        
        Scanner leer = new Scanner(System.in);
        
        String[] Equipo = new String[2];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Escribir el nombre");
            Equipo[i] = leer.nextLine();
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.println(i + ")" + Equipo[i]);
        }
        System.out.println("");
    }
    
}
