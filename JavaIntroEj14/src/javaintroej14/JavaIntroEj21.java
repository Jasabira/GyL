/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaintroej14;

import java.util.*;


public class JavaIntroEj21 {

    
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        // Creando matriz
        int [][] matrizM = new int[10][10];
        int [][] matrizP = new int[3][3];
        
        int filaC = 0;
        int columnaC = 0;
        
        llenarMatrizM(matrizM);
        llenarMatrizP(matrizP);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        
                    }
                }
            }
        }
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    filaC = i;
                    columnaC = j;
                    System.out.print("[" + filaC + "," + columnaC + "]");
                    if (matrizM[i][j] == matrizP[0][1]) {
                        filaC = i;
                        columnaC = j;
                        System.out.print("[" + filaC + "," + columnaC + "]");
                        if (matrizM[i][j] == matrizP[0][2]) {
                            filaC = i;
                            columnaC = j;
                            System.out.print("[" + filaC + "," + columnaC + "]");
                            if (matrizM[i][j] == matrizP[1][0]) {
                                filaC = i;
                                columnaC = j;
                                System.out.print("[" + filaC + "," + columnaC + "]");
                                if (matrizM[i][j] == matrizP[1][1]) {
                                    filaC = i;
                                    columnaC = j;
                                    System.out.print("[" + filaC + "," + columnaC + "]");
                                    if (matrizM[i][j] == matrizP[1][2]) {
                                        filaC = i;
                                        columnaC = j;
                                        System.out.print("[" + filaC + "," + columnaC + "]");
                                        if (matrizM[i][j] == matrizP[2][0]) {
                                            filaC = i;
                                            columnaC = j;
                                            System.out.print("[" + filaC + "," + columnaC + "]");
                                            if (matrizM[i][j] == matrizP[2][1]) {
                                                filaC = i;
                                                columnaC = j;
                                                System.out.print("[" + filaC + "," + columnaC + "]");
                                                if (matrizM[i][j] == matrizP[2][2]) {
                                                    filaC = i;
                                                    columnaC = j;
                                                    System.out.print("[" + filaC + "," + columnaC + "]");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        
        
        
    }
    
    public static int[][] llenarMatrizM(int matrizM[][]){
        Scanner leer = new Scanner(System.in);
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //System.out.println("Coloca un numero para la posicion " + "[" + i +","+ j + "]");
                //matrizM[i][j] = leer.nextInt();
                matrizM[i][j] = (int) (Math.random() * 9+1);
            }
        }
        return matrizM;
    }
    
    public static int[][] llenarMatrizP(int matrizP[][]){
        Scanner leer = new Scanner(System.in);
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.println("Coloca un numero para la posicion " + "[" + i +","+ j + "]");
                //matrizM[i][j] = leer.nextInt();
                matrizP[i][j] = (int) (Math.random() * 9+1);
            }
        }
        return matrizP;
    }
    
}
