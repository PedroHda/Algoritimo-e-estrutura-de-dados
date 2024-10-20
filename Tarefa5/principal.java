
import java.util.Scanner;

public class principal {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // fibonacci(6) -> fibonacci(5) + fibonacci(4)

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Vetor Lista = new Vetor();

        System.out.println("Digite a quantidade de valores no fibonacci ");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            Lista.adiciona(fibonacci(i));
        }
        System.out.println("Passo a passo do cálculo do Fibonacci:");
        for (int i = 1; i <= n; i++) {
            if (i == 0) {
                System.out.println("fibonacci(" + i + ") -> " + i);
                continue;
            }
            if (i == 1) {
                System.out.println("fibonacci(" + i + ") -> " + i);
                continue;
            }
            System.out.println("fibonacci(" + i + ") -> " + "fibonacci(" + (i - 1) + ") + fibonacci(" + (i - 2) + ")" + " -> "
                    + fibonacci(i - 1) + " + " + fibonacci(i - 2) + " -> " + fibonacci(i));
        }
        entrada.close();
        System.out.println(Lista);
    }
}
