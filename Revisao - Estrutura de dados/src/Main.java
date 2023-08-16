import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicio09();
    }

    public static Scanner in = new Scanner(System.in);

    public static void Exercicio01(){

        int[] vetor = new int[5];

        for (int i =0; i <vetor.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor: ");
            vetor[i] = in.nextInt();
        }

        System.out.print("Vetor na ordem inversa: ");
        for (int i=4; i>=0; i--){
            System.out.print(vetor[i]+" ");
        }
    }

    public static void Exercicio02(){
        int[] vetor = new int[10];
        int soma=0;

        for (int i =0; i <vetor.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor: ");
            vetor[i] = in.nextInt();
            soma = soma + vetor[i];
        }

        System.out.println("Soma: "+soma);
    }

    public static void Exercicio03(){
        int[] vetor = new int[10];

        for (int i =0; i <vetor.length; i++) {
            System.out.print("Informe um número para a " + (i + 1) + "º posição do vetor: ");
            vetor[i] = in.nextInt();
        }

        System.out.print("Números pares: ");
        for (int i =0; i <vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                System.out.print(vetor[i]+" , ");
            }
        }

    }
    public static void Exercicio04(){
        int[] vetor = new int[10];
        int maior=0, menor=0;

        for (int i =0; i <vetor.length; i++) {
            System.out.print("Informe um número para a " + (i + 1) + "º posição do vetor: ");
            vetor[i] = in.nextInt();

            if(i == 0){
                maior = vetor[i];
                menor = vetor[i];
            }

            if(vetor[i] > maior){
                maior = vetor[i];
            }

            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }

        System.out.print("O maior valor é "+maior+", e o menor é "+menor);
    }

    public static void Exercicio05(){
        double[] vetor = new double[6];
        double soma=0, media=0;

        for (int i =0; i <vetor.length; i++) {
            System.out.print("Informe um número para a " + (i + 1) + "º posição do vetor: ");
            vetor[i] = in.nextDouble();
            soma = soma + vetor[i];
        }

        media = soma / 6;

        System.out.print("A média é "+media +" e os valores acima da média são ");
        for (int i =0; i <vetor.length; i++) {
            if (vetor[i] > media){
                System.out.print(vetor[i]+" , ");
            }
        }

    }

    public static void Exercicio06(){
        int[] vetor = new int[8];
        int cont=0;
        String valores="";

        for (int i =0; i < vetor.length; i++) {
            System.out.print("Informe um número para a " + (i + 1) + "º posição do vetor: ");
            vetor[i] = in.nextInt();

            if(vetor[i] < 0){
                cont++;
                valores = valores + vetor[i] + "  ";
            }
        }

        System.out.println("Foram informados "+cont+" valores negativos. E eles são "+valores);
    }

    public static void Exercicio07(){
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        for (int i =0; i <A.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor A: ");
            A[i] = in.nextInt();
        }

        for (int i =0; i < B.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor B : ");
            B[i] = in.nextInt();
        }

        for (int i =0; i <5; i++){
                C[i] = A[i];
                C[i+5] = B[i];
        }

        System.out.print("C = ");
        for (int i =0; i <C.length; i++){
            System.out.print(C[i]+ " , ");
        }

    }

    public static void Exercicio08(){
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        for (int i =0; i <A.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor A: ");
            A[i] = in.nextInt();
        }

        for (int i =0; i < B.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor B : ");
            B[i] = in.nextInt();
        }

        System.out.print("C = ");
        for (int i =0; i < C.length; i++){
            C[i] = A[i] + B[i];
            System.out.print(C[i]+" ");
        }
    }

    public static void Exercicio09(){
        int[] vetor = new int[5];

        for (int i =0; i < vetor.length; i++) {
            System.out.print("Informe um número para a " + (i + 1) + "º posição do vetor: ");
            vetor[i] = in.nextInt();
        }

        for (int i= 0; i< 5; i++){
            for (int j = 0; j< (4-i); j++){
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        System.out.print("Ordem crescente: ");
        for (int i= 0; i< vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }


    }

    public static void Exercicio10(){
        int[] A = new int[5];
        int[] B = new int[5];
        boolean iguais = true;

        for (int i =0; i <A.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor A: ");
            A[i] = in.nextInt();
        }

        for (int i =0; i < B.length; i++){
            System.out.print("Informe um número para a "+(i+1)+"º posição do vetor B : ");
            B[i] = in.nextInt();
        }

        for (int i =0; i < 5; i++){
            if (A[i] != B[i]){
                iguais = false;
            }
        }

        if (iguais){
            System.out.println("Os vetores são iguais!");
        } else {
            System.out.println("Os vetores são diferentes!");
        }

    }

}