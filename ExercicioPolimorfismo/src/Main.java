public class Main {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito(150);
        Pagamento pix = new Pix(230);
        Pagamento boleto = new Boleto(760);
        Pagamento cripto = new Criptomoeda(12000);

        cartaoCredito.processarPagamento();
        pix.processarPagamento();
        boleto.processarPagamento();
        cripto.processarPagamento();
    }
}
