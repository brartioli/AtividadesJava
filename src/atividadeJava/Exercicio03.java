package atividadeJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Entre com o salário bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.println("Entre com o adicional noturno: ");
		adicionalNoturno = ler.nextFloat();
		System.out.println("Entre com as horas extras: ");
		horasExtras = ler.nextFloat();
		System.out.println("Entre com os descontos: ");
		descontos = ler.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu salário líquido é:" +salarioLiquido);
		
		ler.close();
	}

}
