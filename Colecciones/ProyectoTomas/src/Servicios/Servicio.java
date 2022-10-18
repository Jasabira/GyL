
package Servicios;

import Entidad.Persona;
import java.util.*;

public class Servicio {
    private final Scanner leer;
    private final ArrayList<Persona> listaPersonas;

    public Servicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPersonas= new ArrayList<>();
    }
    
    public void CrearPipol (){
        String rta;
        while(true){
         
        Persona p1 = new Persona();
        
        System.out.println("ingresa nombre");
        p1.setNombre(leer.next());
        System.out.println("ingresa edad");
        p1.setEdad(leer.nextInt());
        System.out.println("ingresa apellido");
        p1.setApellido(leer.next());
        System.out.println("ingresa pais");
        p1.setPais(leer.next());
        System.out.println("ingresa altura");
        p1.setAltura(leer.nextDouble());
        
        listaPersonas.add(p1);
            System.out.println("queres ingresar otro wachin?");
            rta = leer.next();
        if(rta.equals("no")){
            break;
        }
        }
    }
    public void mostrarPersona(){
        System.out.println(listaPersonas);
    }
     public void promedioAltura(){
         double sum=0;
        
         for (Persona personita : listaPersonas) {
             sum += personita.getAltura();
         }
         
        System.out.println("promedio "+sum/listaPersonas.size());
    }
}
