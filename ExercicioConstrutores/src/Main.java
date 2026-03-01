import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Carlos");

        System.out.print("Adicione o 1º saldo: ");
        conta.depositarValor(sc.nextDouble());

        System.out.print("Adicione o 2º saldo: ");
        conta.depositarValor(sc.nextDouble());

        conta.exibirSaldo();
    }
}
