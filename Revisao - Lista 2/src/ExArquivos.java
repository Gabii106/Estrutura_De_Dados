import java.io.*;

public class ExArquivos {
    public static void main(String[] args) throws IOException {
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
}
