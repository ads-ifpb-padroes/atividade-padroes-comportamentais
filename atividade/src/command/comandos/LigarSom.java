package command.comandos;

import command.aparelhos.Som;

public class LigarSom implements Command {

    private Som som;
    private String horario;

    public LigarSom(Som som, String horario) {
        this.som = som;
        this.horario = horario;
    }

    @Override
    public void executar() {

        this.som.ligar(horario);
    }

}
