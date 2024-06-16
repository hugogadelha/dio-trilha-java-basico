import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome.");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência.");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite a sua conta.");
        String conta = scanner.next();

        System.out.println("Por favor, digite o seu saldo.");
        double saldo = scanner.nextDouble();

         // Formatando o saldo como valor monetário
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = nf.format(saldo);

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldoFormatado + " já está disponível para saque.");
    }
}