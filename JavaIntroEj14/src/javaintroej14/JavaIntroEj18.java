/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package javaintroej14;


public class JavaIntroEj18 {

    
    public static void main(String[] args) {
        
        //Crear y llenar matriz
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 9+1);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("--------------------------");
        
        //Haciendo traspuesta
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
