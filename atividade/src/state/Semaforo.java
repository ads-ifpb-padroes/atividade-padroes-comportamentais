package state;

public interface Semaforo {
    
    public Semaforo tick();
    public Semaforo panic();
    public Semaforo off();
    public Semaforo on();
    public String status();
    
}
