public interface ICliente {

    public void criarUsuario(String nome, String cpf);

    public void listarUsuarios();

    public void deletarUsuario(int id);

    public void alterarUsuario(int id, String novoNome, String novoCpf);

    public boolean encontrarUsuario(int id);
}
