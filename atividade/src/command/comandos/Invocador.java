package command.comandos;

import java.util.ArrayList;
import java.util.List;

public class Invocador {

    private List<Command> comandosLigar;
    private List<Command> comandosDesligar;

    public Invocador() {
        this.comandosDesligar = new ArrayList<>();
        this.comandosLigar = new ArrayList<>();
    }

    public void addLigar(Command command) {
        this.comandosLigar.add(command);
    }

    public void addDesligar(Command command) {
        this.comandosDesligar.add(command);
    }
    
    public void ligarTodos(){
        this.comandosLigar.forEach(c->c.executar());
    }
    
    public void desligarTodos(){
        this.comandosDesligar.forEach(c->c.executar());
    }
}
