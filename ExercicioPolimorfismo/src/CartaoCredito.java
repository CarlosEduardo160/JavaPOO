public class CartaoCredito extends Pagamento{
    private String numeroCartao = "1234 5678 9012 3456";

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " Realizado no cartão de crédito.");
    }
}
