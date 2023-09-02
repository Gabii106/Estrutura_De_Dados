import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vendasSemana[] = new double[7];
        double soma = 0, maior = 0, menor = 0;
        int indexMaior = 0, indexMenor = 0;

        for (int i = 0; i < 7; i++){
            System.out.println("Informe o valor das vendos de "+diaSemana((i+1))+": ");
            vendasSemana[i] = in.nextDouble();

            soma += vendasSemana[i];

            if(i == 0){
                maior = vendasSemana[i];
                menor = vendasSemana[i];
            }

            if(vendasSemana[i] > maior){
                maior = vendasSemana[i];
                indexMaior = i;
            }

            if(vendasSemana[i] < menor){
                menor = vendasSemana[i];
                indexMenor = i;
            }
        }

        double media = soma / 7;

        System.out.println("Valor médio das vendas de todos os dias da semana: "+media);
        System.out.println("Dia com maior valor de venda: "+diaSemana((indexMaior+1))); // tem que ter o nome do dia
        System.out.println("Dia com menor valor de venda: "+diaSemana((indexMenor+1)));
        System.out.println("Soma das vendas da semana: "+soma);
    }

    public static String diaSemana(int dia){
        if (dia == 1){
            return "domingo";
        } else if (dia == 2){
            return "segunda-feira";
        } else if (dia == 3) {
            return "terça-feira";
        } else if (dia == 4) {
            return "quarta-feira";
        } else if (dia == 5) {
            return "quinta-feira";
        } else if (dia == 6) {
            return "sexta-feira";
        } else {
            return "sábado";
        }
    }
}
