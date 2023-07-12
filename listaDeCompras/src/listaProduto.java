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

    public String getmarca(){
        return this.marca;
    }

    public void  setmarca(String marca){
        this.marca = marca;
    }
        public double getvalor(){
        return this.valor;
    }

    public void  setvalor(double valor){
        this.valor = valor;
    }

        public int getparcelas(){
        return this.parcelas;
    }

    public void  setparcelas(int parcelas){
        this.parcelas = parcelas;
    }

        public String getdata(){
        return this.data;
    }

    public void  setdata(String data){
        this.data = data;
    }

    
}

