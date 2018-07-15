package command.aparelhos;

public class ArCondicionado {

    private boolean ligado;
    private String temperatura;
    
    public void ligar(String temperatura) {
        this.ligado = true;
        this.temperatura = temperatura;
        System.out.println("Ar ligado na temperatura: "+ this.temperatura);
    }

    
    public void desligar() {
        this.ligado = false;
        System.out.println("Ar desligado");
    }
    
}
