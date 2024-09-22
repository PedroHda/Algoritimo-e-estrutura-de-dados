
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int condition = 0;
        Vetor ListaDePagamentos = new Vetor();
        // Insert do usuario para incremento na lista
        while (condition == 0) {
            System.out.println("""
                           1. Inserir um novo pagamento\r
                           2. Remover um pagamento efetuado\r
                           3. Exibir pagamentos pendentes\r
                           4. Buscar por um pagamento\r
                           5. Sair"""
            );
            int opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1:
                    Dados DadosPagamento = new Dados();

                    System.out.println("Insira o Fornecedor:   ");
                    String fornecedor = entrada.nextLine();
                    System.out.println("\nInsira o Valor do Pagamento:   ");
                    double valor = Double.parseDouble(entrada.nextLine());
                    System.out.println("\nInsira o Data de vencimento (dd-mm-aaaa):  ");
                    String data_vencimento = entrada.nextLine();

                    DadosPagamento.setFornecedor(fornecedor);
                    DadosPagamento.setValor(valor);
                    DadosPagamento.setData_vencimento(data_vencimento);

                    int lenghtLista = ListaDePagamentos.Tamanho();
                    ListaDePagamentos.adiciona(lenghtLista, DadosPagamento);
                    break;
                case 2:
                    System.out.println("Nome do fornecedor para baixa: ");
                    String nomeFornecedor = entrada.nextLine();

                    int posicao = -1;
                    for (int i = 0; i < ListaDePagamentos.Tamanho(); i++) {
                        if (ListaDePagamentos.pegarDados(i).getFornecedor().equals(nomeFornecedor)) {
                            posicao = i;
                            break;
                        }
                    }

                    if (posicao != -1) {
                        ListaDePagamentos.remover(posicao);
                        System.out.println("Pagamento removido com sucesso!");
                    } else {
                        System.out.println("Fornecedor não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println(ListaDePagamentos);
                    break;
                case 4:
                    System.out.println("Insira a posicao do pagamento");
                    int valorDoPagamento = Integer.parseInt(entrada.nextLine());
                    System.out.println(ListaDePagamentos.pega(valorDoPagamento));
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    condition = 1;

                    break;
                default:
                    throw new AssertionError();
            }

        }

        // Vetor lista = new Vetor();
        // Dados Trapezio = new Dados();
        // Trapezio.setValor(12312);
        // Trapezio.setFornecedor("rpoaskjop");
        // Trapezio.setData_vencimento("a");
        // lista.adiciona(Trapezio);
        entrada.close();
    }
}
