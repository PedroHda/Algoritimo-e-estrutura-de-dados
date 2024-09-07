import java.util.Scanner;

public class principal {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1)
            return false;
        if (numero == 2)
            return true;
        if (numero % 2 == 0)
            return false;
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Vetor listaPrimos = new Vetor();
        System.out.println("Digite números inteiros entre 1 e 100 (digite 0 para encerrar):");

        while (true) {
            int numero = entrada.nextInt();
            if (numero == 0)
                break; // Termina a leitura se digitar 0
            if (numero < 1 || numero > 100) {
                System.out.println("Número fora do intervalo. Digite um número entre 1 e 100.");
                continue;
            }
            if (ehPrimo(numero)) {
                Dados dado = new Dados();
                dado.setNumero(numero);
                listaPrimos.adiciona(dado);
            }
        }

        System.out.println("Números primos armazenados: " + listaPrimos);
    }
}
