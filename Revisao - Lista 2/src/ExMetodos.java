import java.util.Scanner;

public class ExMetodos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        double v1 = in.nextDouble();
        System.out.println("Informe outro valor: ");
        double v2 = in.nextDouble();

        System.out.println("Informe qual a operação aritmética que deseja realizar entre os valores: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        int menu = in.nextInt();

        switch (menu){
            case 1:
                System.out.println("Resultado da adição: "+Adicao(v1, v2));
                break;
            case 2:
                System.out.println("Resultado da subtração: "+Subtracao(v1, v2));
                break;
            case 3:
                System.out.println("Resultado da divisão: "+Divisao(v1, v2));
                break;
            case 4:
                System.out.println("Resultado da multiplicação: "+Multiplicacao(v1, v2));
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        in.close();
    }

    public static double Adicao(double a, double b){
        return (a + b);
    }

    public static double Subtracao(double a, double b){
        return (a - b);
    }

    public static double Divisao(double a, double b){
        return (a / b);
    }

    public static double Multiplicacao(double a, double b){
        return (a * b);
    }
}
