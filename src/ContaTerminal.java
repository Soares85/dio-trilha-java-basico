import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = in.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = in.nextLine();

        System.out.println("Por favor, digite o númedo de sua conta!");
        int numeroConta = in.nextInt();

        System.out.println("Por favor, digite seu saldo!");
        double saldo = in.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}