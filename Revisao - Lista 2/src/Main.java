import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Des2();
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
        int a=0, b=0, c=0, d=0;
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

        for (int i=0; i < 3; i++) {
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

        for (int i=0; i< 1; i++) {
            for (int j = 0; j < 1; j++) {

                a += 1;
                b += 1;

                if(a==3 && b==3){
                    a = 0;
                    b =0;
                }

              if ( (matrizPricipal[i][j] ==  matrizPadrao[a][b] && matrizPricipal[i+1][j] ==  matrizPadrao[a][b] &&
                   matrizPricipal[i+2][j] ==  matrizPadrao[a][b] && matrizPricipal[i][j+1] ==  matrizPadrao[a][b] &&
                   matrizPricipal[i][j+2] ==  matrizPadrao[a][b] && matrizPricipal[i+1][j+1] ==  matrizPadrao[a][b] &&
                   matrizPricipal[i+1][j+2] ==  matrizPadrao[a][b] && matrizPricipal[i+2][j+1] ==  matrizPadrao[a][b] &&
                   matrizPricipal[i+2][j+2] ==  matrizPadrao[a][b]) ){
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

    public static void Des2(){
        Scanner in = new Scanner(System.in);
        int[][] padrao = new int[3][3];
        Random gerador = new Random();
        boolean contem = false;

        System.out.print("Digite o número de linhas da imagem: ");
        int numL = in.nextInt();
        System.out.print("Digite o número de colunas da imagem: ");
        int numC = in.nextInt();

        int imagem[][] = new int[numL][numC];


        for (int i=0; i< numL ; i++) {
            for (int j = 0; j < numC ; j++) {
                imagem[i][j] = gerador.nextInt(2);
                if(j == numC-1){
                    System.out.print(imagem[i][j]+"\n");
                } else{
                    System.out.print(imagem[i][j]+" ");
                }
            }
        }

        for (int i=0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz padrão: ");
                padrao[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i <= numL - 3; i++) {
            for (int j = 0; j <= numC - 3; j++) {
                if (matchPattern(imagem, i, j, padrao)) {
                    contem = true;
                }
            }
        }

        if(contem){
            System.out.println("Contem");
        } else {
            System.out.println("Não contem");
        }


        in.close();

    }

    private static boolean matchPattern(int[][] imagem, int a, int b, int[][] padrao) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (imagem[a + i][b + j] != padrao[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }



    public static void Arquivo() throws Exception{

        File arq1 = new File("C:\\Users\\gabriela_schirmer\\Documents\\arq1.txt");
        File arq2 = new File("C:\\Users\\gabriela_schirmer\\Documents\\arq2.txt");

        //A

        FileWriter canalA = new FileWriter(arq2);
        BufferedWriter operadorA = new BufferedWriter(canalA);

        FileReader leitorA = new FileReader(arq1);

        BufferedReader bufA = new BufferedReader(leitorA);

        String linhaA;
        while ((linhaA = bufA.readLine()) != null){
            operadorA.write(linhaA);
        }

        leitorA.close();
        operadorA.close();
        canalA.close();


        //B
        FileWriter canalB = new FileWriter(arq2, true);
        BufferedWriter operadorB = new BufferedWriter(canalB);

        FileReader leitorB = new FileReader(arq1);

        BufferedReader bufB = new BufferedReader(leitorB);

        String linhaB;
        while ((linhaB = bufB.readLine()) != null){
            //System.out.println("Linha: "+linhaB);
            operadorB.write(linhaB);
        }

        bufB.close();
        operadorB.close();
        canalB.close();

        //C

        FileReader leitorC = new FileReader(arq1);

       BufferedReader bufC = new BufferedReader(leitorC);

        String linhaC;
        System.out.println("arq1.txt: ");
        while ((linhaC = bufC.readLine()) != null){
            System.out.println(linhaC);
        }

       leitorC.close();


        //D

        FileReader leitorD = new FileReader(arq2);

        BufferedReader bufD = new BufferedReader(leitorD);

        String linhaD;
        System.out.println("arq2.txt: ");
        while ((linhaD = bufD.readLine()) != null){
            System.out.println(linhaD);
        }

        leitorD.close();



    }

    public static void Metodo(){
        System.out.println("Informe um valor: ");
        double v1 = in.nextDouble();
        System.out.println("Informe outro valor: ");
        double v2 = in.nextDouble();

        System.out.println("Informe qual a operação aritmética que deseja realizar entre os valores: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        int menu = in.nextInt();

        switch (menu){
            case 1:
                System.out.println("Resultado da adição: "+Adicao(v1, v2));
                break;
            case 2:
                System.out.println("Resultado da subtração: "+Subtracao(v1, v2));
                break;
            case 3:
                System.out.println("Resultado da divisão: "+Divisao(v1, v2));
                break;
            case 4:
                System.out.println("Resultado da multiplicação: "+Multiplicacao(v1, v2));
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }

    public static double Adicao(double a, double b){
        return (a + b);
    }

    public static double Subtracao(double a, double b){
        return (a - b);
    }

    public static double Divisao(double a, double b){
        return (a / b);
    }

    public static double Multiplicacao(double a, double b){
        return (a * b);
    }


    public static void Recursividade(){
        System.out.println("Informe um valor: ");
        int val = in.nextInt();

        int soma = Rec(val);

        System.out.println("Resultado da soma de 1 até "+val+": "+soma);
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