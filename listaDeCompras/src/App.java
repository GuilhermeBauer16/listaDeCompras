import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        criandoParametro criandoParametro = new criandoParametro();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        limpaTerminal limpaTerminal = new limpaTerminal();
        int opcao = 0 ;
        String linha = "--".repeat(30);

        while (true) {
            System.out.println(titulo("Lista de compras",30));
            System.out.println("[1]Novo usuario " );
            System.out.println("[2]Login ");
            System.out.println("[3]Sair  ");
            System.out.println(linha);
            opcao = criandoParametro.criaParametroInt("Sua opcão: ");

            if (opcao == 1){

                System.out.println(titulo("Novo usuário", 30));

                String nome = criandoParametro.criaParametroString("Nome: ");
                String senha = criandoParametro.criaParametroString("Senha: ");
                Usuario criausuario = new Usuario(nome , senha);
                usuarios.add(criausuario);
                Thread.sleep(1000);
                limpaTerminal.apagaTerminal();
            }else if (opcao == 2) {

                System.out.println(titulo("login", 30));
            
                String nomeLogin = criandoParametro.criaParametroString("Nome: ");
                String senhaLogin = criandoParametro.criaParametroString("Senha: ");
                boolean temUsuario = false;
                for ( Usuario usuario : usuarios ){
                    if (usuario.verificaUsuario(nomeLogin, senhaLogin)){
                        String nomeProduto = criandoParametro.criaParametroString("Nome do produto: ");
                        String marca = criandoParametro.criaParametroString("Nome da marca: ");
                        double valor = criandoParametro.criaParametroDouble("Valor do produto:R$  ");
                        int parcelas = criandoParametro.criaParametroInt("Quantidade de parcelas: ");
                        String data = criandoParametro.criaParametroString("Data:  ");
                        usuario.listaProduto(nomeProduto,marca,valor,parcelas,data);
                        // temUsuario = true;
                        // break;
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
            
            
            
        }


    }

    public static String titulo(String mensagem , int numero){
        String linha = "--".repeat(numero);
        return linha + "\n "+ mensagem + "\n" + linha;
    }

    
}
