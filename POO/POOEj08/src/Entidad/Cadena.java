/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidad;


public class Cadena {
    public String frase;
    public int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    //METODOS
    
    public void invertirFrase(){
        String fraseInvertida = "";
        for (int i = frase.length()-1; i >= 0; i--){
            fraseInvertida = fraseInvertida + frase.charAt(i);
        }
        System.out.println(fraseInvertida);
    }
    
    public void vecesRepetido(String letra){
        int cont = 0;
        for (int i = 0; i <frase.length(); i++){ 
            if (frase.substring(i,i+1).equals(letra)) {
                cont++;
            }  
        }
        System.out.println("la letra " + letra + " se repitió " + cont + " veces.");
    }
    
    public void compararLongitud(String nuevaFrase){
        int frase1 = frase.length();
        String frase2 = nuevaFrase;
        int frase3 = frase2.length();
        System.out.println("La frase tiene: " + frase1 + " y la nueva frase tiene: " + frase3);
    }
    
    public void unirFrase(String fraseAdd){
        String nuevaFrase = frase + " " +fraseAdd;
        System.out.println("nueva frase: " + nuevaFrase);
    }
    
    public String reemplazar(String letra){
        String nuevaFrase = "";
        for (int i = 0; i <frase.length(); i++){ 
            if (frase.substring(i,i+1).equals("a")) {
                nuevaFrase += letra;
            }else{
                nuevaFrase += i;
            }
        }
        return nuevaFrase;
    }
    
    public boolean contiene(String letra){
        boolean contieneLetra = false;
        for (int i = 0; i <frase.length(); i++){ 
            if (frase.substring(i,i+1).equals(letra)) {
                contieneLetra = true;
            }
        }
        return contieneLetra;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
}
