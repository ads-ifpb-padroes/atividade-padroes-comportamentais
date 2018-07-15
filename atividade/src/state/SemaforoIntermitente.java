package state;

public class SemaforoIntermitente implements Semaforo {

    @Override
    public Semaforo tick() {
        return this;
    }

    @Override
    public Semaforo panic() {
        return new SemaforoPanic();
    }

    @Override
    public Semaforo off() {
        return this;
    }

    @Override
    public Semaforo on() {
        return new SemaforoVermelho();
    }

    @Override
    public String status() {
        return "Amarelo Intermitente";
    }

}
