import java.util.Scanner;


public class ContaTerminal {

	
	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Por favor, digite seu nome: ");
		nomeCliente = scanner.next();

		System.out.print("Por favor, digite o n�mero da conta: ");
		numero = scanner.nextInt();
		
		System.out.print("Por favor, digite a ag�ncia: ");
		agencia = scanner.next();

		System.out.print("Por favor, digite o saldo da conta: ");
		saldo = scanner.nextDouble();
		
		scanner.close();		
		
		System.out.println("Ol� "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua ag�ncia � "+agencia+", conta "+numero+" e seu saldo "+saldo+" j� est� dispon�vel para saque.");
		
		
	}
	
}
