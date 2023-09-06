public class Teste {
    public static void main(String[] args) {
        ListaComArray lista = new ListaComArray();
        lista.add(7);
        lista.add(2);
        lista.add(8);
        lista.add(-77);
        lista.add(0);
        lista.add(-2);
        lista.add(34);
        lista.add(55);
        lista.add(-100);
        lista.add(66);
        lista.add(123);
        lista.add(321);

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        if (lista.isEmpty()){
            System.out.println("A lista está vazia");
        } else{
            System.out.println("A lista não está vazia");
        }

        if (lista.isFull()){
            System.out.println("A lista está cheia");
        } else{
            System.out.println("A lista não está cheia");
        }

        lista.remove(3);

        if (lista.isFull()){
            System.out.println("A lista está cheia");
        } else{
            System.out.println("A lista não está cheia");
        }

        System.out.println(lista.toString());

        if (lista.contains(-100)){
            System.out.println("Contém");
        } else {
            System.out.println("Não contém");
        }
    }
}
