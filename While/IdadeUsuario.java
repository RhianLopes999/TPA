import java.util.Scanner;

public class IdadeUsuario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int i=1;
        double iu;
        while(i<=5) {
        	
        
        System.out.println("Digite a idade do "+i+" usuário");
        iu = ler.nextDouble();
       
        if (iu>=18) {
        	System.out.println("Maior de idade");
        } else {
        	System.out.println("Menor de idade");
        	
        	
        }
        i++;
        }
        
        }
}
