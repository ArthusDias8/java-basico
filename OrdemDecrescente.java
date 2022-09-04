package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int numeroUm = scan.nextInt();
		System.out.println("Entre com o segundo numero: ");
		int numeroDois = scan.nextInt();
		System.out.println("Entre com o terceiro numero: ");
		int numeroTres = scan.nextInt();
		
		if(numeroUm <= numeroDois && numeroUm <= numeroTres && numeroDois <= numeroTres) {
			System.out.println(numeroTres + "-" + numeroDois + "-" + numeroUm);
		}else if(numeroDois <= numeroUm && numeroDois <= numeroTres && numeroTres <= numeroUm){
			System.out.println(numeroUm + "-" + numeroDois + "-" + numeroTres);
		} else if(numeroTres <= numeroUm && numeroTres <= numeroDois && numeroUm <= numeroDois) {
			System.out.println(numeroUm + "-" + numeroTres + "-" + numeroDois);
		} else if(numeroTres <= numeroUm && numeroTres <= numeroDois && numeroDois <= numeroUm) {
			System.out.println(numeroTres + "-" + numeroDois + "-" + numeroUm);
		}
	}

}
