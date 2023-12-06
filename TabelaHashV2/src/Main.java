public class Main {
    public static void main(String[] args) {

        TabelaHash<Aluno> tabela = new TabelaHash<Aluno>(3);

        Aluno joao = new Aluno("Joao", 9, 5.5);
        Aluno carlos = new Aluno("Carlos", 3, 9.5);

        tabela.insere(joao);
        tabela.insere(carlos);
        tabela.insere(new Aluno("Joao2", 9, 5.5));
        tabela.insere(new Aluno("Samuel", 12, 5.5));
        tabela.insere(new Aluno("teste", 15, 5.5));
        tabela.insere(new Aluno("Caio", 4, 6.5));
        tabela.imprime();

        //System.out.println("Busca 3: "+tabela.busca(3));
        tabela.remove(joao);
        tabela.remove(carlos);
        tabela.imprime();

        ListaComEncadeamento<String> lista = new ListaComEncadeamento<String>();
        ListaComEncadeamento<Aluno> lista2 = new ListaComEncadeamento<Aluno>();


    }
}