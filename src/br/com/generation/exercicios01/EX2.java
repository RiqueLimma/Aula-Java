package br.com.generation.exercicios01;

import java.util.Scanner;

public class EX2 {

	public static void main (String [] args) {
		
		int idade;
        int idadeMeses;
        int idadeSemanas;
        int idadeDias;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("digite sua idade: ");
        idade = ler.nextInt();

        idadeDias = idade * 365;
        idadeSemanas = idade * 48;
        idadeMeses = idade * 12;

        System.out.println("Sua idade em anos é "+ " " + idade + "  "+  "sua idade em meses é " + idadeMeses + ", sua idade em semanas é " + idadeSemanas + ", sua idade em dias é " + idadeDias + ".");
    }
}