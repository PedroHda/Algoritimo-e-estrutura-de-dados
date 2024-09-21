
public class Vetor {

    private Dados[] dados = new Dados[100];
    private int total = 0;
    StringBuilder builder;

    public void adiciona(Dados elem) {
        this.dados[this.total] = elem;
        this.total++;
    }

    public int Tamanho() {
        return this.total;
    }

    public Dados pegarDados(int posicao) {
        return this.dados[posicao];
    }

    public boolean contem(String dados) {
        this.toString();
        return builder.indexOf(dados) >= 0 ? true : false;
    }

    private boolean posicaoOcupada(int posicao) {
        return (posicao >= 0 && posicao < this.total);
    }

    public Dados pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("******** Posicao Invalida ********");
        }
        return dados[posicao];
    }

    public String toString() {
        if (this.total == 0) {
            return "[]";
        }
        builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.total - 1; i++) {
            builder.append(this.dados[i]);
            builder.append(", ");
        }
        builder.append(this.dados[this.total - 1]);
        builder.append("]");
        return builder.toString();
    }
}
