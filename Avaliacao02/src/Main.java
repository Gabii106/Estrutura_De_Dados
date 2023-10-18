public class Main {
    public static void main(String[] args) {
        ListaComEncadeamento lista = new ListaComEncadeamento();

        System.out.println(lista.toString());

        lista.addLast(3);
        lista.addLast(0);
        lista.addLast(1);
        lista.addLast(3);
        lista.addLast(2);
        lista.addLast(3);

        System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(2));
        System.out.println(lista.get(5));

        System.out.println(lista.size());

        System.out.println(lista.toString());

        lista.removeAll(3);
        lista.addFirst(6);
        lista.addFirst(2);
        lista.addFirst(3);
        System.out.println();

        System.out.println(lista.toString());

        System.out.println("\n"+lista.size());

        System.out.println(lista.toString());


        System.out.println("\n"+lista.size());

        System.out.println("Antes: "+lista.toString());
        lista.reverse();
        System.out.println("Depois: "+lista.toString());

        lista.addFirst(7);

        System.out.println("Outro: "+lista.toString());

        lista.reverse();
        System.out.println("Depois: "+lista.toString());

        //

        lista.reverse();
        System.out.println("Depois3: "+lista.toString());

        lista.removeAll(2);

        System.out.println("Depois34: "+lista.toString());

        lista.clear();

        System.out.println(lista.get(0));
        lista.reverse();
        System.out.println("Depois5: "+lista.toString());
        System.out.println( lista.size());
        lista.removeAll(4);
        System.out.println("Depois6: "+lista.toString());
        lista.clear();
        lista.addFirst(2);
        System.out.println("Depois6: "+lista.toString());
        lista.clear();
        System.out.println(lista.size());
        lista.addLast(2);
        System.out.println("Depois6: "+lista.toString());
        lista.reverse();
        System.out.println("Depois7: "+lista.toString());

        lista.removeAll(3);
        System.out.println("Depois8: "+lista.toString());
        lista.removeAll(2);
        System.out.println("Depois9: "+lista.toString());

        lista.addLast(4);
        lista.addFirst(3);
        lista.addLast(5);
        lista.addFirst(2);
        lista.addLast(6);
        lista.addFirst(1);

        System.out.println("Depois10: "+lista.toString());

        System.out.println(lista.get(5));
        lista.reverse();
        System.out.println("Depois11: "+lista.toString());

        System.out.println(lista.get(5));
    }
}