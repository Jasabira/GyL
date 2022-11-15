
package herenciaej05;

import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.YateLujo;

public class HerenciaEj05 {

    public static void main(String[] args) {
        Barco barco = new Barco();
        barco.crearBarco();
        barco.iniciarAlquiler(barco);
        System.out.println("El precio del barco es de: " + barco.precioAlquiler());
        
        Velero vel  = new Velero();
        vel.crearVelero();
        vel.iniciarAlquiler(vel);
        System.out.println("el precio del velero es de: " + vel.precioAlquiler());
        
        
        BarcoMotor BM = new BarcoMotor();
        BM.crearBM();
        BM.iniciarAlquiler(BM);
        System.out.println("El precio del barco a motor es de: " + BM.precioAlquiler());
        
        YateLujo YL = new YateLujo();
        YL.crearYate();
        YL.iniciarAlquiler(YL);
        System.out.println("El precio del yate es de: " + YL.precioAlquiler());
        
    }
    
}
