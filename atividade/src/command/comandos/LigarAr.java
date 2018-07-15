package command.comandos;

import command.aparelhos.ArCondicionado;

public class LigarAr implements Command {

    private ArCondicionado ar;
    private String temperatura;

    public LigarAr(ArCondicionado ar, String temperatura) {
        this.ar = ar;
        this.temperatura = temperatura;
    }

    @Override
    public void executar() {

        this.ar.ligar(this.temperatura);

    }

}
