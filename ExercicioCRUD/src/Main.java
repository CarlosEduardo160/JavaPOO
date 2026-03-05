import java.util.Scanner;

public class Main {
    static ICliente cliente = new ClienteRepositorio();
    static Scanner leitura = new Scanner(System.in);

    static void main(String[] args) {
        while (true) {
            menu();
            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    criarUsuario();
                    break;
                case 2:
                    cliente.listarUsuarios();
                    break;
                case 3:
                    alterarUsuario();
                    break;
                case 4:
                    excluirUsuario();
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void menu() {
        System.out.println("-------");
        System.out.println("Digite 1 para adicionar um usuário");
        System.out.println("Digite 2 para consultar usuários");
        System.out.println("Digite 3 para alterar um usuário");
        System.out.println("Digite 4 para excluir um usuário");
        System.out.println("Digite 5 para finalizar");
        System.out.println("-------");
    }

    public static void criarUsuario() {
        System.out.print("Digite o nome do usuário: ");
        String nome = leitura.nextLine();
        System.out.print("Digite o CPF do usuário: ");
        String cpf = leitura.nextLine();

        cliente.criarUsuario(nome, cpf);
    }

    public static void alterarUsuario() {
        System.out.print("Digite o ID do usuário que deseja alterar: ");
        int id = leitura.nextInt();
        leitura.nextLine();
        if (cliente.encontrarUsuario(id)) {
            System.out.print("Digite o novo nome do usuário: ");
            String novoNome = leitura.nextLine();
            System.out.print("Digite o novo CPF do usuário");
            String novoCpf = leitura.nextLine();
            cliente.alterarUsuario(id, novoNome, novoCpf);
        } else {
            System.out.println("Usuário não encontrado");
        }
    }

    public static void excluirUsuario() {
        System.out.print("Digite o ID do usuário que deseja excluir: ");
        int id = leitura.nextInt();
        leitura.nextLine();
        if (cliente.encontrarUsuario(id)) {
            cliente.deletarUsuario(id);
        } else {
            System.out.println("Usuário não encontrado");
        }
    }
}