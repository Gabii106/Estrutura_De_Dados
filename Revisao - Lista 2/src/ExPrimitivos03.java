import java.util.Scanner;

public class ExPrimitivos03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        double alt = in.nextDouble();
        System.out.println("Informe seu peso: ");
        double peso = in.nextDouble();

        double imc = peso / (alt * alt);

        System.out.println("Seu IMC(Índice de Massa Corporal) é "+imc);
        in.close();
    }
}
