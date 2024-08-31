import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Dados obj[] = new Dados[3];
        for (int i = 0; i <= 2; i++) {
            String nome = entrada.nextLine();
            obj[i] = new Dados();
            obj[i].setAdiciona(nome);
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println(obj[i].getPegaElem());
        }
    }
}
