import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Desafio();
    }

    public static void TiposPrimitivos_Q1(){
        System.out.println("Informe a base do retângulo: ");
        double base = in.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double alt = in.nextDouble();

        double area = base * alt;

        System.out.println("Área: "+area);
    }

    public static void TiposPrimitivos_Q2(){
        System.out.println("Informe a temperatura em graus Celsius: ");
        double cel = in.nextDouble();

        double fa = ((cel /5) * 9) + 32;

        System.out.println("A temperatura em Fahrenheit é "+fa+"°F");
    }

    public static void TiposPrimitivos_Q3(){
        System.out.println("Informe sua altura: ");
        double alt = in.nextDouble();
        System.out.println("Informe seu peso: ");
        double peso = in.nextDouble();

        double IMC = peso / (alt * alt);

        System.out.println("Seu IMC(Índice de Massa Corporal) é "+IMC);
    }

    public static void TiposPrimitivos_Q4(){
        System.out.println("Informe um número inteiro: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("O número "+num+" é par");
        } else {
            System.out.println("O número "+num+" é impar");
        }
    }

    public static void TiposPrimitivos_Q5(){
        System.out.println("Informe um número inteiro: ");
        int num = in.nextInt();

        if(num == 0){
            System.out.println("Foi informado o número zero");
        } else if(num > 0){
            System.out.println("Foi informado um número positivo");
        } else {
            System.out.println("Foi informado um número negativo");
        }
    }

    public static void Vetores_Q1(){
        int vetor[] = new int[5];
        int soma=0;

        for (int i=0; i<5;i++){
            System.out.println("Informe um valor para a "+(i+1)+"° posição do vetor");
            vetor[i] = in.nextInt();

            soma += vetor[i];
        }

        int media = soma/5;

        System.out.println("A média dos valores do vetor é "+media);

    }

    public static void Vetores_Q2(){
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
    }

    public static void Vetores_Q3(){
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

            System.out.print(vetorDps[i]+" ");
        }


    }

    public static void Vetores_Q4(){
        boolean possui=false;

        System.out.println("Informe o número de elementos do vetor: ");
        int val = in.nextInt();

        int vetor[]= new int[val];

        for (int i=0; i < val; i++) {
            System.out.println("Informe um valor para a " + (i + 1) + "° posição do vetor");
            vetor[i] = in.nextInt();
        }

        System.out.println("Informe o elemento que deseja saber se esta no vetor: ");
        int elemento = in.nextInt();

        for (int i=0; i < val; i++) {
                if (vetor[i] == elemento){
                    possui = true;
                }
        }

        if (possui){
            System.out.println("O elemento "+elemento+" está presente no vetor");
        } else {
            System.out.println("O elemento "+elemento+" não está presente no vetor");
        }

    }

    public static void Vetores_Q5(){
        int count=0;

        System.out.println("Informe o número de elementos do vetor: ");
        int val = in.nextInt();

        int vetor[]= new int[val];

        for (int i=0; i < val; i++) {
            System.out.println("Informe um valor para a " + (i + 1) + "° posição do vetor");
            vetor[i] = in.nextInt();
        }

        System.out.println("Informe o valor que deseja quantas vezes está no vetor: ");
        int valor = in.nextInt();

        for (int i=0; i < val; i++) {
            if(vetor[i] == valor){
                count++;
            }
        }

        System.out.println("O valor "+valor+" aparece "+count+" vezes no vetor");

    }

    public static void Matrizes_Q1(){
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizC[][] = new int[3][3];

        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++){
                System.out.println("Informe o valor para a posição na linha "+(i+1)+" na coluna "+(j+1)+" para a matriz A: ");
                matrizA[i][j] = in.nextInt();
            }
        }
        System.out.println("\n");

        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++){
                System.out.println("Informe o valor para a posição na linha "+(i+1)+" na coluna "+(j+1)+" para a matriz B: ");
                matrizB[i][j] = in.nextInt();


            }
        }
        System.out.println("Soma das matrizes: ");
        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++) {
                matrizC[i][j] = matrizB[i][j] + matrizA[i][j];

                if (j==2){
                    System.out.print(matrizC[i][j]+"\n");
                } else {
                    System.out.print(matrizC[i][j]+" ");
                }
            }
        }

    }

    public static void Matrizes_Q2(){
        int diagonal =1;
        String valores ="";

        System.out.println("Informe o número de colunas e linhas da matriz quadrada: ");
        int val = in.nextInt();

        int matriz[][] = new int[val][val];

        for (int i=0; i< val; i++) {
            for (int j = 0; j < val; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz: ");
                matriz[i][j] = in.nextInt();

                if(j == i){
                    diagonal = diagonal * matriz[i][j];
                    valores += matriz[i][j] + " ";
                }
            }
        }

        System.out.println("Os elementos da diagonal principal são: "+valores);
        System.out.println("E sua multiplicação é: "+diagonal);

    }

    public static void Matrizes_Q3(){
        System.out.println("Informe o número de colunas e linhas da matriz quadrada: ");
        int val = in.nextInt();

        int matriz[][] = new int[val][val];

        boolean transposta = true;

        for (int i=0; i< val; i++) {
            for (int j = 0; j < val; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz: ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i=0; i< val; i++) {
            for (int j = 0; j < val; j++) {
                if(matriz[i][j] != matriz[j][i]){
                    transposta = false;
                }
            }
        }

        if (transposta){
            System.out.println("Essa matriz é simétrica");
        } else {
            System.out.println("Essa matriz não é simétrica");
        }
    }

    public static void Matrizes_Q4(){
        System.out.println("Informe o número de linhas da matriz: ");
        int valLinhas = in.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int valColunas = in.nextInt();

        int matriz[][] = new int[valLinhas][valColunas];


        for (int i=0; i< valLinhas; i++) {
            for (int j = 0; j < valColunas; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz: ");
                matriz[i][j] = in.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("Informe o número que deseja multiplicar a matriz: ");
        int num = in.nextInt();

        for (int i=0; i< valLinhas; i++) {
            for (int j = 0; j < valColunas; j++) {
                matriz[i][j] = num * matriz[i][j];
                if(j==2){
                    System.out.print(matriz[i][j]+" \n");
                }else {
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }

    }

    public static void Matrizes_Q5(){
        double matriz[][] = new double[3][3];
        double m1=0, m2=0, m3=0;

        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++){
                System.out.println("Informe o valor para a posição na linha "+(i+1)+" na coluna "+(j+1)+" para a matriz: ");
                matriz[i][j] = in.nextInt();

                if(j == 0){
                    m1 += matriz[i][j];
                } else if (j == 1){
                    m2 += matriz[i][j];
                } else{
                    m3 += matriz[i][j];
                }
            }
        }

        m1 = m1 / 3;
        m2 = m2 / 3;
        m3 = m3 / 3;

        System.out.println("Média da coluna 1: "+m1);
        System.out.println("Média da coluna 2: "+m2);
        System.out.println("Média da coluna 3: "+m3);
    }

    public static void Desafio(){ //Ainda não funciona
        int matrizPricipal[][] = new int[5][5];
        int matrizPadrao[][] = new int[3][3];
        Random gerador = new Random();
        boolean contem = false;

        for (int i=0; i< 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizPricipal[i][j] = gerador.nextInt(2);
                if(j == 4){
                    System.out.print(matrizPricipal[i][j]+"\n");
                } else{
                    System.out.print(matrizPricipal[i][j]+" ");
                }
            }
        }

        for (int i=0; i< 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz padrão: ");
                matrizPadrao[i][j] = in.nextInt();

                if(j == 2){
                    System.out.print(matrizPadrao[i][j]+"\n");
                } else{
                    System.out.print(matrizPadrao[i][j]+" ");
                }
            }
        }

        for (int i=0; i< 5; i++) {
            for (int j = 0; j < 2; j++) {

              if ( matrizPricipal[i][j] ==  matrizPadrao[i][j] && matrizPricipal[i+1][j] ==  matrizPadrao[i+1][j] &&
                   matrizPricipal[i+2][j] ==  matrizPadrao[i+2][j] && matrizPricipal[i][j+1] ==  matrizPadrao[i][j+1] &&
                   matrizPricipal[i][j+2] ==  matrizPadrao[i][j+2] && matrizPricipal[i+1][j+1] ==  matrizPadrao[i+1][j+1] &&
                   matrizPricipal[i+1][j+2] ==  matrizPadrao[i+1][j+2] && matrizPricipal[i+2][j+1] ==  matrizPadrao[i+2][j+1] &&
                   matrizPricipal[i+2][j+2] ==  matrizPadrao[i+2][j+2]){
                        contem = true;
              }
            }
        }

        if (contem){
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

    }
}