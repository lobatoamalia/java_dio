import java.util.Scanner; // Importação necessária para a classe Scanner

public class ContaTerminalau {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema");

        // Criação de um Scanner para capturar os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação de informações do usuário
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número da conta

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechamento do Scanner
        scanner.close();
    }
}
