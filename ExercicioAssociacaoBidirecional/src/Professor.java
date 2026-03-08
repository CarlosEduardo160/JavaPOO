import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Curso> cursos;

    public Professor(String nome){
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }

    public String getNome() {
        return nome;
    }

    public void mostrarCursos(){
        System.out.println("Cursos do professor " + this.nome + ":");
        for(Curso curso : cursos){
            System.out.println(curso.getNome());
        }
    }
}
