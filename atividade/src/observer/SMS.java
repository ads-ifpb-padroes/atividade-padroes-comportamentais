package observer;

public class SMS implements Observador {

    @Override
    public void atualizar(Forum forum) {

        System.out.println("SMS - Tópicos do fórum:");
        forum.getTopicos().forEach(System.out::println);
    }

}
