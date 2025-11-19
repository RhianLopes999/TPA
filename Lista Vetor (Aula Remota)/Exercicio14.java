import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[],i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i < TAM; i++) {
			System.out.print("Digite o"+(i+1)+" valor do vetor A:");
			a[i] = ler.nextInt();
			
			if (a[i] % 2 == 0) {
                b[i] = 1;
			}else {
				b[i] = 0;
					
					}
		}
			for(i=0; i < TAM; i++) {
				System.out.println("Vetor B ="+b[i]);
			}
                
            }
		}

