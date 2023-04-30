package exercicio_de_matematica_;

import java.util.Locale;
import java.util.Scanner;

public class Exem {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroquadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroquadrado;
		
		System.out.printf("area = %.2f%n ",area);
		System.out.printf("preco = %.2f%n ",preco);
		
		
		sc.close();
	}
	
}
