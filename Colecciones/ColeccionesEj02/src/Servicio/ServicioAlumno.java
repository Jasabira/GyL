/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicio;

import Entidad.Alumno;
import java.util.*;

public class ServicioAlumno {
        private final Scanner leer; 
        private final ArrayList<Alumno> listaAlumnos;
        
        public ServicioAlumno(){
            this.leer = new Scanner(System.in).useDelimiter("\n");
            this.listaAlumnos = new ArrayList<>();
        }
    
    public Alumno crearAlumno(){
        
        ArrayList<Integer> notas = new ArrayList();
        Alumno alumno = new Alumno();

        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(leer.next());
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota " + (i+1));
            notas.add(leer.nextInt());
            alumno.setNotas(notas);
        }
        
        listaAlumnos.add(alumno);
        return alumno;
    }
    
    public void mostrarLista(){
        for(Alumno aux : listaAlumnos){
            System.out.println(aux);
        }
    }
       
    public void notaFinal() {
        System.out.println("Nombre del alumno al que quiera calcular la nota final");
        String res = leer.next();
        for(Alumno aux : listaAlumnos){
            if (res.equals(aux.getNombre())) {
                calcularNotaFinal(aux.getNotas());
            }
        }
        
        System.out.println("Quiere calcular otra nota?");
        String res2 = leer.next();
        if ("si".equals(res2)) {
            notaFinal();
        }  
    }
    
    public void calcularNotaFinal(ArrayList<Integer> notas) {
        int sum = 0;

        for (Integer aux : notas) {
            sum = sum + aux;
        }
        
        System.out.println("promedio del alumno es de: " + sum / 3);
    }
}
