package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoC;
		double salario;
		int idade; 
		
		boolean nomeValido = false;
		boolean idadeValida = false;
		boolean salarioValido = false;
		boolean sexoValida = false;
		boolean estadoCValida = false;
		
		
		do {
			System.out.println("Digite seu nome: ");
			nome = scan.next();
			
			if(nome.length() < 3) {
				System.out.println("Este valor eh invalido, digite um valor valido(< 3 digitos).\n");
			}else {
				nomeValido = true;
				System.out.println("Nome valido.\n");
			}
		}while(!nomeValido);// Negação de true e false, será executado enquanto for falo
	
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				idadeValida = true;
				System.out.println("Idade valida.\n");
			} else {
				System.out.println("Valor invalido, digite um numero entre 0 - 150.\n");
			}
		}while(!idadeValida);
		
		do {
			System.out.println("Digite seu salario: ");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				salarioValido = true;
				System.out.println("Valor valido.\n");
			}else {
				System.out.println("Valor invalido, digite um numero maior que 0.\n");
			}
		}while(!salarioValido);
		
		do {
			System.out.println("Sexo(F-M): ");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("f")) {
				sexoValida = true;
				System.out.println("F - Feminino\n");
			} else if(sexo.equalsIgnoreCase("m")) {
				sexoValida = true;
				System.out.println("M - Masculino\n");
			} else {
				System.out.println("Sexo invalido.\n");
			}
		}while(!sexoValida);
		
		do {
			System.out.println("Qual seu estado civil(s - c - v - d): ");
			estadoC = scan.next();
			
			if(estadoC.equalsIgnoreCase("s")) {
				estadoCValida = true;
				System.out.println("S - Solteiro(a)\n");
			} else if(estadoC.equalsIgnoreCase("c")) {
				estadoCValida = true;
				System.out.println("C - Casado(a)\n");
			} else if(estadoC.equalsIgnoreCase("v")){
				estadoCValida = true;
				System.out.println("V - Viuvo(a)\n");
			} else if(estadoC.equalsIgnoreCase("d")) {
				estadoCValida = true;
				System.out.println("D - Divorciado(a)\n");
			} else {
				System.out.println("Estado Civil invalido.\n");
			}
		}while(!estadoCValida);
		System.out.println("iNFORMACOES COLETADAS:");
		System.out.println("Nome: " + nome + "Idade: " + idade + "Salario: " + salario +  "Sexo: " + sexo + "Estado civil: " + estadoC);
	}
}
