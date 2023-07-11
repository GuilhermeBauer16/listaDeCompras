import java.util.Scanner;

public class criandoParametro  {
        private Scanner scanner;

        public criandoParametro(){
            scanner = new Scanner(System.in);
        }
    public String criaParametroString(String mensagem){

        System.out.print(mensagem);
        return scanner.next();
    }

    public int criaParametroInt(String mensagem){
        int numero = 0;
        while (true){
            
            System.out.print(mensagem);
            if (scanner.hasNextInt()){
                numero = scanner.nextInt();
                break;
            }else{
                System.out.println("Por favor digite um número!");
                scanner.nextLine();
            }

        }
        return numero;    }


    public double criaParametroDouble(String mensagem){
        double numero;
        while(true){
            System.out.print(mensagem);
            if (scanner.hasNextDouble()){
                numero = scanner.nextDouble();
                break;

            }else{
                System.out.println("Porfavor digite um número!");
                scanner.nextLine();
    }

    }
        return numero;
}
}
