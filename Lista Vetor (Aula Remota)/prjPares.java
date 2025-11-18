import java.util.Scanner;

public class prjPares {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A[] = new int[10];
        int i = 0;
        int j = 0;

        for (i = 0; i < 10; i++) {
            A[i] = ler.nextInt();
        }

        for (i = 0; i < 10; i++) {

            j = 0;  // inicialização de j

            while (j <= A[i]) {
                System.out.print(j + " ");
                j += 2;
            }

            System.out.println();
        }
    }
}