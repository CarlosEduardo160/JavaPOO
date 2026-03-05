public class Funcionario {
    private String nome;
    private String cargo;
    private Departamento departamento;

    public Funcionario(String nome, String cargo, Departamento departamento){
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public void mostrarFuncionario(){
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Cargo do funcionario: " + this.cargo);
        System.out.println("Departamento: " + departamento.getNome());
        System.out.println("Código do Departamento: " + departamento.getCodigo());
    }
}
