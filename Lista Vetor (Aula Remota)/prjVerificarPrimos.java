import java.util.Scanner;

public class prjVerificarPrimos {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A[] = new int[10];
        int i = 0;
        int j = 0;
        int cont = 0;
        int num = 0;

        for (i = 0; i < 10; i++) {
            A[i] = ler.nextInt();
        }

        for (i = 0; i < 10; i++) {

            num = A[i];
            cont = 0;   

            j = 1;      

            while (j <= num) {  
                if (num % j == 0) {
                    cont++;
                }
                j++;    
            }

            if (cont == 2) {
                System.out.println(num + " é primo");
            } else {
                System.out.println(num + " não é primo");
            }
        }
    }
}