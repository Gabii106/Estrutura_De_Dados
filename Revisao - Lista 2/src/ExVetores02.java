import java.util.Scanner;

public class ExVetores02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maior=0, menor=0;

        System.out.println("Informe o número de elementos do vetor: ");
        int val = in.nextInt();

        int vetor[] = new int[val];

        for (int i=0; i < val; i++){
            System.out.println("Informe um valor para a "+(i+1)+"° posição do vetor");
            vetor[i] = in.nextInt();

            if(i == 0){
                maior = vetor[i];
                menor = vetor[i];
            }

            if (vetor[i] > maior){
                maior = vetor[i];
            }

            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }

        System.out.println("O maior valor dentro do vetor é "+maior+" e o menor é "+menor);
        in.close();
    }
}
