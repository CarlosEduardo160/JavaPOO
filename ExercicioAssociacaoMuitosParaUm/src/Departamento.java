public class Departamento {
    private String nome;
    private int codigo;

    public Departamento(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
}
