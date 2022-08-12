/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaintroej14;

import java.util.*;


public class JavaIntroEj20 {

    
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
       
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal = 0;
        int sumaDiagonalInv = 0;
        
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        
        //Comprobar filas
        
        System.out.println("------------");
        System.out.println("Filas");
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            System.out.println("[" + sumaFila + "]");
        }
        
        //comprobar columnas
        
        System.out.println("------------");
        System.out.println("Columnas");
        for (int j = 0; j < matriz[0].length; j++) {
            sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna = sumaColumna + matriz[i][j];
            }
            System.out.println("[" + sumaColumna + "]");
        }
        
        //comprobar diagonal
        
        System.out.println("------------");
        System.out.println("Diagonal");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==i) {
                    sumaDiagonal = sumaDiagonal + matriz[i][j];
                }
            }
        }
        System.out.println("[" + sumaDiagonal + "]");
        
        //comprobar diagonal inversa
        
        System.out.println("------------");
        System.out.println("Diagonal Inversa");
        for (int i = 2; i >= 0; i--) {
            sumaDiagonalInv = sumaDiagonalInv + matriz[i][2-i];
        }
        System.out.println("[" + sumaDiagonalInv + "]");
        
        comprobarMatrizMagica(matriz, sumaFila, sumaColumna, sumaDiagonal, sumaDiagonalInv);
    }
    
    public static int[][] llenarMatriz(int matriz[][]){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Coloca un numero para la posicion " + "[" + i +","+ j + "]");
                matriz[i][j] = leer.nextInt();
                //matriz[i][j] = (int) (Math.random() * 9+1);
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int matriz[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void comprobarMatrizMagica(int matriz[][], int sumaFila, int sumaColumna, int sumaDiagonal, int sumaDiagonalInv){
        if (sumaFila == sumaColumna && sumaDiagonal == sumaDiagonalInv && sumaFila == sumaDiagonal) {
            System.out.println("Es un cuadrado magico");
        }else{
            System.out.println("No es un cuadrado magico");
        }
    }
}
