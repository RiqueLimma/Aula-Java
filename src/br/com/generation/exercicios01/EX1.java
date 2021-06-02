package br.com.generation.exercicios01;

import java.util.Scanner;


public class EX1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, m=0, d;
		
		System.out.println("Informe sua Idade: ");
		a = leia.nextInt();

		System.out.println("Informe sua Idade em Dias: ");
		d = leia.nextInt();
		
		 d = (d+(a*365)+(m*30));
		 
		 System.out.println("sua idade em dias é: " + d);
	}

}
