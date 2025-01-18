import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta.");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Para ler a proxima linha.
        
        System.out.println("Por favor, digite o numero da Agencia.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente.");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o Saldo de deposito.");
        double saldo = scanner.nextDouble();
        
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + ", já está disponivel para saque.");
        
    }
}
