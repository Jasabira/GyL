
package Servicio;

import Entidad.Persona;
import java.util.Scanner;


public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println("Ingresa tu sexo H/M/O");
        String sexo = leer.next();
        
        System.out.println("Ingresa tu peso en kg");
        int peso = leer.nextInt();
        
        System.out.println("Ingresa tu altura en m");
        double altura = leer.nextDouble();
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        return p1;
    }
    
    public int calcularIMC(Persona p){
        int peso = p.getPeso();
        double altura = p.getAltura();
        int IMC = (int) (peso / (Math.pow(altura, 2)));
        int res;
        if (IMC < 20) {
            res = -1;
        }else if (IMC >= 20 || IMC <= 25) {
            res = 0;
        } else {
            res = 1;
        }
        return res;
    }
    
    public boolean esMayorDeEdad(Persona p){
        boolean mayor = false;
        if (p.getEdad() >= 18) {
            mayor = true;
        }
        
        return mayor;
    }
}