package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;//flag
		
		do {
			System.out.println("Entre com seu nome de usuario: ");
			String nome = scan.next();
			
			System.out.println("Entre com a sua senha: ");
			String senha = scan.next();
			
			if(senha.equalsIgnoreCase(nome)) {
				//infoValidas = false;
				System.out.println("Valor da senha invalida, entre com outro valor.\n");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuarios validos.");
			}
		}while(!infoValidas);// negando o valor do boolean com o !, que era falso, tornando-se verdadeiro

	}

}
