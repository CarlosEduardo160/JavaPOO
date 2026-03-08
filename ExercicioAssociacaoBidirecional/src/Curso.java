public class Curso {
    private String nome;
    private Professor professor;

    public Curso(String nome){
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void mostrarCurso(){
        System.out.println("Nome do curso: " + this.nome);
        System.out.println("Nome do professor: " + professor.getNome());
    }

    public String getNome() {
        return nome;
    }
}
