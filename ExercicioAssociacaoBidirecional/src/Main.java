//////Exercício trabalha com associação bidirecional

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Ricardo");

        Curso c1 = new Curso("Estrutura de Dados");
        Curso c2 = new Curso("Lógica de programação");

        c1.setProfessor(p1);
        c2.setProfessor(p1);

        p1.adicionarCurso(c1);
        p1.adicionarCurso(c2);

        p1.mostrarCursos();
        System.out.println();
        c1.mostrarCurso();
    }
}