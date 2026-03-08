public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Roberto", "Matematica");

        Aluno aluno01 = new Aluno("Carlos", 18);
        Aluno aluno02 = new Aluno("Ana", 14);
        Aluno aluno03 = new Aluno("Pedro", 16);

        Seminario seminarioMat = new Seminario("Matemática", "Escola primaria");

        seminarioMat.setAluno(aluno01);
        seminarioMat.setAluno(aluno02);
        seminarioMat.setAluno(aluno03);

        seminarioMat.setProfessor(p1);
        p1.setSeminario(seminarioMat);

        seminarioMat.mostrarSeminario();
    }
}
