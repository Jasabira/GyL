/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaintroej14;

import java.util.Scanner;


public class JavaIntroEj19 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        llenado(matriz);
        mostrando(matriz);
      
        // comparando matrices
        
        boolean anti = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                anti = matriz[i][j] + matriz[j][i] == 0;
            }
        }
        System.out.println("Es una matriz anti-simetrica? " + anti);
    }
    
    public static int[][] llenado(int matriz[][]) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //matriz[i][j] = leer.nextInt();
                matriz[i][j] = (int) (Math.random() * 5+1);
            }
        }
        return matriz;
    }
    
    public static void mostrando(int matriz[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("--------------------------");
    }
    
}
