package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class MaiorNumeroUsandoTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int numeroUm = scan.nextInt();
		
		System.out.println("Entre com o primeiro numero: ");
		int numeroDois = scan.nextInt();
		
		System.out.println("Entre com o primeiro numero: ");
		int numeroTres = scan.nextInt();
		
		if(numeroUm >= numeroDois && numeroUm >= numeroTres) {
			System.out.println("O maior numero eh o " + numeroUm);
		}else if(numeroDois >= numeroUm && numeroDois >= numeroTres){
			System.out.println("O maior numero eh o " + numeroDois);
		} else if(numeroTres >= numeroUm && numeroTres >= numeroDois){
			System.out.println("O maior numero eh o " + numeroTres);
		}
	}
}
