package command.comandos;

import command.aparelhos.ArCondicionado;

public class DesligarAr implements Command {

    private ArCondicionado ar;

    public DesligarAr(ArCondicionado ar) {
        this.ar = ar;
    }

    @Override
    public void executar() {
        this.ar.desligar();
    }

}
