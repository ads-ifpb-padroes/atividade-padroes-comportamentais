package observer;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<String> topicos;
    private List<Observador> observadores;

    public Forum() {
        this.observadores = new ArrayList<>();
        this.topicos = new ArrayList<>();
    }

    public void addTopico(String topico) {
        this.topicos.add(topico);
        notificarObservadores();
    }

    public List<String> getTopicos() {
        return topicos;
    }

    public void addObservador(Observador o) {
        this.observadores.add(o);
    }

    private void notificarObservadores() {

        for (Observador o : observadores) {
            o.atualizar(this);
        }
    }
}
