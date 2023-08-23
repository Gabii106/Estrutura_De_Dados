import java.util.Scanner;

public class ExPrimitivos05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = in.nextInt();

        if(num == 0){
            System.out.println("Foi informado o número zero");
        } else if(num > 0){
            System.out.println("Foi informado um número positivo");
        } else {
            System.out.println("Foi informado um número negativo");
        }
        in.close();
    }
}
