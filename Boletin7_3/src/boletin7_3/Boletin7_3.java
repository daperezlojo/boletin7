package boletin7_3;
/**
 *
 * @author Damian
 */
import java.util.Scanner;
public class Boletin7_3 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Rebaixas R1 = new Rebaixas();
        
        System.out.println("Introduza o precio Orixinal");
        R1.setPrezoOrixinal(sc.nextInt());
        System.out.println("Introduza o precio Rebaixado");
        R1.setPrezoRebaixado(sc.nextInt());
        
        R1.calcularPorcentaxe();
        
    }
    
}
