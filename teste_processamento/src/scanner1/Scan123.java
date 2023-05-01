package scanner1;

import java.util.Scanner;

public class Scan123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;

		x = sc.nextLine(); /// definir o scan para cada letra
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("dados digitados"); // imprimir os dados digitados
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
sc.close();
	}

}
