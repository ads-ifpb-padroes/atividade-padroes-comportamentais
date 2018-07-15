package command.comandos;

import command.aparelhos.Som;

public class DesligarSom implements Command {

    private Som som;

    public DesligarSom(Som som) {
        this.som = som;
    }

    @Override
    public void executar() {
        this.som.desligar();
    }

}
