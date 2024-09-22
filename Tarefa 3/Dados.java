
public class Dados {

    private String fornecedor;
    private double valor;
    private String data_vencimento;

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValor() { 
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String toString() {
        return ("\nFornecedor: " + this.fornecedor + "\n" + " Valor: " + this.valor + "\n" + " Vencimento: " + this.data_vencimento + "\n");
    }
}
