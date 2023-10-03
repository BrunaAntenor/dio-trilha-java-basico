
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		String agencia;
		int numeroConta;
		String nome;
		double saldo;

		System.out.println("Por favor, digite o número da Agência: ");
		agencia = scanner.nextLine();

		System.out.println("Por favor, digite o número da Conta: ");
		numeroConta = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Por favor, digite o nome do Cliente: ");
		nome = scanner.nextLine();

		System.out.println("Por favor, digite o Saldo da Conta: ");
		saldo = scanner.nextDouble();

		System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+ " , conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque. ");

	}

}
