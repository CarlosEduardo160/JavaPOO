//Exercício trabalha com associação unidirecional 1:1

public class Main {
    public static void main(String[] args) {
        Livro livro01 = new Livro("Crepúsculo dos Ídolos", "Friedrich Nietzsche");
        Emprestimo emprestimo = new Emprestimo(livro01, "12/11/2025");

        emprestimo.mostrarEmprestimo();
    }
}
