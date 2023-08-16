import java.io.*;

public class ExemploFile {
    public static void main(String[] args) throws Exception {
        EscritaDeBinário();
    }

    public static void Arquivo() throws Exception {
        File meuArquivo = new File("C:\\Users\\gabriela_schirmer\\Documents\\teste.txt");
        if (meuArquivo.exists()) {
            System.out.println("Dados do arquivo "+ meuArquivo.getAbsolutePath());
            System.out.println( "Tamanho " + meuArquivo.length() + " bytes");
            System.out.println("Pode ser escrito? " + meuArquivo.canWrite() );

            meuArquivo.delete();
        } else {
            System.out.println("Arquivo não existe!");
            meuArquivo.createNewFile(); //Cria arquivo

            //meuArquivo.mkdir(); //Cria diretório
        }
    }

    public static void Diretorio() throws Exception{
        File meuDiretorio = new File("C:\\Users\\gabriela_schirmer\\Documents\\Gabi");
        if (!meuDiretorio.exists()) {
                meuDiretorio.mkdir();
        }

        for (int i = 0; i < 10; i++){
            String nome = "Arquivo";
            nome = nome + (i+1) + ".png";
            System.out.println(nome);
            //System.out.println(meuDiretorio.getAbsolutePath());

            File temp = new File(meuDiretorio.getAbsolutePath()+"\\"+nome);

            temp.createNewFile();
        }
    }

    public static void LeituraPorCaracter() throws IOException{
        File meuArquivo = new File("C:\\Users\\gabriela_schirmer\\Documents\\Gabi\\Teste.txt");

        FileReader leitorDoArquivo = new FileReader(meuArquivo);

        int c;

        while ( ( c = leitorDoArquivo.read() ) != -1 ){
            System.out.println("Li o caracter: "+ (char)c);
        }
        leitorDoArquivo.close();
    }

    public static void LeituraPorLinha() throws IOException{
        File meuArquivo = new File("C:\\Users\\gabriela_schirmer\\Documents\\Gabi\\Teste.txt");
        FileReader leitorDoArquivo = new FileReader(meuArquivo);

        BufferedReader altoNivel = new BufferedReader(leitorDoArquivo);

        String linha;
        while ((linha = altoNivel.readLine()) != null){
            System.out.println("Linha: "+linha);
        }

        leitorDoArquivo.close();
    }

    public static void EscritaPorLinha() throws IOException {
        File meuArquivo = new File("C:\\Users\\gabriela_schirmer\\Documents\\Gabi\\Teste.txt");
        FileWriter canalDeComunicação = new FileWriter(meuArquivo, true); //Com o true junta com o que já está escrito
        BufferedWriter operadorDoCanal = new BufferedWriter(canalDeComunicação);

        operadorDoCanal.write("Finalmente escrevi no arquivo 2");

        operadorDoCanal.close();
        canalDeComunicação.close();
    }

    public static void LeituraDeBinario() throws IOException{
        File meuArquivo = new File("C:\\Users\\gabriela_schirmer\\Documents\\Gabi\\desafio.pdf");
        FileInputStream leitorDoArquivoBinario = new FileInputStream(meuArquivo);

        int i = -1;
        do {
            i = leitorDoArquivoBinario.read();
            if (i != -1){
                System.out.println(Integer.toBinaryString(i));
            }
        } while (i != -1);

       // System.out.println(meuArquivo.length()); 558707
        leitorDoArquivoBinario.close();
    }

    public static void EscritaDeBinário() throws IOException {
        File meuArquivo = new File("C:\\Users\\gabriela_schirmer\\Documents\\Gabi\\des.pdf");

        FileOutputStream canalParaEscritaBinario = new FileOutputStream(meuArquivo, true);

        canalParaEscritaBinario.write(new byte[]{'G', 'A', 'B', 'I'});

        System.out.println(meuArquivo.length());

        canalParaEscritaBinario.close();
    }

}