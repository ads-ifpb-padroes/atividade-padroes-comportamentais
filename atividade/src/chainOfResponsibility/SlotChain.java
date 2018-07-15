package chainOfResponsibility;

public abstract class SlotChain {

    private SlotChain proximo;
    private float moeda;

    public SlotChain(float moeda) {
        this.moeda = moeda;
    }

    public void setProximo(SlotChain proximoMetodo) {

        if (proximo == null) {
            this.proximo = proximoMetodo;
        } else {
            this.proximo.setProximo(proximoMetodo);
        }
    }

    public boolean inserirMoeda(float valorMoeda) {

        if (verificaMoeda(valorMoeda)) {

            return true;
        } else {

            return this.proximo.inserirMoeda(valorMoeda);

        }

    }

    public boolean verificaMoeda(float valorMoeda) {
        return valorMoeda == this.moeda;
    }

}
