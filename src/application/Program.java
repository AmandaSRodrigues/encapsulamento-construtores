package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Controle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Controle controle;
		
		System.out.print("Enter account number: ");
		int nConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depInicial = sc.nextDouble();
			controle = new Controle(nConta, name, depInicial);
		}
		else {
			controle = new Controle(nConta, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(controle);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		controle.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(controle);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		controle.saque(saque);
		System.out.println(controle);
		
		sc.close();

	}

}
