import java.util.ArrayList;

public class Seminario {
    private String titulo;
    private Professor professor;
    private String local;
    ArrayList<Aluno> alunos;

    public Seminario(String titulo, String local){
        this.titulo = titulo;
        this.local = local;
        this.alunos = new ArrayList<>();
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void setAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void mostrarSeminario(){
        System.out.println("Seminário: " + this.titulo);
        System.out.println("Professor responsável: " + professor.getNome());
        for(Aluno aluno : alunos){
            System.out.println("Aluno: " + aluno.getNome() + "| idade: " + aluno.getIdade());
        }
    }
}
