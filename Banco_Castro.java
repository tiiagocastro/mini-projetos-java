package exercicios_casa;

import java.util.Scanner;

public class Banco_Castro {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		double saldo = 1000;
		double operacao = 0;
		String mensagem = "";
		
		System.out.println("""
				 
				 ----- BEM VINDO AO BANCO CASTRO -----
			
			
					Selecione a opção desejada: 
							
					1. Depositar
					2. Sacar
					3. Transferir
					4. Sair
							
							
				 -----------------------------------------			
				
			""");
		
		int opcaoUsuario = scan.nextInt();
		
		while (opcaoUsuario != 4) {
			double saldoAnterior = saldo;
			switch (opcaoUsuario) {
				case 1 -> {
				System.out.println("Você selecionou depositar.");
				System.out.println("Qual valor deseja depositar?");
				operacao = scan.nextDouble();
				
				saldo += operacao;
				mensagem = """
						 Depósito feito com sucesso. 
						
						---------- EXTRATO ----------
						Saldo anterior: R$ %.2f
						Valor depositado: R$ %.2f
						Saldo atualizado: R$ %.2f
						------------------------------
							
						""".formatted(saldoAnterior, operacao, saldo);
				System.out.println(mensagem);
				
				}
				case 2 -> {
					System.out.println("Você selecionou sacar.");
					System.out.println("Qual valor deseja sacar?");
					operacao = scan.nextDouble();
					
					if (operacao>saldo) {
						mensagem = "Saldo insuficiente para saque.";
					}else if(operacao <= 0 ){
						mensagem = "Não é possível fazer essa operação.";
					}else {
						saldo -= operacao;
						mensagem = """
						 Saque feito com sucesso. 
								
						---------- EXTRATO ----------
						Saldo anterior: R$ %.2f
						Valor sacado: R$ %.2f
						Saldo atualizado: R$ %.2f
						------------------------------
									
								""".formatted(saldoAnterior, operacao, saldo);
						
					}
					System.out.println(mensagem);
					
				}
				case 3 -> {
					System.out.println("Você selecionou transferir.");
					System.out.println("Qual valor deseja transferir?");
					operacao = scan.nextDouble();
					
					if (operacao>saldo) {
						mensagem = "Saldo insuficiente para transferencia.";
					}else if(operacao <= 0 ){
						mensagem = "Não é possível fazer essa transferência.";
					}else {
						saldo -= operacao;
						mensagem = """
						 Transferência feita com sucesso. 
						
						---------- EXTRATO ----------
						Saldo anterior: R$ %.2f
						Valor sacado: R$ %.2f
						Saldo atualizado: R$ %.2f
						------------------------------
									
								""".formatted(saldoAnterior, operacao, saldo);
						
					}
					System.out.println(mensagem);
					}
				default -> {
					System.out.println("Opção inválida. Por favor selecione uma opção entre 1 e 4.");
				}
			}
			System.out.println("""
		            
					Deseja fazer mais alugma operação?
		                         1. Depositar
		                         2.   Sacar
		                         3. Transferir
		                         4.   Sair
		                
		            ------------------------------------
		                
		                """);
		            opcaoUsuario = scan.nextInt();
		}
	}

}
