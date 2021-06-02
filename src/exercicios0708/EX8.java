package exercicios0708;

import java.util.Scanner;

public class EX8 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double custoFabrica, impostos, custoConsumidor, porcentagem;
		
		System.out.println("Digite o preço de fábrica do seu carro: ");
		custoFabrica = entrada.nextDouble();
		
		impostos=(0.45*custoFabrica);
		porcentagem=(0.28*custoFabrica);
		custoConsumidor=(impostos+porcentagem+custoFabrica);
		
		System.out.println("O valor dos impostos é de " + Math.ceil(impostos));
		System.out.println("\nO custo do distribuidor é de " + Math.ceil(porcentagem));
		System.out.println("\nO custo pro consumidor é " + Math.ceil(custoConsumidor));
	}

}
