public class Pix extends Pagamento{
    private String chavePix = "@123456789";

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " Realizado via Pix");
    }
}
