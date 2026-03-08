import java.util.ArrayList;

public class Professor {
    private String nome;
    private String especialidade;
    ArrayList<Seminario> seminarios;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = new ArrayList<>();
    }

    public void setSeminario(Seminario seminario){
        seminarios.add(seminario);
    }

    public String getNome() {
        return nome;
    }
}
