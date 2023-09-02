import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celaBraille[][] = new int[3][2];
        int posicao = 0, contador = 0;
        boolean representaA = true;

        for (int j = 0; j < 2; j++){
            for (int i = 0; i < 3; i++){
                System.out.println("Informe se a posição "+(++posicao)+" é um ponto elevado (1) ou plano (0): ");
                celaBraille[i][j] = in.nextInt();
                while (celaBraille[i][j] != 0 && celaBraille[i][j] != 1){
                    System.out.println("Resposta inválida! Informe 0 para ponto plano ou 1 para elevado: ");
                    celaBraille[i][j] = in.nextInt();
                }

                if(celaBraille[i][j] == 1){
                    contador++;
                }

                if (celaBraille[0][0] != 1){
                    representaA = false;
                }

                if (i != 0 || j != 0){
                    if (celaBraille[i][j] != 0){
                        representaA = false;
                    }
                }

            }
        }

        System.out.println("Quantidade de pontos elevados na cela Braille: "+contador);

        if (representaA){
            System.out.println("Essa cela Braille representa a letra 'a'");
        } else{
            System.out.println("Essa cela Braille não representa a letra 'a'");
        }

    }
}
