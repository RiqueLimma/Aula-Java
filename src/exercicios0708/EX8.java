package exercicios0708;

import java.util.Scanner;

public class EX8 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double custoFabrica, impostos, custoConsumidor, porcentagem;
		
		System.out.println("Digite o pre�o de f�brica do seu carro: ");
		custoFabrica = entrada.nextDouble();
		
		impostos=(0.45*custoFabrica);
		porcentagem=(0.28*custoFabrica);
		custoConsumidor=(impostos+porcentagem+custoFabrica);
		
		System.out.println("O valor dos impostos � de " + Math.ceil(impostos));
		System.out.println("\nO custo do distribuidor � de " + Math.ceil(porcentagem));
		System.out.println("\nO custo pro consumidor � " + Math.ceil(custoConsumidor));
	}

}
