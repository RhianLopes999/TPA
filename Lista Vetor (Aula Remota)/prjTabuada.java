import java.util.Scanner;

public class prjTabuada {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A[] = new int[5];

        for (int i = 0; i < 5; i++) {
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
            System.out.println();
        }
    }
}