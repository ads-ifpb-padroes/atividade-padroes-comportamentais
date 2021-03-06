package state;

public class SemaforoAmarelo implements Semaforo{

    @Override
    public Semaforo tick() {
        return new SemaforoVermelho();
    }

    @Override
    public Semaforo panic() {
        return new SemaforoPanic();
    }

    @Override
    public Semaforo off() {
        return new SemaforoIntermitente();
    }

    @Override
    public Semaforo on() {
        return new SemaforoVermelho();
    }

    @Override
    public String status() {
        return "Amarelo";
    }
    
}
