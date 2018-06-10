package boletin7_2;
/**
 *
 * @author Damian
 */
public class Coche {
    
    private int velocidade=0;

    public Coche() {
    }

    public Coche(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        System.out.println("Velocidad Actual: "+velocidade);
        return velocidade;
    }
    
    public void acelerar(){
        velocidade=velocidade+2;
        System.out.println("Velocidade tras Acelerar: "+velocidade);
    }
    
    public void frenar(){
        velocidade=velocidade-1;
        System.out.println("Velocidade tras Frenar: "+velocidade);
    }

    
}
