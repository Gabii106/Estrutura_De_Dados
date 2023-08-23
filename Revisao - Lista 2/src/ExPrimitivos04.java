import java.util.Scanner;

public class ExPrimitivos04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("O número "+num+" é par");
        } else {
            System.out.println("O número "+num+" é impar");
        }
        in.close();
    }
}
