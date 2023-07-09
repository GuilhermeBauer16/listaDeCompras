
public class Usuario {
    private String nome;
    private String senha;

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

    public void setUsuario(String nome, String senha){
        
        this.senha = senha;
        this.nome = nome; ;
    }
}