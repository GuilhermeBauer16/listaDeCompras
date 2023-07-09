public class usuario {
    private String nome;
    private String senha;

    public boolean veficaUsuario(String nome , String senha){
        if (this.nome == nome &&
        this.senha == senha){
            System.out.println("O usuario " + nome + " logado com sucesso");
            return true;
        }else:
            System.out.println("O usuario" + nome + "não encontrado");
            return false;
    }
}
