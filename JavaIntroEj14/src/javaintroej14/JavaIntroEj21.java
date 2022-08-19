/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaintroej14;


public class JavaIntroEj21 {

    
    public static void main(String[] args) {
        
        // Creando matriz
        int [][] matrizM = {
            {5,6,3,8,7,7,2,1,9,2},
            {1,1,4,9,8,8,5,4,6,5},
            {6,5,8,6,3,9,9,1,4,3},
            {3,8,7,7,5,2,9,8,6,6},
            {6,7,8,4,3,6,7,9,3,4},
            {9,6,4,3,2,1,1,9,8,6},
            {3,5,4,5,6,7,8,1,1,8},
            {7,9,2,2,4,9,8,6,3,3},
            {3,5,1,6,8,9,6,1,1,5},
            {5,2,9,8,5,2,3,4,9,4}
       };
        int [][] matrizP = {
            {7,5,2},
            {4,3,6},
            {3,2,1}
        };
        
        int c = 0;
        int d = 0;
        boolean bandera = false;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    bandera = true;
                    c = i;
                    d = j;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizP[k][l] != matrizM[i+k][j+l]) {
                                bandera = false;
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        if (bandera = true) {
            System.out.println("La matriz se encuentra en la posicion inial: "+ "[" + c + "," + d + "]");
        }
    }
}
