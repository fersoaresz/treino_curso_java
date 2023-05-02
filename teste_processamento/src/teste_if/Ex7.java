package teste_if;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		System.out.println("digite o valor do x: ");
		a=sc.nextDouble();
		
		System.out.println("digite o valor de y:");
		b=sc.nextDouble();
		
		if(a>0.0&&b>0.0) {
			System.out.println("Q1");
		}
		else if(a>0.0&&b<0.0) {
			System.out.println("Q4");
		}
		else if(a<0.0&&b>0.0) {
			System.out.println("Q2");
		}
		else if(a<0.0&&b<0.0) {
			System.out.println("Q3");
			
		}
		else {
			System.out.println("origem");
		}
			
	}

}
