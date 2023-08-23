import java.util.Scanner;

public class ExVetores03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número de elementos do vetor: ");
        int val = in.nextInt();

        int vetor[]= new int[val];
        int vetorDps[] = new int[val];

        for (int i=0; i < val; i++) {
            System.out.println("Informe um valor para a " + (i + 1) + "° posição do vetor");
            vetor[i] = in.nextInt();
        }

        int o = val-1;

        System.out.print("Vetor invertido: ");
        for (int i=0; i < val; i++) {
            vetorDps[i] = vetor[o];
            o--;


            if(i == (val-1)){
                System.out.print(vetorDps[i]);
            } else {
                System.out.print(vetorDps[i]+", ");
            }
        }
        in.close();
    }
}
