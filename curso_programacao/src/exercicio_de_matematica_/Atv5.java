package exercicio_de_matematica_;

import java.util.Locale;
import java.util.Scanner;

public class Atv5 {
	public static void main (String[]args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double p1 = sc.nextDouble();
		double p2 = sc.nextDouble();
		double uni1=sc.nextDouble();
		double uni2=sc.nextDouble();
	    double val1=sc.nextDouble();
	    double val2=sc.nextDouble();
	    double res1,res2,res3;
	    
	    res1=uni1*val1;
	    res2=uni2*val2;
	    res3= res1+res2;
	    
	    
		
		System.out.println("o codigo da peca 1 e: "+p1+"\n peca 2 e: "+p2);
		System.out.printf("valor a pagar e %.2f%n",res3);
		
		
		sc.close();
	}
	
	

}
