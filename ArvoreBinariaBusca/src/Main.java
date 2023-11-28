public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca a = new ArvoreBinariaBusca();
        a.insere(6);
        a.insere(8);
        a.insere(2);
        a.insere(1);
        a.insere(4);
        a.insere(3);
        System.out.println(a.toStringDecrescente());
        System.out.println(a);
        a.retira(4);
        System.out.println(a.toStringDecrescente());
        System.out.println(a);



        System.out.println("Busca do número 7: " + a.busca(7));
        System.out.println("Busca do número 3: " + a.busca(3));
        System.out.println("Busca do número 5: " + a.busca(5));
        System.out.println("Busca do número 1: " + a.busca(1));
    }
}