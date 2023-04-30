package exercicio_de_matematica_;

import java.util.Locale;
import java.util.Scanner;

public class Atv4 {
	
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double numerofunc = sc.nextDouble();
		double horas = sc.nextDouble();
		double valorhoras = sc.nextDouble();
		double result;
		
		result=horas*valorhoras;
		
		System.out.println("seu numero e "+numerofunc);
		System.out.printf("seu salario e: %.2f%n",result);
		
		
	sc.close();	
	}
	
	

}
