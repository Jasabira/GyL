/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotomas;

import Servicios.Servicio;

/**
 *
 * @author jasbir
 */
public class ProyectoTomas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Servicio s1 = new Servicio();
      s1.CrearPipol();
      s1.mostrarPersona();
      s1.promedioAltura();
    }
    
}
