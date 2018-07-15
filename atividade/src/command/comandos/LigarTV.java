package command.comandos;

import command.aparelhos.TV;

public class LigarTV implements Command {

    private TV tv;

    public LigarTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        this.tv.ligar();
    }

}
