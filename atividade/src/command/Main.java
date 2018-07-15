package command;

import command.aparelhos.ArCondicionado;
import command.aparelhos.Som;
import command.aparelhos.TV;
import command.comandos.DesligarAr;
import command.comandos.DesligarSom;
import command.comandos.DesligarTV;
import command.comandos.Invocador;
import command.comandos.LigarAr;
import command.comandos.LigarSom;
import command.comandos.LigarTV;

public class Main {

    public static void main(String[] args) {

        Invocador invocador = new Invocador();
        
        TV tv = new TV();
        ArCondicionado ar = new ArCondicionado();
        Som som = new Som();
        
        invocador.addLigar(new LigarTV(tv));
        invocador.addLigar(new LigarAr(ar,"20"));
        invocador.addLigar(new LigarSom(som,"10:20"));
        
        invocador.addDesligar(new DesligarTV(tv));
        invocador.addDesligar(new DesligarSom(som));
        invocador.addDesligar(new DesligarAr(ar));
        
        System.out.println("Ligando todos os aparelhos:");
        
        invocador.ligarTodos();
        
        System.out.println("Desligando todos os aparelhos:");
        
        invocador.desligarTodos();
    }
}
