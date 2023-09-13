import java.util.Arrays;

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

        lista.clear();

        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        lista.add(12);
        lista.add(10);

        lista.add(10);
        lista.add(16);

        lista.removeFirt(2);
        lista.set(1, 100);

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

        System.out.println("A primeira aparição do número 6 está no indice: "+lista.indexOf(6));

        System.out.println("A ultima aparição do número 10 está no indice: "+lista.lastIndexOf(10));


        System.out.println(Arrays.toString(lista.toArray()));
    }
}
