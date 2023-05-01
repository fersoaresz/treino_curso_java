package teste_if;

import java.util.Scanner;

public class Ex3 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		System.out.println("digite seu primeiro valor:");
		A=sc.nextInt();
		
		System.out.println("digite seu segundo valor:");
		B=sc.nextInt();
		if(A%B==0||B%A==0) {
			System.out.println("sao multiplos");
			
		}
		else {
			System.out.println("nao sao multiplos");
		}
	}

}
