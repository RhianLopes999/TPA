import java.util.Scanner;

public class Laços {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1;
		double anoBissexto = 0, anoInicial= 0, anoFinal= 0;
		
		while (i<=5);{
		
		System.out.println("Digite o ano inicial:");
			anoInicial = in.nextDouble();
			
		System.out.println("Digite o ano final:");
			anoFinal = in.nextDouble();
			
			if (anoInicial>=366);
			anoBissexto = anoBissexto + 1;
			
			
			if(anoFinal>=366);
			anoBissexto = anoBissexto + 1;
			
			System.out.println("O número de anos bissextos é" +anoBissexto);
			
			
			
		i++;	
		}
		
	}

}
