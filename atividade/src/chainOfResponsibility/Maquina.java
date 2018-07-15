package chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Maquina {

    private SlotChain chain;
    private float acumulado;
    private Map<String, Float> produtos;

    public Maquina(SlotChain chain) {
        this.chain = chain;
        this.produtos = new HashMap<>();
        adicionarProdutos();
    }

    public void inserir(float valor) {

        if (chain.inserirMoeda(valor)) {
            this.acumulado += valor;
        }
    }
    
    private void adicionarProdutos(){
        this.produtos.put("Refrigerante", 3.5f);
        this.produtos.put("Salgadinhos", 2f);
        this.produtos.put("Chocolate", 1f);
    }
    
    public Map<String, Float> getProdutos() {
        return produtos;
    }

    public boolean receberProduto(String produto) throws Exception {

        System.out.println(this.acumulado);
        if (this.acumulado >= produtos.get(produto)) {
            return true;
        } else {
            throw new Exception("O valor inserido não é suficiente");
        }
    }
}
