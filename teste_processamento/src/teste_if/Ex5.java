package teste_if;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner (System.in);
		int A,B;
		double C = 0;
		
		System.out.println("Digite digite o codigo do seu pedido");
		A=sc.nextInt();
		
		
		
		if (A==1){
			System.out.println("voce selecionou cachorro quente \ndigite quanto vai querer:");
			B=sc.nextInt();
			C=B*4.00;
			
			
		}
		else if(A==2) {
			System.out.println("voce selecionou X-salada \ndigite quanto vai querer:");
			B=sc.nextInt();
			C=B*4.50;
			
			
			
			
		}
		else if(A==3){
		System.out.println("voce selecionou X-Bacon \ndigite quanto vai querer: ");
		B=sc.nextInt();
		C=B*5.00;
		
		
		}
		else if (A==4) {
			System.out.println("voce selecionou Torrada simples \ndigite quanto vai querer: ");
			B=sc.nextInt();
			C=B*2.00;
			
			
		}
		else if (A==5) {
			System.out.println("voce selecionou refrigerante \ndigite quanto vai querer: ");
			B=sc.nextInt();
			C=B*1.50;
			
			
		}
		System.out.printf("total: R$%.2f ",C);
		
		sc.close();
	
	}
	
}
