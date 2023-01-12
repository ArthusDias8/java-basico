package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String [][] compromissos = new String[31][24];
		
		boolean sair =  false;
		int opcao;
		while (!sair) {
			
			System.out.println("\nDigite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextInt();
			
			if (opcao == 1) {//adicionar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novmente: ");
					}
				}
				
					boolean horaValido = false;
					int hora = 0;
					while (!horaValido) {
						System.out.println("Entre com o hora do compromisso: ");
						hora = scan.nextInt();
						if (hora >= 0 && hora <= 24) {
							horaValido = true;
						} else {
							System.out.println("Hora invalido, digite novmente: ");
						}
				}
					
				dia--;//subtrair um dia, pois o valor 1 é o 0;
				System.out.println("Digite o compromisso: ");	
				compromissos[dia][hora] = scan.next();
				
			} else if (opcao == 2) {//verificar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novmente: ");
					}
				}
				
					boolean horaValido = false;
					int hora = 0;
					while (!horaValido) {
						System.out.println("Entre com o hora do compromisso: ");
						hora = scan.nextInt();
						if (hora >= 0 && hora <= 24) {
							horaValido = true;
						} else {
							System.out.println("Hora invalido, digite novmente: ");
						}
				}
				
				dia--;
				System.out.println("O compromisso agendado eh: ");
				System.out.println(compromissos[dia][hora]);
				
			} else if (opcao == 0){
				sair = true;
			} else {
				System.out.println("Opcao invalida, digite novamente: ");
			}
		}
	}

}
