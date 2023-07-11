import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        limpaTerminal limpaTerminal = new limpaTerminal();
        int opcao = 0 ;
        String linha = "--".repeat(30);

        while (true) {
            System.out.println(titulo("Lista de compras",30));
            System.out.println("[1]Novo usuario ");
            System.out.println("[2]Login ");
            System.out.println("[3]Sair  ");
            System.out.println(linha);
            opcao = testaNumero.verificaNumeroInt("Sua opcão: ", opcao);

            if (opcao == 1){

                System.out.println(titulo("Novo usuário", 30));
                System.out.print("nome: ");
                String nome = scanner.next();
                System.out.print("Senha: ");
                String senha = scanner.next();
                Usuario criausuario = new Usuario(nome , senha);
                usuarios.add(criausuario);
                Thread.sleep(1000);
                limpaTerminal.apagaTerminal();
            }else if (opcao == 2) {
                System.out.println(titulo("login", 30));
                System.out.print("Nome: ");
                String nomeLogin = scanner.next();
                System.out.print("Senha: ");
                String senhaLogin = scanner.next();
                boolean temUsuario = false;
                for ( Usuario usuario : usuarios ){
                    if (usuario.verificaUsuario(nomeLogin, senhaLogin)){
                        temUsuario = true;
                        break;
                    }
                }

                if (temUsuario == true){
                    System.out.println("Ola");
                }
                
            } else if (opcao == 3) {
                break;
                
            }else{
                System.out.println("Por favor selecione uma opção valida!");
            }
            
            // if (usuario.veficaUsuario())
            
        }


    }

    public static String titulo(String mensagem , int numero){
        String linha = "--".repeat(numero);
        return linha + "\n "+ mensagem + "\n" + linha;
    }
}
