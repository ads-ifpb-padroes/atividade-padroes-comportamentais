package chainOfResponsibility;

import chainOfResponsibility.slots.Slot01;
import chainOfResponsibility.slots.Slot10;
import chainOfResponsibility.slots.Slot1;
import chainOfResponsibility.slots.SlotChain;
import chainOfResponsibility.slots.Slot50;
import chainOfResponsibility.slots.Slot25;
import chainOfResponsibility.slots.Slot05;

public class main {

    public static void main(String[] args) {

        SlotChain chain = new Slot01(0.01f);
        chain.setProximo(new Slot05(0.05f));
        chain.setProximo(new Slot10(0.1f));
        chain.setProximo(new Slot25(0.25f));
        chain.setProximo(new Slot50(0.5f));
        chain.setProximo(new Slot1(1));
        Maquina maquina = new Maquina(chain);
        
        maquina.inserir(1);
        maquina.inserir(1);
        maquina.inserir(1);
        //maquina.inserir(1);
        
        
        try {
            if(maquina.receberProduto("Refrigerante")){
                System.out.println("Produto recebido");
            }
                
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
