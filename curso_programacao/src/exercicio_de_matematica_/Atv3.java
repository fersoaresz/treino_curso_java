/******************************************************************************

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

*******************************************************************************/


package exercicio_de_matematica_;

import java.util.Locale;
import java.util.Scanner;

public class Atv3 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e;
		e = a*b-c*d;
		
		System.out.println("o valor de saida e:"+e);
		
		
		
		
		
		sc.close();
		
	}

}
