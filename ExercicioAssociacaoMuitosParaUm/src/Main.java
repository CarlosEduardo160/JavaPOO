////Exercício trabalha com associação unidirecional N:1

public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("Tecnologia", 101);

        Funcionario f1 = new Funcionario("Carlos", "Backend", ti);
        Funcionario f2 = new Funcionario("Ana", "Frontend", ti);
        Funcionario f3 = new Funcionario("Pedro", "DevOps", ti);

        f1.mostrarFuncionario();
        System.out.println();

        f2.mostrarFuncionario();
        System.out.println();

        f3.mostrarFuncionario();
        System.out.println();
    }
}
