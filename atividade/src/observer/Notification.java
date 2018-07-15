package observer;

public class Notification implements Observador {

    @Override
    public void atualizar(Forum forum) {

        System.out.println("Notification - Tópicos do fórum:");
        forum.getTopicos().forEach(System.out::println);
    }

}
