/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaintroej14;


public class JavaIntroExtra02 {

    
    public static void main(String[] args) {
        int A = 5;
        int B = 9;
        int C = 2;
        int D = 6;
        System.out.println("Valores iniciales: ");
        System.out.print("A = " + A + ". B = " + B + ". C = " + C + ". D = " + D);
        
        int a;
        int b;
        int c;
        int d;
        
        a = A;
        b = B;
        c = C;
        d = D;
        
        B = c;
        C = a;
        A = d;
        D = b;
        
        System.out.println("");
        System.out.println("Valores finales: ");
        System.out.print("A = " + A + ". B = " + B + ". C = " + C + ". D = " + D);
    }
    
}
