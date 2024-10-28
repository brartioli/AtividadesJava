package atividadeJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, salarioNovo;
		
		System.out.println("Entre com o seu salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Entre com o seu abono: ");
		abono = ler.nextFloat();
		
		salarioNovo = salario + abono;
		
		System.out.printf("Parabéns!! seu novo valor de salário é: " + salarioNovo);
		
		ler.close();
	}

}
