public class listaProduto {
    private String nomeProduto;
    private String marca;
    private double valor;
    private int parcelas;
    private String data;

    public listaProduto(String nomeProduto,String marca ,double valor , int parcelas ,String data ){
        this.nomeProduto = nomeProduto;
        this.marca = marca ;
        this.valor = valor;
        this.parcelas = parcelas;
        this.data = data;
    }


    public listaProduto(){}


    public String getNomeproduto(){
        return this.nomeProduto;
    }

    public void  setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

}

