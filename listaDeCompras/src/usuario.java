import java.util.ArrayList;
public class Usuario {
    private String nome;
    private String senha;
    ArrayList<listaProduto> listaProdutos;


    

    public Usuario(){
        this.listaProdutos = new ArrayList<>();
    }

    public Usuario(String nome , String senha){
        this.nome = nome;
        this.senha = senha;
        this.listaProdutos = new ArrayList<>();
        System.out.println(nome + " seu usuario foi criado!");
    }

    public boolean verificaUsuario(String nome , String senha){
        if (this.nome.equals(nome) &&
        this.senha.equals(senha)){
            System.out.println("O usuario " + nome + " logado com sucesso");
            return true;
        }else{
            System.out.println("O usuario " + nome + " não encontrado");
            return false;
    }
}

    public String getNome(){
        return this.nome ;
    }

    public String getSenha(){
        return this.senha;

    }

    public String setNome(String nome){

        return this.nome = nome ;
    }

    public String setSenha(String senha){

        return this.senha = senha;
    }

    public void  mostraListaProdutos(){

        for ( int i = 0 ; i < listaProdutos.size(); i++){
            listaProduto lista = listaProdutos.get(i);
            System.out.println("Nome: " + lista.getNomeproduto());
            System.out.println("Marca: " + lista.getmarca());
            System.out.println("Valor:R$ " + lista.getvalor());
            System.out.println("Parcelas: " + lista.getparcelas());
            System.out.println("Data: " + lista.getdata());
            System.out.println();
        }
    }
}
