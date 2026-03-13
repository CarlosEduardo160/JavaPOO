public class Boleto extends Pagamento{
    private String codigoBarras = "123456789";

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Boleto gerado no valor de R$" + getValor());
    }
}
