package boletin7_2;
/**
 *
 * @author Damian
 */
import java.util.Scanner;
public class Boletin7_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Coche Coche = new Coche();
        
        System.out.println("Introduzca la velocidad a la que va el coche");
        Coche.setVelocidade(sc.nextInt());
        
        Coche.getVelocidade();
        Coche.acelerar();
        Coche.frenar();
    
    
    }
    
}
