import java.util.Scanner;

public class ExPrimitivos01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a base do retângulo: ");
        double base = in.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double alt = in.nextDouble();

        double area = base * alt;

        System.out.println("Área: "+area);
        in.close();
    }
}
