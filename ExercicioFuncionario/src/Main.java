public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Carlos";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1237, 2450, 1500};

        funcionario.imprime();
        System.out.println("Média dos salários: ");
        System.out.println(funcionario.media());
    }
}
