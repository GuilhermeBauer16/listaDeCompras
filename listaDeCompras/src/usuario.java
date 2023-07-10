
public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome , String senha){
        this.nome = nome;
        this.senha = senha;
        System.out.println(nome + " seu usuario foi criado!");
    }

    public boolean verificaUsuario(String nome , String senha){
        if (this.nome == nome &&
        this.senha == senha){
            System.out.println("O usuario " + nome + " logado com sucesso");
            return true;
        }else{
            System.out.println("O usuario" + nome + "não encontrado");
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
}
