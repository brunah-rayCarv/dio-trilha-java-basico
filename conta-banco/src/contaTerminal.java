import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner leitor = new Scanner(System.in);
        
       System.out.println("Por favor, digite o número da agência: ");
       int numero = leitor.nextInt();

       leitor.nextLine();

       System.out.println("Agora, digite o nome da agência: ");
        String agencia = leitor.nextLine();

       System.out.println("Nome de cliente: ");
        String nomeCliente = leitor.nextLine();
        
       System.out.println("Insira o valor do saldo Atual: ");
        double saldo = leitor.nextDouble();

        leitor.nextLine();

       System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numero + " e seu Saldo " + saldo + " já está disponível para saque.");

        leitor.close();
    }
}
