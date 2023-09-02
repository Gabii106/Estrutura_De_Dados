import java.io.*;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        String sinal = "";

        while (opcao != 5){
            System.out.println("Menu");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Sair");
            System.out.println("Escolha a opção desejada: ");
            opcao = in.nextInt();
            if(opcao > 0 && opcao < 5){
                System.out.println("Informe o primeiro valor: ");
                double valor1 = in.nextDouble();
                System.out.println("Informe o segundo valor: ");
                double valor2 = in.nextDouble();

                System.out.println(Conta(valor1, valor2, opcao));

                if (opcao == 1){
                    sinal = " + ";
                } else if (opcao == 2) {
                    sinal = " - ";
                } else if (opcao == 3) {
                    sinal = " / ";
                } else {
                    sinal = " * ";
                }

                String operacao = valor1+sinal+valor2+" = "+Conta(valor1, valor2, opcao)+"\n";

                File arquivo = new File("C:\\Users\\gabriela_schirmer\\Documents\\arquivo.txt");
                FileWriter canal = new FileWriter(arquivo, true);
                BufferedWriter operador = new BufferedWriter(canal);

                operador.write(operacao);

                operador.close();
                canal.close();

            } else if (opcao != 5) {
                System.out.println("Opção inválida!");
            }

        }
    }

    public static double Conta(double v1, double v2, int operacao){
        if (operacao == 1){
            return v1 + v2;
        } else if (operacao == 2){
            return v1 - v2;
        } else if (operacao == 3) {
            return v1 / v2;
        } else{
            return v1 * v2;
        }
    }
}
