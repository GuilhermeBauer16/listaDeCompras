import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
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
                
                System.out.print("nome: ");
                String nome = scanner.next();
                System.out.print("Senha: ");
                String senha = scanner.next();
                Usuario criausuario = new Usuario(nome , senha);
                // criausuario.setNome(nome);
                // criausuario.setSenha(senha);
                // System.out.println(criausuario.getNome());
            }else if (opcao == 2) {
                
                System.out.print("Nome: ");
                String nomeLogin = scanner.next();
                System.out.print("Senha: ");
                String senhaLogin = scanner.next();
                String temUsuario = " ";
                // verificaUsuario(nomeLogin,senhaLogin);
                
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
