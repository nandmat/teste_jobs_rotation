/*
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele 
 * calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */

package questao_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = 10;
		
		int[] array = new int[n];
		
		int t1 = 0;
		
		int t2 = 1;
		
		int t3 = 1;
		
		System.out.println("Digite um número: ");
		int num = leitor.nextInt();
		
		for(int i = 0; i < n; i++) {
			   
		        
		        t1 = t2 + t3;
		        t2 = t3;
		        t3 = t1;
		        array[i] = t3;
		    }
		boolean verifica = conteudo(array, num);
		
		System.out.println( num + "? " + verifica);
		
		leitor.close();

	}

	public static boolean conteudo (final int[] array, final int num) {
		return Arrays.asList(array).contains(num);
	}
	
}
