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
        Vetor Areas = new Vetor();
        Dados Triangulo = new Dados();
        Dados Retangulo = new Dados();
        Dados Trapezio = new Dados();

        Triangulo.setbase(baseTriangulo);
        Triangulo.setaltura(AlturaTriangulo);
        lista.adiciona(Triangulo);

        Dados Triangulo2 = lista.pegarDados(0);
        Triangulo2.setarea(areaTriangulo(Triangulo2.getbase(),Triangulo2.getaltura()), "Triangulo");
        Areas.adiciona(Triangulo2);
        
        Retangulo.setbase(BaseRetangulo);
        Retangulo.setaltura(AlturaRetangulo);
        lista.adiciona(Retangulo);

        Dados Retangulo2 = lista.pegarDados(1);
        Retangulo2.setarea(areaRetangulo(Retangulo2.getbase(),Retangulo2.getaltura()), "Retangulo");
        Areas.adiciona(Retangulo2);


        Trapezio.setbase(BaseMenorTrapezio);
        Trapezio.setaltura(AlturaTrapezio);
        Trapezio.setbaseMaior(BaseMaiorTrapezio);
        lista.adiciona(Trapezio);

        Dados Trapezio2 = lista.pegarDados(2);
        Trapezio2.setarea(areaTrapézio(Trapezio2.getbaseMaior(),Trapezio2.getbase(), Trapezio2.getaltura()), "Trapézio");
        Areas.adiciona(Trapezio2);



        System.out.println(Areas);
    }
}
