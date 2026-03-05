import java.util.HashMap;

public class ClienteRepositorio implements ICliente {

    private HashMap<Integer, Cliente> usuarios = new HashMap<Integer, Cliente>();
    private int contadorId = 1;

    @Override
    public void criarUsuario(String nome, String cpf) {
        Cliente cliente = new Cliente(contadorId, nome, cpf);
        usuarios.put(contadorId, cliente);
        contadorId++;

    }

    @Override
    public void listarUsuarios() {
        if (usuarios.isEmpty()){
            System.out.println("Lista de usuários vázia.");
        } else {
            for (int id : usuarios.keySet()) {
                Cliente cliente = usuarios.get(id);

                System.out.println(
                        "ID: " + id +
                                " | Nome: " + cliente.getNome() +
                                " | CPF: " + cliente.getCpf()
                );
            }
        }
    }

    @Override
    public void deletarUsuario(int id) {
        if (usuarios.containsKey(id)){
            usuarios.remove(id);
            System.out.println("Usuário removido");
        } else {
            System.out.println("Usuário não encontrado");
        }

    }

    @Override
    public void alterarUsuario(int id, String novoNome, String novoCpf) {
        if (usuarios.containsKey(id)){
            Cliente cliente = usuarios.get(id);
            cliente.setNome(novoNome);
            cliente.setCpf(novoCpf);
        } else {
            System.out.println("Usuário não encontrado");
        }

    }

    public boolean encontrarUsuario(int id){
        if (usuarios.containsKey(id)){
            return true;
        } else
            return false;
    }
}