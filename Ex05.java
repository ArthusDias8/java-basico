package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String [][][] compromissos = new String[12][31][8];
		
		boolean sair =  false;
		int opcao;
		while (!sair) {
			
			System.out.println("\nDigite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextInt();
			
			if (opcao == 1) {//adicionar compromisso
				
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Entre com o mes: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mes invalido, digite novmente: ");
					}
				}
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
						if (hora >= 0 && hora <= 8) {
							horaValido = true;
						} else {
							System.out.println("Hora invalido, digite novmente: ");
						}
				}
				
				mes--;
				dia--;//subtrair um dia, pois o valor 1 é o 0;
				System.out.println("Digite o compromisso: ");	
				compromissos[mes][dia][hora] = scan.next();
				
			}else if (opcao == 2) {//verificar compromisso
			
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Entre com o mes: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mes invalido, digite novmente: ");
					}
			
			
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
				
				mes--;
				dia--;
				System.out.println("O compromisso agendado eh: ");
				System.out.println(compromissos[mes][dia][hora]);
				
			} if (opcao == 0){
				sair = true;
			} else {
				System.out.println("Opcao invalida, digite novamente: ");
			}
		}
	}

	}
	
}

