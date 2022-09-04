package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class ValorPositivoNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor positivo ou negativo: ");
		int valorUm = scan.nextInt();
		
		if(valorUm > 0) {
			System.out.println("Valor da entrada eh positiva");
		} else if(valorUm == 0) {
			System.out.println("Valor invalido");
		} else {
			System.out.println("Valor da entrada eh negativo");
		}
	}

}
