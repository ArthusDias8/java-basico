package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra qualquer: ");
		String letra = scan.next();
		
		if(letra.length() > 1) {
			System.out.println("Nao eh uma letra valida, digite apenas uma letra");
		}else if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
				letra.equalsIgnoreCase("u")) {
			System.out.println("Este valor eh uma vogal");
		}else {
			System.out.println("Este valor eh uma consoante");
		}
	}
}
