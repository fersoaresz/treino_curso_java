package exercicio_de_matematica_;

import java.util.Locale;
import java.util.Scanner;

public class Atv6 {
	public static void main(String[]args) {
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,pi=3.14159,tri,raio,trap,area,retarea;
		
		
		
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		
		tri=(A*C)/2;
		raio=Math.pow(C,2)*pi;
		
		
		trap=((A+B)*C)/2;
		area=B*B;
		retarea=A*B;
		
		System.out.printf("Triangulo: %.3f%n Circulo: %.3f%n Trapezio: %.3f%n Quadrado: %.3f%n Retangulo: %.2f%n",tri,raio,trap,area,retarea);
		
		
		
		
		
		
		
	}

}
