
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		String agencia;
		int numeroConta;
		String nome;
		double saldo;

		System.out.println("Por favor, digite o n�mero da Ag�ncia: ");
		agencia = scanner.nextLine();

		System.out.println("Por favor, digite o n�mero da Conta: ");
		numeroConta = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Por favor, digite o nome do Cliente: ");
		nome = scanner.nextLine();

		System.out.println("Por favor, digite o Saldo da Conta: ");
		saldo = scanner.nextDouble();

		System.out.println("Ol� " + nome + " , obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia
				+ " , conta " + numeroConta + " e seu saldo " + saldo + " j� est� dispon�vel para saque. ");

	}

}
