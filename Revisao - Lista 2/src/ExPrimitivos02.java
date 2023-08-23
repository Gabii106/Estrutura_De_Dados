import java.util.Scanner;

public class ExPrimitivos02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: ");
        double cel = in.nextDouble();

        double fa = ((cel /5) * 9) + 32;

        System.out.println("A temperatura em Fahrenheit é "+fa+"°F");
        in.close();
    }
}
