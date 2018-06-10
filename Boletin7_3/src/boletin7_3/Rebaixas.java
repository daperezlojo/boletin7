package boletin7_3;
/**
 *
 * @author Damian
 */
public class Rebaixas {
    private float prezoOrixinal;
    private float prezoRebaixado;

    public Rebaixas() {
    }

    public Rebaixas(float prezoOrixinal, float prezoRebaixado) {
        this.prezoOrixinal = prezoOrixinal;
        this.prezoRebaixado = prezoRebaixado;
    }

    public void setPrezoOrixinal(float prezoOrixinal) {
        this.prezoOrixinal = prezoOrixinal;
    }

    public void setPrezoRebaixado(float prezoRebaixado) {
        this.prezoRebaixado = prezoRebaixado;
    }

    public float getPrezoOrixinal() {
        return prezoOrixinal;
    }

    public float getPrezoRebaixado() {
        return prezoRebaixado;
    }
    
    public float calcularPorcentaxe(){
        float porcentaxe=100-((prezoRebaixado*100/prezoOrixinal));
        System.out.println("Porcentaxe Rebaizado "+porcentaxe+"%");
        return porcentaxe;
    }
}
