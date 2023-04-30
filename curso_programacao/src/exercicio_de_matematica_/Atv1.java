/******************************************************************************

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

*******************************************************************************/



package exercicio_de_matematica_;

import java.util.Locale;
import java.util.Scanner;

public class Atv1 {
	public static void main(String [] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int C;
		int  A = sc.nextInt();
		int  B = sc.nextInt();
		
		C=A+B;
		
		System.out.println("a soma e:"+C);
		
		
		
		sc.close();
	}

}
