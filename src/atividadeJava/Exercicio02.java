package atividadeJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.printf("Entre com a sua nota 1: ");
		nota1 = ler.nextFloat();
		
		System.out.printf("Entre com a sua nota 2: ");
		nota2 = ler.nextFloat();
		
		System.out.printf("Entre com a sua nota 3: ");
		nota3 = ler.nextFloat();
		
		System.out.printf("Entre com a sua nota 4: ");
		nota4 = ler.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua média final foi:" +mediaFinal);
		
		ler.close();

	}

}
