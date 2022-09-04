package com.loiane.cursojava.aula17;

public class ex4 {

	public static void main(String[] args) {

		int popA = 80000;
		int popB = 200000;
		int cont = 0;

		while (popA < popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont++;
		}
		
		System.out.println("Ppulacao A: " + popA);
		System.out.println("Ppulacao B: " + popB);
		System.out.println("Quantidade de anos para A ultrapassar B: " + cont + " Anos");
	}

}
