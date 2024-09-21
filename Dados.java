
public class Dados {

    private double base;

    private double altura;

    private double baseMaior;

    private double area;

    private String Tipo;

    public void setbase(double Base) {
        this.base = Base;
    }

    public double getbase() {
        return this.base;
    }

    public void setaltura(double Altura) {
        this.altura = Altura;
    }

    public double getaltura() {
        return this.altura;
    }

    public void setbaseMaior(double BaseMaior) {
        this.baseMaior = BaseMaior;
    }

    public double getbaseMaior() {
        return this.baseMaior;
    }

    public void setarea(double Nome, String TipodeObjeto) {
        this.area = Nome;
        this.Tipo = TipodeObjeto;
    }

    public double getarea() {
        return this.area;
    }

    public String toString() {
        if (this.Tipo == "Trapézio") {
            return this.Tipo + ": " + this.base + " " + this.altura + " " + this.baseMaior + " " + "Area do " + this.Tipo + ": " + this.area + " ";
        } else {
            return this.Tipo + ": " + this.base + " " + this.altura + " " + "Area do " + this.Tipo + ": " + this.area + " ";
        }
    }

}
