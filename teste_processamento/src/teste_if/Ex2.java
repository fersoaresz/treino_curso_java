package teste_if;

import java.util.Scanner;

public class Ex2 {
	public static void main (String[]args) {
	Scanner sc =new Scanner(System.in);
	int A;
	
	System.out.println("digite seu numero");
	A=sc.nextInt();
	
	if (A%2==0) {
		System.out.println("par");
		
	
	}
	else {
		System.out.println("impar");
	}
	
	
	
	
		sc.close();
	}

}
