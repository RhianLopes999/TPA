import java.util.Scanner;

public class idadeNascimento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1;
		double anoAtual, anoNascimento, idadeUsuario;
		
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextDouble();
		
		System.out.println("Digite o ano de nascimento:");
		anoNascimento = in.nextDouble();
		
		do {
			idadeUsuario = (anoAtual - anoNascimento);
			
			
			i++;
			
		
		}
		
		while (i<=5);
		
		System.out.println("A idade do usuário:" +idadeUsuario);
	}

}
