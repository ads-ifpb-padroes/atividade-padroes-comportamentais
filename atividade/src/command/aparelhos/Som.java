package command.aparelhos;

import java.time.LocalDateTime;

public class Som {

    private boolean ligado;
    private String tempo;

    
    public void ligar(String horario) {
        this.ligado = true;
        this.tempo = horario;
        System.out.println("Som ligado as "+ tempo);
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Som desligado");
    }

}
