package observer;

public class Main {

    public static void main(String[] args) {

        Forum forum = new Forum();
        forum.addObservador(new SMS());
        forum.addObservador(new Email());
        forum.addObservador(new Notification());

        forum.addTopico("Padrões de Projeto");
        forum.addTopico("Observer");
        forum.addTopico("Command");
        forum.addTopico("State");
    }
}
