/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package Entidad;

public class Matematica {
    public double numero1;
    public double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    //METODOS
    
    public void devolverMayor(){
        double numeroMenor = 0;
        if (numero1 < numero2) {
            numeroMenor = numero1;
        }else{
            numeroMenor = numero2;
        }
        System.out.println("El numero menor es: " + numeroMenor ); 
    }
    
    public void calcularPotencia(){
        double numeroMenor = 0;
        double numeroMayor = 0;
        if (numero1 < numero2) {
            numeroMenor = Math.abs(numero1);
            numeroMayor = Math.abs(numero2);
        }else{
            numeroMenor = Math.abs(numero2);
            numeroMayor = Math.abs(numero1);
        }
        
        int elevacion = (int) Math.pow(numeroMayor, numeroMenor);
        
        System.out.println("El resultado de la elevacion es: " + elevacion);
        
    }
    
    public void calcularRaiz(){
        int numero1R = (int) Math.abs(numero1);
        int numero2R = (int) Math.abs(numero2);
        int numeroMenor = 0;
        
        if (numero1R < numero2R) {
            numeroMenor = numero1R;
        }else{
            numeroMenor = numero2R;
        }
        
        int raiz = (int) Math.sqrt(numeroMenor);
        
        System.out.println("La raiz del numero menor es: " + raiz);
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
