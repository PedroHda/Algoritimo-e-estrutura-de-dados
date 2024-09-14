import java.util.Scanner;

public class principal {
    
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
    public static double areaRetangulo(double base, double altura){
        return (base*altura);
    }
    public static double areaTrapézio(double baseMaior,double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da Base do Triangulo");
        double baseTriangulo = Double.parseDouble(entrada.nextLine());
        System.out.println("Informe o valor da Altura do Triangulo");
        double AlturaTriangulo = Double.parseDouble(entrada.nextLine());
        System.out.println("Informe o valor da base do Retangulo");
        double BaseRetangulo = Double.parseDouble(entrada.nextLine());
        System.out.println("Informe o valor da Altura do Retangulo");
        double AlturaRetangulo = Double.parseDouble(entrada.nextLine());
        System.out.println("Informe o valor da Base Maior do Trapezio");
        double BaseMenorTrapezio = Double.parseDouble(entrada.nextLine());
        System.out.println("Informe o valor da Base menor do Trapezio");
        double AlturaTrapezio = Double.parseDouble(entrada.nextLine());
        System.out.println("Informe o valor da Altura do Trapezio");
        double BaseMaiorTrapezio = Double.parseDouble(entrada.nextLine());


        Vetor lista = new Vetor();
        Dados Triangulo = new Dados();
        Dados Retangulo = new Dados();
        Dados Trapezio = new Dados();

        Triangulo.setbase(baseTriangulo);
        Triangulo.setaltura(AlturaTriangulo);
        Triangulo.setarea(areaTriangulo(baseTriangulo,AlturaTriangulo), "Triangulo");
        lista.adiciona(Triangulo);
        
        Retangulo.setbase(BaseRetangulo);
        Retangulo.setaltura(AlturaRetangulo);
        Retangulo.setarea(areaRetangulo(BaseRetangulo,AlturaRetangulo), "Retangulo");
        lista.adiciona(Retangulo);

        Trapezio.setbase(BaseMenorTrapezio);
        Trapezio.setaltura(AlturaTrapezio);
        Trapezio.setbaseMaior(BaseMaiorTrapezio);
        Trapezio.setarea(areaTrapézio(BaseMaiorTrapezio,BaseMenorTrapezio, AlturaTrapezio), "Trapézio");
        lista.adiciona(Trapezio);

        System.out.println(lista);
    }
}
