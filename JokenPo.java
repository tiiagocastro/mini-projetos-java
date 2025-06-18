package exercicios_casa;

import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		Random random = new Random();

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Vamos jogar PEDRA PAPEL E TESOURA.");
		System.out.println("Escolha qual você vai jogar: \n1)Pedra\n2)Papel\n3)Tesoura");
		int jogador = scan.nextInt();
		scan.nextLine();
		
		String escolhaJogador =	switch(jogador) {
			case 1 -> "Pedra";
			case 2 -> "Papel";
			case 3 -> "Tesoura";
			default -> "Opção Inválida";
		};
		System.out.println("Você escolheu: " + escolhaJogador);
		
		int numeroComputador = random.nextInt(1, 4);
		
		String escolhaComputador =	switch(numeroComputador) {
		case 1 -> "Pedra";
		case 2 -> "Papel";
		case 3 -> "Tesoura";
		default -> "Opção Inválida";
		};
		System.out.println("O computador escolheu: " + escolhaComputador);
		
		if(		jogador == numeroComputador) {
			System.out.println("Empate!");
		}else if(	   (jogador == 1 && numeroComputador == 3) 
					|| (jogador == 2 && numeroComputador == 1) 
					|| (jogador == 3 && numeroComputador == 2)) {
			System.out.println("Você venceu!");
		}else{
			System.out.println("Você perdeu!");
		}
		
	
	}

}
