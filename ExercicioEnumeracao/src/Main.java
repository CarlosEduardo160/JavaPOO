public class Main {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido(1, 150);
        Pedido pedido02 = new Pedido(2, 430);

        pedido01.imprimirResumo();

        System.out.println();
        pedido01.pagar();
        pedido01.imprimirResumo();

        System.out.println();
        pedido01.enviar();
        pedido01.imprimirResumo();

        //Pedido 2 para testar uso da função cancelar:

        System.out.println("------------------");
        pedido02.imprimirResumo();

        System.out.println();
        pedido02.cancelar();
        pedido02.imprimirResumo();
    }
}
