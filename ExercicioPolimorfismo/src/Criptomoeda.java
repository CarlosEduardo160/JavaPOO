public class Criptomoeda extends Pagamento{
    private String chaveCripto = "@123#456!";

    public Criptomoeda(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " Realizado via criptmoeda");
    }
}
