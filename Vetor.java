public class Vetor {
    private Dados[] dados = new Dados[100];
    private int total = 0;

    public void adiciona(Dados elem) {
        this.dados[this.total] = elem;
        this.total++;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < this.total -1; i++) {
            if (this.dados[i] != null) {
                str += this.dados[i] + ",";
            }
        }
        str+= this.dados[this.total-1] + "]";
        return str;
        
    }
}
