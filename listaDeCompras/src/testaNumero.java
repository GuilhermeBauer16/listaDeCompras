import java.util.Scanner;
public class testaNumero {
    
    public static double verificaNumeroDouble(String mensagem , double numero ){
        
        Scanner scanner = new Scanner(System.in);
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

        return numero ;
    }

    public static int verificaNumeroInt(String mensagem , int numero){
        Scanner scanner = new Scanner(System.in);
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
}
