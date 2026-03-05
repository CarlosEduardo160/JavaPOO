public class Emprestimo {
    private String dataEmprestimo;
    private Livro livro;

    public Emprestimo(Livro livro, String dataEmprestimo){
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void mostrarEmprestimo(){
        System.out.println("Data de emprestimo: " + dataEmprestimo);
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
    }
}
