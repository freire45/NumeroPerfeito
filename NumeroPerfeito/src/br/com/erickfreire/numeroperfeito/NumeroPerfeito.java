package br.com.erickfreire.numeroperfeito;

import java.util.Scanner;

/**
 * Programa em Java que verifica se um n�mero � perfeito
 * @author Erick Freire
 * @version 1 - Criado em 02-05-2021 as 16:10
 */

public class NumeroPerfeito {

	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica o n�mero perfeito: ");
		
		System.out.print("Informe o valor: ");
		numero = entrada.nextInt();
		
		while(numero < 0) {
			System.out.print("O valor tem que ser positivo, digite novamente: ");
			numero = entrada.nextInt();		
			
		}
		
		
		if(numero == 0) {
			System.out.println("%nO fatorial � 1!");
		} 
		
		if(numero > 0)
		    verificaPerfeito(numero);

	}
	
	public static void verificaPerfeito(int n) {
		
		int resultado = 0;

		for(int i = 1; i <= n; i++) {
			
			resultado = resultado + i;
			
			if(resultado == n) {
				System.out.printf("%nO n�mero � perfeito: %d quando o contador �: %d", resultado, i);
			}
			
		}
		
		
	}

}
