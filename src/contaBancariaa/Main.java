package contaBancariaa;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//criar conta
		ContaTerminal conta = new ContaTerminal();
		//preencher dados da conta
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor, digite o nome da Agência: ");
		conta.setAgencia(scan.nextLine());
		System.out.println("Por favor, digite o Número da conta: ");
		conta.setNumero(scan.nextInt());
		System.out.println("Por favor, digite o Nome do cliente: ");
		conta.setNomeCliente(scan.nextLine());
		scan.nextLine();//para não dá problema com o buffer
		
		System.out.println("Por favor, digite o saldo do cliente: ");
		conta.setSaldo(scan.nextFloat());
		//printar as informações da conta no console/terminal
		System.out.printf("Olá "+conta.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua Agência é ["+ conta.getAgencia()+"], conta ["+conta.getNumero()+"] e seu saldo ["+ conta.getSaldo()+"] já está disponível para saque");
		
		scan.close();
	}

}
