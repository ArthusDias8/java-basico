package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com  valor da sua nota: ");
			double nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("voce digitou "+ nota);
			} else {
				System.out.println("Nota invalidade, digite novamente\n");
			}
		} while (!notaValida);
	}
}