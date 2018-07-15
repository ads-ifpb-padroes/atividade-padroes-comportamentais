package state;

public class SemaforoVerde implements Semaforo{

    @Override

    public Semaforo tick() {
        return new SemaforoAmarelo();
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
        return "Verde";
    }
    
}
