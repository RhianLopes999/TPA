import java.util.Scanner;

public class prjParesImpares {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A[] = new int[20];
        int B[] = new int[20];
        int p = 0;

        for (int i = 0; i < 20; i++) {
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[p] = A[i];
                p++;
            }
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[p] = A[i];
                p++;
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }
    }
}