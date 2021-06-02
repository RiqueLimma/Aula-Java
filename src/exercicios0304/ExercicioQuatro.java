package exercicios0304;

import java.math.MathContext;
import java.util.Scanner;
public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		
		
		
		System.out.println("Digite o valor do primeiro número: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor do segundo número: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o valor do terceiro número: ");
		c = entrada.nextInt();
		
		double r = Math.pow(a+b, 2);
		
		
		double s = Math.pow(b+c,  2);
		
		double d;
		
		d = (r+s)/2;
				
		System.out.println("A expressão é: " + d);
	}

}