package exercicio_de_fixacao;
import java.util.Locale;

public class Exercicio {

	public static void main(String[] args)
	{
	
	String product1 = "computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	
	double measure = 53.234567;
	
	System.out.printf("%s, which price is $ 2100,00",product1);
	System.out.printf("%n%s, which price is $650,50%n%n",product2);
	System.out.println("Record:"+age+" years old, code "+code+" and gender: "+gender);
	System.out.printf("Record: %d years old, code %d and gender: %c%n%n",age,code,gender);
	System.out.printf("%nMeasue with eight decimal places:%f",measure);
	System.out.printf("%nRounder (three decimal places):%.2f",measure);
	Locale.setDefault(Locale.US);
	System.out.printf("%nUS decimal point:%.2f",measure);
	}

}
