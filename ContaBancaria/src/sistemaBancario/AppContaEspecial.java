package sistemaBancario;

import java.util.Iterator;
import java.util.Scanner;

public class AppContaEspecial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Id conta         :");
		int idconta = input.nextInt();
		
		System.out.println("Agência          :");
		String agencia = input.next();
		
		System.out.println("Conta            :");
		String numeroConta = input.next();
		
		System.out.println("Limite de Crédito:");
		double limiteCredito = input.nextDouble();
		
		ContaBancaria contaBancaria = new ContaBancaria(idconta, agencia, numeroConta, limiteCredito);
		
		mostrarDadosconta(contaBancaria);
		
		for (int i = 0; i < 2; i++) {
			
			System.out.print("Deposito:");
			double valorDeposito = input.nextDouble();
			contaBancaria.registraDeposito(valorDeposito);
		}
		mostrarDadosconta(contaBancaria);
		
		if (contaBancaria.registraSaque(1000) == false) {
			System.out.println("Saldo insuficiênte");
		}
		mostrarDadosconta(contaBancaria);
		
		if (contaBancaria.registraSaque(3000) == false) {
			System.out.println("Saldo insuficiênte");
		}
		mostrarDadosconta(contaBancaria);
		
		if (contaBancaria.registraSaque(800) == false) {
			System.out.println("Saldo insuficiênte");
		}
		mostrarDadosconta(contaBancaria);
	}	
	
		
	
	
	public static void mostrarDadosconta(ContaBancaria conta) {
		System.out.println();
		System.out.println("=================================================");
		System.out.println("Identificador: " + conta.getIdConta());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número da Conta: " + conta.getNumeroConta());
		System.out.println("Tipo: " + (conta.getTipo().equals("E")?"Especial":"Normal"));
		System.out.println("Saldo: R$ " + conta.getSaldo());
		System.out.println("Limite de Crédito: " + conta.getLimiteCredito());
		System.out.println("------------------------------------------------");
		System.out.println();
	}
}
