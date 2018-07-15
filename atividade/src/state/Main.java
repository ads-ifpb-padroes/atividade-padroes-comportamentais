package state;

public class Main {

    public static void main(String[] args) {

        Semaforo semaforo = new SemaforoIntermitente();

        semaforo = semaforo.on();
        System.out.println(semaforo.status());

        for (int k = 0; k < 3; k++) {
            semaforo = semaforo.tick();
            System.out.println(semaforo.status());
        }

        semaforo = semaforo.panic();
        semaforo = semaforo.tick();
        semaforo = semaforo.off();
        System.out.println(semaforo.status());
        

    }
}
