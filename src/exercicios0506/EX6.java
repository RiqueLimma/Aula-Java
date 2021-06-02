package exercicios0506;

import java.util.Scanner;
import java.math.MathContext;


public class EX6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2, p, raiz;
		
		System.out.println("Digite o valor de X1: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y1: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X2: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y2: ");
		y2 = entrada.nextDouble();
		
		p = ((x2-x1) * (x2-x1)) + ((y2 - y1) * (y2 - y1));
		raiz = Math.sqrt(p);
		
		System.out.println("Potência X e Y: " + p);
		System.out.println("Raiz X e Y: " + raiz);
	}

}
