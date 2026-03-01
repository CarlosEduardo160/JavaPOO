public class ContaBancaria {
    private String titular;
    private double saldo = 0;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositarValor(double valor){
        this.saldo += valor;
    }

    public double exibirSaldo(){
        System.out.println("Saldo em conta: " + this.saldo);
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
}

