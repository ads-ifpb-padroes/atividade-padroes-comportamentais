package command.aparelhos;

public class TV {

    private boolean ligado;
    
    
    public void ligar() {
        this.ligado = true;
        System.out.println("TV ligada");
    }

    
    public void desligar() {
        this.ligado = false;
        System.out.println("TV desligada");
    }
    
}
