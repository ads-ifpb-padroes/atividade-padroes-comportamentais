package command.comandos;

import command.aparelhos.TV;

public class DesligarTV implements Command {

    private TV tv;

    public DesligarTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        this.tv.desligar();
                
    }

}
