/******************************************************************************

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

*******************************************************************************/

package exercicio_de_matematica_;

import java.util.Locale;
import java.util.Scanner;

public class Atv2 {
	public static void main(String []args){
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double area,pi;
		
		double raio = sc.nextDouble();
		
		
	    pi=3.14159;
	    area =Math.pow(raio, 2.0) * pi;
	    
	    System.out.printf("o valor do raio e:%.4f%n",area);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	

}
