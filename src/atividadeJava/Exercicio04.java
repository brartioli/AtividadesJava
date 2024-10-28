package atividadeJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) 
	{
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.printf("Entre com o valor 1:");
		n1 = ler.nextFloat();
		System.out.printf("Entre com o valor 2:");
		n2 = ler.nextFloat();
		System.out.printf("Entre com o valor 3:");
		n3 = ler.nextFloat();
		System.out.printf("Entre com o valor 4:");
		n4 = ler.nextFloat();
		
		diferenca = (n1 * n2)-(n3 * n4);
		
		System.out.println("O valor da diferença é: " +diferenca);
		
		ler.close();
		
	}

}
