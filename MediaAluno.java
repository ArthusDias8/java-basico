package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor da sua primeira nota: ");
		float notaUm = scan.nextFloat();
		
		System.out.println("Insira o valor da sua segunda nota: ");
		float notaDois = scan.nextFloat();
		
		float media = (notaUm + notaDois)/2;
		
		System.out.println("Sua media foi " + media);
		
		if(media >= 7) {
			System.out.println("Voce esta aprovado");
		} else if(media == 10) {
			System.out.println("Voce esta aprovado com distincao");
		} else {
			System.out.println("Voce esta reprovado");
		}
	}
}
