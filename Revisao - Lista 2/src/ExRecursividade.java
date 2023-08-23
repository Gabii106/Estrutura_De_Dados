import java.util.Scanner;

public class ExRecursividade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int val = in.nextInt();

        int soma = Rec(val);

        System.out.println("Resultado da soma de 1 até "+val+": "+soma);
        in.close();
    }

    public static int Rec( int v){
        int resultado;

        if(v != 1){
            resultado =  v + Rec(v-1);
            return resultado;
        } else{
            return 1;
        }

    }
}
