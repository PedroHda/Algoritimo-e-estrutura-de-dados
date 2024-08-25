
import java.util.Scanner;

class aula {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            int n = Integer.parseInt(entrada.nextLine());
            if (n != 0) {
                int lista[] = new int[n];
                for (int k = 0; k <= n - 1; k++) {
                    int elem = Integer.parseInt(entrada.nextLine());
                    lista[k] = elem;
                }
                for (int i = 0; i <= n - 1; i++) {
                    System.out.println(lista[i]);
                }
            } else {
                System.out.println("Lista Vazia ...");
            }
        } finally {
            entrada.close();
        }

    }
}
