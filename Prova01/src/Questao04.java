import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valores[] = new int[8];
        int somaIterarividade = 0;

        for (int i = 0; i < 8; i++){
            if (i % 2 != 0){
                System.out.println("Informe um valor para o indice "+i+" do vetor: ");
                valores[i] = in.nextInt();
            }
        }

        for (int i = 0; i < 8; i++){
            if(i % 2 == 0){
                valores[i] = 2 * valores[i + 1];
            }
        }

        for (int i = 0; i < 8; i++){
            somaIterarividade += valores[i];
        }
        System.out.println("Soma de todos os valores do vetor com iteratividade: "+somaIterarividade);

        System.out.println("Soma de todos os valores do vetor com recursividade: "+Recursividade(valores, 0));
    }

    public static int Recursividade(int vetor[], int index){
        if (index == (vetor.length -1 )){
            return  vetor[index];
        } else {
            return vetor[index] + Recursividade(vetor,index+1);
        }
    }
}
