package javaintroej00.pkg7;
import java.util.Scanner;

public class JavaIntroEj007 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloque su tipo de bomba");
        int tipoMotor = leer.nextInt();
        switch (tipoMotor) {
            case 1 -> System.out.println("La bomba es una bomba de agua");
            case 2 -> System.out.println("La bomba es una bomba de gasolina");
            case 3 -> System.out.println("La bomba es una bomba de hormigon");
            case 4 -> System.out.println("La bomba es una bomba de pasta alimenticia");
            default -> System.out.println("No existe un valor valido para ese tipo de bomba");
        }
    }
    
}
