package boletin7_1;
/**
 *
 * @author Damian
 */
import java.util.Scanner;
public class Temperatura {
    
    private double tCelsius;
    private double tFarenheit;

    Scanner sc = new Scanner(System.in);
    
    public Temperatura() {
    }

    public Temperatura(double tCelsius, double tFarenheit) {
        this.tCelsius = tCelsius;
        this.tFarenheit = tFarenheit;
    }

    public void settCelsius(double tCelsius) {
        this.tCelsius = tCelsius;
    }

    public void settFarenheit(double tFarenheit) {
        this.tFarenheit = tFarenheit;
    }

    public double gettCelsius() {
        return tCelsius;
    }

    public double gettFarenheit() {
        return tFarenheit;
    }
    public void elegir(){
        System.out.println("Qué desea hacer?\n"
                + "1-Pasar de Celsius a Farenheit\n"
                + "2-Pasar de Farenheit a Celsius");
        int ele = sc.nextInt();
        
        switch(ele){
            case 1: System.out.println("Introduzca la temperatura en Celsius");
                    tCelsius= sc.nextInt();
                    celsiusAFarenheit();
                    System.out.println("Temperatura en Farenheit= "+tFarenheit);
                    break;
            
            case 2: System.out.println("Introduzca la temperatura en Farenheit");
                    tCelsius = sc.nextInt();
                    FarenheitACelsius();
                    System.out.println("Temperatura en Celsius "+tCelsius);
                    break;
            default: System.out.println("Error, introduzca una opcion válida");
        }
    }
    public double celsiusAFarenheit(){
        tFarenheit=1.8*tCelsius+32;
        return tFarenheit;
    }
    public double FarenheitACelsius(){
        tCelsius=(tFarenheit-32)/1.8;
        return tCelsius;
    }
    
}
