package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class DefinicaoSexo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu sexo (F-M): ");
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("F - feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("invalido");
		}

	}

}
