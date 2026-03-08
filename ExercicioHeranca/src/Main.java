public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 2100);
        Gerente gerente = new Gerente("Rodrigo", 5530);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 4250);

        funcionario.imprimirDados();
        System.out.println("Bonus: " + funcionario.calcularBonus());

        System.out.println();

        gerente.imprimirDados();
        System.out.println("Bonus: " + gerente.calcularBonus());

        System.out.println();

        desenvolvedor.imprimirDados();
        System.out.println("Bonus: " + desenvolvedor.calcularBonus());
    }
}