package exercicios0708;
import java.util.Scanner;

public class EX7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextInt();
		
		System.out.println("Digite o valor de D: ");
		d = entrada.nextInt();
		
		System.out.println("Digite o valor de E: ");
		e = entrada.nextInt();
		
		System.out.println("Digite o valor de F: ");
		f = entrada.nextInt();
		
		x = (c*e)-(b*f)/(a*e)-(b*d);
		y = (a*f)-(c+d)/(a*e)-(b*d);
		
		System.out.println("O valor de X é " + x);
		System.out.println("O valor de Y é " + y);
	}

}