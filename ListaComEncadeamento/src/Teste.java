public class Teste {

    public static void main(String[] args) {
        //ListaComEncadeamento lista = new ListaComEncadeamento(); = size = 0
        //ListaComEncadeamento lista; = NullPointerExeption
        ListaComEncadeamento lista = new ListaComEncadeamento();


        System.out.println(lista.isEmpty());

        lista.add(5);
        lista.add(2);
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());

        lista.clear();
        System.out.println(lista.size());
    }
}
