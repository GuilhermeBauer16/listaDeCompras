import java.util.Scanner;
public class testaNumero {
    
    public static double verificaNumero(String mensagem , double numero ){
        
        boolean digitaNumero = false;
        Scanner scanner = new Scanner(System.in);
        while(!digitaNumero){
            System.out.print(mensagem);
            if (scanner.hasNextInt()){
                numero = scanner.nextDouble();
                digitaNumero = true;

            }else{
                System.out.println("Porfavor digite um número!");
                scanner.nextLine();
            }
        }

        return numero ;
    }
}
