public class Pedido {
    private int id;
    private double valor;
    private StatusPedido status = StatusPedido.PENDENTE;

    public Pedido(int id, double valor){
        this.id = id;
        this.valor = valor;
    }

    public void pagar() {
        if (status == StatusPedido.PENDENTE) {
            this.status = StatusPedido.PAGO;
        }
    }

    public void enviar(){
        if (status == StatusPedido.PAGO){
            this.status = StatusPedido.ENVIADO;
        }
    }

    public void cancelar(){
        if (status == StatusPedido.PENDENTE){
            this.status = StatusPedido.CANCELADO;
        }
    }

    public void imprimirResumo(){
        System.out.println("Pedido: " + id);
        System.out.println("Valor: " + valor);
        System.out.println("Status: " + status);
    }
}
