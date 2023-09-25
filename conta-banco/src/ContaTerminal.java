import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     System.out.println("Digita sua Conta ");
     String Conta = scanner.next();

     System.out.println("Digita sua Agencia ");
     String Agencia = scanner.next();

    

     String nomeCompleto = "VANDERSON" + "AZEVEDO ";

     System.out.println("NomeCompleto");
     String NomeCompleto = scanner.next();

     System.out.println ("Olá [VANDERSON AZEVEDO ], obrigado por criar uma conta em nosso banco, sua agência é [389-1], conta [1020] e seu saldo [10000.5] já está disponível para saque");
    }   
}
