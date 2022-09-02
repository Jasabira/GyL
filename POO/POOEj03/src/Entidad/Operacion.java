/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Entidad;

import java.util.Scanner;

public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        //pedir dato
        System.out.println("Coloca el primer numero");
        this.numero1 = leer.nextInt();
        System.out.println("Coloca el segundo numero");
        this.numero2 = leer.nextInt();
        
        
        Operacion Op1 = new Operacion(numero1, numero2);
        return Op1;
    }
    
    public void calcularSuma(int numero1, int numero2){
        int suma = numero1 + numero2;
        System.out.println(suma);
    }
   
    public void calcularResta(int numero1, int numero2){
        int resta = numero1 - numero2;
        System.out.println(resta);
    }
    
    public void calcularMultiplicacion(int numero1, int numero2){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR: Resultado 0");
        }else{
            int multiplicacion = numero1 * numero2;
            System.out.println(multiplicacion);
        }
    }
    
    public void calcularDivision(int numero1, int numero2){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR: Resultado 0");
        }else{
            int multiplicacion = numero1 / numero2;
            System.out.println(multiplicacion);
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
