/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Entidad;

import java.util.Scanner;

public class NIF {
    private long DNI;
    private char letra;

    public NIF() {
    }

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public NIF crearNIF(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Coloque su numero de DNI: ");
        DNI = leer.nextLong();
        letra = calcularLetra();
        
        return new NIF();
    }
    
    public char calcularLetra(){
        int posicion = (int) (DNI % 23);
        
        char[] vectorLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letrita = vectorLetra[posicion];
        System.out.println(posicion);
        return letrita;
    }
    
    public void mostrarNIF(){
        System.out.println("El NIF es: " + DNI + "-" + letra);
    }
    
}
