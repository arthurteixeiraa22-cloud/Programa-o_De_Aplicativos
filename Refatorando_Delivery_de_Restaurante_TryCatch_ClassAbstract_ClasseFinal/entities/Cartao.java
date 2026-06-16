package Refatorando_Delivery_de_Restaurante_TryCatch_ClassAbstract_ClasseFinal.entities;

public final class Cartao extends Pagamento {
    public Cartao() {
        super(TipoPagamento.CARTAO);
    }

    @Override
    public void processar() {
        System.out.println(" Conectando com a maquininha de cartão ");
    }
}
