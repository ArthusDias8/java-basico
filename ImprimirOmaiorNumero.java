package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class ImprimirOmaiorNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		int valor2 = scan.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O maior numero eh " + valor1);
		} else {
			System.out.println("O maior numero eh " + valor2);
		}

	}

}
