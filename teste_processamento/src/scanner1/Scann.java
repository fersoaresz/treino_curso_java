package scanner1;
import java.util.Locale; //importar idioma US
import java.util.Scanner; // importar scanner
public class Scann {

	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int j;
	String x;
	double z;
	
	
	Locale.setDefault(Locale.US);
	z= sc.nextDouble(); //para ler com double
	System.out.println("voce digitou o primeiro numero"+z);
	
	j= sc.nextInt(); //para ler com int
	System.out.println("voce digitou o numero:"+j);
	
	x = sc.next(); // ler com string
	System.out.println("voce digitou:"+x);
	
	
	
	
	sc.close();

}



}
