package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		double popA, popB, taxaA, taxaB;
		
		do {
			System.out.println("Entre com o valor da populacao A: ");
			popA = scan.nextDouble();
			
			if(popA > 0) {
				valido = true;
				System.out.println("Populacao valida.\n");
			}else {
				System.out.println("Valor invalido.\n");
			}
		}while(!valido);
	
		valido = false;
		
		do {
			System.out.println("Entre com o valor da populacao B: ");
			popB = scan.nextDouble();
			
			if(popB > 0) {
				valido = true;
				System.out.println("Populacao valida.\n");
			}else {
				System.out.println("Valor invalido.\n");
			}
		}while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Entre com o valor da taxa de crescimento A: ");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
				System.out.println("taxa valida.\n");
			}else {
				System.out.println("Valor invalido.\n");
			}
		}while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Entre com o valor da taxa de crescimento B: ");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
				System.out.println("taxa valida.\n");
			}else {
				System.out.println("Valor invalido.\n");
			}
		}while(!valido);
		
		int cont = 0;

		while (popA < popB) {
			
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont++;
		}
		
		System.out.println("Ppulacao A: " + popA);
		System.out.println("Ppulacao B: " + popB);
		System.out.println("Quantidade de anos para A ultrapassar B: " + cont + " Anos");
	}

	}

