import java.util.Scanner;

public class ApresentarTabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1;
		double n, tn;
		
		while(i<10) {
			System.out.println("Digite algum número da  tabuada");
			n= ler.nextDouble();
			
			tn = n*i;
			
			System.out.println ("Este é o número da tabuada:" +tn);
			
			i++;
		}
		ler.close();

	}

}
