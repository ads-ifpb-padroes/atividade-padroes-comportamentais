package observer;

public class Email implements Observador {

    @Override
    public void atualizar(Forum forum) {
        
        System.out.println("Email - Tópicos do fórum:");
        forum.getTopicos().forEach(System.out::println);
    }

    

}
